package ge.edu.btu;

import java.io.File;
import java.io.FilenameFilter;

public class FileCounter {
    private  static final String BTU = "btu";
    public static void main(String[] args) {
int counter = 0;
        File root = new File("G:\\BTU_DOCUMENTS");
        FilenameFilter startsWith = (directory, filename) -> filename.startsWith(BTU);

        File[] files = root.listFiles(startsWith);
        assert files != null;
        for (File ignored : files) {
            counter++;
        }
        System.out.println("მოძებნილი ფაილების რაოდენობაა : " +counter);
    }
}
