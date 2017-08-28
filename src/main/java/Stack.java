import com.alibaba.fastjson.JSON;

import java.util.Arrays;
import java.util.EmptyStackException;

/**
 * Created by zangyaoyi on 2017/2/23.
 */
public class Stack<C> {
    private Object[] elements;
    private int size = 0;
    public static final int DEFAULT_INITIAL_CAPACITY = 16;

    public Stack() {
        elements = new Object[DEFAULT_INITIAL_CAPACITY];
    }

    public void push(Object e) {
        ensureCapacity();
        elements[size++] = e;  //size++ 先引用size的值在size+1;
    }

    public Object pop() {
        if (size == 0) {
            throw new EmptyStackException();
        }
        //防止内存泄漏
        Object result = elements[--size];
        elements[size] = null;
        return result;
    }

    private void ensureCapacity() {
        if (elements.length == size) {
            elements = Arrays.copyOf(elements, 2 * size + 1);
        }
    }

    public void main(String[] args) {
        Stack<C> stack = new Stack<C>();
        stack.push("123");
        System.out.println(JSON.toJSONString(stack.elements));
    }
}
