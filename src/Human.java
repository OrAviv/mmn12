import java.util.Objects;

public class Human extends Mammal
{
    String food_type;
    String hobby;

    public Human(String name, int age, String color, int legs_number, Feeding_Behavior feeding_behavior, String food_type, String hobby)
    {
        super(name, age, color, legs_number, feeding_behavior);
        this.set_food_type(food_type);
        this.set_hobby(hobby);
    }

    protected void set_food_type(String food_type)
    {
        this.food_type = food_type;
    }

    protected void set_hobby(String hobby)
    {
        this.hobby = hobby;
    }

    public String get_food_type()
    {
        return this.food_type;
    }

    public String get_hobby()
    {
        return this.hobby;
    }

    @Override
    public void eat()
    {
        System.out.println("I am "+this.feeding_behavior.toString()+" and i eat "+this.food_type);
    }

    @Override
    public void sleep()
    {
        System.out.println("Going to sleep in bed.");
    }

    @Override
    public String toString() {
        return "Human{" +
                "food_type='" + food_type + '\'' +
                ", hobby='" + hobby + '\'' +
                ", legs_number=" + legs_number +
                ", feeding_behavior=" + feeding_behavior +
                ", name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                '}';
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Human)) return false;
        if (!super.equals(o)) return false;
        Human human = (Human) o;
        return this.get_name().equals(human.get_name()) &&
               this.get_age() == human.get_age() &&
               this.get_color().equals(human.get_color()) &&
               this.get_feeding_behavior().equals(human.get_feeding_behavior()) &&
               this.get_feeding_behavior().equals(human.get_feeding_behavior()) &&
               this.get_legs_number() == human.get_legs_number() &&
               this.get_food_type().equals(human.get_food_type()) &&
               this.get_hobby().equals(human.get_hobby());
    }
}
