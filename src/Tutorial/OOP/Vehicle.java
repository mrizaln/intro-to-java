package src.Tutorial.OOP;

// interface is just like class, but it cannot create an instance of it
// interface is only inherited from
// interfaces can only contain public method declarations

public interface Vehicle
{
    final int gears = 5;

    void changeGear(int a);
    void speedUp(int a);
    void slowDown(int a);

    default void out()
    {
        System.out.println("Default method");
    }

    static int math(int b)
    {
        return b + 9;
    }
}
