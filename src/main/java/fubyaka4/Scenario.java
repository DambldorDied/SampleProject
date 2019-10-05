package fubyaka4;

public class Scenario {
    public static void main(String[] args) {
        Student st = new Student("Vitalya", 16, 10);
        Teacher tc = new Teacher("Valera", "Math", 56);
        tc.teach(st);

        Human[] people = new Human[5];
        people[0] = new Human("Alex", 111);
        people[1] = new Student("George", 17, 11);
        people[2] = st;
        people[3] = new Teacher("Owen", "Science", 234);
        people[4] = tc;
        for (int i = 0; i < people.length; i++) {
            people[i].sayHello();
        }
    }
}
