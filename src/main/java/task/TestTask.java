package task;

import java.util.concurrent.TimeUnit;

/**
 * Created by zangyaoyi on 2017/7/26.
 */
public class TestTask {
    public static void startCheckTimeoutServer() {

        CheckMeterTask checkTask = new CheckMeterTask();

        TaskPoolFactory.scheduleAtFixedRate("CHECK_METER_TASK", checkTask, 0, 10 * 60, TimeUnit.SECONDS);
    }

}
