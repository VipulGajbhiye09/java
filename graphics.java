package javaapplication16;

import java.util.*;
import java.awt.*;
import java.applet.*;

public class JavaApplication16 extends Applet {

    public void paint (Graphics g){
        Scanner obj = new Scanner(System.in);
        String s = new String("Hello World");
       
       g.setColor(Color.red);
       g.fillRect(200,100,200,180);
      
       g.setColor(Color.blue);
       g.fillOval(400,100,400,180);
      
       g.setColor(Color.green);
       g.drawLine(100,100,300,80);
       
       g.drawString(s,10,50);
    }
    
}
