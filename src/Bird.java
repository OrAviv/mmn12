import java.util.Objects;

public class Bird extends Animal
{
    public enum Feeding_Behavior
    {
        // steels food from another organisem.
        kleptoparasitism,
        nectar_feeder,
        // straining suspended matter and food particles from water.
        filter_feeder
    };

    protected Feeding_Behavior feeding_behavior;
    protected int wingspan;

    public Bird(String name, int age, String color, int wingspan, Feeding_Behavior feeding_behavior)
    {
        super(name, age, color);
        this.set_wingspan(wingspan);
        this.feeding_behavior = feeding_behavior;
    }

    public Feeding_Behavior get_feeding_behavior()
    {
        return this.feeding_behavior;
    }

    public int get_wingspan()
    {
        return this.wingspan;
    }

    private void set_wingspan (int wingspan)
    {
        this.wingspan = wingspan;
    }

    @Override
    public String toString() {
        return "Bird{" +
                "feeding_behavior=" + feeding_behavior +
                ", wingspan=" + wingspan +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Bird)) return false;
        Bird bird = (Bird) o;
        return this.get_name().equals(bird.get_name()) &&
               this.get_age() == bird.get_age() &&
               this.get_color().equals(bird.get_color()) &&
               this.get_feeding_behavior() == bird.get_feeding_behavior() &&
               this.get_wingspan() == bird.get_wingspan();
    }
}
