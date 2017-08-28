/**
 * Created by zangyaoyi on 2017/4/1.
 */
public class TestBit {
    public static void main(String[] args) {
        System.out.println(5&3);
        System.out.println(4&1);
        System.out.println(false&&Integer.valueOf("aa")==1);

    }

    public static short CRCSum(byte[] data, int start, int backOffset) {

        short result = 0;

        for (int i = start; i < data.length - backOffset; i++) {
            result += (short) (data[i] & 0x0ff);
        }


        return result;
    }

    public static String bytes2HexString(byte[] b) {
        String ret = "";
        for (int i = 0; i < b.length; i++) {
            String hex = toHexString(b[i] & 0xFF);
            if (hex.length() == 1) {
                hex = '0' + hex;
            }
            ret += hex.toUpperCase();
        }
        return ret;
    }

    public static String toHexString(int i) {
        return toUnsignedString(i, 4);
    }

    private static String toUnsignedString(int i, int shift) {
        char[] buf = new char[32];
        int charPos = 32;
        int radix = 1 << shift;
        int mask = radix - 1;
        // System.out.println("mask:" + mask);
        int ii;
        do {
            //这里的mask一直为：1，所以当i为奇数的时候，这里"i & mask"操作才为：1
            //否则返回：0
            ii = i & mask;
     /*       System.out.println("ii:" + ii);*/
            buf[--charPos] = digits[ii];
            i >>>= shift;
            //右移赋值，左边空出的位以0填充
     /*       System.out.println("buf:" + JSON.toJSONString(buf));
            System.out.println("charPos:" + charPos);
            System.out.println("i:" + i);*/
        } while (i != 0);

        return new String(buf, charPos, (32 - charPos));
    }

    final static char[] digits = {
            '0', '1', '2', '3', '4', '5',
            '6', '7', '8', '9', 'a', 'b',
            'c', 'd', 'e', 'f', 'g', 'h',
            'i', 'j', 'k', 'l', 'm', 'n',
            'o', 'p', 'q', 'r', 's', 't',
            'u', 'v', 'w', 'x', 'y', 'z'
    };
}
