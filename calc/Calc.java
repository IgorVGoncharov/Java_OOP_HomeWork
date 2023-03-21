import java.util.ArrayList;

public abstract class Calc {
    //private ArrayList<Double> valuesList = new ArrayList<>();
    private double firstvalue;
    private double secValue;
    
    
    public Calc(double firstvalue, double secValue) {
        this.firstvalue = firstvalue;
        this.secValue = secValue;
    }

    public double getFirstvalue() {
        return firstvalue;
    }
    
    public void setFirstvalue(double firstvalue) {
        this.firstvalue = firstvalue;
    }
    
    public double getSecvolue() {
        return secValue;
    }
    
    public void setSecvalue(double secvalue) {
        this.secValue = secvalue;
    }
    
    //public ArrayList<Double> getValuesList() {
    //    return valuesList;
   // }
    
    public ArrayList<Double> setValuesList(ArrayList<Double> valuesList) {
        valuesList.add(firstvalue);
        valuesList.add(secValue);
        return valuesList;
    }
    
}
