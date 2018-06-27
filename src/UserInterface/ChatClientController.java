package UserInterface;

import javafx.event.ActionEvent;
import javafx.scene.control.TextArea;

public class ChatClientController
{
    public TextArea ipTextArea;
    private String IpAddress;
    public void submitIp(ActionEvent actionEvent)
    {
        IpAddress = ipTextArea.getText();
        System.out.println(IpAddress);
    }
}
