package ru.volokitin.l1;

import java.util.Arrays;

public class Lesson3 {

    public static void main(String[] args) {

// Задание 8 проверка
        int[] arrayMoveExample ={1,2,3,4,5,6,7,8,9,10};
        arrayMove(arrayMoveExample,-4);


// Задание 1
        int [] arr = {0,1,1,1,0,0,0,0};
        for (int i = 0; i<arr.length; i++)
            {
            if (arr [i]==0){
                arr [i] = 1;
            }
            else
            {
                arr[i] = 0;
            }
            System.out.println(arr[i]);

        }

// Задание 2

        int [] arr2 = new int [100];
        for (int a =0; a<100;a++)
        {
            arr2 [a] = a+1;
        }
        System.out.println(arr2 [99]);

// Задание 3

        int [] arr3 = { 1, 5, 3, 2, 11, 4, 5, 2, 4, 8, 9, 1};
        for (int iii=0;iii<arr3.length; iii++)
        {
            if (arr3[iii]<6)
            {
                arr3[iii]*=2;
                System.out.println(arr3[iii]);
            }
        }

// Задание 4

        int [][] arr4 = new int [10][10];
        String arr4String = Arrays.toString(arr4);
        for (int iv=0;iv<10;iv++)
        {
            for (int jv=0;jv<10;jv++)
            {
                if (jv==iv)
                {
                    arr4 [iv][jv]=0;
                }
                else
                {
                    arr4 [iv][jv]=1;
                }
                System.out.print(arr4[iv][jv]);

            }
            System.out.println(" ");
        }

// Задание 6

        int [] arrVi = {19,23,3,4,53,6,7,1};
        int max=arrVi[0],min=arrVi[0];
        for (int vi=0;vi<arrVi.length;vi++)
        {
            if (arrVi[vi]>max)
            {
                max = arrVi[vi];
            }
            else
            {
                if (arrVi[vi]<min)
                {
                    min = arrVi[vi];
                }
            }
        }

        System.out.println(max+"+"+min);

        int[] arrayExample = {2,2,2,2,4,4};
        System.out.println(arrayCompare(arrayExample));     //Задание 7 проверка

    }

// Задание 5

    public static int[] arrayCreator (int len,int initialValue)
    {
           int[] arr5 = new int [len];
           for (int i =0;i<len;i++)
           {
               arr5[i]=initialValue;
           }
           return arr5;
    }

// Задание 7

    public static boolean arrayCompare (int[] arr7)
    {
        int summLeft=arr7[0],summ=0;
        for (int vii=1;vii<arr7.length;vii++)
        {
          summ += arr7[vii];
        }
       for (int vii=1;vii<arr7.length;vii++)
       {
           if (summLeft==summ)
           {
               return true;
           }
           else
           {
               summ-=arr7[vii];
               summLeft+=arr7[vii];
           }
       }
       return false;
    }


// Задание 8, При условии, что предаваемые элементы массива не большое 9.

    public static void arrayMove (int[] arr, int n)
    {
        int summToDivide=0,multiplicator=1,changer;
        for (int viii=0;viii<arr.length;viii++)
        {
           summToDivide = summToDivide + (arr[viii] * multiplicator);
           multiplicator= multiplicator * 10;

            }
        System.out.println(summToDivide);

        for (int viii=0;viii<arr.length;viii++)
        {
            if((viii+n)<0)
            {
                changer=viii+n+arr.length;
            }
            else
            {
                if ((viii+n)<=(arr.length)-1)
                {
                    changer=viii+n;
                }
                else
                {
                    changer = viii+n-arr.length;
                }
            }
            arr[changer]=summToDivide%10;
            summToDivide/=10;
        }
        for (int viii=0;viii<arr.length;viii++)
        {
            System.out.print(arr[viii]+" ");
        }
        System.out.println(" "); // Новая строка, чтобы не спутывать результаты
    }


    }



