import org.junit.After;
import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import java.io.*;
import java.util.ArrayList;
import java.util.List;


public class ParseXmlTest {

    private Converter converter = new Converter();
    private List<Employee> testList = new ArrayList<>();

    @Before
    public void initTest() {
        testList.add(new Employee(1, "John", "Smith", "USA", 25));
        testList.add(new Employee(2, "Inav", "Petrov", "RU", 23));
    }

    @Test
    public void parse_xml_success() {
        List<Employee> resultList = converter.parseXML("data.xml");
        Assert.assertEquals(resultList, testList);
    }

}
