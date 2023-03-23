public class RationalOperationsImplements<T extends RationalCalc> implements PlusMetodInterface<T>, MinusMetodInterface<T>, MultiplicadeMetodInterface<T>, DivMetodInterface<T> {
    
    @Override
    public String divMetod(T calc) {
        return Double.toString(calc.getFirstvalue() / calc.getSecvolue());
        
    }

    @Override
    public String multiplicadeMetod(T calc) {
        return Double.toString(calc.getFirstvalue() * calc.getSecvolue());
    }

    @Override
    public String minusMetod(T calc) {
        return Double.toString(calc.getFirstvalue() - calc.getSecvolue());
    }

    @Override
    public String plusMetod(T calc) {
        return Double.toString(calc.getFirstvalue() + calc.getSecvolue());
    }

 

    

        


  
    
}
