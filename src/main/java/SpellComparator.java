import java.util.Comparator;

/**
 * ����ƴ������Ƚ���
 */
class SpellComparator implements Comparator {
    public int compare(Object o1, Object o2) {
        try {
            // ȡ�ñȽ϶���ĺ��ֱ��룬������ת�����ַ���
            String s1 = new String(o1.toString().getBytes("UTF-8"), "ISO-8859-1");
            String s2 = new String(o2.toString().getBytes("UTF-8"), "ISO-8859-1");
            // ����String��� compareTo������������������бȽ�
            return s1.compareTo(s2);
        } catch (Exception e) {
            e.printStackTrace();
        }
        return 0;
    }
}