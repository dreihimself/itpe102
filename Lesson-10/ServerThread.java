import java.net.Socket;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ServerThread extends Thread
{
	private Socket socket;

	public ServerThread(Socket socket)
	{
		this.socket = socket;
	}

	@Override
	public void run()
	{
		try 
		{
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

				System.out.println("Message from client : " + message);
				output.println("Echo from server: " + message);
			}			
		}
		catch(IOException e)
		{
			System.out.println("Error message : " + e.getMessage());
		}
		finally
		{
			try 
			{
				socket.close();
			}
			catch(IOException e)
			{
				System.out.println("Error closing socket connection : " + e.getMessage());
			}
		}
	}
}