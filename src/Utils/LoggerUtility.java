package Utils;

import java.util.ArrayList;
import java.util.List;

public class LoggerUtility {
    private static List<String> logMessages = new ArrayList<>();

    public static void log(String message) {
        logMessages.add(message);
    }

    public static List<String> getLogMessages() {
        return new ArrayList<>(logMessages); // Return a copy to avoid modification during iteration
    }

    public static void clearLogMessages() {
        logMessages.clear();
    }
}
