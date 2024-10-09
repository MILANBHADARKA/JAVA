import java.io.File;

public class Renamefile {
    public static void main(String[] args) {
        try {
            File f = new File("C:\\Users\\bhada\\Desktop\\coding\\JAVA\\FileHandling\\file.txt");     
            File f1 = new File("C:\\Users\\bhada\\Desktop\\coding\\JAVA\\FileHandling\\file12.txt");
            
            if(f.exists()){
                System.out.println(f.renameTo(f1));
            } else {
                System.out.println("Error in renaming file");
            }

        } catch (Exception e) {
            System.out.println("An error occurred.");
            e.printStackTrace();
        }
    }
}
