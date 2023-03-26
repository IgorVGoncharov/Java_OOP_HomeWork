public abstract class FileMessagesAbstract {
    Double messageSize;
    String path;
    String fileName;
    String messageType;
    
    public FileMessagesAbstract(String path, String fileName, String messageType) {
        this.path = path;
        this.fileName = fileName;
        this.messageType = messageType;
    }

    public Double getMessageSize() {
        return messageSize;
    }


    public String getPath() {
        return path;
    }

    public void setPath(String path) {
        this.path = path;
    }

    public String getFileName() {
        return fileName;
    }

    public void setFileName(String fileName) {
        this.fileName = fileName;
    }

    public String getMessageType() {
        return messageType;
    }

    public void setMessageType(String messageType) {
        this.messageType = messageType;
    }
    

}
