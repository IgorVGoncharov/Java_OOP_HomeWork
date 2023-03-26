public class CityPhone extends PhoneAbstract implements CallsInterface{

    public CityPhone(String brand, String model) {
        super(brand, model);
    }

    @Override
    public void makeCall(String number) {
        System.out.println("Решили позвонить по номеру" + number);
    }

    @Override
    public void takeCall() {
        System.out.println("Звонит телефон, взяли трубку");
    }
    
}
