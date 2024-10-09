
import java.io.FileWriter;


public class Filewriter {
    public static void main(String[] args) {

        try {
            FileWriter writer = new FileWriter("C:\\Users\\bhada\\Desktop\\coding\\JAVA\\FileHandling\\file.txt");

            try {
                writer.write("Hello World");
            }
            catch (Exception e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
            finally{
                writer.close();
            }   

            System.out.println("Successfully wrote to the file.");

        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }    
}
