package ru.volokitin.l1;

public class Plate {
    public int foodValue;
    public Plate(int foodValue)
    {
        this.foodValue=foodValue;
    }
    public void plateInfo()
    {
        System.out.println(foodValue);
    }
    public void addFood(int foodValue)
    {
        this.foodValue=foodValue;
    }
}
