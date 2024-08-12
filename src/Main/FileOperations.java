package Main;

import java.io.File;
import java.io.IOException;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardCopyOption;
import java.text.SimpleDateFormat;

public class FileOperations {

    public void displayDirectoryContents(String path) {
        Path dirPath = Path.of(path);
        File dir = dirPath.toFile();

        if (Files.exists(dirPath) && Files.isDirectory(dirPath)) {
            File[] files = dir.listFiles();
            SimpleDateFormat sdf = new SimpleDateFormat("MM/dd/yyyy HH:mm:ss");

            System.out.printf("%-30s %-10s %-20s%n", "File Name", "Size", "Last Modified");
            System.out.println("--------------------------------------------------------------");
            if (files != null) {
                for (File file : files) {
                    System.out.printf("%-30s %-10s %-20s%n", file.getName(), file.length(), sdf.format(file.lastModified()));
                }
            }
        } else {
            System.out.println("Invalid directory path.");
        }
    }

    public void copyFile(String sourcePath, String destinationPath) {
        try {
            Files.copy(Path.of(sourcePath), Path.of(destinationPath), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File copied successfully.");
        } catch (IOException e) {
            System.out.println("Error copying file: " + e.getMessage());
        }
    }

    public void moveFile(String sourcePath, String destinationPath) {
        try {
            Files.move(Path.of(sourcePath), Path.of(destinationPath), StandardCopyOption.REPLACE_EXISTING);
            System.out.println("File moved successfully.");
        } catch (IOException e) {
            System.out.println("Error moving file: " + e.getMessage());
        }
    }

    public void deleteFile(String filePath) {
        try {
            Files.delete(Path.of(filePath));
            System.out.println("File deleted successfully.");
        } catch (IOException e) {
            System.out.println("Error deleting file: " + e.getMessage());
        }
    }
}
