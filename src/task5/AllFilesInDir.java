package task5;

import java.io.File;

public class AllFilesInDir {
    private static int countDir = 0;
    private static long sumSize = 0;
    private static int countFile = 0;
    public static void printAllFilesInDirectory(File file) {
        for (final File fileEntry : file.listFiles()) {
            if (fileEntry.isDirectory()) {
                System.out.println(fileEntry.getName());
                countDir++;
                printAllFilesInDirectory(fileEntry);

            } else {
                countFile++;
                sumSize += fileEntry.length();
                System.out.println("    "+fileEntry.getName()+"and atr :");
            }
        }
    }

    public static void main(String[] args) {
        File file = new File("F:\\task10_IO_NIO\\src");
        printAllFilesInDirectory(file);
        System.out.println("Files :"+countFile+", total size :"+sumSize+" bytes");
        System.out.println("Dir :"+countDir);
    }
}
