import java.util.ArrayList;

public class Main {
    public static void main(String[] args) {
        Group group = new Group(new ArrayList<Student>(), "20704");
        Student student = new Student(103489, "Ксения", "Докукина", 19, 4.4);
        System.out.println("----------PRINT INFO STUDENT----------");
        student.printInfo(student);
        System.out.println("----------ADD STUDENT----------");
        group.addStudent(student);
        group.addStudent(new Student(248961, "Петр", "Иванов", 20, 3.8));
        group.addStudent(new Student(348796, "Мария", "Турчинович", 20, 4.8));
        group.addStudent(new Student(405505, "Кирилл", "Беседин", 19, 4.1));
        group.addStudent(new Student(508942, "Олег", "Зарубин", 21, 3.2));
        group.printInfo();
        System.out.println("----------GET NUMBER----------");
        group.getByNumber(405505).printInfo(student);
        System.out.println("----------DELETE STUDENT----------");
        group.deleteStudent(student);
        group.printInfo();
        System.out.println("---------GET ALL-----------");
        System.out.println(group.getAll());
        System.out.println("---------GET AGE-----------");
        System.out.println(group.getCountByAge());
        System.out.println("-----------GET SCORE---------");
        System.out.println(group.getByMinScore(4.1));
        System.out.println("----------PRINT IFO GROUP----------");
        group.printInfo();

    }
}
