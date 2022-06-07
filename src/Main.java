import javax.xml.crypto.Data;
import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.nio.charset.StandardCharsets;

public class Main {
    public static final String fileName = "table.csv";
    public static void main(String[] args) {

       try (FileOutputStream fileOutputStream = new FileOutputStream(fileName)) {
           byte[] csvData = newData().toString().getBytes(StandardCharsets.UTF_8);
           fileOutputStream.write(csvData);
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }

       try (FileInputStream fileInputStream = new FileInputStream(fileName)) {
           byte[] csvDate = new byte[fileInputStream.available()];
           fileInputStream.read(csvDate);
           String table = new String(csvDate);
           System.out.println(table);
       } catch (Exception e) {
           System.out.println(e.getMessage());
       }

    }

    public static AppData newData() {
        AppData appData = new AppData();
        String[] headers = new String[] {"Value 1", "Value 2", "Value 3"};
        appData.init(headers);
        return appData;
    }
}


