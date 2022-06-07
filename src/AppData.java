import java.util.Random;

public class AppData {
    private String[] headers;
    private int[][] table;

    public void init(String[] headers) {
        this.headers = headers;
        Random random = new Random();
        table = new int[headers.length][headers.length];

        for (int i = 0; i < headers.length; i++) {
            for (int j = 0; j < headers.length; j++) {
                table[i][j] = random.nextInt(10);
            }
        }
    }

    public String toString() {
        String result = "";

        for (String word : headers) {
            result += word + ";";
        }
        result += "\n";

        for (int i = 0; i < headers.length; i++) {
            for (int j = 0; j < headers.length; j++) {
                result += table[i][j] + ";";
            }
            result += "\n";
        }
        return result;
    }
}
