package ru.volokitin.l1;

public class Employee {
    String name;
    String position;
    String phoneNumb;
    int salary;
    int age;

    public Employee (){

    }
    public Employee (String name, String position, String phoneNumb,int salary,int age)
    {
        this.name=name;
        this.position=position;
        this.phoneNumb=phoneNumb;
        this.salary=salary;
        this.age=age;
    }
    public static void employeeInfo(Employee person)
    {
        System.out.println("Имя сотрудника: "+person.name);
        System.out.println("Возраст: "+person.age);
        System.out.println("Должность: "+person.position);
        System.out.println("Номер телефона: "+person.phoneNumb);
        System.out.println("Заработная плата: "+person.salary);
        System.out.println(" ");
    }




    public static void main(String[] args) {
        Employee [] person = new Employee[5];
        person[0] = new Employee("Иванов Иван Иванович","Охранник","+7(999)999-99-99",200,25);
        person[1] = new Employee("Иванов Иван Иванович","Директор","+7(999)999-99-99",300,55);
        person[2] = new Employee("Иванов Иван Иванович","Уборщик","+7(999)999-99-99",100,35);
        person[3] = new Employee("Иванов Иван Иванович","Водитель","+7(999)999-99-99",150,40);
        person[4] = new Employee("Иванов Иван Иванович","Продавец","+7(999)999-99-99",250,55);

        for (int i =0;i<person.length; i++)
        if (person[i].age>40)
        {
            employeeInfo(person[i]);
        }
    }
}
