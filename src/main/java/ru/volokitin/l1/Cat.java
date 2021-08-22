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
        this.maxRun=200;
        this.fullness=10;
    }

    public void catInfo()
    {
        System.out.println("Всего было создано "+catCounter+" котов");
    }


    public void swim()
    {
        System.out.println(name + " отказывается плыть");
    }
}
