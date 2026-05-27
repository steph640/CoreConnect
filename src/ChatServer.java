import java.net.*;

public class ChatServer {
    public static void main(String[] args) throws Exception {
        ServerSocket server = new ServerSocket(1234);
        System.out.println("Serveur en attente...");
        Socket client = server.accept();
        System.out.println("Client connecté !");
        server.close();
    }
}
