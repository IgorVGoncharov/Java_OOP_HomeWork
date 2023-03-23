import java.util.Scanner;

public class MenuImplements implements MenuInterface {

    @Override
    public void menu(Scanner iScanner, LogsList logsList) {
        try {
            System.out.println("\nВыберите режим работы калькулятора:\n1. Калькулятор для работы с комплексными числами\n2. Калькулятор для работы с рациональными числами\n3. Посмотреть логи\n4. Выход");
            System.out.print("Введите значение: ");
            Integer choise = Integer.parseInt(iScanner.nextLine());
            if (choise == 1){
                new ComplexPerfomCalcImplement().choise(iScanner, logsList);
            }
            else if (choise == 2){
                new RationalPerfomCalcImplement().choise(iScanner, logsList);
            }
            else if (choise == 3){
                System.out.println("\n");
               logsList.showLogs();
               menu(iScanner, logsList);
            }
            else if (choise == 4){
                System.out.println("До скорых встреч!");
                
            }
            else{
                System.out.println("Введено не верное значение. Попробуйте еще раз.");
                menu(iScanner, logsList);
            }
            
        } catch (Exception e) {
            System.out.println("Ошибка! Введено не число, попробуем еще рвз.....");
            menu(iScanner, logsList);
        }
    }
    
    
}
