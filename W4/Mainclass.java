package W4;

import java.io.IOException;

public class Mainclass {
    public static void main(String[] args) throws IOException {
        ReadAndWriteIO reader = new ReadAndWriteIO();
        reader.readZip("zip.txt");
    }
}
