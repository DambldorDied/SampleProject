package fubyaka4.oopbasic;

public class Student extends Human implements Polite {
    private int form;

    public Student(String name, int age, int form) {
        super(name, age);
        this.form = form;
    }
    public void sayHello(){
        System.out.println("Привет, меня зовут " + this.name);
    }

    public String getName() {
        return name;
    }

    public int getAge() {
        return age;
    }

    public int getForm() {
        return form;
    }

    @Override
    public void goodBye() {
        System.out.println("До свидания.");
    }
}
