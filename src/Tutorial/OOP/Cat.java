package src.Tutorial.OOP;

// inherit from Dog class
public class Cat extends Dog
{
    private int food;

    public Cat(String name, int age, int food) {
        super(name, age);
        this.food = food;
    }

    public Cat(String name, int age)
    {
        super(name, age);
        this.food = 0;
    }

    public Cat(String name)
    {
        super(name, 0);
        this.food = 0;
    }

    public void speak()
    {
        System.out.println("Meow, my name is " + this.name + " and i am " + this.age + " years old. I have " + this.food + " foods now.");
    }
    
    public void eat(int x)
    {
        this.food -= x;
    }
}
