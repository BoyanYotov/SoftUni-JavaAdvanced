package StreamsFilesAndDirectories_04;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.Scanner;

public class ReadFile_01 {
    public static void main(String[] args) throws IOException {
        Scanner scanner = new Scanner(System.in);

        String path = "C:\\Users\\Boyan Yotov\\Documents\\GitHub\\SoftUni-JavaAdvanced\\src\\StreamsFilesAndDirectories_04\\input.txt";

        FileInputStream fileReader = new FileInputStream(path);
        int oneByte = fileReader.read();

        while (oneByte >= 0){
            System.out.print(Integer.toBinaryString(oneByte) + " ");
            oneByte = fileReader.read();
        }

    }
}
