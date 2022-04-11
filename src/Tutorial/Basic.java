package src.Tutorial;
import java.util.Scanner;

public class Basic
{
    public static void hello_world()
    {
        System.out.println("Hello world!");
    }

    public static void variable_and_data_types()
    {
        // primitive data types
        int hello_world = 5;
        double num2 = 3.4;
        boolean b = false;
        char c = 'a';

        // not primitive data types
        String s = "the quick brown fox jumps over the lazy dog";

        int weh = hello_world +  (int) num2;

        System.out.println(hello_world);
        System.out.println(num2);
        System.out.println(b);
        System.out.println(c);
        System.out.println(s);
        System.out.println(weh);
    }

    public static void basic_operation()
    {
        int x = 5, y = 7, z = 56;

        int sum = x + y + z;
        int sub = x - y - z;
        double div = (double)z / (y + x);
        long mul = y * z;
        int mod = z % y;

        double exp = Math.pow(x, y);
        
        System.out.println(sum);
        System.out.println(sub);
        System.out.println(div);
        System.out.println(mul);
        System.out.println(mod);

        System.out.println(exp);
    }

    public static void input_and_scanners()
    {
        System.out.print("Please input something: ");
        Scanner sc = new Scanner(System.in);
        String scanned = sc.next();
        System.out.println("Your input is: " + scanned);

        System.out.print("Please input an integer: ");
        int scannedInt = sc.nextInt();
        System.out.print("Your integer is: ");
        System.out.println(scannedInt);

        System.out.print("Please input an integer again: ");
        String scanned2 = sc.next();
        int x = Integer.parseInt(scanned2);
        System.out.println(x);
        sc.close();
    }

    public static void relational()
    {
        int x = 6;
        int y = 7;
        int z = 10;
        // > < >= <= == !=
        boolean compare;
        compare = (x > y);
        System.out.println(compare);
        compare = (y < z);
        System.out.println(compare);

        String s1 = "the";
        String s2 = "asd";
        System.out.println(s1.equals("the"));

        System.out.println(x < y && y < z || s1 == s2);
    }

    public static void main(String[] args)
    {
        hello_world();
        variable_and_data_types();
        basic_operation();
        input_and_scanners();
        relational();
    }
}
