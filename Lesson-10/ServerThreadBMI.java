import java.net.Socket;
import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;

public class ServerThreadBMI extends Thread
{
	private Socket socket;

	public ServerThreadBMI(Socket socket)
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
				String data[] = input.readLine().split(":");
				String result;

				int response = Integer.parseInt(data[0]);
				double height = Double.parseDouble(data[1]);
				double weight = Double.parseDouble(data[2]);

				if(response == 2)
				{
					break;
				} 

				double bmi = weight / (height * 2); 

				if(bmi < 18.5)
				{
					result = "Underweight";
				}
				else if(bmi >= 18.5 && bmi <=24.9 )
				{
					result = "Normal weight";
				}
				else if(bmi >= 25 && bmi <= 29.9)
				{
					result = "Overweight";
				}
				else
				{
					result = "Obese";
				}

				output.println(result);
			}			

		}
		catch(IOException e)
		{
			System.out.println("Server exception " + e.getMessage());
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