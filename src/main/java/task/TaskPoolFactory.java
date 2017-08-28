package task;

/**
 * Created by zangyaoyi on 2017/7/26.
 */
//
// Source code recreated from a .class file by IntelliJ IDEA
// (powered by Fernflower decompiler)
//

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.Executors;
import java.util.concurrent.ScheduledExecutorService;
import java.util.concurrent.TimeUnit;

public class TaskPoolFactory {
    public static Map<String, ScheduledExecutorService> taskPoolMap = new ConcurrentHashMap();

    public TaskPoolFactory() {
    }

    public static ScheduledExecutorService scheduleAtFixedRate(String taskPoolKey, Runnable task, long initialDelay, long period, TimeUnit unit) {
        ScheduledExecutorService schedule = getSingleThreadScheduledExecutor(taskPoolKey);
        schedule.scheduleAtFixedRate(task, initialDelay, period, unit);
        return schedule;
    }

    public static ScheduledExecutorService scheduleAtFixedRate(String taskPoolKey, Runnable task, long initialDelay, TimeUnit unit) {
        ScheduledExecutorService schedule = getSingleThreadScheduledExecutor(taskPoolKey);
        schedule.schedule(task, initialDelay, unit);
        return schedule;
    }

    private static ScheduledExecutorService getSingleThreadScheduledExecutor(String taskPoolKey) {
        Map var1 = taskPoolMap;
        synchronized (taskPoolMap) {
            ScheduledExecutorService schedule = (ScheduledExecutorService) taskPoolMap.get(taskPoolKey);
            if (schedule == null) {
                schedule = Executors.newSingleThreadScheduledExecutor(new ServerThreadFactory(taskPoolKey));
                taskPoolMap.put(taskPoolKey, schedule);
            }

            return schedule;
        }
    }

    public static void scheduleByThreadPool(String threadPoolKey, Runnable task, long initialDelay, long period, TimeUnit unit) {
        TaskPoolFactory.TimeTask timeTask = new TaskPoolFactory.TimeTask(threadPoolKey, task);
        scheduleAtFixedRate("PUBLIC_TIME_TASK", timeTask, initialDelay, period, unit);
    }

    private static class TimeTask implements Runnable {
        private String threadPoolKey;
        private Runnable task;

        public TimeTask(String threadPoolKey, Runnable task) {
            this.threadPoolKey = threadPoolKey;
            this.task = task;
        }

        public void run() {
            ThreadPoolFactory.submit(this.threadPoolKey, this.task);
        }
    }
}
