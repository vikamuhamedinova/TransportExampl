package com.transport;

import java.util.*;

public class Main {

    public static void main(String[] args)
    {
        Scanner input = new Scanner(System.in);
        String s = input.nextLine();
        TransportFactory factory = new TransportFactory();
        for (String str_type : s.split(" "))
        {
            int type = Integer.parseInt(str_type);
            Transport transport = factory.CreateTransport(type);
            if(transport != null)
            {
                transport.Display();
            }
        }
    }
}
