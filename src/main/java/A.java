/**
 * Created by zangyaoyi on 2017/1/5.
 */
/*
作者：木女孩
        链接：https://www.zhihu.com/question/54420047/answer/139244179
        来源：知乎
        著作权归作者所有，转载请联系作者获得授权。
*/

public class A {
    public static void main(String[] args) {
       /* pikaqiu(1);
        System.out.println();*/
        if (System.out.printf("a") == null) {
            System.out.println("a");
        } else {
            System.out.println("b");
        }
    }

    static void pikaqiu(int number) {
        String s = number + "";
        int length = s.length();
        if (length > 3 || s.charAt(0) == '-') {
            throw new IllegalArgumentException("别逗比，人家说的是不多于3位的正整数，谢谢");
        }
        System.out.println("位数：" + length);
        System.out.print("分别打印各位数字：");
        for (int i = 0; i < length; i++) {
            System.out.print(s.charAt(i));
        }
        System.out.println();
        System.out.print("逆序打印各位数字：");
        for (int i = length - 1; i >= 0; i--) {
            System.out.print(s.charAt(i));
        }
    }

}