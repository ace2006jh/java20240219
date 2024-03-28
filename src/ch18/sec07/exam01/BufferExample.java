package ch18.sec07.exam01;

import java.io.*;

public class BufferExample {
    public static void main(String[] args) throws Exception {
        String originalFIlePath1 = "temp/dog.png";
        String targetFilePath1 = "temp/dog2.png";
        FileInputStream fis = new FileInputStream(originalFIlePath1);
        FileOutputStream fos = new FileOutputStream(targetFilePath1);

        String originalFIlePath2 = "temp/dog.png";
        String targetFilePath2 = "temp/dog2.png";
        FileInputStream fis2 = new FileInputStream(originalFIlePath2);
        FileOutputStream fos2 = new FileOutputStream(targetFilePath2);
        BufferedInputStream bis = new BufferedInputStream(fis2);
        BufferedOutputStream bos = new BufferedOutputStream(fos2);

        long nonBufferTime = copy(fis, fos);
        System.out.println("버퍼 미사용:\t" + nonBufferTime + " ns");
        long BufferTime = copy(fis, fos);
        System.out.println("버퍼 사용:\t" + BufferTime + " ns");

        fis.close();
        fos.close();
        bis.close();
        bos.close();

    }

    public static long copy(InputStream is, OutputStream os) throws Exception {
        long start = System.nanoTime();

        while (true) {
            int data = is.read();
            if (data == -1) break;
            os.write(data);
        }
        os.flush();
        long end = System.nanoTime();
        return (end - start);
    }
}
