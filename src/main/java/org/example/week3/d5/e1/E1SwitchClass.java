package org.example.week3.d5.e1;

import java.util.Scanner;

public class E1SwitchClass {
    public static void main(String[] args) {
    Scanner input=new Scanner(System.in);
        System.out.println("Enter name of the instructor");
    String Name=input.next();
    String responsibility;

    switch(Name){
        case "Asghar":
           responsibility="Will take care of Java Assignment";
           break;

        case "Sohail":
            responsibility="Will take care of SDLC Assignment";
            break;

        case "Moazzam":
            responsibility="Will take care of Selenium Assignment";
            break;

        case "Asel":
            responsibility="Will take care of every Assignment";
            break;


            default:
                responsibility="Invalid instructor selected";
        }
        System.out.println(responsibility);

    }
}
