import field.Role;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.lang.reflect.Field;

/**
 * Created by zangyaoyi on 2017/7/18.
 */
public class ObjectUtils {

    private static final Logger LOG = LoggerFactory.getLogger(ObjectUtils.class);

    /**
     * 反射取得bean中对应属性的值
     * @param bean
     * @param fieldName
     * @return
     */
    public static Object getProperty(Object bean, String fieldName) {
        Object obj = getProperty(bean.getClass(),bean,fieldName);
        return obj;
    }

    private static Object getProperty(Class _class,Object bean,String fieldName){
        Object obj = null;
        Field[] fields = _class.getDeclaredFields();
        Field.setAccessible(fields, true);
        for (int i = 0; i < fields.length; i++) {
            Field field = fields[i];
            if (fieldName.equals(field.getName())) {
                try {
                    obj = field.get(bean);
                } catch (IllegalArgumentException e) {
                    LOG.error(e.getMessage());
                } catch (IllegalAccessException e) {
                    LOG.error(e.getMessage());
                }
                break;
            }
        }
        if(obj == null && _class.getGenericSuperclass()!=null){
            obj = getProperty(_class.getSuperclass(), bean, fieldName);
        }
        return obj;
    }

    public static void main(String[] args) {
        System.out.println(getProperty(new Role(),""));
    }
}