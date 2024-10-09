import java.io.*;

public class L11 {
    public static void main(String[] args) {
        if (args.length == 0) {
            System.out.println("Please provide a file name as a command-line argument.");
            return;
        }

        try {
            FileReader f = new FileReader("C:\\Users\\bhada\\Desktop\\coding\\JAVA\\FileHandling\\" + args[0]);
            BufferedReader br = new BufferedReader(f);

            int i;
            int words = 0;
            int lines = 0;
            int characters = 0;
            boolean inWord = false;

            while ((i = br.read()) != -1) {
                char ch = (char) i;
                characters++;

                if (ch == '\n') {
                    lines++;
                }

                if (Character.isWhitespace(ch)) {
                    if (inWord) {
                        words++;
                        inWord = false;
                    }
                } else {
                    inWord = true;
                }
            }

            // If the last character was part of a word, count it
            if (inWord) {
                words++;
            }

            // Increment lines if the file is not empty
            if (characters > 0) {
                lines++;
            }

            System.out.println("Words: " + words);
            System.out.println("Lines: " + lines);
            System.out.println("Characters: " + characters);

            br.close();
        } catch (IOException e) {
            System.out.println("Exception");
            e.printStackTrace();
        }
    }
}