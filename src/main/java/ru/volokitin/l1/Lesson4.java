package ru.volokitin.l1;

import java.util.Random;
import java.util.Scanner;

// Возможны остатки переменных из предыдущих вариаций


public class Lesson4 {

    public static void main(String[] args) {
        int size=5; // Размер поля
        char Winner='•';
        char[][] map= new char [size][size];
        int[] userMoves=new int[2]; // Массив для сохранения последнего хода игрока
        createMap(map);
        showMap(map);
        while(Winner=='•')
        {

            userTurn(map,userMoves);
            Winner = checkTurns(map,'X');
            if (Winner!='•')
            {
                break;
            }
            showMap(map);
            aiTurn(map,userMoves);
            Winner=checkTurns(map,'O');
            if (Winner!='•')
            {
                break;
            }
            showMap(map);
            System.out.println("Ваш ход.");
        }
        checkWinner(Winner);
    }

    public static void createMap(char[][] map)
    {
        char emptyField = '•';
        for (int i=0;i<map.length;i++)
        {
            for (int j=0;j<map.length;j++)
            {
                map[i][j]=emptyField;
            }
        }
    }
    public static Scanner scan = new Scanner(System.in);
    public static void userTurn(char[][]map,int[]moves)
    {

        int positive=1;
        do
        {
            System.out.println("Введите координаты точки куда вы хотите походить");
            System.out.println("Введите номер строки (номер первой строки равен 0)");

            moves[0] = scan.nextInt();
            System.out.println("Введите номер столбца (номер первого столбца равен 0)");
            moves[1] = scan.nextInt();
            if (validCheck(map, moves[0], moves[1]))
            {
                map[moves[0]][moves[1]] = 'X';
                positive++;
            }
            else
            {
                System.out.println("Введеные координаты заняты или не существуют. Попробуйте еще раз.");

            }
        }while (positive==1);
    }
    public static Random rand = new Random();
    public static void aiTurn(char [][]map,int[]moves)
    {
        System.out.println("Ход противника.");
        int positive=0;
        while(positive==0)
        {
            int turnX = rand.nextInt(3);
            turnX = (turnX - 1) +moves[0] ;
            int turnY = rand.nextInt(3);
            turnY = (turnY - 1) + moves[1];
            if (validCheck(map, turnX, turnY)) // Попытка заблокировать ход игрока
            {
                map[turnX][turnY] = 'O';
                positive++;
            }
            else // Ход, если заблокировать игрока не получилось (Ох уж этот рандом)
            {
                turnX = rand.nextInt(map.length);
                turnY = rand.nextInt(map.length);
                if (validCheck(map, turnX, turnY))
                {
                    map[turnX][turnY] = 'O';
                    positive++;
                }
            }

        }

    }


    public static boolean validCheck(char[][]map,int x,int y) //Подтверждение, что поле пустое
    {
        if (y >= 0 && x >= 0 && x < map.length && y < map.length)
        {
            if (map[x][y] == '•')
            {
                return true;
            }
            else
            {
                return false;
            }
        }
        else
        {
            return false;
        }

    }




    public static void showMap(char[][]map)
    {
        for (int i=0;i<map.length;i++)
        {
            for (int j=0;j<map.length;j++)
            {
                System.out.print(map[i][j]+" ");
            }
            System.out.println(" ");
        }
    }

    public static char checkTurns(char [][]map,char mark)
    {
        int winCounter=0;
        char winMark=0;
        //Проверка поля;
        switch (map.length)
        {
            case 3:
                winCounter=3;
                break;
            case 5:
                winCounter=4;
                break;
            default:
                System.out.println("Заданный размер поля не допустим");
                break;
        }
        //Проверка игрока
        switch (mark)
        {
            case 'X':
                winMark='X';
                break;
            case 'O':
                winMark='O';
                break;
            default:
                System.out.println("Заданное значение не найдено");
                break;
        }

        //Проверка по вертикали
        for (int i=0;i<map.length;i++)
        {
            int counter = 0;
            for (int j = 0; j < map.length; j++)
            {
                //Проверка по вертикали
                if (map[i][j] == winMark)
                {
                    counter++;
                    if (counter == winCounter)
                    {
                        return winMark;
                    }
                }
                else
                {
                    if (counter == winCounter)
                    {
                        return winMark;
                    }
                    else
                    {
                        counter = 0;
                    }
                }
            }
        }
        //Проверка по горизонтали
        for (int i=0;i<map.length;i++)
        {
            int counter = 0;
            for (int j = 0; j < map.length; j++)
            {
                if (map[j][i] == winMark)
                {
                    counter++;
                    if (counter == winCounter)
                    {
                        return winMark;
                    }
                }
                else
                {
                    if (counter == winCounter)
                    {
                        return winMark;
                    }
                    else
                    {
                        counter = 0;
                    }
                }
            }
        }
            // Проверка по диагонали
        //(0;0)
        int counter=0;
        for (int i=0;i<map.length;i++)
        {

           if (map[i][i]==winMark)
           {
               counter++;
               if (counter == winCounter)
               {
                   return winMark;
               }

           }
           else
           {
               if (counter == winCounter)
               {
                   return winMark;
               }
               else
               {
                   counter=0;
               }
           }
        }


        //Проверка по диогонали (1;0)
        counter=0;
        for (int i=0;i<map.length;i++)
        {

            if((i+1)< map.length)
            {
                if (map[i + 1][i] == winMark) {
                    counter++;
                    if (counter == winCounter) {
                        return winMark;
                    }

                } else {
                    if (counter == winCounter) {
                        return winMark;
                    } else {
                        counter = 0;
                    }
                }
            }
        }

        //Проверка по диогонали (0;4)
        counter=0;
        for (int i=0;i<map.length;i++)
        {
            if (map[i][(map.length-1)-i]==winMark)
            {
                counter++;
                if (counter == winCounter)
                {
                    return winMark;
                }

            }
            else
            {
                if (counter == winCounter)
                {
                    return winMark;
                }
                else
                {
                    counter=0;
                }
            }
        }

        //Проверка по диогонали (0;3)
        counter=0;
        for (int i=0;i<map.length;i++)
        {
            if(((map.length - 1) - i - 1)>=0)
            {
                if (map[i][(map.length - 1) - i - 1] == winMark) {
                    counter++;
                    if (counter == winCounter) {
                        return winMark;
                    }

                } else {
                    if (counter == winCounter) {
                        return winMark;
                    } else {
                        counter = 0;
                    }
                }
            }
        }
        int drawCounter=(map.length)*(map.length);
        for (int i=0;i< map.length;i++)
        {
            for (int j=0;j< map.length;j++)
            {

                if (map[i][j]!='•')
                {
                    drawCounter--;
                }
            }
        }
        if (drawCounter==0)
        {
            return '+';
        }
    return '•';
    }


    public static void checkWinner(char Winner)
    {
        switch (Winner)
        {
            case 'X':
                System.out.println("Поздравляю! Вы победили!!!!");
                break;
            case 'O':
                System.out.println("К сожалению вы проиграли");
                break;
            default:
                System.out.println("Ничья");
        }
    }
}
