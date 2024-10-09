package SingletonDesignPattern;

class DBConnection1{
    public static DBConnection1 dbConnection = new DBConnection1();

    private DBConnection1(){
    }

    public static DBConnection1 getInstance(){
        return dbConnection;
    }
}
public class Eager {
    public static void main(String[] args) {

        DBConnection1 object = DBConnection1.getInstance();
    }
}
