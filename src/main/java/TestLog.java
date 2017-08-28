import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * Created by zangyaoyi on 2016/12/27.
 */
public class TestLog {

    public static final Logger logger = LoggerFactory.getLogger(TestLog.class);

    public static void main(String arg[]) {
        logger.debug("debug log 1111111111111111");
        System.out.println(666);
        logger.error("error log 222222222222222");
        System.out.println(555);
    }
}
