package ru.volokitin.l1;

public class Animal
{
    public String name;
    public String color;
    static int counter=0;
    public int maxSwim;
    public int maxRun;
    public boolean full=false; // Изначально животное голодное
    public int fullness = 50; //примерное число насыщения

    public Animal()
    {

    }

    public void animalInfo()
    {
        System.out.println("Всего было создано "+counter+" животных");
    }

    public void run(int m)
    {

        if (m<=maxRun)
        {
            System.out.println(name + " пробежал " + m +" метров.");
        }
        else
        {
            System.out.println(name + " не может столько пробежать, его предел "+maxRun);
        }
    }

    public void swim(int m)
    {
        if (m<=maxSwim)
        {
            System.out.println(name + " проплыл "+m);
        }
        else
        {
            System.out.println(name + " не может столько проплыть, его предел "+maxSwim);
        }
    }

    // Задание к 7 уроку

    public void eat(Plate plate)
    {
        if (plate.foodValue>0 && plate.foodValue>=fullness)
        {
            full=true;
            plate.foodValue-=fullness;
        }
        else
        {
            System.out.println("На тарелке недостаточно еды, чтобы накормить "+ name );
        }
    }

    public void fullness()
    {
        if (full==true)
        {
            System.out.println(name+" сыт");
        }
        else
        {
            System.out.println(name+" голоден");
        }
    }

}

