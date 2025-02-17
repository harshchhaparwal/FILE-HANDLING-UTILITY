import java.io.IOException;
import java.nio.file.*;
import java.nio.charset.StandardCharsets;
import java.util.List;

public class FileHandlingUtility {

    private static final String FILE_PATH = "example.txt";

    public static void main(String[] args) {
        // Writing to a file
        writeToFile("Hello, this is a sample text file.\nWelcome to File Handling in Java!");
        
        // Reading from the file
        readFromFile();
        
        // Modifying the file (Appending a new line)
        modifyFile("This is an additional line appended to the file.");
        
        // Reading again to check modifications
        readFromFile();
    }

    /**
     * Writes the given text to the file.
     * @param content The text content to write.
     */
    public static void writeToFile(String content) {
        try {
            Files.write(Paths.get(FILE_PATH), content.getBytes(StandardCharsets.UTF_8),
                        StandardOpenOption.CREATE, StandardOpenOption.TRUNCATE_EXISTING);
            System.out.println("File written successfully.");
        } catch (IOException e) {
            System.err.println("Error writing to file: " + e.getMessage());
        }
    }

    /**
     * Reads and prints the contents of the file.
     */
    public static void readFromFile() {
        try {
            List<String> lines = Files.readAllLines(Paths.get(FILE_PATH), StandardCharsets.UTF_8);
            System.out.println("File Content:");
            lines.forEach(System.out::println);
        } catch (IOException e) {
            System.err.println("Error reading file: " + e.getMessage());
        }
    }

    /**
     * Appends the given text to the existing file.
     * @param content The text content to append.
     */
    public static void modifyFile(String content) {
        try {
            Files.write(Paths.get(FILE_PATH), ("\n" + content).getBytes(StandardCharsets.UTF_8),
                        StandardOpenOption.APPEND);
            System.out.println("File modified successfully.");
        } catch (IOException e) {
            System.err.println("Error modifying file: " + e.getMessage());
        }
    }
}
