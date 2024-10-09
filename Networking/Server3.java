
import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server3 {

    public static void main(String[] args) {

        try {
            ServerSocket ss = new ServerSocket(6666);

            Socket s = ss.accept();

            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dos = new DataOutputStream(s.getOutputStream());

            String st = dis.readUTF();

            int number = Integer.parseInt(st);
            number = number*number*number;
            
            dos.writeUTF(String.valueOf(number));

            ss.close();



        } 
        catch (Exception e) {
            System.out.println(e);
        }

    }
}
