package com.transport;

public class Motorcycle extends Transport
{
    boolean sidecar;

    Motorcycle(String name,int wheels,int maxSpeed, boolean sidecar)
    {
        super(name, wheels, maxSpeed);
        this.sidecar = sidecar;
    }

    @Override
    public void Display()
    {
        super.Display();
        if(this.sidecar)
        {
            System.out.printf("Присутствует боковая коляска\n\n");
        }
    }
}
