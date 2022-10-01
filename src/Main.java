import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Group group = new Group(new ArrayList<Student>(), "20704");
        Student student = new Student(103489, "Ксения", "Докукина", 19, 4.4);
        student.printInfo(student);
        System.out.println("--------------------");
        group.addStudent(student);
        group.addStudent(new Student(248961, "Петр", "Иванов", 20, 3.8));
        group.addStudent(new Student(348796, "Мария", "Турчинович", 20, 4.8));
        group.addStudent(new Student(405505, "Кирилл", "Беседин", 19, 4.1));
        group.addStudent(new Student(508942, "Олег", "Зарубин", 21, 3.2));
        group.getByNumber(405505).printInfo(student);
        group.deleteStudent(student);
        System.out.println("--------------------");
        System.out.println(group.getAll());
        System.out.println("--------------------");
        System.out.println(group.getCountByAge());
        System.out.println("--------------------");
        System.out.println(group.getByMinScore(4.8));
        System.out.println("--------------------");
        group.printInfo();

    }
}
