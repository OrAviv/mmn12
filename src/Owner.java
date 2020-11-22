import java.util.Objects;

public class Owner
{
    private String name;
    private int phone_number;

    public Owner (String name, int phone_number)
    {
        this.name = name;
        this.set_phone_number(phone_number);
    }

    public String get_name()
    {
        return this.name;
    }

    public int get_phone_number()
    {
        return this.phone_number;
    }

    public void set_phone_number(int phone_number)
    {
        this.phone_number = phone_number;
    }

    public void set_name(String name)
    {
        this.name = name;
    }

    @Override
    public String toString()
    {
        return "Owner{" +
                "name='" + name + '\'' +
                ", phone_number=" + phone_number +
                '}';
    }

    @Override
    public boolean equals(Object o)
    {
        if (this == o) return true;
        if (!(o instanceof Owner)) return false;
        Owner owner = (Owner) o;
        return this.get_phone_number() == owner.get_phone_number() &&
               this.get_name().equals(owner.get_name());
    }
}
