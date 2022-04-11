package src.Tutorial.OOP;

import java.util.Scanner;

public class Intro
{
    public static void intro_to_objects()
    {
        // objects are instances of any data types
        Scanner sc = new Scanner(System.in);
        int x = 5;              // x is an int object
        String str = "hello";   // str is a String object

        // methods are anything that is called on an object
        // sc.next();
        str.length();
        str.toCharArray();
    }

    public static void hello(String str, int r)
    {
        for (int i = 0; i < r; ++i)
            System.out.println(str);
    }

    public static void main(String[] args)
    {
        intro_to_objects();
        hello("the quick brown fox jumps over the lazy dog", 5);
    }
    
}
