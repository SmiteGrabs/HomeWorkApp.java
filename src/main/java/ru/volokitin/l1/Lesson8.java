package ru.volokitin.l1;

import java.util.Random;
import java.util.Scanner;

public class Lesson8
{
    public static void main(String[] args)
    {
        // new Lesson8Window();



        String[] words = {"apple", "orange", "lemon", "banana", "apricot", "avocado", "broccoli", "carrot", "cherry", "garlic", "grape", "melon", "leak", "kiwi", "mango", "mushroom", "nut", "olive", "pea", "peanut", "pear", "pepper", "pineapple", "pumpkin", "potato"};
        String guessWord = getWord(words);
        String userGuess=" ";
        System.out.println("Добро пожаловать в игру 'Угадайка'! ");
        while(guessWord.equals(userGuess) == false)
        {
            System.out.println("Введите слово." );
            userGuess = guessUser();
            compareAnswer(guessWord, userGuess);
        }
        System.out.println("ПОздравляю! Вы угадали");


    }

    public static Random random = new Random();
    public static String getWord(String[] word)
    {
        int i = random.nextInt(25);
        return word[i];
    }
    public static String guessUser()
    {
        Scanner scanner = new Scanner(System.in);
        String answer = scanner.next();
        return answer;

    }
    public static void compareAnswer(String word, String answer)
    {
        StringBuilder clue= new StringBuilder();
        int clueLength=15;
        int wordLength=word.length();
        int answerLength=answer.length();
        char [] wordArray=new char[clueLength];
        char [] answerArray = new char[clueLength];


        for (int i=0; i<wordLength;i++) //загоняем слово в массив
        {

            if (i>word.length()) //сделано, чтобы был сплошной ряд #, после проверки в wordArray== answerArray
            {
                wordArray[i]='a';
            }
            else
            {
                wordArray[i]=word.charAt(i);
            }
        }
        for (int i=0; i<answerLength;i++) //загоняем слово в массив
        {

            if(i>answer.length())
            {
                answerArray[i]='b';
            }
            else
            {
                answerArray[i]=answer.charAt(i);
            }

        }
        for (int i = 0; i<clueLength;i++)
        {
            if(wordArray[i]==answerArray[i])
            {
                clue.append(answerArray[i]);
            }
            else
            {
                clue.append("#");
            }

        }
        System.out.println(clue);
    }
}
