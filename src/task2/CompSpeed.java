package task2;

import java.io.*;
import java.time.Duration;
import java.time.LocalDateTime;
import java.util.Date;
import static java.time.temporal.ChronoUnit.SECONDS;

public class CompSpeed {
    public static void main(String[] args) throws IOException {
        File dir = new File("tmp/test");
        File file = new File(dir,"test.txt");
        File file1 = new File(dir,"testEnd.txt");
        FileReader fileReader = new FileReader(file);
        FileWriter fileWriter = new FileWriter(file1);
        testFileRW(fileReader,fileWriter);

        for(int i=1 ; i < 10;i++){
            int size = 64*i;
            BufferedReader bufferedReader = new BufferedReader(new FileReader(file),size);
            BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(file1),size);
            testBufferRW(bufferedReader,bufferedWriter,size);

        }

    }
    public static void testFileRW(FileReader fileReader, FileWriter fileWriter) throws IOException {
        LocalDateTime now = LocalDateTime.now();
        int bytee;
        Date date = new Date();
        while((bytee = fileReader.read()) != -1){
            fileWriter.write((byte)bytee);
        }
        LocalDateTime now2 = LocalDateTime.now();
        System.out.print("Usual FileReader - ");
        System.out.println(SECONDS.between(now,now2)+" sec.");
    }
    public static void testBufferRW(BufferedReader bufferedReader,BufferedWriter bufferedWriter,int size) throws IOException {
        LocalDateTime now = LocalDateTime.now();
        int bytee;
        Date date = new Date();
        while((bytee = bufferedReader.read()) != -1){
            bufferedWriter.write((byte)bytee);
        }
        LocalDateTime now2 = LocalDateTime.now();
        System.out.print("BufferedReader size-"+size+" ; ");
        System.out.println(SECONDS.between(now,now2)+" sec.");
    }
}
