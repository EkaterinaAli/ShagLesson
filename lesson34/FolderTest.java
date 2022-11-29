package lesson34;

import java.io.File;
import java.io.IOException;

public class FolderTest {
    public static void main(String[] args) {
       File folder = new File("D://111//222");
       /* boolean created = folder.mkdir();//make directory, создать каталог (папку)
        if (created){
            System.out.println("Папка создана, путь " + folder.getAbsolutePath() );
        }
        else {
            System.out.println("Папка не создана");
        }

        */
        File newFolder = new File("D://111//new222");
        /*boolean renamed = folder.renameTo(newFolder);
        if (renamed){
            System.out.println("Папка " + folder.getAbsolutePath() + " переименовано в " + newFolder.getAbsolutePath());

        }
        else {
            System.out.println("Папка " + folder.getAbsolutePath() + " не переименовано в " + newFolder.getAbsolutePath());
        }
         */
        boolean deleted = newFolder.delete();
        if (deleted){
            System.out.println("Папка " + newFolder.getAbsolutePath() + " удалена");
        }
        else {
            System.out.println("Папка " + newFolder.getAbsolutePath() + " не удалена");
        }
    }
}
