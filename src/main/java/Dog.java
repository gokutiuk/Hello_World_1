import java.util.Objects;

public class Dog extends Animal{
    String name;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public String getPoroda() {
        return poroda;
    }

    public void setPoroda(String poroda) {
        this.poroda = poroda;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    int age;
    String poroda;

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dog)) return false;
        Dog dog = (Dog) o;
        return age == dog.age &&
                Objects.equals(name, dog.name) &&
                Objects.equals(poroda, dog.poroda) &&
                Objects.equals(color, dog.color);
    }

    @Override
    public int hashCode() {

        return Objects.hash(name, age, poroda, color);
    }

    String color;

    public Dog(String name, int age, String poroda, String color) {
        this.name = name;
        this.age = age;
        this.poroda = poroda;
        this.color = color;

    }

    @Override
    public String toString() {
        return "Dog{" +
                "name='" + name + '\'' +
                ", age=" + age +
                ", poroda='" + poroda + '\'' +
                ", color='" + color + '\'' +
                '}';
    }

      @Override
    public  void move ()
    {
        System.out.println(" Я собака я двигаюсь");

    }


}
