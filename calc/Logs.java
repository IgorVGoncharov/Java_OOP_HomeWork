import java.time.LocalDateTime;

public abstract class Logs {
    private LocalDateTime operationDateTime;
    private String userName;
    private Double firstValue;
    private String operation;
    private Double secValue;
    private String result;
    
    public Logs(LocalDateTime operationDateTime, String userName, Double firstValue, String operation,
    Double secValue, String result) {
        this.operationDateTime = operationDateTime;
        this.userName = userName;
        this.firstValue = firstValue;
        this.operation = operation;
        this.secValue = secValue;
        this.result = result;
    }

    public LocalDateTime getOperationDateTime() {
        return operationDateTime;
    }

    public void setOperationDateTime(LocalDateTime operationDateTime) {
        this.operationDateTime = operationDateTime;
    }

    public String getUserName() {
        return userName;
    }

    public void setUserName(String userName) {
        this.userName = userName;
    }

    public Double getFirstValue() {
        return firstValue;
    }

    public void setFirstValue(Double firstValue) {
        this.firstValue = firstValue;
    }

    public String getOperation() {
        return operation;
    }

    public void setOperation(String operation) {
        this.operation = operation;
    }

    public Double getSecValue() {
        return secValue;
    }

    public void setSecValue(Double secValue) {
        this.secValue = secValue;
    }

    public String getResult() {
        return result;
    }

    public void setResult(String result) {
        this.result = result;
 
    }

    @Override
    public String toString() {
        return "Дата и время операции: " + this.operationDateTime + ", " + "\tПользователь: " + this.userName + ", " + "\tВыражение: {" + this.firstValue + " "
        + this.operation + " " + this.secValue + " = " + this.result + "}"; 
    }
}
