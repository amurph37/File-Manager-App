package Main;

import java.io.File;
import java.nio.file.Files;
import java.nio.file.Path;

public class SearchOperations {

    public void searchFiles(String directoryPath, String query) {
        Path dirPath = Path.of(directoryPath);
        File dir = dirPath.toFile();

        if (Files.exists(dirPath) && Files.isDirectory(dirPath)) {
            searchDirectory(dir, query);
        } else {
            System.out.println("Invalid directory path.");
        }
    }

    private void searchDirectory(File directory, String query) {
        File[] files = directory.listFiles();
        if (files != null) {
            for (File file : files) {
                if (file.isDirectory()) {
                    searchDirectory(file, query);
                } else if (file.getName().contains(query)) {
                    System.out.println("Found: " + file.getAbsolutePath());
                }
            }
        }
    }
}
