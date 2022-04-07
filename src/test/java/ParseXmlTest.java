import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ParseXmlTest {

    private Converter converter = new Converter();
    private List<Employee> testList = new ArrayList<>();

    @Test
    public void parse_xml_success() {

        testList.add(new Employee(1, "John", "Smith", "USA", 25));
        testList.add(new Employee(2, "Inav", "Petrov", "RU", 23));

        List<Employee> resultList = converter.parseXML("data.xml");
        assertEquals(resultList, testList);
    }

}
