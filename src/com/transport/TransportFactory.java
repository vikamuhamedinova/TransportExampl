package com.transport;

public class TransportFactory
{
    public Transport CreateTransport(int type)
    {
        switch (type)
        {
            case 0:
                return new Motorcycle("мотоцикл", 2, 100, true);
            case 1:
                String foldingMechanism = "Рулевая стойка складывается вместе с передним колесом";
                return new Scooter("самокат", 2, 10, foldingMechanism);
            case 2:
                return new Car("автомобиль", 4, 150, "универсал");
            case 3:
                return new Bus("автобус", 6, 100, 2);
            default:
                System.out.println("Неизвестный тип транспорта \n");
        }
        return null;
    }
}
