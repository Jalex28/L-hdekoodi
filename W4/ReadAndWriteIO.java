package W4;

import java.io.BufferedReader;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.io.FileReader;
import java.io.BufferedWriter;
import java.io.FileWriter;
import java.util.zip.ZipInputStream;
import java.io.FileInputStream;

public class ReadAndWriteIO {
    public void readFile(String filePath) throws FileNotFoundException, IOException {
        String outputstr;
        BufferedReader reader = new BufferedReader(new FileReader(filePath));
        outputstr = reader.readLine();
        while (outputstr != null) {
            System.out.println(outputstr);
            outputstr = reader.readLine();
        }

        reader.close();
    }

    public void readAndWrite(String input, String output) throws FileNotFoundException, IOException {
        String outputstr = "", line = null;
        BufferedReader reader = new BufferedReader(new FileReader(input));
        BufferedWriter writer = new BufferedWriter(new FileWriter(output));
        line = reader.readLine();
        while(line != null) {
            //if (line.length() < 30 && !(line.trim().isEmpty()) && line.contains("v"))
                outputstr += line + "\n";
            line = reader.readLine();
        }
        writer.write(outputstr);
        reader.close();
        writer.close();
    }

    public void readZip(String filePath) {
        try {
            ZipInputStream zip = new ZipInputStream(new FileInputStream(filePath));
            zip.getNextEntry();
            byte[] buffer = new byte[1048];
            int length = zip.read(buffer);
            System.out.println(new String(buffer, 0, length));
            zip.close();
        } catch (IOException e) {
            System.out.println("Error:" + e);
        }
    }
}
