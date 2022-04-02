import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import java.io.*;


public class WriteStringTest {

    private Converter converter = new Converter();
    private String writeString;
    private String fileString;

    @Before
    public void initTest() {
        writeString = "[{\"id\":1,\"firstName\":\"John\",\"lastName\":\"Smith\",\"country\":\"USA\",\"age\":25}]";
    }

    @Test
    public void write_sring_to_file_success() {
        converter.writeString(writeString, "target/writeFile.csv");
        File writeFile = new File("target/writeFile.csv");
        try (BufferedReader reader = new BufferedReader(new FileReader (writeFile))) {
            fileString = reader.readLine();
        } catch (IOException e) {
            e.printStackTrace();
        }
        Assert.assertTrue(writeFile.exists());
        Assert.assertEquals(writeString,fileString);
    }

    @After
    public void afterTest() {
        File writeFile = new File("target/writeFile.csv");
        writeFile.delete();
    }

}
