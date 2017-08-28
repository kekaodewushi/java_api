package task;

import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.ExecutorService;
import java.util.concurrent.Executors;
import java.util.concurrent.Future;

/**
 * Created by zangyaoyi on 2017/7/26.
 */
public class ThreadPoolFactory {
    private static final Logger logger = LoggerFactory.getLogger(ThreadPoolFactory.class);
    public static Map<String, ExecutorService> threadPoolMap = new ConcurrentHashMap();

    public ThreadPoolFactory() {
    }

    public static Future submit(String threadPoolKey, Runnable task) {
        Future future = getSingleThreadExecutor(threadPoolKey).submit(task);
        return future;
    }

    public static Future submitToCached(String threadPoolKey, Runnable task) {
        Future future = getCachedThreadExecutor(threadPoolKey).submit(task);
        return future;
    }

    private static ExecutorService getSingleThreadExecutor(String threadPoolKey) {
        Map var1 = threadPoolMap;
        synchronized(threadPoolMap) {
            ExecutorService executorService = (ExecutorService)threadPoolMap.get(threadPoolKey);
            if(executorService == null) {
                executorService = Executors.newSingleThreadExecutor(new ServerThreadFactory(threadPoolKey));
                threadPoolMap.put(threadPoolKey, executorService);
                logger.info("创建一个【单线程】的【线程池】,key=【{}】", new Object[]{threadPoolKey});
            }

            return executorService;
        }
    }

    private static ExecutorService getCachedThreadExecutor(String threadPoolKey) {
        Map var1 = threadPoolMap;
        synchronized(threadPoolMap) {
            ExecutorService executorService = (ExecutorService)threadPoolMap.get(threadPoolKey);
            if(executorService == null) {
                executorService = Executors.newCachedThreadPool(new ServerThreadFactory(threadPoolKey));
                threadPoolMap.put(threadPoolKey, executorService);
                logger.info("创建一个【多线程】的【线程池】,key=【{}】", new Object[]{threadPoolKey});
            }

            return executorService;
        }
    }
}
