package Handlers;

import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStream;
import java.io.InputStreamReader;
import java.net.Socket;
import java.net.UnknownHostException;
import java.util.logging.SocketHandler;

public class ServerHandler
{
    private static int PortNumber = 8090;
    private String IpAddress;

    public ServerHandler(String ipAddress)
    {
        IpAddress = ipAddress;
    }

    public void ConnectToServer()
    {
        try (Socket socket = new Socket(IpAddress, PortNumber))
        {

        }
        catch (UnknownHostException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }

    public String GetServerMessages()
    {
        String messages = "";
        try (Socket socket = new Socket(IpAddress, PortNumber))
        {
            InputStreamReader input = new InputStreamReader(socket.getInputStream());
            BufferedReader reader = new BufferedReader(input);
            String line;
            while ((line = reader.readLine()) != null)
            {
                messages += line;
            }
        }
        catch (UnknownHostException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
        return messages;
    }

    public void SendMessage(String text)
    {
        try (Socket socket = new Socket(IpAddress, PortNumber))
        {

        }
        catch (UnknownHostException e)
        {
            e.printStackTrace();
        }
        catch (IOException e)
        {
            e.printStackTrace();
        }
    }
}
