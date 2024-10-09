import java.io.*;
import java.util.Scanner;

public class Two {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the file name: ");

        String fileName = sc.nextLine();
        File file = new File(fileName);

        try {
            if (file.createNewFile()) {
                System.out.println("File created: " + file.getName());
            } else {
                System.out.println("File exists.");
            }
        } catch (IOException e) {
            System.out.println("An error occurred.");
        }

        System.out.println("Enter the content to write in the file: ");
        String content = sc.nextLine();

        try {
            FileWriter fileWriter = new FileWriter(fileName);
            fileWriter.write(content);
            fileWriter.close();
        } catch (IOException e) {
            System.out.println("error");
        }


            try {
                File myObj = new File(fileName);
                Scanner myReader = new Scanner(myObj);

                int charr = 0;
                int word = 0;
                int line = 0;

                while (myReader.hasNextLine()) {
                    String data = myReader.nextLine();
                    line++;

                    charr += data.length();
                    String[] words = data.split(" ");
                    
                    word += words.length;
                    System.out.println(data);
                }
                System.out.println("Number of characters: " + charr);
                System.out.println("Number of words: " + word);
                System.out.println("Number of lines: " + line);
                myReader.close();
            } catch (FileNotFoundException e) {
                System.out.println("An error occurred.");
                e.printStackTrace();
            }
        

    }

}


