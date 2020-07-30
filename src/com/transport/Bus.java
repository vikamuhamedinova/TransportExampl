package com.transport;

public class Bus extends Transport
{
    int numSections;

    Bus(String name,int numWheels,int maxSpeed, int numSections)
    {
        super(name, numWheels, maxSpeed);
        this.numSections = numSections;
    }

    @Override
    public void Display()
    {
        super.Display();
        System.out.printf("Количество секций пассажирских мест: %d\n\n", this.numSections);
    }
}
