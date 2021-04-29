package encryptdecrypt;

public class UnicodeAlgo implements EncriptionAlgo {

    public String encryptMessage(String text, int key) {
        StringBuilder cypherText = new StringBuilder();
        char[] holder = text.toCharArray();

        for (char currentChar : holder) {

            cypherText.append((char)(currentChar + key));
        }
        return cypherText.toString();
    }
    public String decryptMessage(String text, int key) {
        StringBuilder cypherText = new StringBuilder();
        char[] holder = text.toCharArray();

        for (char currentChar : holder) {

            cypherText.append((char)(currentChar - key));
        }

        return cypherText.toString();
    }


}
