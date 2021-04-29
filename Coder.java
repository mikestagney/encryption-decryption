package encryptdecrypt;

public class Coder {

    private EncriptionAlgo algorithm;

    public void setAlgorithm(EncriptionAlgo algorithm) {
        this.algorithm = algorithm;
    }

    public String encryptMessage(String text, int key) {
        return this.algorithm.encryptMessage(text, key);
    }

    public String decryptMessage(String text, int key) {
        return this.algorithm.decryptMessage(text, key);
    }
}
