import java.time.LocalDateTime;

public class ComplexLogs extends Logs {
    private double imagePartOfFirstValue;
    private double imagePartOfSecValue;

    public ComplexLogs(LocalDateTime operationDateTime, String userName, Double firstValue, double imagePartOfFirstValue, String operation,
    Double secValue, double imagePartOfSecValue, String result) {
        super(operationDateTime, userName, firstValue, operation, secValue, result);
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
    public String toString() {
        return "Дата и время операции: " + super.getOperationDateTime() + ", " + "\tПользователь: "
        + super.getUserName() + ", " + "\tВыражение: { (" + super.getFirstValue() + " + "
        + this.imagePartOfFirstValue + "i) " + super.getOperation() + " (" + super.getSecValue() + " + " + this.imagePartOfSecValue
        + "i) = " + super.getResult() + " }";
        
    }
    
}
