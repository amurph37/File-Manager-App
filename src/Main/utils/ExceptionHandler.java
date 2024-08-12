package Main.utils;

public class ExceptionHandler {

    public static void handleException(Exception e) {
        Logger.log(e.getMessage());
        System.out.println("An error occurred: " + e.getMessage());
    }
}
