import javax.swing.*;
import java.awt.FlowLayout;
import java.io.*;
import java.net.Socket;
import java.awt.event.WindowAdapter;

public class ChatClient
{
	static JFrame chatWindow = new JFrame("Chat application");
	static JTextArea chatArea = new JTextArea(22, 40);
	static JTextField textField = new JTextField(40);
	static JLabel blankLabel = new JLabel("");
	static JButton sendButton = new JButton("Send");
	static BufferedReader in;
	static PrintWriter out;
	static JLabel nameLabel = new JLabel("");

	public ChatClient()
	{
		chatWindow.setLayout(new FlowLayout());
		chatWindow.add(nameLabel);
		chatWindow.add(new JScrollPane(chatArea));
		chatWindow.add(blankLabel);
		chatWindow.add(textField);
		chatWindow.add(sendButton);

		chatWindow.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
		chatWindow.setSize(475, 500);
		chatWindow.setVisible(true);
		textField.setEditable(false);
		chatArea.setEditable(false);

		sendButton.addActionListener(new Listener());
		textField.addActionListener(new Listener());
		chatWindow.addWindowListener(new WindowListener());
	}

	public static void main(String[] args) throws Exception
	{	
		ChatClient client = new ChatClient();
		client.startChat();
	}

	public void startChat() throws Exception
	{
		String ipAddress = JOptionPane.showInputDialog(chatWindow, "Enter ip address:", "IP is required", JOptionPane.PLAIN_MESSAGE);
		
		Socket soc = new Socket(ipAddress, 5000);

		in = new BufferedReader(new InputStreamReader(soc.getInputStream()));
		out = new PrintWriter(soc.getOutputStream(), true);

		while(true)
		{
			String str = in.readLine();

			if(str.equals("NAMEREQUIRED"))
			{
				String name = JOptionPane.showInputDialog(chatWindow, "Enter a name", "Name is required", JOptionPane.PLAIN_MESSAGE);

				out.println(name);
			} 
			else if(str.equals("NAMEALREADYEXIST"))
			{
				String name = JOptionPane.showInputDialog(chatWindow, "Name already exist, enter another name", "Name already exist", JOptionPane.WARNING_MESSAGE);			

				out.println(name);
			} 
			else if(str.startsWith("NAMEACCEPTED"))
			{
				// NAMEACCEPTEDdenver;
				textField.setEditable(true);
				String name = str.substring(12);
				nameLabel.setText("You are logged in as : " + name);
			} 
			else if(str.startsWith("DISCONNECTED"))
			{
				// DISCONNECTEDdenver;
				String name = str.substring(12);
				chatArea.append("Server: " + name + " is disconnected from the chat. \n");
			}
			else 
			{
				chatArea.append(str + "\n");
			}
		}
	}
}