package Main;

import Main.utils.ExceptionHandler;

import java.util.Scanner;

public class FileManagerApp {

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        FileManagerController controller = new FileManagerController();

        System.out.println("Welcome to File Manager!");
        while (true) {
            System.out.println("\nSelect an option:");
            System.out.println("1. Display Directory Contents");
            System.out.println("2. Copy a File");
            System.out.println("3. Move a File");
            System.out.println("4. Delete a File");
            System.out.println("5. Create a Directory");
            System.out.println("6. Delete a Directory");
            System.out.println("7. Search Files");
            System.out.println("8. Exit");

            String choice = scanner.nextLine();

            try {
                if ("1".equals(choice)) {
                    controller.displayDirectoryContents(scanner);
                } else if ("2".equals(choice)) {
                    controller.copyFile(scanner);
                } else if ("3".equals(choice)) {
                    controller.moveFile(scanner);
                } else if ("4".equals(choice)) {
                    controller.deleteFile(scanner);
                } else if ("5".equals(choice)) {
                    controller.createDirectory(scanner);
                } else if ("6".equals(choice)) {
                    controller.deleteDirectory(scanner);
                } else if ("7".equals(choice)) {
                    controller.searchFiles(scanner);
                } else if ("8".equals(choice)) {
                    System.exit(0);
                } else {
                    System.out.println("Invalid choice. Please try again.");
                }
            } catch (Exception e) {
                ExceptionHandler.handleException(e);
            }
        }
    }
}
