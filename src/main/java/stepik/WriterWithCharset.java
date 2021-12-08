package stepik;

import java.io.IOException;
import java.io.OutputStream;
import java.io.OutputStreamWriter;
import java.io.Writer;
import java.nio.charset.StandardCharsets;

public class WriterWithCharset {
    public static void main(String[] args) throws IOException {
        OutputStream outputStream = System.out;
        Writer writer = new OutputStreamWriter(outputStream, StandardCharsets.US_ASCII);
        writer.write("ю");
        writer.flush();
    }
}
