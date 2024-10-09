package SingletonDesignPattern;

class DBConnection3{
    public static DBConnection3 dbConnection3;

    private DBConnection3(){
    }

    synchronized public static DBConnection3 getInstance(){   //-> this is called a synchronized block here the threads enter one after another which also results in more time taking
        if(dbConnection3 == null){
            dbConnection3 = new DBConnection3();
        }
        return dbConnection3;
    }
}

public class SynchronizedMethod {
    public static void main(String[] args) {

    }
}
