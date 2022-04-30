import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.net.Socket;
import java.net.ServerSocket;

public class Server
{
	public static void main(String[] args) 
	{
            try(ServerSocket serverSocket = new ServerSocket(5000)) 
            {
                  Socket socket = serverSocket.accept();
                  System.out.println("Client Connected");

                  BufferedReader input = new BufferedReader(
                  	new InputStreamReader(socket.getInputStream()));
                  PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

                  while(true)
                  {
                  	String message = input.readLine();

                  	if(message.equals("exit"))
                  	{
                  		break;
                  	}

                  	output.println("Echo from server: " + message);
                  }            
		}
		catch (IOException e) 
		{
                  System.out.println("Server Error: " + e.getMessage());
            }
	}
}

