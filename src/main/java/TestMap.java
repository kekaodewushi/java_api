import java.util.*;

/**
 * Created by zangyaoyi on 2016/12/26.
 */
public class TestMap {

    public static void main(String args[]) {
        System.out.println("*************************LinkedHashMap*************");
        Map<Integer, String> map = new LinkedHashMap<Integer, String>();
        map.put(null,"six");
        map.put(6, "oracle");
        map.put(1, "apple");
        map.put(2, "banana");
        map.put(3, "pear");
        map.put(4, "sqlServer");
        map.put(5, "mysql");

        for (Iterator it = map.keySet().iterator(); it.hasNext(); ) {
            Object key = it.next();
            System.out.println(key + "=" + map.get(key));
        }

        System.out.println("*************************HashMap*************");
        Map<Integer, String> map1 = new HashMap<>();
        map1.put(6, "oracle");
        map1.put(1, "apple");
        map1.put(2, "banana");
        map1.put(3, "pear");
        map1.put(4, "sqlServer");
        map1.put(5, "mysql");
        map1.put(null,"six");

        for (Iterator it = map1.keySet().iterator(); it.hasNext(); ) {
            Object key = it.next();
            System.out.println(key + "=" + map1.get(key));
        }

        Map<String, String> map2 = new HashMap<>();
        map2.put("","six");
        map2.put(null,"five");
        System.out.println(map2.get(""));
        System.out.println(map2.get(null));
        System.out.println("test:"+map2.get(3));
        System.out.println(null==null);

        Set a=new HashSet();
        a.add(null);
        a.add("");
        System.out.println(a);
    }
}