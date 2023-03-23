import java.util.Scanner;

public class NewRationalValueImplements <T extends RationalCalc> implements NewValueInterface<RationalCalc> {

    @Override
    public RationalCalc newValue(Scanner iScanner) {
        System.out.println("\nВведите значения: ");
        System.out.print("Введите первое число: ");
        Double firstValue = Double.parseDouble(iScanner.nextLine());
        System.out.print("Введите второе число: ");
        Double secValue = Double.parseDouble(iScanner.nextLine());
        return new RationalCalc(firstValue, secValue);
    }
    
}
