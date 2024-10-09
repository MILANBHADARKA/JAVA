import java.io.*;
import java.net.*;

public class Server2 {
    public static void main(String[] args) {
        try {
            ServerSocket ss = new ServerSocket(6666);

            Socket s = ss.accept();

            DataInputStream dis = new DataInputStream(s.getInputStream());
            DataOutputStream dout = new DataOutputStream(s.getOutputStream());         
            BufferedReader br = new BufferedReader(new InputStreamReader(System.in));

            String str="", str2="";

            while(!str.equals("stop")){
                str = br.readLine();    // reading from the console (keyboard) 
                dout.writeUTF(str);
                dout.flush();
                str2 = dis.readUTF();
                System.out.println("Client says: "+str2);
            }

            dout.close();
            s.close();


        } catch (Exception e) {
            System.out.println(e);
        }
    }
}
