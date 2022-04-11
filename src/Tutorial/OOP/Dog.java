package src.Tutorial.OOP;

public class Dog
{
    protected String name;      // protected only class in the same package and subclass can access
    protected int age;
    
    // constructor method
    public Dog(String name, int age)
    {
        this.name = name;
        this.age = age;
        // add2();
        // speak();
    }

    public void speak()
    {
        System.out.println("I am " + this.name + " and I am " + this.age + " years old.");
    }

    public int getAge()
    {
        return this.age;
    }

    public void setAge(int age)
    {
        this.age = age;
    }

    private void add2()
    {
        this.age += 2;
    }
}
