import java.net.*;
import java.io.*;
public class Client 
{
	public static void main(String [] args)
	{
//		if(args.length!=2)
//		{
//			System.out. println("Usage : java EchoCl ient <host name> <port number>" );
//		}
		System.out. println("Usage : java EchoCl ient <host name> <port number>" );
		String hostname="127.0.0.1";
		int portnum=8090;
		try {
			Socket echo=new Socket (hostname,portnum);
			PrintWriter out=new PrintWriter(echo.getOutputStream(),true);
			BufferedReader in=new BufferedReader(new InputStreamReader(echo.getInputStream()));
			BufferedReader stdln=new BufferedReader(new InputStreamReader(System.in));
			String s;
			while((s=stdln.readLine())!=null)
			{
				out.println(s) ;
				System.out.println( " echo : " + in.readLine ( ) ) ;
			}
		} catch (UnknownHostException e) {
			// TODO Auto-generated catch block
			System.out.println( "Don’t know about host " + hostname ) ;
			System.exit(1);
		} catch (IOException e) {
			// TODO Auto-generated catch block
			System.out.println( "Couldn't get IO for the connection to " + hostname ) ;
			System.exit(1);
		}
		
	}
}
