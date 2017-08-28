import java.nio.ByteBuffer;

/**
 * Created by zangyaoyi on 24917/4/5.
 */
public class TestByteBuffer {
    public static void main(String[] args) {
        byte[] msg = {1,0,1,1,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49,49};
        ByteBuffer byteBuffer = ByteBuffer.wrap(msg);

        short a1=byteBuffer.getShort();
        short a2=byteBuffer.getShort();
        byte[] bEpCode = new byte[16];
        byteBuffer.get(bEpCode);
        String epCode = getByteString(bEpCode);
        byteBuffer.get(bEpCode);
        System.out.println("aaa:"+a1);
        System.out.println("aaa:"+a2);
        System.out.println("aaa:"+epCode);
        System.out.println("长度:"+epCode.length());
    }

    public static String getByteString(byte[] src) {
        if (src == null || src.length <= 0)
            return "";
        String s = new String(src);
        return s;

    }

}
