import java.io.*;
import java.net.*;

public class TCPServer {
    public static void main(String[] args) {
        try {
            // Create server socket on port 5000
            ServerSocket serverSocket = new ServerSocket(5000);
            System.out.println("Server is running... waiting for client...");

            // Accept client connection
            Socket socket = serverSocket.accept();
            System.out.println("Client connected!");

            // Create input and output streams
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // Read message from client
            String clientMessage = in.readLine();
            System.out.println("Received from client: " + clientMessage);

            // Convert message to uppercase and send back
            String response = clientMessage.toUpperCase();
            out.println("Server Response: " + response);

            // Close connections
            in.close();
            out.close();
            socket.close();
            serverSocket.close();

            System.out.println("Server closed.");
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}