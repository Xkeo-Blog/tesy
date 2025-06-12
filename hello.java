import java.io.FileReader;
import java.io.BufferedReader;
import java.io.IOException;

public class ProblematicCodeExample {
    public static void main(String[] args) {
        String filePath = null;  // 传入 null，导致空指针异常

        // 空指针异常：filePath 为 null 时无法打开文件
        try {
            FileReader fileReader = new FileReader(filePath);
            BufferedReader reader = new BufferedReader(fileReader);
            String line = reader.readLine();
            System.out.println(line);
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
