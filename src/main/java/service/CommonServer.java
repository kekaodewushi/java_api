package service;

/**
 * Created by zangyaoyi on 2017/1/9.
 */
public class CommonServer {
    private static Object lock = new Object();
    private static CommonServer commonServer;
    private IEventCallBack evt;
    private int orgNo;
    private String gateId;

    private CommonServer() {
    }

    public static CommonServer getInstance() {
        Object var0 = lock;
        synchronized(lock) {
            if(commonServer == null) {
                commonServer = new CommonServer();
            }
        }

        return commonServer;
    }

    public void init(int orgNo, String gateId, IEventCallBack evt) {
        this.orgNo = orgNo;
        this.gateId = gateId;
        this.evt = evt;
    }
}
