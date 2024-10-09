package SingletonDesignPattern;

class DBConnection4{
    public static DBConnection4 dbConnection4;

    private DBConnection4(){
    }

    public static DBConnection4 getInstance(){
        if(dbConnection4 == null){
            synchronized (DBConnection4.class){   // --> synchronized block
                if(dbConnection4 == null){
                    dbConnection4 = new DBConnection4();
                }
            }
        }
        return dbConnection4;
    }
}

public class DoubleLocking {
    public static void main(String[] args) {

    }
}
