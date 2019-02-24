package task4;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class ReadComments {
    String read(String path)throws IOException {
        StringBuilder stringBuilder = new StringBuilder();
        BufferedReader bufferedReader = new BufferedReader(new FileReader(path));
        String line;
        while ((line = bufferedReader.readLine())!= null){
            int commentIndex = line.indexOf("//");
            if(commentIndex >= 0){
                stringBuilder.append(line.subSequence(commentIndex,line.length())).append("\n");
            }
        }
        return stringBuilder.toString();
    }

    public static void main(String[] args) throws IOException {
        ReadComments readComments = new ReadComments();
        System.out.println(readComments.read("F:\\task10_IO_NIO\\src\\task4\\Comments.txt"));
    }
}
