import java.util.ArrayList;

public class ComplexCalc extends Calc {
    private double imagePartOfFirstValue;
    private double imagePartOfSecValue;

    public ComplexCalc(double firstvalue, double imagePartOfFirstValue, double secvalue, double imagePartOfSecValue) {
        super(firstvalue, secvalue);
        this.imagePartOfFirstValue = imagePartOfFirstValue;
        this.imagePartOfSecValue = imagePartOfSecValue;
    }
    public double getImagePartOfFirstValue() {
        return imagePartOfFirstValue;
    }

    public void setImagePartOfFirstValue(double imagePartOfFirstValue) {
        this.imagePartOfFirstValue = imagePartOfFirstValue;
    }

    public double getImagePartOfSecValue() {
        return imagePartOfSecValue;
    }

    public void setImagePartOfSecValue(double imagePartOfSecValue) {
        this.imagePartOfSecValue = imagePartOfSecValue;
    }

    @Override
    public ArrayList<Double> setValuesList(ArrayList<Double> valuesList) {
        valuesList.add(super.getFirstvalue());
        valuesList.add(super.getSecvolue());
        valuesList.add(imagePartOfFirstValue);
        valuesList.add(imagePartOfSecValue);
        return valuesList;
    }

    
}
