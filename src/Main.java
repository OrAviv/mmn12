import java.util.ArrayList;

public class Main
{
    public static void main(String args[]) throws CloneNotSupportedException {
//        Animal a1 = new Dog("a1",1,"black",4, Mammal.Feeding_Behavior.omnivore,"dogs food");
//        Dog d1 = new Dog("d1",2,"brown",4, Mammal.Feeding_Behavior.omnivore,"dogs food");

        ArrayList<Animal> animals = new ArrayList<Animal>();

        animals.add(new Dog("Bully the dog",2,"brown",4, Mammal.Feeding_Behavior.omnivore,"dogs food"));
        animals.add(new Human("Adam", 20, "white", 2, Mammal.Feeding_Behavior.omnivore, "everything cooked", "soccer"));
        animals.add(new Flamingo("jack the flamingo", 3, "pink", 450, Bird.Feeding_Behavior.filter_feeder, "micro organism", Flamingo.Leg.right));
        animals.add(new Seagull("sher the seagull", 12, "black & white", 200, Bird.Feeding_Behavior.kleptoparasitism, "fish", 50));

        for (int i=0; i<animals.size(); i++)
        {
            System.out.println(animals.get(i).toString());
            animals.get(i).eat();
            animals.get(i).sleep();
        }

        animals.add((Animal) animals.get(0).clone());
        System.out.println(animals.get(0).toString());
        System.out.println(animals.get(animals.size()-1).toString());
        System.out.println("Equals on new clone results: "+animals.get(0).equals(animals.get(animals.size()-1)));
        Dog d = (Dog) animals.get(animals.size()-1);
        d.set_owner_name("Tom Cruise");
        d.set_owner_phone_number(545454545);
        System.out.println(animals.get(0).toString());
        System.out.println(animals.get(animals.size()-1).toString());
        System.out.println("after changing clones owner -- Equals on new clone results: "+animals.get(0).equals(animals.get(animals.size()-1)));

        for (int i=0; i<animals.size(); i++)
        {
            System.out.println(animals.get(i).toString());
            animals.get(i).eat();
            animals.get(i).sleep();
        }
    }
}
