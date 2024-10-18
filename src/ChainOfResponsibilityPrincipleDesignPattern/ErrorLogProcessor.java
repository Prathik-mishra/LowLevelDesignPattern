package ChainOfResponsibilityPrincipleDesignPattern;

public class ErrorLogProcessor extends LogProcessor{
    ErrorLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if(logLevel == ERROR){
            System.out.println("Error : " +message);
        }else{
            super.log(logLevel, message);
        }
    }
}
