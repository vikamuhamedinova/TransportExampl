package com.transport;

public class Car extends Transport
{
    String body;

    Car(String name,int wheels,int maxSpeed,String body)
    {
        super(name, wheels, maxSpeed);
        this.body = body;
    }

    @Override
    public void Display()
    {
        super.Display();
        System.out.printf("Тип кузова: %s\n\n", this.body);
    }
}
