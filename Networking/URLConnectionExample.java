import java.io.*;    
import java.net.*;    
public class URLConnectionExample {    
public static void main(String[] args){    
try{    
URL url=new URL("https://moneymate.up.railway.app/customers");    
URLConnection urlcon=url.openConnection();  //openConnection() method of the URL class returns the //object of URLConnection class. 
InputStream stream=urlcon.getInputStream();    
int i;    
while((i=stream.read())!=-1){    
System.out.print((char)i);    
}    
}catch(Exception e){System.out.println(e);}    
}    
}    
