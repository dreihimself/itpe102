import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.net.Socket;

public class Client
{
	public static void main(String[] args) 
	{
		try(Socket socket = new Socket("127.0.0.1", 5000))
		{
            BufferedReader input = new BufferedReader(
                new InputStreamReader(socket.getInputStream()));
            PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

            Scanner scanner = new Scanner(System.in);
            String message;
            String response;

            do {
                System.out.print("Enter message >>> ");
                message = scanner.nextLine();

                output.println(message);

                if(!message.equals("exit")) {
                    response = input.readLine();
                    System.out.println(response);
                }
                
            } while(!message.equals("exit"));

		}

		catch(IOException e)
		{
			System.out.println("Client Error : " + e.getMessage());
		}
	}
}

