// Renamed to avoid conflict with exercise.java
abstract class DatabaseTestBase { 

    String username, password, url;

    DatabaseTestBase(String u, String p, String url) {
        this.username = u;
        this.password = p;
        this.url = url;
    }

    abstract void display();
}

class OracleTest extends DatabaseTestBase {
    OracleTest(String u, String p, String url) {
        super(u, p, url);
    }

    void display() {
        System.out.println("Test Oracle → " + username + " " + url);
    }
}

class MySqlTest extends DatabaseTestBase {
    MySqlTest(String u, String p, String url) {
        super(u, p, url);
    }

    void display() {
        System.out.println("Test MySQL → " + username + " " + url);
    }
}

class SQLServerTest extends DatabaseTestBase {
    SQLServerTest(String u, String p, String url) {
        super(u, p, url);
    }

    void display() {
        System.out.println("Test SQLServer → " + username + " " + url);
    }
}

public class DatabaseAbstractTest { // Filename matches this public class
    public static void main(String[] args) {
        DatabaseTestBase[] db = new DatabaseTestBase[3];

        db[0] = new OracleTest("scott", "tiger", "oracle.com");
        db[1] = new MySqlTest("root", "123", "mysql.com");
        db[2] = new SQLServerTest("admin", "abc", "sql.com");

        for (DatabaseTestBase d : db)
            d.display();
    }
}