import java.util.*;

public class JavaSort {
    static class Student {
        int id;
        String name;
        double cgpa;

        Student(int id, String name, double cgpa) {
            this.id = id;
            this.name = name;
            this.cgpa = cgpa;
        }

        @Override
        public String toString() {
            return id + " " + name + " " + cgpa;
        }
    }

    public static void main(String[] args) {
        List<Student> students = new ArrayList<>();
        students.add(new Student(33, "Tina", 3.68));
        students.add(new Student(85, "Louis", 3.85));
        students.add(new Student(56, "Samar", 3.75));
        students.add(new Student(19, "Samar", 3.75));
        students.add(new Student(22, "Lorry", 3.76));

        students.sort(
            Comparator.comparingDouble((Student s) -> s.cgpa).reversed()
                      .thenComparing(s -> s.name)
                      .thenComparingInt(s -> s.id)
        );

        for (Student s : students) {
            System.out.println(s);
        }
    }
}
