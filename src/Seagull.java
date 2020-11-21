import java.sql.Struct;
import java.util.Objects;

public class Seagull extends Bird
{
    String food_type;
    int flight_hours;
    public Seagull(String name, int age, String color, int wingspan, Feeding_Behavior feeding_behavior, String food_type, int flight_hours)
    {
        super(name, age, color, wingspan, feeding_behavior);
        this.set_flight_hours(flight_hours);
        this.set_food_type(food_type);
    }

    protected void set_flight_hours(int flight_hours)
    {
        this.flight_hours = flight_hours;
    }

    protected void set_food_type(String food_type)
    {
        this.food_type = food_type;
    }

    public int get_flight_hours()
    {
        return this.flight_hours;
    }

    public String get_food_type()
    {
        return this.food_type;
    }

    @Override
    public void eat()
    {
        System.out.println("I am "+this.feeding_behavior.toString()+" and I eat"+this.food_type);
    }

    @Override
    public void sleep()
    {
        System.out.println("Going to sleep on shore");
    }

    @Override
    public String toString()
    {
        return "Seagull{" +
                "food_type='" + food_type + '\'' +
                ", flight_hours=" + flight_hours +
                ", feeding_behavior=" + feeding_behavior +
                ", wingspan=" + wingspan +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Seagull)) return false;
        if (!super.equals(o)) return false;
        Seagull seagull = (Seagull) o;
        return this.get_name().equals(seagull.get_name()) &&
               this.get_age() == seagull.get_age() &&
               this.get_color().equals(seagull.get_color()) &&
               this.get_feeding_behavior() == seagull.get_feeding_behavior() &&
               this.get_wingspan() == seagull.get_wingspan() &&
               this.get_flight_hours() == seagull.get_flight_hours() &&
               this.get_food_type().equals(seagull.get_food_type());
    }
}
