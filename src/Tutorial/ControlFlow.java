package src.Tutorial;
import java.util.Scanner;

public class ControlFlow
{
    public static Scanner sc = new Scanner(System.in);

    public static void conditional()
    {
        String s = sc.nextLine();

        if (s.equals("maiuna"))
        {
            System.out.println("You typed maiuna");
        }
        else if (s.equals("idk"))
        {
            System.out.println("You don't know what to input 'eh");
        }
        else
        {
            System.out.println("okay.");
        }
    }

    public static void nested_statement()
    {
        System.out.print("Input your age: ");
        String s = sc.nextLine();
        int age = Integer.parseInt(s);

        if (age >= 18)
        {
            System.out.println("You are an adult");
            System.out.print("What is your favorite food? ");
            String favoriteFood = sc.nextLine();
            
            if (favoriteFood.equalsIgnoreCase("pizza"))
            {
                System.out.println("Wow, mine too!");
            }
            else
            {
                System.out.println("Mine is pizza");
            }
        }
        else if (age >= 13)
        {
            System.out.println("You are a teenager");
        }
        else
        {
            System.out.println("You are not a teenager or an adult");
        }
    }

    public static void loops()
    {
        for (int i = 0; i < 5; ++i)
        {
            System.out.println("hello");
        }

        int[] arr = {1,42,7,12,6};
        for (int i = 0; i < arr.length; ++i)
        {
            System.out.println(arr[i] + " at index " + i);
        }

        String[] stringArr = {"the", "quick", "brown", "fox", "jumps", "over", "the", "lazy", "dog"};
        for (String element:stringArr)
        {
            System.out.print(element + ' ');
            if (element.equals("over"))
            {
                System.out.println('\n' + "Yeah, it's over");
                break;
            }
        }
        System.out.print('\n');

        int x = 0;
        while (x < 6)
        {
            System.out.println(x);
            ++x;
        }

        do
        {
            System.out.println("aaa");
            --x;
        } while (x > 0);

        System.out.println(x);
    }

    public static void main(String[] args)
    {
        // conditional();
        // nested_statement();
        loops();
    }
}
