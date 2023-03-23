public abstract class Calc {
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
    
}
