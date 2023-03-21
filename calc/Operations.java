import java.util.ArrayList;

public class Operations implements OperationsFunc{

    @Override
    public String plusMetod(ArrayList<Double> valueList) {
        return Double.toString(valueList.get(0) + valueList.get(1));

    }

    @Override
    public String minusMetod(ArrayList<Double> valuesList) {
        return Double.toString(valuesList.get(0) - valuesList.get(1));
    }

    @Override
    public String multiplicateMetod(ArrayList<Double> valuesList) {
        return Double.toString(valuesList.get(0) * valuesList.get(1));
    }

    @Override
    public String divMetod(ArrayList<Double> valuesList) {
        return Double.toString(valuesList.get(0) / valuesList.get(1));
    }
    
}
