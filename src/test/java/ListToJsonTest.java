import org.junit.Before;
import org.junit.Test;
import org.junit.Assert;

import java.util.ArrayList;
import java.util.List;

public class ListToJsonTest {

    private Converter converter = new Converter();
    private List<Employee> testList = new ArrayList<>();

    @Before
    public void initTest() {
        testList.add(new Employee(1, "John", "Smith", "USA", 25));
    }

    @Test
    public void list_to_json_success() {

        String result;
        String expectedResult = "[{\"id\":1,\"firstName\":\"John\",\"lastName\":\"Smith\",\"country\":\"USA\",\"age\":25}]";

        result = converter.listToJson(testList);
        Assert.assertEquals(result, expectedResult);
    }

}
