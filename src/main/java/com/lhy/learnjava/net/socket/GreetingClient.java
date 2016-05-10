/**
 * Company
 * Copyright (C) 2004-2016 All Rights Reserved.
 */
package com.lhy.learnjava.net.socket;

import java.net.*;
import java.io.*;
/**
 * @author xuhaitao
 * @version $Id GreetingClient.java, v 0.1 2016-05-10 13:25 xuhaitao Exp $$
 */
public class GreetingClient
{
    public static void main(String [] args)
    {
        String serverName = "localhost";
        int port = Integer.parseInt("6066");
        try
        {
            System.out.println("Connecting to " + serverName
                    + " on port " + port);
            Socket client = new Socket(serverName, port);
            System.out.println("Just connected to "
                    + client.getRemoteSocketAddress());
            OutputStream outToServer = client.getOutputStream();
            DataOutputStream out =
                    new DataOutputStream(outToServer);

            out.writeUTF("Hello from "
                    + client.getLocalSocketAddress());
            InputStream inFromServer = client.getInputStream();
            DataInputStream in =
                    new DataInputStream(inFromServer);
            System.out.println("Server says " + in.readUTF());
            client.close();
        }catch(IOException e)
        {
            e.printStackTrace();
        }
    }
}
