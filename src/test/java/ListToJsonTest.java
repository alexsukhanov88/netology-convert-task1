import org.junit.jupiter.api.*;

import java.util.ArrayList;
import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class ListToJsonTest {

    private Converter converter = new Converter();
    private List<Employee> testList = new ArrayList<>();

    @Test
    public void list_to_json_success() {

        testList.add(new Employee(1, "John", "Smith", "USA", 25));

        String result;
        String expectedResult = "[{\"id\":1,\"firstName\":\"John\",\"lastName\":\"Smith\",\"country\":\"USA\",\"age\":25}]";

        result = converter.listToJson(testList);

        assertEquals(result, expectedResult);
    }

}
