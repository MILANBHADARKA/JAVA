import java.io.*;

public class Fileread {
    public static void main(String[] args) {
        try {
            FileReader reader = new FileReader("C:\\Users\\bhada\\Desktop\\coding\\JAVA\\FileHandling\\file2.txt");

            try {
                int i;

                while ((i = reader.read()) != -1) {
                    System.out.print((char) i);
                }

            } catch (Exception e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            finally{
                reader.close();
            }

        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
