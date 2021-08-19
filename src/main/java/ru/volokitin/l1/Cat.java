package ru.volokitin.l1;

public class Cat extends Animal
{
    static int catCounter=0;
    public Cat(String name, String color)
    {
        this.name=name;
        this.color=color;
        catCounter+=1;
        counter+=1;
    }
    public void catInfo()
    {
        System.out.println("Всего было создано "+catCounter+" котов");
    }

    public void run (int m)
    {
        if (m<=200)
        {
            System.out.println(name + " пробежал " + m +" метров.");
        }
        else
        {
            System.out.println(name + " не может столько пробежать, его предел 200м");
        }
    }
    public void swim()
    {
        System.out.println(name + " отказывается плыть");
    }
}
