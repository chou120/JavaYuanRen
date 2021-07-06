package com.yuanren.core3;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Server {
    public static void main(String[] args) {
        try {
            ServerSocket serverSocket = new ServerSocket(6565);
            Socket accept = serverSocket.accept();
            InputStream inputStream = accept.getInputStream();

            byte[] bytes = new byte[1024];
            int read = inputStream.read(bytes);

            /*int  index=0;
            while(read!=-1){
                bytes[index++]=(byte)read;
                read = inputStream.read(bytes);
            }*/
            String s = new String(bytes,0,read);
            System.out.println("从客户端发送的数据为:"+s);

        } catch (IOException e) {
            e.printStackTrace();
        }


    }
}
