package task6;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

import java.nio.Buffer;
import java.nio.ByteBuffer;
import java.nio.channels.FileChannel;
import java.nio.channels.ReadableByteChannel;
import java.nio.channels.SeekableByteChannel;
import java.nio.channels.WritableByteChannel;
import java.nio.file.Files;
import java.nio.file.Path;
import java.nio.file.StandardOpenOption;

public class SomeBuffer {
    public static void main(String[] args) throws IOException {

        // Path Of The Input Text File
        FileInputStream input = new FileInputStream ("F:\\task10_IO_NIO\\src\\task6\\test.txt");
        ReadableByteChannel source = input.getChannel();

        // Path Of The Output Text File
        FileOutputStream output = new FileOutputStream ("F:\\task10_IO_NIO\\src\\task6\\test1.txt");
        WritableByteChannel destination = output.getChannel();
        ByteBuffer buffer = ByteBuffer.allocateDirect(1024);
        readSome(source,buffer);
        writeSome(destination,buffer);

    }


    public static void readSome(ReadableByteChannel source, ByteBuffer buffer) throws IOException {
        while (source.read(buffer) != -1) {
            buffer.flip();
        }
    }

    public static void writeSome(WritableByteChannel destination, ByteBuffer buffer) throws IOException {
        while (buffer.hasRemaining()) {
            destination.write(buffer);
        }
        buffer.clear();
    }

}
