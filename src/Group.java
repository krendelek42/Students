import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

public class Group {
    protected ArrayList<Student> students;
    protected String groupNumber;

    public Group(ArrayList<Student> students, String groupNumber) {
        this.students = students;
        this.groupNumber = groupNumber;
    }

    public void addStudent(Student newStudent) {
        this.students.add(newStudent);
    }

    public Student getByNumber(int serialNumber) {
        for (Student student: this.students) {
            if (serialNumber == student.number) {
                return student;
            }
        }
        return null;
    }

    public void deleteStudent(Student student) {
        this.students.remove(student);
    }

    public List<Student> getAll() {
        return this.students;
    }

    public Map<Integer, Integer> getCountByAge() {
        Map<Integer, Integer> map = new HashMap<>();
        for(Student student : this.students) {
            map.putIfAbsent(student.age, 0);
            map.put(student.age, map.get(student.age) + 1);
        }
        return map;
    }

    public List<Student> getByMinScore(double score) {
        ArrayList<Student> minScore = new ArrayList<>();
        for(Student student : this.students) {
            if (student.averageScore >= score) {
                System.out.println(student);
            }
        }
        return minScore;
    }

    public void printInfo() {
        System.out.printf("Группа: %s%n", this.groupNumber);
        for(Student student: this.students) {
            student.printInfo(student);
            System.out.println("");
        }

    }

}
