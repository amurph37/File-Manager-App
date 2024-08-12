package Main.utils;

import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

public class Logger {

    private static final String LOG_FILE = "log.txt";

    public static void log(String message) {
        FileWriter fw = null;
        PrintWriter pw = null;
        try {
            fw = new FileWriter(LOG_FILE, true);
            pw = new PrintWriter(fw);
            pw.println(message);
        } catch (IOException e) {
            System.out.println("Error writing to log file: " + e.getMessage());
        } finally {
            if (pw != null) {
                pw.close();
            }
            if (fw != null) {
                try {
                    fw.close();
                } catch (IOException e) {
                    System.out.println("Error closing FileWriter: " + e.getMessage());
                }
            }
        }
    }
}
