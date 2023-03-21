import java.util.ArrayList;

public class LogsList <T extends Logs> {
    private ArrayList<T> newLogsList = new ArrayList<>();
 
    public void addLog(T log){
        this.newLogsList.add(log);
    }

    public void showLogs(){
        for (T t : newLogsList) {
            System.out.println(t);
        }
    }
}
