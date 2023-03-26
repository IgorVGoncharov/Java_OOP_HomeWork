public class PushButtonMobilePhone extends CityPhone implements SmsInterface{
    Double butteryPower;
    Double screenSize;

    public PushButtonMobilePhone(String brand, String model, Double butteryPower, Double screenSize) {
        super(brand, model);
        this.screenSize = screenSize;
        this.butteryPower = butteryPower;
    }

    public Double getButteryPower() {
        return butteryPower;
    }

    public void setButteryPower(Double butteryPower) {
        this.butteryPower = butteryPower;
    }

    public Double getScreenSize() {
        return screenSize;
    }

    public void setScreenSize(Double screenSize) {
        this.screenSize = screenSize;
    }

    @Override
    public void sendSms(String text) {
        System.out.println("Отправляем смс с текстом" + text);
    }

    @Override
    public void readSms() {
        System.out.println("Читаем смс");
    }


    
}
