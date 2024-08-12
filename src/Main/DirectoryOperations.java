package Main;

import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;

public class DirectoryOperations {

    public void createDirectory(String path) {
        try {
            Files.createDirectory(Path.of(path));
            System.out.println("Directory created successfully.");
        } catch (IOException e) {
            System.out.println("Error creating directory: " + e.getMessage());
        }
    }

    public void deleteDirectory(String path) {
        Path dirPath = Path.of(path);
        if (Files.exists(dirPath) && Files.isDirectory(dirPath)) {
            try {
                Files.delete(dirPath);
                System.out.println("Directory deleted successfully.");
            } catch (IOException e) {
                System.out.println("Error deleting directory: " + e.getMessage());
            }
        } else {
            System.out.println("Invalid directory path.");
        }
    }
}
