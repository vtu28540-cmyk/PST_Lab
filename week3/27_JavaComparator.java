import java.util.*;

public class JavaComparator {
    static class Person {
        String name;
        int age;

        Person(String name, int age) {
            this.name = name;
            this.age = age;
        }

        @Override
        public String toString() {
            return name + " " + age;
        }
    }

    public static void main(String[] args) {
        List<Person> people = new ArrayList<>();
        people.add(new Person("Rahul", 22));
        people.add(new Person("Arun", 20));
        people.add(new Person("Bala", 22));

        people.sort(
            Comparator.comparingInt((Person p) -> p.age)
                      .thenComparing(p -> p.name)
        );

        people.forEach(System.out::println);
    }
}
