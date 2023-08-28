import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Client {
    static int port = 2001;
    static String host = "localhost";
    static DataInputStream in;
    static Socket socket;

    public static void main(String[] args) {

        try {
            socket = new Socket(host, port);
            in = new DataInputStream(socket.getInputStream());
        } catch (IOException e) {
            throw new RuntimeException(e);
        }

            try {
                System.out.println(in.readUTF());
            } catch (IOException e) {
                throw new RuntimeException(e);
            }
        }
    }



