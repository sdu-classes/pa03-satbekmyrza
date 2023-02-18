import java.util.Scanner;
import java.io.File;
import java.io.FileNotFoundException;


public class ReadFile {
    public static String[] readFile(String filename) throws FileNotFoundException {
        File file = new File(filename);
        Scanner in = new Scanner(file);
        
        String[] lines = new String[1000];
        int lineCounter = 0;
        
        while (in.hasNextLine()) {
            String line = in.nextLine();
            lines[lineCounter] = line;
            lineCounter++;
        }

        return lines;
    }

    public static void main(String[] args) {
        // readFile("text.txt");
        try {
            String relPath = "files" + File.separator + "text.txt";
            String absPath = "/code/sdu/pa03-satbekmyrza/4pm/problem-b/files/text.txt";
            String[] lines = readFile(relPath);
            for (String line: lines) {
                if (line == null) {
                    break;
                }
                System.out.println(line);
            }
        } catch (FileNotFoundException exc) {
            System.out.println("Your file does not exist.");
        } catch (NullPointerException exc) {
            System.out.println("Your file cannot be null");
        }
    }
}
