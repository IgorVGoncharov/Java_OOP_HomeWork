

public class ComplexOperationImplements<T extends ComplexCalc>  implements PlusMetodInterface<T>, MinusMetodInterface<T>, MultiplicadeMetodInterface<T>, DivMetodInterface<T> {
    
    @Override
    public String divMetod(T calc) {
        Double firstPart = (calc.getFirstvalue() * calc.getSecvolue()) + (calc.getImagePartOfFirstValue() * calc.getImagePartOfSecValue());
        Double secPart = ((calc.getSecvolue() * calc.getSecvolue())) + ((calc.getImagePartOfSecValue() * calc.getImagePartOfSecValue()));
        Double thirdPart = (calc.getImagePartOfFirstValue() * calc.getSecvolue()) - (calc.getFirstvalue() * calc.getImagePartOfSecValue()); 
        Double forthPart = ((calc.getSecvolue() * calc.getSecvolue())) + ((calc.getImagePartOfSecValue() * calc.getImagePartOfSecValue()));
        return Double.toString((firstPart/secPart)) + " + " + Double.toString(thirdPart/forthPart) + "i";
    }

    @Override
    public String multiplicadeMetod(T calc) {
        return Double.toString((calc.getFirstvalue() * calc.getSecvolue()) 
        - calc.getImagePartOfFirstValue() * calc.getImagePartOfSecValue()) + " + " 
        + Double.toString((calc.getFirstvalue() * calc.getImagePartOfSecValue()) 
        + (calc.getSecvolue() * calc.getImagePartOfFirstValue()))+"i";
    }
    
    @Override
    public String minusMetod(T calc) {
        return Double.toString(calc.getFirstvalue() - calc.getSecvolue()) + " + " 
        + Double.toString(calc.getImagePartOfFirstValue() - calc.getImagePartOfSecValue())+"i";
    }

    @Override
    public String plusMetod(T calc) {
        return Double.toString(calc.getFirstvalue() + calc.getSecvolue()) + " + " 
        + Double.toString(calc.getImagePartOfFirstValue() + calc.getImagePartOfSecValue())+"i";
    }
   



}
