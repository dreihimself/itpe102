import java.awt.event.WindowAdapter;
import java.awt.event.WindowEvent;

public class WindowListener extends WindowAdapter
{
	@Override
    public void windowClosing(WindowEvent e) {
        ChatClient.chatWindow.dispose();

        if(ChatClient.out != null)
       		ChatClient.out.println("EXIT");
    }   
}