abstract class Database {

    String username, password, url;
    static int count = 0;

    Database(String u, String p, String url) {
        this.username = u;
        this.password = p;
        this.url = url;
        count++;
    }

    abstract void display();
}

class Oracle extends Database {

    private Oracle(String u, String p, String url) {
        super(u, p, url);
    }

    public static Oracle getInstance(String u, String p, String url) {
        if (count < 10)
            return new Oracle(u, p, url);
        else
            return null;
    }

    void display() {
        System.out.println("Oracle → " + username + " " + url);
    }
}

class MySql extends Database {

    private MySql(String u, String p, String url) {
        super(u, p, url);
    }

    public static MySql getInstance(String u, String p, String url) {
        if (count < 10)
            return new MySql(u, p, url);
        else
            return null;
    }

    void display() {
        System.out.println("MySQL → " + username + " " + url);
    }
}

class SQLServer extends Database {

    private SQLServer(String u, String p, String url) {
        super(u, p, url);
    }

    public static SQLServer getInstance(String u, String p, String url) {
        if (count < 10)
            return new SQLServer(u, p, url);
        else
            return null;
    }

    void display() {
        System.out.println("SQLServer → " + username + " " + url);
    }
}

public class exercise {
    public static void main(String[] args) {

        Database[] db = new Database[10];

        db[0] = Oracle.getInstance("scott", "tiger", "oracle.com");
        db[1] = MySql.getInstance("root", "123", "mysql.com");
        db[2] = SQLServer.getInstance("admin", "abc", "sql.com");
        db[3] = Oracle.getInstance("u1", "p1", "o1");
        db[4] = MySql.getInstance("u2", "p2", "m1");
        db[5] = SQLServer.getInstance("u3", "p3", "s1");
        db[6] = Oracle.getInstance("u4", "p4", "o2");
        db[7] = MySql.getInstance("u5", "p5", "m2");
        db[8] = SQLServer.getInstance("u6", "p6", "s2");
        db[9] = Oracle.getInstance("u7", "p7", "o3");

        // display 10 objects
        for (Database d : db)
            if (d != null)
                d.display();

        // try to create 11th object
        Database extra = MySql.getInstance("extra", "111", "notallowed");

        if (extra == null)
            System.out.println("Cannot create more than 10 objects ❌");
    }
}

