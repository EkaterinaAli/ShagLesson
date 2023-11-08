package main.org.example.servlets;

import main.org.example.jdbs.dao.impl.UserDAOImpl;
import main.org.example.model.User;
import main.org.example.util.EmailUtils;
import main.org.example.util.EncryptDecryptUtils;

import javax.servlet.RequestDispatcher;
import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Date;

@WebServlet ("/registry")
public class RegistryServlet extends HttpServlet {
    private UserDAOImpl dao = new UserDAOImpl();

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        RequestDispatcher rd =req.getRequestDispatcher("/reg.html");
        rd.forward(req,resp); // move forword with the same params and so  on

    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        String name = req.getParameter("name");
        String email = req.getParameter("email");
        String psw1 = req.getParameter("psw1");
        String psw2 = req.getParameter("psw2");

        //1st Validation


        //if its volid then create user in memory (DB)
        User userFromGUI = new User();
        userFromGUI.setName(name.trim());
        userFromGUI.setEmail(email.trim().toLowerCase());
        userFromGUI.setPwd(EncryptDecryptUtils.encrypt(psw1));
        dao.create(userFromGUI);

        String token = EncryptDecryptUtils.encrypt(email);
        String url = "http://localhost:8080/web_app_war/activate?token=" + token;

        //2st send message with activate instruction
        EmailUtils.send(email, "APP REG", "<a href='" + url + "'>here</a> to activate</h1>" );

        //show some info in response

        PrintWriter pw = resp.getWriter();
        pw.println("check your email please");




    }
}
