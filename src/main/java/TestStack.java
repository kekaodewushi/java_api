import java.util.Stack;

/**
 * Created by zangyaoyi on 2016/12/28.
 */
public class TestStack {
    public static final Long SIZE = 10000000L;

    public static void main(String[] args) {
        long begin=System.currentTimeMillis();
        Stack<Long> stack1 = new Stack<Long>();
        fullStack(stack1,begin,"二：");

        begin=System.currentTimeMillis();
        Stack<Long> stack = new Stack<>();
        fullStack(stack,begin,"一：");

    }

    private static void fullStack(Stack<Long> stack,long beginTime,String s){
        long i = 0L;

        while (stack.size() < SIZE) {
            stack.add(i);
            i++;
        }
        System.out.println(s+(System.currentTimeMillis()-beginTime));
    }
}
