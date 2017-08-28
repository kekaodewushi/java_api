package service;

import service.impl.IEventCallBackImpl;

/**
 * Created by zangyaoyi on 2017/1/9.
 */
public class Test {
    public static void main(String[] args) {
        CommonServer commonServer=CommonServer.getInstance();
        IEventCallBackImpl iEventCallBack=new IEventCallBackImpl();
        commonServer.init(123,"1",iEventCallBack);
    }
}
