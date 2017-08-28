import java.io.File;
import java.io.FileWriter;
import java.io.IOException;
import java.io.PrintWriter;

/**
 * @author Xing, Xiudong
 */
public class CoderUtils {

    public static char ascii2Char(int ascii) {
        return (char) ascii;
    }

    public static int char2ASCII(char c) {
        return (int) c;
    }

    public static String ascii2String(int[] asciis) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < asciis.length; i++) {
            sb.append((char) ascii2Char(asciis[i]));
        }
        return sb.toString();
    }

    public static String ascii2String(String asciis, String delimiter) {
        String[] asciiss = asciis.split(delimiter);
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < asciiss.length; i++) {
            sb.append((char) ascii2Char(Integer.parseInt(asciiss[i])));
        }
        return sb.toString();
    }

    public static int[] string2ASCII(String s) {// 字符串转换为ASCII码  
        if (s == null || "".equals(s)) {
            return null;
        }

        char[] chars = s.toCharArray();
        int[] asciiArray = new int[chars.length];

        for (int i = 0; i < chars.length; i++) {
            asciiArray[i] = char2ASCII(chars[i]);
        }
        return asciiArray;
    }

    public static String getIntArrayString(int[] intArray) {
        return getIntArrayString(intArray, ",");
    }

    public static String getIntArrayString(int[] intArray, String delimiter) {
        StringBuffer sb = new StringBuffer();
        for (int i = 0; i < intArray.length; i++) {
            sb.append(intArray[i]).append(delimiter);
        }
        return sb.toString();
    }

    public static String getASCII(int begin, int end) {
        StringBuffer sb = new StringBuffer();
        for (int i = begin; i < end; i++) {
            sb.append(i).append(":").append((char) i).append("/t");
            // sb.append((char) i).append("/t");  
            if (i % 10 == 0) {
                sb.append("/n");
            }
        }
        return sb.toString();
    }

    public static String getCHASCII(int begin, int end) {
        return getASCII(19968, 40869);
    }

    public static void showASCII(int begin, int end) {
        for (int i = begin; i < end; i++) {
            // System.out.print(i + ":" + (char) i + "/t");
            System.out.print((char) i + "/t");
            if (i % 10 == 0) {
                System.out.println();
            }
        }
    }

    public static void showCHASCII() {
        showASCII(19968, 40869);
    }

    public static void showIntArray(int[] intArray) {
        showIntArray(intArray, ",");
    }

    public static String showIntArray(int[] intArray, String delimiter) {
        StringBuffer stringBuffer = new StringBuffer();
        for (int i = 0; i < intArray.length; i++) {
            stringBuffer.append(intArray[i] + delimiter);
        }
        return stringBuffer.toString();
    }

    public static void createFile(String filePathAndName, String fileContent)
            throws IOException {

        String filePath = filePathAndName;
        filePath = filePath.toString();
        File myFilePath = new File(filePath);
        if (!myFilePath.exists()) {
            myFilePath.createNewFile();
        }
        FileWriter resultFile = new FileWriter(myFilePath);
        PrintWriter myFile = new PrintWriter(resultFile);
        String strContent = fileContent;
        myFile.println(strContent);
        myFile.close();
        resultFile.close();
    }

    public static void main(String[] args) throws IOException {

        String s = "你好asedfwefc235 b35423 ";
      /*  String ascii=showIntArray(string2ASCII(s), " ");
        System.out.println(s);
        System.out.println(ascii);
        System.out.println(ascii2String(ascii," "));*/
        int a = (int) '你';
        System.out.println(a);
    }

}  