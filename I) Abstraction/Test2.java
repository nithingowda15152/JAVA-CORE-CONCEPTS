interface Database {
    void connect();
}

class MySQLDatabase implements Database {
    public void connect() {
        System.out.println("Connecting to MySQL Database...");
    }
}

class OracleDatabase implements Database {
    public void connect() {
        System.out.println("Connecting to Oracle Database...");
    }
}

public class Test2 {
    public static void main(String[] args) {
        Database db1 = new MySQLDatabase();
        db1.connect();

        Database db2 = new OracleDatabase();
        db2.connect();
    }
}
