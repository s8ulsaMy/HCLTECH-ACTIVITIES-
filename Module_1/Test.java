import java.util.*;

class Worker {
    String name;
    double salary;

    Worker(String name, double salary) {
        this.name = name;
        this.salary = salary;
    }

    double pay() {
        return salary;
    }
}

class DailyWorker extends Worker {
    int days;

    DailyWorker(String name, double perDaySalary, int days) {
        super(name, perDaySalary);
        this.days = days;
    }

    double pay() {
        return salary * days;
    }
}

class SalariedWorker extends Worker {

    SalariedWorker(String name, double hourlySalary) {
        super(name, hourlySalary);
    }

    double pay() {
        return salary * 40;   // fixed 40 hours
    }
}

public class Test {
    public static void main(String[] args) {

        ArrayList<Worker> list = new ArrayList<>();

        list.add(new DailyWorker("Amit", 500, 6));
        list.add(new DailyWorker("Riya", 400, 5));
        list.add(new SalariedWorker("John", 300));
        list.add(new SalariedWorker("Sara", 350));

        // sort by weekly salary
        Collections.sort(list, (a, b) -> Double.compare(a.pay(), b.pay()));

        for (Worker w : list) {
            System.out.println(w.name + "  Weekly Pay = " + w.pay() +
                    "  (" + w.getClass().getSimpleName() + ")");
        }
    }
}
