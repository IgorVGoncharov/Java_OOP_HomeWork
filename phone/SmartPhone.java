public class SmartPhone<T extends FileMessagesAbstract> extends PushButtonMobilePhone implements MessageModuleInterface<T>, CameraInterface {
    Double memory;
    Double camera;
   
   
    public SmartPhone(String brand, String model, Double butteryPower, Double screenSize, Double memory, Double camera) {
        super(brand, model, butteryPower, screenSize);
        this.memory = memory;
        this.camera = camera;
    }


    public Double getMemory() {
        return memory;
    }


    public void setMemory(Double memory) {
        this.memory = memory;
    }


    public Double getCamera() {
        return camera;
    }


    public void setCamera(Double camera) {
        this.camera = camera;
    }


    @Override
    public void sendMessage(T message) {
        System.out.println("отправляем сообщение указанного типа");
    }


    @Override
    public void readMessage(T message) {
        System.out.println("Принимаем сообщение указанного типа");
    }


    @Override
    public void saveMessage(T message) {
        System.out.println("сохраняем сообщение указанного типа");
    }


    @Override
    public void makePhoto() {
        System.out.println("Делаю фото");
    }
    
}
