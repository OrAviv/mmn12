public class Main
{
    public static void main(String args[])
    {
        Animal a1 = new Dog("a1",1,"black",4, Mammal.Feeding_Behavior.omnivore,"dogs food");
        Dog d1 = new Dog("d1",2,"brown",4, Mammal.Feeding_Behavior.omnivore,"dogs food");


        System.out.println(a1.toString());
        System.out.println(d1.toString());
        a1.sleep();
        d1.sleep();

    }
}
