import java.util.HashMap;
import java.util.Map;

/**
 * Created by zangyaoyi on 2016/12/9.
 */
public class TestClear {
    private static final Integer MAP_SIZE=10000000;
    public static void main(String[] args) {
        Map<Integer, String> map = getMapBySize(MAP_SIZE);

        Long begin = System.currentTimeMillis();
        map.clear();
        Long clearEnd = System.currentTimeMillis();
        System.out.println("clear:" + (clearEnd-begin));

        map=getMapBySize(MAP_SIZE);
        begin = System.currentTimeMillis();
        map=new HashMap<>();
        Long end = System.currentTimeMillis();
        System.out.println("new:" + (end - begin));
        map=null;
        System.gc();
    }

    private static Map<Integer, String> getMapBySize(int size) {
        Map<Integer, String> map = new HashMap<>();
        int i = 0;
        while (map.size() < size) {
            map.put(i++, "厉害了");
            map.put(i++, "真厉害");
            map.put(i++, "太厉害");
        }
        return map;
    }

    private static Person getPerson(String name, Integer age) {
        Person person = new Person();
        person.setName(name);
        person.setAge(age);
        return person;
    }
}
