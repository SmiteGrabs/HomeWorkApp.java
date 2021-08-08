package ru.volokitin.l1;

public class Lesson2 {
    public static void main(String[] args) {
       System.out.println(compare(10,1));
       posOrNeg(-3);
       System.out.println(campareSecond(2));
       lineWriter("Проходи не задерживайся",10);
       System.out.println(yearDeterminator(1100));

    }

// Задание 1 *****************************************************

    public static boolean compare (int a, int b){
        int x = a+b;
        boolean y;
        if (x>=10 && x<=20){
            y = true;
        }
        else {
            y= false;
        }
        return y;
    }

// Задание 2 *******************************************************

    public static void posOrNeg (int a){
        if (a>=0){
            System.out.println("Число Положительное");
        }
        else {
            System.out.println("Число Отрицательное");
        }
    }

// Задание 3 *******************************************************

    public static boolean campareSecond (int a) {
        boolean y;
        if (a < 0) {
            y = true;
        } else {
            y = false;
        }
        return y;
    }
// задание 4 *******************************************************

    public static void lineWriter (String str,int a){
        for (int i=0;i<a;i++){
            System.out.println(str);

        }
    }

// Задание 5 *******************************************************

    public static boolean yearDeterminator(int year){
        boolean y;
        if (year%400==0){
            y=true;
        }
        else {
            if (year%100==0){
                y=false;
            }
            else {
                if (year%4==0){
                    y=true;
                }
                else {
                    y=false;
                }
            }
        }

    return y;}
    // Еще коментарий для pull
}
