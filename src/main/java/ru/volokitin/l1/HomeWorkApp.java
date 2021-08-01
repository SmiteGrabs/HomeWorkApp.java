package ru.volokitin.l1;

public class HomeWorkApp {
    public static void main(String[] args) {
        printThreeWords();
        checkSumSign();
        printColor();
        compareNumbers();
    }
// Задание 2 **************************************************************

    public static void printThreeWords(){
        System.out.println("Orange\n"+"Banana\n"+"Apple");
    }

// Задание 3 **************************************************************

    public static void  checkSumSign(){
        int a = 2, b = -3;
        a +=b;
        if (a>0){
            System.out.println("Сумма положительная");
        }
        else{
            System.out.println("Сумма отрицательная");
        }
    }

// Задание 4 *********************************************************

    public static void printColor(){
        int value = 120;
        if (value>0){
            if (value>100){
                System.out.println("Зеленый");
            }
            else {
                System.out.println("Желтый");
            }
        }
        else{
            System.out.println("Красный");
        }
    }

// Задание 5 *********************************************************

    public static void compareNumbers(){
        int a=1, b=5;
        if (a>=b){
            System.out.println("a>=b");
        }
        else{
            System.out.println("a<b");
        }
    }
}


