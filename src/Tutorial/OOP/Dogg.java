package src.Tutorial.OOP;



// what does static means
public class Dogg
{
    // class variable
    protected static int count = 0;

    // instance variable
    protected String name;      // protected only class in the same package and subclass can access
    protected int age;
    
    // constructor method
    public Dogg(String name, int age)
    {
        this.name = name;
        this.age = age;
        Dogg.count += 1;
        Dogg.display();
    }

    // static method
    public static void display()
    {
        System.out.println("I am a dog!");
    }
}
