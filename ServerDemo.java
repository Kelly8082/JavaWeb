import java.io.*;
import java.net.*;

class ServerDemo 
{
	public static void main(String[] args) throws Exception
	{
		ServerSocket ss = new ServerSocket(11000);
		Socket s = ss.accept();
		sop(s.getInetAddress().getHostAddress());

		PrintWriter pw = new PrintWriter(s.getOutputStream(),true);
		pw.println("<font color='blue' size=10 >Hi Client</font>");

		s.close();
		ss.close();
	}

	public static void sop(Object obj)
	{
		System.out.println(obj);
	}
}
