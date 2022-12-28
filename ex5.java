import java.io.*;
 
class Employee {
    int salary = 60000;
}

class Manager extends Employee {
    int benefits = 10000;
}

public class Main {
    public static void main(String args[])
    {
        Manager obj = new Manager();
        System.out.println("Salary : " + obj.salary + "\nBenefits : " + obj.benefits);
    }
}
