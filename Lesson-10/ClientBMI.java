import java.io.IOException;
import java.io.BufferedReader;
import java.io.InputStreamReader;
import java.io.PrintWriter;
import java.util.Scanner;
import java.net.Socket;

public class ClientBMI
{
	public static void main(String[] args) 
	{
		try(Socket socket = new Socket("127.0.0.1", 5000))
		{
        BufferedReader input = new BufferedReader(
            new InputStreamReader(socket.getInputStream()));
        PrintWriter output = new PrintWriter(socket.getOutputStream(), true);

        Scanner scanner = new Scanner(System.in);
        double weight;
        double height;
       	int userEntry;
       	String response;

       	System.out.println("Press (1) to compute for BMI press (2) to exit");
       	userEntry = scanner.nextInt();

        do 
        {
          if(userEntry != 2) {
              System.out.print("Enter weight in kg >>> ");
            weight = scanner.nextDouble();
            scanner.nextLine();

            System.out.print("Enter height in cm >>> ");
            height = scanner.nextDouble();

            output.println(userEntry+":"+height+":"+weight);

          } else {
          	output.println(userEntry+":0:"+"0");
          	break;
          }
          
          response = input.readLine();
          System.out.println(response);

          System.out.println("Press (1) to compute for BMI press (2) to exit");
       		userEntry = scanner.nextInt();
        } while(true);
		}
		catch(IOException e)
		{
			System.out.println("Client Error : " + e.getMessage());
		}
	}
}