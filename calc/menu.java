import java.time.LocalDateTime;
import java.util.ArrayList;
import java.util.Scanner;

public class menu {
    Scanner iScanner = new Scanner(System.in);
    
    public void menu(LogsList logsList){
        try {
            System.out.println("\nВыберите режим работы калькулятора:\n1. Калькулятор для работы с комплексными числами\n2. Калькулятор для работы с рациональными числами\n3. Посмотреть логи\n4. Выход");
            System.out.print("Введите значение: ");
            Integer choise = Integer.parseInt(iScanner.nextLine());
            if (choise == 1){
                comlCalcChoise(logsList);
            }
            else if (choise == 2){
                ratCalcChoise(logsList);
            }
            else if (choise == 3){
                System.out.println("\n");
               logsList.showLogs();
               menu(logsList);
            }
            else if (choise == 4){
                System.out.println("До скорых встреч!");
                
            }
            else{
                System.out.println("Введено не верное значение. Попробуйте еще раз.");
                menu(logsList);
            }
            
        } catch (Exception e) {
            System.out.println("Ошибка! Введено не число, попробуем еще рвз.....");
            menu(logsList);
        }
    }

    public ArrayList<Double> complexValues(){
        System.out.println("\nВведите значения: ");
        System.out.print("Введите действительную часть первого числа: ");
        Double firstValue = Double.parseDouble(iScanner.nextLine());
        System.out.print("Введите мнимую часть первого числа: ");
        Double imagePartOfFirstValue = Double.parseDouble(iScanner.nextLine());
        System.out.print("Введите действительную часть второго числа: ");
        Double secValue = Double.parseDouble(iScanner.nextLine());
        System.out.print("Введите мнимую часть второго числа: ");
        Double imagePartOfsecValue = Double.parseDouble(iScanner.nextLine());
        ArrayList<Double> newList = new ArrayList<>();
        ComplexCalc newValue = new ComplexCalc(firstValue, imagePartOfFirstValue, secValue, imagePartOfsecValue);
        return newValue.setValuesList(newList);
    }

    public ArrayList<Double> rationalValues(){
        System.out.println("\nВведите значения: ");
        System.out.print("Введите первое число: ");
        Double firstValue = Double.parseDouble(iScanner.nextLine());
        System.out.print("Введите второе число: ");
        Double secValue = Double.parseDouble(iScanner.nextLine());
        ArrayList<Double> newList = new ArrayList<>();
        RationalCalc newValue = new RationalCalc(firstValue, secValue);

        return newValue.setValuesList(newList);
    }
    
    public void comlCalcChoise(LogsList logsList){
        ArrayList<Double> list = complexValues();
        System.out.println("\nВыбирите действие, которое вы хотите выполнить: ");
        System.out.print("1. Сложение\n2. Вычетание\n3. Умножение\n4. Деление\n5. Вернуться в основное меню\nВведите значение: ");
        Integer choise = Integer.parseInt(iScanner.nextLine());
        if (choise == 1){
            String res = new ComplexOperation().plusMetod(list);
            ComplexLogs newComplLog = new ComplexLogs(LocalDateTime.now(), System.getProperty("user.name"), list.get(0), 
            list.get(2), "+", list.get(1), list.get(3), res);
            logsList.addLog(newComplLog);
            System.out.println("\nРезультат= " + res);
            comCalcBack(logsList);
        }
        else if (choise == 2){
            String res = new ComplexOperation().minusMetod(list);
            ComplexLogs newComplLog = new ComplexLogs(LocalDateTime.now(), System.getProperty("user.name"), list.get(0), 
            list.get(2), "-", list.get(1), list.get(3), res);
            logsList.addLog(newComplLog);
            System.out.println("\nРезультат= " + res);
            comCalcBack(logsList);
        }
        else if (choise == 3){
            String res = new ComplexOperation().multiplicateMetod(list);
            ComplexLogs newComplLog = new ComplexLogs(LocalDateTime.now(), System.getProperty("user.name"), list.get(0), 
            list.get(2), "*", list.get(1), list.get(3), res);
            logsList.addLog(newComplLog);
            System.out.println("\nРезультат= " + res);
            comCalcBack(logsList);
        }
        else if (choise == 4){
            String res = new ComplexOperation().divMetod(list);
            ComplexLogs newComplLog = new ComplexLogs(LocalDateTime.now(), System.getProperty("user.name"), list.get(0), 
            list.get(2), "/", list.get(1), list.get(3), res);
            logsList.addLog(newComplLog);
            System.out.println("\nРезультат= " + res);
            comCalcBack(logsList);
        }
        else if (choise == 5){
            menu(logsList);
        }
        else {
            System.out.println("Введено не верное значение, повторите ввод.");
            comlCalcChoise(logsList);
        }
    }

    public void ratCalcChoise(LogsList logsList){
        ArrayList<Double> list = rationalValues();
        System.out.println("\nВыбирите действие, которое вы хотите выполнить: ");
        System.out.print("1. Сложение\n2. Вычетание\n3. Умножение\n4. Деление\n5. Вернуться в основное меню\nВведите значение: ");
        Integer choise = Integer.parseInt(iScanner.nextLine());
        if (choise == 1){
            String res = new RationalOperations().plusMetod(list);
            RationalLogs newRatLog = new RationalLogs(LocalDateTime.now(), System.getProperty("user.name"), 
            list.get(0) , "+", list.get(1), res);
            logsList.addLog(newRatLog);
            System.out.println("\nРезультат= " + res);
            ratCalcBack(logsList);
        }
        else if (choise == 2){
            String res = new RationalOperations().minusMetod(list);
            RationalLogs newRatLog = new RationalLogs(LocalDateTime.now(), System.getProperty("user.name"), 
            list.get(0) , "-", list.get(1), res);
            logsList.addLog(newRatLog);
            System.out.println("\nРезультат= " + res);
            ratCalcBack(logsList);
        }
        else if (choise == 3){
            String res = new RationalOperations().multiplicateMetod(list);
            RationalLogs newRatLog = new RationalLogs(LocalDateTime.now(), System.getProperty("user.name"), 
            list.get(0) , "*", list.get(1), res);
            logsList.addLog(newRatLog);
            System.out.println("\nРезультат= " + res);
            ratCalcBack(logsList);
        }
        else if (choise == 4){
            String res = new RationalOperations().divMetod(list);
            RationalLogs newRatLog = new RationalLogs(LocalDateTime.now(), System.getProperty("user.name"), 
            list.get(0) , "/", list.get(1), res);
            logsList.addLog(newRatLog);
            System.out.println("\nРезультат= " + res);
            ratCalcBack(logsList);
        }
        else if (choise == 5){
            menu(logsList);
        }
        else {
            System.out.println("Введено не верное значение, повторите ввод.");
            ratCalcChoise(logsList);
        }
    }

    public void ratCalcBack(LogsList logsList){
        System.out.println("\nЕсли хотите совершить еще операции, нажмите - 1\nЧтобы вернуться в основное меню - 2");
        System.out.print("Введите значение: ");
        String value = iScanner.nextLine();
        Integer choise = Integer.parseInt(value);
        if (choise == 1){
            ratCalcChoise(logsList);
        }
        else if (choise == 2){
            menu(logsList);
        }
        else{
            System.out.println("Введено не корректное значение");
            ratCalcChoise(logsList);
        }   
    }

    public void comCalcBack(LogsList logsList){
        System.out.println("\nЕсли хотите совершить еще операции, нажмите - 1\nЧтобы вернуться в основное меню - 2");
        System.out.print("Введите значение: ");
        String value = iScanner.nextLine();
        Integer choise = Integer.parseInt(value);
        if (choise == 1){
            comlCalcChoise(logsList);
        }
        else if (choise == 2){
            menu(logsList);
        }
        else{
            System.out.println("Введено не корректное значение");
            comlCalcChoise(logsList);
        }   
    }
}
