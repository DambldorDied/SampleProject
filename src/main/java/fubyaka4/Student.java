package fubyaka4;

public class Student extends Human {
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
}
