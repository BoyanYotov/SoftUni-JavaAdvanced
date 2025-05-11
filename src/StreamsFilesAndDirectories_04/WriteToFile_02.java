package StreamsFilesAndDirectories_04;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Scanner;

public class WriteToFile_02 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String pathInput = "C:\\Users\\Boyan Yotov\\Documents\\GitHub\\SoftUni-JavaAdvanced\\src\\StreamsFilesAndDirectories_04\\input.txt";
        FileInputStream fileInputStream = new FileInputStream(pathInput);

        String pathOut = "C:\\Users\\Boyan Yotov\\Documents\\GitHub\\SoftUni-JavaAdvanced\\src\\StreamsFilesAndDirectories_04\\output.txt";
        FileOutputStream fileOutputStream = new FileOutputStream(pathOut);

        int oneByte = fileInputStream.read();

        while (oneByte >= 0) {
            char symbol = (char) oneByte;
            if (symbol != ',' && symbol != '.' && symbol != '!' && symbol != '?') {
                fileOutputStream.write(symbol);
            }

            oneByte = fileInputStream.read();
        }

        fileOutputStream.close();
    }
}