import java.io.*;

class Employee {
    int salary = 50000;
}
class Employer extends Employee {
    int benefits = 5000;
}

public class Main {
    public static void main(String args[])
    {
        Employer e = new Employer();
