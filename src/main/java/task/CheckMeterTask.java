package task;

import util.HttpUtils;

import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

/**
 * Created by zangyaoyi on 2017/7/26.
 */
public class CheckMeterTask implements Runnable{

    public static String start(String url, String info) {
        Map<String, String> params = fullParams(info);
        if (null == params) {
            return null;
        }
        String response = null;
        try {
            response = HttpUtils.httpPost(url, params);
        } catch (IOException e) {
            e.printStackTrace();
        }
        return response;
    }

    private static Map<String, String> fullParams(String info) {
        Map<String, String> params = new HashMap<>();
        params.put("org", "9002");
        params.put("outOrderId", "3301231230000001");
        params.put("driverId", "123123");
        params.put("gunId", "1");
        params.put("stubId", "3301231230000001");
        params.put("ext", "t");
        return params;
    }
    @Override
    public void run() {

    }
}
