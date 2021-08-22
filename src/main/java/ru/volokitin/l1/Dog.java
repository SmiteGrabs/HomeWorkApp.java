package ru.volokitin.l1;

public class Dog extends Animal
{
    static int dogCounter =0;
    public Dog(String name, String color)
    {
        this.name=name;
        this.color=color;
        dogCounter+=1;
        counter+=1;
    }

    public void dogInfo()
    {
        System.out.println("Всего было создано "+dogCounter+" собак");
    }

    public void run (int m)
    {
        if (m<=500)
        {
            System.out.println(name + " пробежал " + m +" метров.");
        }
        else
        {
            System.out.println(name + " не может столько пробежать, его предел 500м");
        }
    }

    public void swim(int m)
    {
        if (m<=10)
        {
            System.out.println(name + " проплыл "+m);
        }
        else
        {
            System.out.println(name + " не может столько проплыть, его предел 10м");
        }

    }
}
