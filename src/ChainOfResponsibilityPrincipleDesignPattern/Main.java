package ChainOfResponsibilityPrincipleDesignPattern;

public class Main {
    public static void main(String[] args) {
        LogProcessor logProcessor = new InfoLogProcessor(new DebugLogProcessor(new ErrorLogProcessor(null)));

        logProcessor.log(LogProcessor.ERROR, "Life me error aata he hy");
        logProcessor.log(LogProcessor.DEBUG, "Isko tho debug krna padega meri jaan");
        logProcessor.log(LogProcessor.INFO, "Li8 lo yaaro khali message hy");

    }
}
