import java.util.ArrayList;

public class ComplexOperation extends Operations{
    
    @Override
    public String plusMetod(ArrayList<Double> valueList) {
        return Double.toString(valueList.get(0) + valueList.get(1)) + " + " 
        + Double.toString(valueList.get(2) + valueList.get(3))+"i";
    }

    @Override
    public String multiplicateMetod(ArrayList<Double> valuesList) {
        return Double.toString((valuesList.get(0) * valuesList.get(1)) 
        - (valuesList.get(2) * valuesList.get(3))) + " + " + Double.toString((valuesList.get(0) * valuesList.get(3)) 
        + (valuesList.get(1) * valuesList.get(2)))+"i";
    }

    @Override
    public String divMetod(ArrayList<Double> valuesList) {
        Double firstPart = (valuesList.get(0) * valuesList.get(1)) + (valuesList.get(2) * valuesList.get(3));
        Double secPart = ((valuesList.get(1) * valuesList.get(1))) + ((valuesList.get(3) * valuesList.get(3)));
        Double thirdPart = (valuesList.get(2) * valuesList.get(1)) - (valuesList.get(0) * valuesList.get(3)); 
        Double forthPart = ((valuesList.get(1) * valuesList.get(1))) + ((valuesList.get(3) * valuesList.get(3)));
        return Double.toString((firstPart/secPart)) + " + " + Double.toString(thirdPart/forthPart) + "i";
    }

    @Override
    public String minusMetod(ArrayList<Double> valuesList) {
        return Double.toString(valuesList.get(0) - valuesList.get(1)) + " + " 
        + Double.toString(valuesList.get(2) - valuesList.get(3))+"i";
    }
}
