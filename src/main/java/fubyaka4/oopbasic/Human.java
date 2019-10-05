package fubyaka4.oopbasic;

public class Human {
    protected String name;
    protected int age;

    public Human(String name, int age) {
        this.name = this.name;
        this.age = this.age;
    }

    public void sayHello() {
        System.out.println("Привет, меня зовут  " + this.name);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }
}
