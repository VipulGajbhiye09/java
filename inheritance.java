package inheritance;

import java.util.*;

abstract class Player{
    String name;
    int score;
}

class Cricket_player extends Player{
    void display(){
        System.out.println("Cricket :");
        System.out.println("Player name :"+name);
        System.out.println("Player Score :"+score+"\n");
    }
}

class Hockey_player extends Player{
    void display(){
        System.out.println("Hockey :");
        System.out.println("Player name :"+name);
        System.out.println("Player Score :"+score+"\n");
    }
}

class Football_player extends Player{
    void display(){
        System.out.println("Football :");
        System.out.println("Player name :"+name);
        System.out.println("Player Score :"+score+"\n");
    }
}

public class Inheritance {

    public static void main(String[] args) {
        Scanner s = new Scanner(System.in);
        Cricket_player obj1 = new Cricket_player();
        Hockey_player obj2 = new Hockey_player();
        Football_player obj3 = new Football_player();
        obj1.name="Sachin";
        obj1.score=162;
        obj2.name="Gaurav";
        obj2.score=29;
        obj3.name="Arush";
        obj3.score=82;
        obj1.display();
        obj2.display();
        obj3.display();   
    }
    
}
