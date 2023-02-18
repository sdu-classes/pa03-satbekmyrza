import java.io.*;
import java.util.Scanner;

public class ReadFile {
    public static String[] readFile(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner fileIn = new Scanner(file);
        
        String[] lines = new String[1000];
        int lineCounter = 0;

        while (fileIn.hasNextLine()) {
            String line = fileIn.nextLine();
            lines[lineCounter] = line;
            lineCounter++;
        }

        return lines;
    }

    public static void main(String[] args) {
        try {
            String[] contents = readFile("input.txt");
            for (String line: contents) {
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }
        } catch (FileNotFoundException ex) {
            System.out.println("The file does not exist");
        }
    }
}
