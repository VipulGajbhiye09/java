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

