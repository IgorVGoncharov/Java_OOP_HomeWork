import java.util.Scanner;

public class NewComplexValueImplement<T extends ComplexCalc> implements NewValueInterface<ComplexCalc>{

    @Override
    public ComplexCalc newValue(Scanner iScanner) {
        System.out.println("\nВведите значения: ");
        System.out.print("Введите действительную часть первого числа: ");
        Double firstValue = Double.parseDouble(iScanner.nextLine());
        System.out.print("Введите мнимую часть первого числа: ");
        Double imagePartOfFirstValue = Double.parseDouble(iScanner.nextLine());
        System.out.print("Введите действительную часть второго числа: ");
        Double secValue = Double.parseDouble(iScanner.nextLine());
        System.out.print("Введите мнимую часть второго числа: ");
        Double imagePartOfsecValue = Double.parseDouble(iScanner.nextLine());
        return new ComplexCalc(firstValue, imagePartOfFirstValue, secValue, imagePartOfsecValue);
    }
    
}
