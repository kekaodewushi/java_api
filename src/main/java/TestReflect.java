import java.lang.reflect.Field;

/**
 * Created by zangyaoyi on 2017/1/18.
 */
public class TestReflect {
    public static void main(String args[]) {
        Girl t = new Girl();
        Class temp = t.getClass();
        Field f;
        try {
            f = temp.getDeclaredField("age");
            f.setAccessible(true);
            System.out.println(f.get(t));
        } catch (Exception e) {
            e.printStackTrace();
        }
    }
}

class Girl {
    private int age = 666;

    public int getAge() {
        return 1111;
    }
}


