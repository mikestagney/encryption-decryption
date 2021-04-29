package encryptdecrypt;

public interface EncriptionAlgo {
    public String encryptMessage(String Message, int key);

    public String decryptMessage(String Message, int key);
}
