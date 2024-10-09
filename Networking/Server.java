
import java.io.*;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {

    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(6666);

            Socket s = ss.accept();

            DataInputStream dis = new DataInputStream(s.getInputStream());

            String str = (String) dis.readUTF();          // readUTF() is used to read the data from the input stream

            System.out.println("message= " + str);

            ss.close();
        } catch (Exception e) {
            System.out.println(e);
        }

    }
}
