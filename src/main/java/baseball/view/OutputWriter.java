package baseball.view;

public class OutputWriter {

    public static void print(String message) {
        System.out.print(message);
    }

    public static void println(String message) {
        System.out.println(message);
    }

    public static void printFormat(String message, int strikeOrBall) {
        System.out.println(String.format(message, strikeOrBall));
    }

    public static void printFormat(String message, int ball, int strike) {
        System.out.println(String.format(message, ball, strike));
    }

    public static void printError(Exception e) {
        System.out.println(e.getMessage());
    }
}
