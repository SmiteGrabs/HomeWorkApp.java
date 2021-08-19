package ru.volokitin.l1;

public class classExecutioner {
    public static void main(String[] args)
    {

        Cat cat1 = new Cat ("Барсик","Белый");
        cat1.run(200);
        cat1.swim();
        Dog dog1 = new Dog ("Мистер Пиклз", "Черный");
        dog1.run(500);
        dog1.swim(7);
        Cat cat2 = new Cat ("Барсик1","Белый");
        Cat cat3 = new Cat ("Мурзик","Белый");
        Cat cat4 = new Cat ("Барсик3","Белый");
        Cat cat5 = new Cat ("Барсик4","Белый");
        Cat cat6 = new Cat ("Барсик5","Белый");
        cat1.catInfo();
        cat1.animalInfo();
        dog1.dogInfo();
    }
}
