package fubyaka4;

public class Teacher extends Human {
    private String subject;

    public Teacher(String name, String subject, int age) {
        super(name, age);
        this.subject = subject;
    }
    public void sayHello(){
        System.out.println("Здравствуйте, меня зовут " + this.name);
    }

    public String getName() {
        return name;
    }

    public String getSubject() {
        return subject;
    }

    public int getAge() {
        return age;
    }

    public void teach(Student st) {
        st.sayHello();
    }
}
