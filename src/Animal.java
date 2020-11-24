import java.util.Objects;

// Animal - base class - everyone will inherit from here.
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
        return "Animal" +
                " name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Animal)) return false;
        Animal animal = (Animal) o;
        return this.get_name().equals(animal.get_name()) &&
               this.get_age() == animal.get_age() &&
               this.get_color().equals(animal.get_color());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Animal(this.get_name(),this.get_age(),this.get_color());
    }
}
