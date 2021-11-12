import java.net.Socket;
import java.io.PrintWriter;
import java.io.IOException;

public class SimpleJavaSocketClient {
    public static void main(String[] args) throws Exception {
        System.out.println("Sending Message to Client :)"); // System Output

        try {
            Socket socket = new Socket("192.168.0.17", 1234); // IP Address, Port
            PrintWriter printWriter = new PrintWriter(socket.getOutputStream());
            printWriter.write("This is the sample message sent from Kyle's Server"); // Message to send
            printWriter.flush();
            printWriter.close();
            socket.close();

        } catch (IOException e) {
            e.printStackTrace(); // Print Error

        }

    }
}
