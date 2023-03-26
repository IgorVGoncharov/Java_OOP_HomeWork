public interface MessageModuleInterface<T> {
    public void sendMessage(T message);
    public void readMessage(T message);
    public void saveMessage(T message);
}
