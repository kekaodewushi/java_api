/**
 * Created by zangyaoyi on 2017/5/10.
 */
public class Exc0{
    static int i = 1;

    static {
        i++;
    }

    public Exc0() {
        i++;
    }

    public static void main(String[] args) {
        Exc0 t1 = new Exc0();
        System.out.println(t1.i);
        Exc0 t2 = new Exc0();
        System.out.println(t2.i);

    }

}