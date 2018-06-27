package UserInterface;

import Handlers.ServerHandler;
import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;

public class ChatClientController
{
    public TextArea ipTextArea;
    public TextArea messageTextArea;
    private String IpAddress;
    private ServerHandler ServerHandler;
    public void submitIp(ActionEvent actionEvent)
    {
        IpAddress = ipTextArea.getText();
        ServerHandler = new ServerHandler(IpAddress);

    }

    public void SendMessage(ActionEvent actionEvent)
    {
        ServerHandler.SendMessage(messageTextArea.getText());
    }
}
