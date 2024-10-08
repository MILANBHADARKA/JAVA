import java.io.*;
import java.net.*;

public class Client3 {
    public static void main(String[] args) {
        try {
            Socket s = new Socket("localhost", 6666);

            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());

            dos.writeUTF("5");
            dos.flush();
            String str = dis.readUTF();
            System.out.println("Server says: " + str);

            s.close();
            
        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
