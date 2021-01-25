package hw26;

import java.io.DataInputStream;
import java.io.DataOutputStream;
import java.io.IOException;
import java.io.PrintWriter;
import java.net.ServerSocket;
import java.net.Socket;
import java.util.Scanner;

public class Server {
    static ServerSocket server;
    static Socket socket;
    static final int PORT = 18189;
    static DataInputStream in;
    static DataOutputStream out;

    public static void main(String[] args) {
        try {
            server = new ServerSocket(PORT);
            System.out.println("Server run");
            socket = server.accept();
            System.out.println("Client connected");


            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());
        } catch (IOException e) {
            e.printStackTrace();
        }

        new Thread(() -> {
                try {
                    while (true) {

                        String str = in.readUTF();

                        if (str.equals("/end")) {
                            System.out.println("Client disconnected");
                            break;
                        }
                        System.out.println("Client: " + str);
                    }
                } catch (IOException e) {
                    e.printStackTrace();
                } finally {
                    try {
                        socket.close();
                        server.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
        }).start();


            new Thread(() -> {
                while(true) {
                    Scanner sc = new Scanner(System.in);
                    String strOut = sc.nextLine();
                    try {
                        out.writeUTF(strOut);
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();

    }
}






