class Connection {

    String url, username, password;
    static int count = 0;

    Connection(String url, String username, String password) {

        if (count == 10) {
            System.out.println("Cannot create more than 10 connections ❌");
            return;
        }

        this.url = url;
        this.username = username;
        this.password = password;

        count++;
        System.out.println("Connection created → Total: " + count);
    }

    void close() {
        url = username = password = null;
        count--;
        System.out.println("Connection removed → Total: " + count);
        System.gc();   // explicit garbage collection
    }
}

public class Activity_ConnectionTest {

    public static void main(String[] args) {

        Connection[] con = new Connection[10];

        // create 10 connections
        for (int i = 0; i < 10; i++) {
            con[i] = new Connection("db.com", "user", "pass");
        }

        // 11th connection
        Connection extra = new Connection("db.com", "user", "pass");

        // remove 2 connections
        con[0].close();
        con[1].close();
    }
}
