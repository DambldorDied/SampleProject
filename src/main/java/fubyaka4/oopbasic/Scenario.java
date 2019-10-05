package fubyaka4.oopbasic;

public class Scenario {
    public static void main(String[] args) {
        Student st = new Student("Vitalya", 16, 10);
        Teacher tc = new Teacher("Valera", "Math", 56);
        tc.teach(st);

        Polite[] people = new Polite[5];
        people[0] = new Student("Alex", 111, 112);
        people[1] = new Student("George", 17, 11);
        people[2] = st;
        people[3] = new Teacher("Owen", "Science", 234);
        people[4] = tc;
        for (int i = 0; i < people.length; i++) {
            people[i].goodBye();

        }
    }
}
