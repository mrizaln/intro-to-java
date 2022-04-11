package src.Tutorial.OOP;

public class Main 
{
    // about class and inheritance
    // open Dog.java and Cat.java
    public static void Dog_and_Cat()
    {
        Dog sam = new Dog("Sam", 12);
        sam.speak();
        Dog tim = new Dog("Tim", 5);
        tim.speak();
        Dog bill = new Dog("Bill", 7);
        bill.speak();
        Dog bob = new Dog("Bob", 2);
        bob.speak();

        tim.setAge(10);
        tim.speak();

        Cat yuki = new Cat("Yuki", 16, 100);
        yuki.speak();
        Cat vanilla = new Cat("Vanilla", 14);
        vanilla.speak();
        Cat chocola = new Cat("Chocola");
        chocola.speak();
    }

    // about static keyword
    // open Dogg.java
    public static void Dogg_static()
    {
        Dogg korone = new Dogg("Korone", 17);
        Dogg koyori = new Dogg("Koyori", 18);
        Dogg mio = new Dogg("Mio", 21);

        System.out.println(Dogg.count + " dogs created");
    }

    // about overloading method and object comparison
    // open Student.java
    public static void Student_object_comparison()
    {
        Student joe = new Student("Joe");
        Student joee = new Student("Joe");
        Student bill = new Student("Bill");
        Student tim = new Student("Tim");

        System.out.println(joe == joee);
        System.out.println(joe.equals(joee));
        System.out.println(joe == bill);

        System.out.println(joe.compareTo(bill) > 0);

        System.out.println(tim);
    }

    // nested class
    // open OuterClass.java
    public static void nested_class()
    {
        OuterClass out = new OuterClass();
        out.inner();

        OuterClass.InnerClass in = out.new InnerClass();
        in.display();
    }

    // interface
    // open Vehicle.java
    public static void Vehicle_interface()
    {
        Car ford = new Car();
        ford.speedUp(20);
        ford.changeGear(2);
        ford.display();

        int x = Vehicle.math(5);
        System.out.println(x);
    }

    // enums
    // open Level.java
    public static void Level_enum()
    {
        Level lvl = Level.LOW;
        String en = lvl.toString();

        Level[] arr = Level.values();

        for (Level i: arr)
            System.out.println(i);

        if (lvl == Level.LOW)
            System.out.println(lvl);
        else if (lvl == Level.MEDIUM)
            System.out.println(lvl);
        else
            System.out.println(lvl);

        System.out.println(lvl.getLvl());
        System.out.println(Level.valueOf("LOW"));

        lvl.setLvl(5);
        System.out.println(lvl.getLvl());
    }


    public static void main(String[] args)
    {
        // Dog_and_Cat();
        // Dogg_static();
        // Student_object_comparison();
        // nested_class();
        // Vehicle_interface();
        Level_enum();
    }
}
