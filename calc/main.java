public class main {
    public static void main(String[] args) {
        System.out.println("Доброе пожаловать в приложение Калькулятор.");
        LogsList logsList = new LogsList<>();
        new menu().menu(logsList);
    }
}
