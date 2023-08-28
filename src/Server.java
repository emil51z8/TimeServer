import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Date;

public class Server {
    static int port = 2001;
    static DataOutputStream out;
    static ServerSocket server;
    static Socket socket;

    public static void main(String[] args) {
        try {
            server = new ServerSocket(port);
            socket = server.accept();

            out = new DataOutputStream(socket.getOutputStream());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


        try {
            out.writeUTF("Den aktuelle tid er : " + new Date().toString());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }


    }
}


