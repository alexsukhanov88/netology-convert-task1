import org.junit.jupiter.api.*;

import java.io.*;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class WriteStringTest {

    private Converter converter = new Converter();
    private String writeString;
    private String fileString;

    @Test
    public void write_sring_to_file_success() {

        writeString = "[{\"id\":1,\"firstName\":\"John\",\"lastName\":\"Smith\",\"country\":\"USA\",\"age\":25}]";

        converter.writeString(writeString, "target/writeFile.csv");
        File writeFile = new File("target/writeFile.csv");
        try (BufferedReader reader = new BufferedReader(new FileReader (writeFile))) {
            fileString = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        assertTrue(writeFile.exists());
        assertEquals(writeString,fileString);

        writeFile.delete();
    }
}
