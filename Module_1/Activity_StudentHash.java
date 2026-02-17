import java.util.*;

class Student {

    int id;
    String name;

    Student(int id, String name) {
        this.id = id;
        this.name = name;
    }

    // PRIME CHECK
    boolean isPrime(int n) {
        if (n < 2) return false;
        for (int i = 2; i <= n / 2; i++)
            if (n % i == 0)
                return false;
        return true;
    }

    @Override
    public int hashCode() {

        if (isPrime(id) && id % 2 == 0)
            return 1;   // prime & even bucket

        else if (isPrime(id) && id % 2 != 0)
            return 2;   // prime & odd bucket

        else
            return 3;   // others
    }

    @Override
    public boolean equals(Object obj) {

        if (this == obj) return true;

        if (!(obj instanceof Student))
            return false;

        Student s = (Student) obj;

        return this.id == s.id;
    }

    public String toString() {
        return id + " " + name;
    }
}

public class Activity_StudentHash {

    public static void main(String[] args) {

        HashSet<Student> set = new HashSet<>();

        set.add(new Student(2, "A"));   // prime even
        set.add(new Student(3, "B"));   // prime odd
        set.add(new Student(4, "C"));   // other
        set.add(new Student(5, "D"));   // prime odd
        set.add(new Student(8, "E"));   // other

        for (Student s : set)
            System.out.println(s + " → bucket " + s.hashCode());
    }
}
