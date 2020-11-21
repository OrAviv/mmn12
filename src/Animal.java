public class Animal
{
    protected String name;
    protected int age;
    protected String color;

    public Animal(String name, int age, String color)
    {
        this.name = name;
        this.set_age(age);
        this.color = color;
    }

    public String get_name()
    {
        return this.name;
    }

    public int get_age()
    {
        return this.age;
    }

    public String get_color()
    {
        return this.color;
    }

    protected void set_age(int age)
    {
            this.age = age;
    }

    public void eat()
    {
        System.out.println("Not enough food data.");
    }

    public void sleep()
    {
        System.out.println("Going to sleep");
    }

    @Override
    public String toString() {
        return "Animal{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }
}
