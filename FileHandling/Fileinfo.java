import java.io.File;

public class Fileinfo {
    public static void main(String[] args) {
        File f = new File("C:\\Users\\bhada\\Desktop\\coding\\JAVA\\FileHandling\\file.txt");

        if(f.exists()){
            System.out.println("File name: " + f.getName());
            System.out.println("Absolute path: " + f.getAbsolutePath());
            System.out.println("Writeable: " + f.canWrite());
            System.out.println("Readable: " + f.canRead());
            System.out.println("File size in bytes: " + f.length());
            System.out.println("File Deleted: " + f.delete());
        }
        else{
            System.out.println("File does not exist");
        }
    }    
}
