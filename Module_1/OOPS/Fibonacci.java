public class Fibonacci {
    public static void main(String[] args) {
        int n = 10; // Number of terms to print
        int firstTerm = 0, secondTerm = 1;

        System.out.println("Fibonacci Sequence up to " + n + " terms:");

        for (int i = 1; i <= n; ++i) {
            System.out.print(firstTerm + ", ");

            // Compute the next term
            int nextTerm = firstTerm + secondTerm;
            firstTerm = secondTerm;
            secondTerm = nextTerm;
        }
    }
}