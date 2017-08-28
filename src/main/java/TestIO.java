import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;

/**
 * Created by zangyaoyi on 2016/12/21.
 */
public class TestIO {
    public static void main(String[] args) {
        BufferedReader in = new BufferedReader(new InputStreamReader(System.in));
        String s;
        try {
            while ((s = in.readLine()).length() != 0)
                System.out.println(s);
            // An empty line terminates the program
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}

