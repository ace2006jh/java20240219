package ch18.lecture.p1outputStream;

import java.io.FileOutputStream;
import java.io.IOException;
import java.io.OutputStream;

public class C01OutPutStream {
    public static void main(String[] args) throws IOException {
        String fileName = "temp/output01.data";
        OutputStream os = new FileOutputStream(fileName);
        os.write(255);
        os.write(100);
        os.write(1234540000);
    }
}
