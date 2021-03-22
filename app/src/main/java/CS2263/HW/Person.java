package CS2263.HW;

public class Person {
    // instance variables
    protected String name;
    protected int age;
    protected String iceCream;

    public Person(String name, int age, String iceCream) {
        this.age = age;
        this.name = name;
        this.iceCream = iceCream;
    }
    public int getAge() {
        return age;
    }
    public String getIceCream() {
        return iceCream;
    }
    public String getName() {
        return name;
    }

    public void setAge(int age) {
        this.age = age;
    }

    public void setIceCream(String iceCream) {
        this.iceCream = iceCream;
    }

    public void setName(String name) {
        this.name = name;
    }
}
