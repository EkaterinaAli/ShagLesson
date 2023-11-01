package main.org.example.util;

import javax.mail.*;
import javax.mail.internet.InternetAddress;
import javax.mail.internet.MimeBodyPart;
import javax.mail.internet.MimeMessage;
import javax.mail.internet.MimeMultipart;
import java.io.File;
import java.io.IOException;
import java.util.Date;
import java.util.HashSet;
import java.util.Properties;
import java.util.Set;

public class EmailUtils {
    private static final String FROM = "ekaterina.alisionok@gmail.com";
    private static final String PASSWORD = "nium mdrp rqtc clrc";
    private static final Properties PROPS = new Properties();

    static {
        PROPS.put("mail.smtp.host", "smtp.gmail.com");
        PROPS.put("mail.smtp.port", "587");
        PROPS.put("mail.smtp.auth", "true");
        PROPS.put("mail.smtp.starttls.enable", "true");
    }



    public static Session getSession() {

        return Session.getInstance(PROPS, new Authenticator() {
            @Override
            protected PasswordAuthentication getPasswordAuthentication() {
                return new PasswordAuthentication(FROM, PASSWORD);
            }
        });

    }
    public static void send(final String to, final String subject, final String msg ){
        send(to,  subject, msg,  null);
    }
    public static void send(final String to, final String subject, final String msg, final String filePath ){
        HashSet<String> toSet = new HashSet<>();
        toSet.add(to);
        send(toSet, null, null, subject, msg, filePath);
    }

    public static void send(final Set<String> to, final Set<String> cc,
                            final Set<String> bcc, final String subject, final String msg,
                            final String attachmentPathname) {

        try {
            Message message = new MimeMessage(getSession());
            message.setFrom(new InternetAddress(FROM));
            message.setRecipients(
                    Message.RecipientType.TO,
                    InternetAddress.parse(String.join(", ", to))
            );

            if (cc != null && cc.size() > 0)
                message.setRecipients(
                        Message.RecipientType.CC,
                        InternetAddress.parse(String.join(", ", cc))
                );

            if (bcc != null && bcc.size() > 0)
                message.setRecipients(
                        Message.RecipientType.BCC,
                        InternetAddress.parse(String.join(", ", bcc))
                );

            message.setSubject(subject);
            BodyPart messageBodyPart = new MimeBodyPart();
            messageBodyPart.setContent(msg, "text/html");
            //messageBodyPart.setText(msg);


            MimeBodyPart attachmentPart = new MimeBodyPart();
            if(attachmentPathname != null)
                attachmentPart.attachFile(new File(attachmentPathname));

            Multipart multipart = new MimeMultipart();
            multipart.addBodyPart(messageBodyPart);

            if(attachmentPathname != null)
                multipart.addBodyPart(attachmentPart);

            message.setContent(multipart);

            // message.setText(msg);
            // message.setContent(msg, "text/html");

            Transport.send(message);

            System.out.println("Done");
        } catch (MessagingException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }

    public static void main(String[] args) {


        String subj = "No SPAM";
        String msg =" <a href = 'https://onliner.by'>SPAM 2</a>";
        EmailUtils.send(FROM, "hi there", "server date " + new Date());

     //   HTMLTableBuilder tableBuilder = new HTMLTableBuilder( "HTML Tabl" + msg, true,3,3,
                //10,10,10);

    //    tableBuilder.addTableHeader("Company", "contect","country");
    //    tableBuilder.addRowValues ("wwwww", "eeeeeee","rrrrr");
     //  tableBuilder.addRowValues ("by", "eng","rgb");
      //  send (FROM, subj , tableBuilder.build(),  "C:\\Users\\St\\IdeaProjects\\mailapp\\pom.xml ");
    }
}
