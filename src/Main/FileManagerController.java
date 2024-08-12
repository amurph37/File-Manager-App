package Main;

import java.util.Scanner;

public class FileManagerController {

    private final FileOperations fileOps = new FileOperations();
    private final DirectoryOperations dirOps = new DirectoryOperations();
    private final SearchOperations searchOps = new SearchOperations();

    public void displayDirectoryContents(Scanner scanner) {
        System.out.print("Enter directory path: ");
        String path = scanner.nextLine();
        fileOps.displayDirectoryContents(path);
    }

    public void copyFile(Scanner scanner) {
        System.out.print("Enter source file path: ");
        String source = scanner.nextLine();
        System.out.print("Enter destination file path: ");
        String destination = scanner.nextLine();
        fileOps.copyFile(source, destination);
    }

    public void moveFile(Scanner scanner) {
        System.out.print("Enter source file path: ");
        String source = scanner.nextLine();
        System.out.print("Enter destination file path: ");
        String destination = scanner.nextLine();
        fileOps.moveFile(source, destination);
    }

    public void deleteFile(Scanner scanner) {
        System.out.print("Enter file path to delete: ");
        String path = scanner.nextLine();
        fileOps.deleteFile(path);
    }

    public void createDirectory(Scanner scanner) {
        System.out.print("Enter directory path to create: ");
        String path = scanner.nextLine();
        dirOps.createDirectory(path);
    }

    public void deleteDirectory(Scanner scanner) {
        System.out.print("Enter directory path to delete: ");
        String path = scanner.nextLine();
        dirOps.deleteDirectory(path);
    }

    public void searchFiles(Scanner scanner) {
        System.out.print("Enter directory path to search: ");
        String path = scanner.nextLine();
        System.out.print("Enter file name or extension to search: ");
        String query = scanner.nextLine();
        searchOps.searchFiles(path, query);
    }
}
