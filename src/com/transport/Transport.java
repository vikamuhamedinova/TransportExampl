package com.transport;

public abstract class Transport
{
    String name;
    int wheels;
    int maxSpeed;

    Transport(String name, int wheels, int maxSpeed)
    {
        this.name = name;
        this.wheels = wheels;
        this.maxSpeed = maxSpeed;
    }

    public void Display()
    {
        System.out.printf("Наименование транспорта: %s\n", name );
        System.out.printf("Кол-во колес: %d\n", wheels );
        System.out.printf("Максимальная скорость: %dкм/ч\n", maxSpeed );
    }
}
