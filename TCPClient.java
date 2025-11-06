import java.io.*;
import java.net.*;

public class TCPClient {
    public static void main(String[] args) {
        try {
            // Connect to the server at localhost, port 5000
            Socket socket = new Socket("localhost", 5000);

            // Create input and output streams
            BufferedReader in = new BufferedReader(new InputStreamReader(socket.getInputStream()));
            PrintWriter out = new PrintWriter(socket.getOutputStream(), true);

            // Send message to server
            String message = "Hello from Sakshi Yadav";
            out.println(message);

            // Receive and print response from server
            String response = in.readLine();
            System.out.println("Received from server: " + response);

            // Close connections
            in.close();
            out.close();
            socket.close();
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}