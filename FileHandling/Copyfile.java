

import java.io.FileInputStream;
import java.io.FileOutputStream;

public class Copyfile {
    public static void main(String[] args) {
        try {
            FileInputStream in = new FileInputStream("C:\\Users\\bhada\\Desktop\\coding\\JAVA\\FileHandling\\file1.txt");
            FileOutputStream out = new FileOutputStream("C:\\Users\\bhada\\Desktop\\coding\\JAVA\\FileHandling\\file2.txt");

            int i;

            while ((i = in.read()) != -1) {
                out.write(i);
            }

            in.close();
            out.close();

            System.out.println("Successfully copied file.");

        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
