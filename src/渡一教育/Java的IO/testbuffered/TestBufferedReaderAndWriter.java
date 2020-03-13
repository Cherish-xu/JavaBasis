package src.渡一教育.Java的IO.testbuffered;

import java.io.*;

public class TestBufferedReaderAndWriter {

    public static void main(String[] args) {

        try {
            File file = new File("F://111//111.txt");
            FileReader fr = new FileReader(file);
            BufferedReader br = new BufferedReader(fr);
            int code = br.read();

        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
