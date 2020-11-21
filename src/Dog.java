import java.util.Objects;
import java.util.Scanner;

public class Dog extends Mammal {

    String food_type;
    String sound = "bark";
    Owner owner;

    Scanner scanner = new Scanner(System.in);


    public Dog(String name, int age, String color, int legs_number, Feeding_Behavior feeding_behavior, String food_type)
    {
        super(name, age, color, legs_number, feeding_behavior);
        this.set_food_type(food_type);
        System.out.println("Does the dog: "+this.get_name()+" got owner? (y/n)");
        if (scanner.nextLine().equals("y"))
        {
            System.out.println("Please provide owners name:");
            String owners_name = scanner.nextLine();
            System.out.println("Please provide owners phone number:");
            int phone_num = scanner.nextInt();
            this.set_owner(owners_name, phone_num);

        }
    }

    private void set_food_type(String food_type) {
        this.food_type = food_type;
    }

    public String get_food_type() {
        return this.food_type;
    }

    public String get_sound() {
        return this.sound;
    }

    @Override
    public void eat() {
        System.out.println("I am " + this.feeding_behavior + " and I eat " + this.food_type);
    }

    @Override
    public void sleep() {
        System.out.println("Going to sleep in my dog's bed");
    }

    private void set_owner(String owner_name, int owner_phone_number)
    {
        this.owner = new Owner(owner_name, owner_phone_number);
    }

    @Override
    public String toString() {
        return "Dog{" +
                "food_type='" + food_type + '\'' +
                ", sound='" + sound + '\'' +
                ", owner=" + owner +
                ", legs_number=" + legs_number +
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
        if (!(o instanceof Dog)) return false;
        if (!super.equals(o)) return false;
        Dog dog = (Dog) o;
        return  this.get_name().equals(dog.get_name()) &&
                this.get_age() == dog.get_age() &&
                this.get_color().equals(dog.get_color()) &&
                this.get_legs_number() == dog.get_legs_number() &&
                this.get_feeding_behavior() == dog.get_feeding_behavior() &&
                this.get_food_type().equals(dog.get_food_type()) &&
                this.get_sound().equals(dog.get_sound());
    }

    @Override
    protected Object clone() throws CloneNotSupportedException {
        return new Dog(this.get_name(),
                       this.get_age(),
                       this.get_color(),
                       this.get_legs_number(),
                       this.get_feeding_behavior(),
                       this.get_food_type());
    }
}
