package ge.edu.btu.searchindirectory;

import java.io.File;
import java.io.FilenameFilter;
import java.util.Scanner;

public class Main {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("შეიტანეთ საძიებო სიტყვა : ");
        String name = scan.next();
        File root = new File("G:\\Users");
        FilenameFilter contains = (directory, filename) -> filename.contains(name);

        File[] files = root.listFiles(contains);
        assert files != null;
        for (File f : files) {
            System.out.println(f);
        }

    }
}
