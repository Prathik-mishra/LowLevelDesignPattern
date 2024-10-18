package ChainOfResponsibilityPrincipleDesignPattern;

public class DebugLogProcessor extends LogProcessor{
    DebugLogProcessor(LogProcessor nextLogProcessor){
        super(nextLogProcessor);
    }

    @Override
    public void log(int logLevel, String message) {
        if(logLevel == DEBUG){
            System.out.println("Debug : " +message);
        }else{
            super.log(logLevel, message);
        }
    }
}
