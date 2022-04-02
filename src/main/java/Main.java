import java.util.List;

public class Main {

    public static void main(String[] args) {

        Converter converter = new Converter();

        String[] columnMapping = {"id", "firstName", "lastName", "country", "age"};
        String fileName = "data.csv";
        List<Employee> list = converter.parseCSV(columnMapping, fileName);
        String json = converter.listToJson(list);
        converter.writeString(json, "data.json");

        List<Employee> listXml = converter.parseXML("data.xml");
        String jsonXml = converter.listToJson(listXml);
        converter.writeString(jsonXml, "dataXml.json");
    }
}
