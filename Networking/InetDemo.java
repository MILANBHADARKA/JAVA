import java.net.*;  
public class InetDemo{  
public static void main(String[] args){  
try{  
MyInetAddress ip=MyInetAddress.getByName("www.railway.app");  
  
System.out.println("Host Name: "+ip.getHostName());  
System.out.println("IP Address: "+ip.getHostAddress());  
}catch(Exception e){System.out.println(e);}  
}  
}  
