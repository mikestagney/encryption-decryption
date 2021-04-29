package encryptdecrypt;

import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Paths;

public class Main {
    public static void main(String[] args) throws IOException {
        // /Users/mikestagney/Downloads/readabilityTest3.txt
        // -key 5 -in "/Users/mikestagney/Downloads/readabilityTest3.txt" -mode dec

        String userChoice = "enc";
        String text = "";
        int key = 0;
        String fileIn = "";
        String fileOut = "";
        String algorithm = "shift";
        Coder coder = new Coder();

        for (int i = 0; i < args.length; i++) {
            switch (args[i]) {
                case "-mode":
                    userChoice = args[i + 1];
                    break;
                case "-key":
                    key = Integer.parseInt(args[i + 1]);
                    break;
                   case "-data":
                    text = args[i + 1];
                    break;
                case "-in":
                    fileIn = args[i + 1];
                    break;
                case "-out":
                    fileOut = args[i + 1];
                    break;
                case "-alg":
                    algorithm = args[i + 1];
                    break;
                default:
                    break;
            }
        }

        String convertedText = "invalid command";

        if (text.equals("") && !fileIn.equals("")) {
            text = readInfile(fileIn);
        }


        if (algorithm.equals("unicode")) {
            coder.setAlgorithm(new UnicodeAlgo());
        } else {
            coder.setAlgorithm(new ShiftAlgo());
        }


        switch (userChoice) {
            case "enc":
                convertedText = coder.encryptMessage(text, key);
                break;
            case "dec":
                convertedText = coder.decryptMessage(text, key);
                break;
            default:
                break;
        }

        if (fileOut.equals("")) {
            System.out.println(convertedText);
        } else {
            File file = new File(fileOut);

            try (FileWriter writer = new FileWriter(file)) {
                writer.write(convertedText);
            } catch (IOException e) {
                System.out.println("Error occurred " + e.getMessage());
            }
        }

    }

    static String readInfile (String fileName) throws IOException {
       
        return new String(Files.readAllBytes(Paths.get(fileName)));
    }
}
