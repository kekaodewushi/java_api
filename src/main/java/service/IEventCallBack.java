package service;

/**
 * Created by zangyaoyi on 2017/1/9.
 */
public interface IEventCallBack {
    void phoneConnect(String var1, int var2, int var3, int var4, int var5, int var6);

    void chargeEvent(String var1, int var2, int var3, int var4);

    void startChangeBack(String var1, int var2, int var3, int var4, int var5);

    void stopChangeBack(String var1, int var2, int var3, int var4, int var5);

    void chargeReal(String var1, int var2, int var3, Object var4);

    void consumeRecord(String var1, int var2, int var3, Object var4);
}
