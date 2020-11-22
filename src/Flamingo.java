public class Flamingo extends Bird
{
    String food_type;
    enum Leg{left, right};
    // Flamingo's standing on one leg each time.
    Leg leg;


    public Flamingo(String name, int age, String color, int wingspan, Feeding_Behavior feeding_behavior, String food_type, Leg leg)
    {
        super(name, age, color, wingspan, feeding_behavior);
        this.set_food_type(food_type);
        this.leg = leg;
    }

    protected void set_food_type(String food_type)
    {
        this.food_type = food_type;
    }
    protected String get_food_type()
    {
        return this.food_type;
    }

    // switch standing leg.
    public void switch_legs()
    {
        if (this.leg == Leg.left)
            this.leg = Leg.right;
        else
            this.leg = Leg.left;
    }

    public Leg get_leg()
    {
        return this.leg;
    }

    @Override
    public String toString() {
        return "Flamingo" +
                " name='" + name + '\'' +
                ", age=" + age +
                ", color='" + color + '\'' +
                ", food_type='" + food_type + '\'' +
                ", leg=" + leg +
                ", feeding_behavior=" + feeding_behavior +
                ", wingspan=" + wingspan_in_cm;
    }

    @Override
    public void eat()
    {
        System.out.println("I am "+this.feeding_behavior.toString()+" and I eat "+this.food_type);
    }

    @Override
    public void sleep()
    {
        System.out.println("Going to sleep standing on my "+this.get_leg()+" leg.");
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Flamingo)) return false;
        if (!super.equals(o)) return false;
        Flamingo flamingo = (Flamingo) o;
        return this.get_name().equals(flamingo.get_name()) &&
               this.get_age() == flamingo.get_age() &&
               this.get_color().equals(flamingo.get_color()) &&
               this.get_feeding_behavior() == flamingo.get_feeding_behavior() &&
               this.get_wingspan() == flamingo.get_wingspan() &&
               this.get_leg() == flamingo.get_leg() &&
               this.get_food_type().equals(flamingo.get_food_type());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Flamingo(this.get_name(),
                        this.get_age(),
                        this.get_color(),
                        this.get_wingspan(),
                        this.get_feeding_behavior(),
                        this.get_food_type(),
                        this.get_leg());
    }
}
