package SingletonDesignPattern;

class DBConnection2{
    public static DBConnection2 dbConnection2;

    private DBConnection2(){
    }

    public static DBConnection2 getInstance(){
        if(dbConnection2 == null){
            dbConnection2 = new DBConnection2();
        }
        return dbConnection2;
    }
}
public class Lazy {
    public static void main(String[] args) {

    }
}
