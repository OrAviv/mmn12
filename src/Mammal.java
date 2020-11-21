public class Mammal extends Animal
{
    public enum Feeding_Behavior
    {
        carnivore,
        herbivore,
        omnivore
    };
    protected int legs_number;
    protected Feeding_Behavior feeding_behavior;

    public Mammal(String name, int age, String color, int legs_number, Feeding_Behavior feeding_behavior)
    {
        super(name, age, color);
        this.legs_number = legs_number;
        this.feeding_behavior = feeding_behavior;
    }

    public int get_legs_number()
    {
        return this.legs_number;
    }

    public String get_feeding_behavior()
    {
        return this.feeding_behavior.toString();
    }

    @Override
    public void eat()
    {
        System.out.println("I am "+this.feeding_behavior.toString()+"; please provide appropriate food.");
    }

    @Override
    public void sleep()
    {
        super.sleep();
    }

    @Override
    public String toString() {
        return "Mammal{" +
                "legs_number=" + legs_number +
                ", feeding_behavior=" + feeding_behavior +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Mammal)) return false;
        Mammal mammal = (Mammal) o;
        return this.get_name().equals(mammal.get_name()) &&
               this.get_age() == mammal.get_age() &&
               this.get_color().equals(mammal.get_color()) &&
               this.get_legs_number() == mammal.get_legs_number() &&
               this.get_feeding_behavior().equals(mammal.get_feeding_behavior());

    }
}
