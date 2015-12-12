import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;
import java.io.PrintStream;


public class Server {
	
	public static void main(String args[]) throws IOException
	{	
		System.out.println("Server gestartet");
		int number,temp;
		ServerSocket s1= new ServerSocket(4444);
		Socket ss = s1.accept();
		Scanner sc= new Scanner(ss.getInputStream());
		while(1<2) {
		number=sc.nextInt();
		temp=number*2;
		PrintStream p = new PrintStream(ss.getOutputStream());
		p.println(temp); }
	}
}