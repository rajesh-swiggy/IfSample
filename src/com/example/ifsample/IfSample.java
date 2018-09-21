package com.example.ifsample;

public class IfSample {
    public static void main(String[] args) {
        int x,y;

        x=10;
        y=20;

        if(x<y) System.out.println("x is less than y.");

        x=x*2;
        if(x==y) System.out.println("x not equal to y.");

        x = x*2;
        if (x>y)    System.out.println("x now greater than y.");

        //this wont be displayed
        if(x==y)    System.out.println("you wont see this.");
    }
}
