import java.util.ArrayList;

public class TestSort {
    public static void main(String[] args) {
        ArrayList list = new ArrayList();
        list.add("asd");
        list.add("fsdf");
        list.add("5123");
        list.add("12");
   /*
   * 运用Collections的sort（）方法对其进行排序 sort（）方法需要传 连个参数，一个是需要进行排序的Collection 另一个是一个Comparator
   */
      //  Collections.sort(list, new SpellComparator());

        for (int i = 0; i < list.size(); i++) {
            System.out.println(list.get(i));
        }
    }
}
