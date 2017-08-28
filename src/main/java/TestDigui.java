/**
 * Created by zangyaoyi on 2016/12/26.
 */
public class TestDigui {
    public static void main(String[] args) {
        System.out.println(f2(2));
    }

    /**
     * 计算5的阶乘(result = 5*4*3*2*1)
     */

    public static int f(int n) {
        if (1 == n)
            return 1;
        else
            return n * f(n - 1);

    }

    /**
     *
     *
     * @Author zangyaoyi
     * @version V1.0.0
     * @since 2016/12/27 14:02
     * @param n
     * @return
     */
    public static int f2(int n) {
        if (1 == n || 2 == n)
            return 1;
        else
            return f2(n - 1) + f2(n - 2);
    }
    //def result='';
    // def params=\"${_1}".replaceAll('[\\\\[|\\\\]|\\\\s]', '').split(',').toList();
    // for(i = 0; i < params.size(); i++) {
    // result+=' * @param ' + params[i] + ((i < params.size() - 1) ? '\\n' : '')
    // };
    // return result
}
