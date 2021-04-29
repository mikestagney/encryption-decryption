package encryptdecrypt;

public class ShiftAlgo implements EncriptionAlgo {

    public String encryptMessage(String message, int key) {
        StringBuilder cypherText = new StringBuilder();
        char[] holder = message.toCharArray();

        for (char currentChar : holder) {
            if (Character.isLowerCase(currentChar)) {
                currentChar += key;
                if (!Character.isLowerCase(currentChar)) {
                    currentChar -= 26;
                }
            } else if (Character.isUpperCase(currentChar)) {
                currentChar += key;
                if (!Character.isUpperCase(currentChar)) {
                    currentChar -= 26;
                }
            }

            cypherText.append(currentChar);
        }
        return cypherText.toString();
    }

    public String decryptMessage(String message, int key) {
        StringBuilder cypherText = new StringBuilder();
        char[] holder = message.toCharArray();

        for (char currentChar : holder) {
            if (Character.isLowerCase(currentChar)) {
                currentChar -= key;
                if (!Character.isLowerCase(currentChar)) {
                    currentChar += 26;
                }
            }
            if (Character.isUpperCase(currentChar)) {
                currentChar -= key;
                if (!Character.isUpperCase(currentChar)) {
                    currentChar += 26;
                }
            }
            cypherText.append(currentChar);
        }
        return cypherText.toString();
    }


}
