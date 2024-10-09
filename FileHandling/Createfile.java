import java.io.*;

//using try catch block

// public class Createfile  {
//     public static void main(String[] args) {
//         File  f = new File("C:\\Users\\bhada\\Desktop\\coding\\JAVA\\FileHandling\\file.txt");

//         try {
//             if(f.createNewFile()){
//                 System.out.println("File created: " + f.getName());
//             } else {
//                 System.out.println("File already exists");
//             }
//         } catch (IOException e) {
//             System.out.println("An error occurred.");
//             e.printStackTrace();
//         }
//     }
// }


//using throws IOException in main method

public class Createfile  {
    public static void main(String[] args) throws IOException {
        File  f = new File("C:\\Users\\bhada\\Desktop\\coding\\JAVA\\FileHandling\\file.txt");

            if(f.createNewFile()){
                System.out.println("File created: " + f.getName());
            } else {
                System.out.println("File already exists");
            }

    }
}

