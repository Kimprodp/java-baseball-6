package baseball.Exception;

import baseball.view.OutputWriter;
import java.util.function.Supplier;

public class ExceptionHandler {

    public static void retryInputPlayerNumber(Runnable runnable) {
        while (true) {
            try {
                runnable.run();
                break;
            } catch (IllegalArgumentException exception) {
                OutputWriter.printError(exception);
            }
        }
    }

    public static <T> T retryInputRestartSelect(Supplier<T> supplier) {
        while (true) {
            try {
                return supplier.get();
            } catch (IllegalArgumentException exception) {
                OutputWriter.printError(exception);
            }
        }
    }
}
