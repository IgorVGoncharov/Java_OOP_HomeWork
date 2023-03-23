import java.time.LocalDateTime;
import java.util.Scanner;

public class RationalPerfomCalcImplement implements PerfomCalcInterface {

    @Override
    public void choise(Scanner iScanner, LogsList logsList) {
        RationalCalc newCalc = new NewRationalValueImplements<>().newValue(iScanner);
        System.out.println("\nВыбирите действие, которое вы хотите выполнить: ");
        System.out.print("1. Сложение\n2. Вычетание\n3. Умножение\n4. Деление\n5. Вернуться в основное меню\nВведите значение: ");
        Integer choise = Integer.parseInt(iScanner.nextLine());
        if (choise == 1){
            String res = new RationalOperationsImplements().plusMetod(newCalc);
            RationalLogs newRatLog = new RationalLogs(LocalDateTime.now(), System.getProperty("user.name"), 
            newCalc.getFirstvalue() , "+", newCalc.getSecvolue(), res);
            logsList.addLog(newRatLog);
            System.out.println("\nРезультат= " + res);
            back(iScanner, logsList);
        }
        else if (choise == 2){
            String res = new RationalOperationsImplements().minusMetod(newCalc);
            RationalLogs newRatLog = new RationalLogs(LocalDateTime.now(), System.getProperty("user.name"), 
            newCalc.getFirstvalue() , "-", newCalc.getSecvolue(), res);
            logsList.addLog(newRatLog);
            System.out.println("\nРезультат= " + res);
            back(iScanner, logsList);
        }
        else if (choise == 3){
            String res = new RationalOperationsImplements().multiplicadeMetod(newCalc);
            RationalLogs newRatLog = new RationalLogs(LocalDateTime.now(), System.getProperty("user.name"), 
            newCalc.getFirstvalue() , "*", newCalc.getSecvolue(), res);
            logsList.addLog(newRatLog);
            System.out.println("\nРезультат= " + res);
            back(iScanner, logsList);
        }
        else if (choise == 4){
            String res = new RationalOperationsImplements().divMetod(newCalc);
            RationalLogs newRatLog = new RationalLogs(LocalDateTime.now(), System.getProperty("user.name"), 
            newCalc.getFirstvalue() , "/", newCalc.getSecvolue(), res);
            logsList.addLog(newRatLog);
            System.out.println("\nРезультат= " + res);
            back(iScanner, logsList);
        }
        else if (choise == 5){
            new MenuImplements().menu(iScanner, logsList);
        }
        else {
            System.out.println("Введено не верное значение, повторите ввод.");
            choise(iScanner, logsList);
        }
    }

    @Override
    public void back(Scanner iScanner, LogsList logsList) {
        System.out.println("\nЕсли хотите совершить еще операции, нажмите - 1\nЧтобы вернуться в основное меню - 2");
        System.out.print("Введите значение: ");
        String value = iScanner.nextLine();
        Integer choise = Integer.parseInt(value);
        if (choise == 1){
            choise(iScanner, logsList);
        }
        else if (choise == 2){
            new MenuImplements().menu(iScanner, logsList);
        }
        else{
            System.out.println("Введено не корректное значение");
            choise(iScanner, logsList);
        }   
    }
    
}
