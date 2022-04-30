import java.net.Socket;
import java.net.ServerSocket;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class MultiThreadedServer {
	public static void main(String[] args) 
	{
		try(ServerSocket serverSocket = new ServerSocket(5000))
		{
			while(true)
			{
				Socket socket = serverSocket.accept();
				System.out.println("Client connected");

				ServerThread serverThread = new ServerThread(socket);
					serverThread.start();
			}
		} 
		catch (IOException e)
		{
			System.out.println("Server exception " + e.getMessage());
		}
	}
}