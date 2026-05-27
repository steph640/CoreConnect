import java.net.*;

public class ChatClient {
    public static void main(String[] args) throws Exception {
        Socket socket = new Socket("localhost", 1234);
        System.out.println("Connecté au serveur !");
        socket.close();
    }
}
