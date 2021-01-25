package hw26;


import java.io.*;

import java.net.Socket;
import java.util.Scanner;


public class Client {
    static Socket socket;

    static final String IP_ADDRESS = "localhost";
    static final int PORT = 18189;
    static DataInputStream in;
    static DataOutputStream out;


    public static void main(String[] args) {

        try {
        socket = new Socket(IP_ADDRESS, PORT);

            in = new DataInputStream(socket.getInputStream());
            out = new DataOutputStream(socket.getOutputStream());

            new Thread(()-> {
                try {
                    while (true) {

                        String str = in.readUTF();

                        if (str.equals("/end")) {
                            System.out.println("Client disconnected");
                            break;
                        }
                        System.out.println("Server: " + str);


                    }
                } catch (IOException e) {
                    e.printStackTrace();
                }finally {
                    try {
                        socket.close();
                    } catch (IOException e) {
                        e.printStackTrace();
                    }
                }
            }).start();
        } catch (IOException e) {
            e.printStackTrace();
        }
        new Thread(()->{
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