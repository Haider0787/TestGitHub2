import java.net.*;
import java.io.*;


public class server
{
	public static void main(String[] args)
	{
//		if(args.length!=1)
//		{
//			System.out.println("Usage : java EchoServer <port number>");
//		}
	//	System.out.println("Usage : java EchoServer <port number>");
		int portnumber=8090;
		try {
			ServerSocket ss= new ServerSocket(portnumber);
			Socket clientSocket=ss.accept();
			PrintWriter out=new PrintWriter(clientSocket.getOutputStream(),true);
			BufferedReader in=new BufferedReader(new InputStreamReader((clientSocket.getInputStream())));
			String s;
			while((s=in.readLine()) !=null)
			{
				out.println(s);
			}
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System. out . println ( " Exception caught when trying to listen on port "
					+ portnumber + " or listening for a connection" ) ;
					System.out.println (e.getMessage()) ;
			
		}
				
	}
}