package lesson34;

import java.io.File;
import java.io.FileInputStream;
import java.io.IOException;
import java.util.Arrays;
import java.util.logging.Level;
import java.util.logging.LogManager;
import java.util.logging.Logger;

public class FileTest {
    static Logger LOGGER; // статический логгер

    static {
        try (FileInputStream ins = new FileInputStream("D://111//log.config")) {
            LogManager.getLogManager().readConfiguration(ins);
            LOGGER = Logger.getLogger(FileTest.class.getName());
        } catch (IOException ex) {
            ex.getMessage();
        }

    }

    public static void createFile() {
        String fileName = "test.txt";
        String folderName = System.getProperty("user.dir");
        String fullName = folderName + File.separator + fileName; //разделитель папок separator
        File file = new File(fullName);
        // проверка если есть файл
        if (!file.exists()) {//если нет файла
            try {
                if (file.createNewFile()) {
                    LOGGER.log(Level.INFO, "Создали тестовый файл");
                } else {
                    LOGGER.log(Level.INFO, "Не создали текстовый файл");
                }
            } catch (IOException ex) {
                LOGGER.log(Level.SEVERE, "Ошибка системы ввода-ввывода", ex);
            }
        } else {
            LOGGER.log(Level.INFO, "Файл существует");
        }

    }
    //вывести список фалов
    public static void getFileList(String path){
        File folder = new File(path);
        for (File item : folder.listFiles())
        if (item.isDirectory()){
            System.out.println(item.getAbsolutePath());
            System.out.println(Arrays.toString(folder.listFiles(File::isDirectory)));
            System.out.println(Arrays.toString(folder.listFiles(File::isFile)));
            getFileList(item.getAbsolutePath());
        }

    }

    public static void main(String[] args) {
        createFile();
        getFileList("D:/Korzyn");

    }

}
