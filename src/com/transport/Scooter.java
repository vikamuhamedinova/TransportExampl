package com.transport;

public class Scooter extends Transport
{
    String foldingMechanism;

    Scooter(String name,int wheels,int maxSpeed, String foldingMechanism)
    {
        super(name, wheels, maxSpeed);
        this.foldingMechanism = foldingMechanism;
    }

    @Override
    public void Display()
    {
        super.Display();
        System.out.printf("%s \n\n", this.foldingMechanism);
    }
}
