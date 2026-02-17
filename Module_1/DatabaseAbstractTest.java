abstract class Database {

    String username, password, url;

    Database(String u, String p, String url) {
        username = u;
        password = p;
        this.url = url;
    }

    abstract void display();
}

class Oracle extends Database {

    Oracle(String u, String p, String url) {
        super(u, p, url);
    }

    void display() {
        System.out.println("Oracle → " + username + " " + url);
    }
}

class MySql extends Database {

    MySql(String u, String p, String url) {
        super(u, p, url);
    }

    void display() {
        System.out.println("MySQL → " + username + " " + url);
    }
}

class SQLServer extends Database {

    SQLServer(String u, String p, String url) {
        super(u, p, url);
    }

    void display() {
        System.out.println("SQLServer → " + username + " " + url);
    }
}

public class DatabaseAbstractTest {

    public static void main(String[] args) {

        Database[] db = new Database[3];

        db[0] = new Oracle("scott", "tiger", "oracle.com");
        db[1] = new MySql("root", "123", "mysql.com");
        db[2] = new SQLServer("admin", "abc", "sql.com");

        for (Database d : db)
            d.display();
    }
}
