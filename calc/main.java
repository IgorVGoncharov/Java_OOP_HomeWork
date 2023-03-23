import java.util.Scanner;

public class main {
    public static void main(String[] args) {
        Scanner iScanner = new Scanner(System.in);
        System.out.println("Доброе пожаловать в приложение Калькулятор.");
        LogsList logsList = new LogsList<>();
        new MenuImplements().menu(iScanner, logsList);
    }
}
