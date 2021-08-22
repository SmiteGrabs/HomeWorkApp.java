package ru.volokitin.l1;

public class classExecutioner {
    public static void main(String[] args)
    {

        Cat cat1 = new Cat ("Барсик","Белый");
        cat1.run(250);
        cat1.swim();
        Dog dog1 = new Dog ("Мистер Пиклз", "Черный");
        dog1.run(600);
        dog1.swim(12);
        Cat cat2 = new Cat ("Барсик2","Белый");
        Cat cat3 = new Cat ("Барсик3","Белый");
        Cat cat4 = new Cat ("Барсик4","Белый");
        Cat cat5 = new Cat ("Барсик5","Белый");
        Cat cat6 = new Cat ("Барсик6","Белый");
        cat1.catInfo();
        cat1.animalInfo();
        dog1.dogInfo();

        // Задание к уроку 7.

        Plate plate1=new Plate(50);


        Cat [] catArray =  {cat1,cat2,cat3,cat4,cat5,cat6};
        for (int i=0;i<catArray.length;i++)
        {
            catArray[i].eat(plate1);
            catArray[i].fullness();
        }
    }
}
