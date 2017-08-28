package com.echongwang.main;

import com.echongwang.tool.SigTool;
import org.apache.http.HttpResponse;
import org.apache.http.NameValuePair;
import org.apache.http.client.HttpClient;
import org.apache.http.client.entity.UrlEncodedFormEntity;
import org.apache.http.client.methods.HttpPost;
import org.apache.http.conn.ClientConnectionManager;
import org.apache.http.conn.scheme.PlainSocketFactory;
import org.apache.http.conn.scheme.Scheme;
import org.apache.http.conn.scheme.SchemeRegistry;
import org.apache.http.conn.ssl.SSLSocketFactory;
import org.apache.http.impl.client.DefaultHttpClient;
import org.apache.http.impl.conn.PoolingClientConnectionManager;
import org.apache.http.message.BasicNameValuePair;

import javax.net.ssl.SSLContext;
import javax.net.ssl.TrustManager;
import javax.net.ssl.X509TrustManager;
import java.io.BufferedReader;
import java.io.IOException;
import java.io.InputStreamReader;
import java.security.cert.X509Certificate;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;

/**
 * Created by zhang on 2016/11/29.
 */
public class DemoMain {

    //本Demo程序运行入口
    public static void main(String[] args) {
        try {
            System.out.println("测试向e充网接口发出请求，具体逻辑请查看源码。\n");
            sendPileState();
//            sendCallback();
//            sendPileChargeRealtimeData();
//            sendBill();
        } catch (IOException e) {
            e.printStackTrace();
        }


    }

        //发送电桩状态到e充网
    public static void sendPileState() throws IOException {
        String url = "http://123.56.160.244:8084/v2/pile-info/notify";  //电桩状态上报url
        String app_id = "qjx6TcPLpgHZv4ZH5mJ2K6qj";  //e充网分配的app_id
        String app_key = "VjaOvn7zkukdmbeG8oplUj3WoJSm4TN1";  //e充网分配的app_key
        //模拟的要发送的info参数内容，json数据
        String info = "{\"pile_code\":\"1110108217001001\",\"inter_no\":0,\"inter_type\":2,\"inter_conn_state\":3,\"inter_work_state\":2,\"inter_order_state\":1,\"voltage\":5,\"current\":9,\"soc\":21,\"fault_code\":22,\"err_code\":0,\"res_time\":0,\"time\":1480417165,\"elect_address\":\"none\",\"elect_type\":2,\"elect_rate\":0,\"active_power\":16,\"reactive_power\":17,\"active_energy\":18,\"reactive_energy\":19,\"parking_state\":2}";
        Map<String, String> params = new HashMap<>();
        params.put("app_id", app_id);
        params.put("info", info);
        String sig = null;
        try {
            sig = SigTool.getSignString(app_id, info, app_key);
        } catch (Exception e) {
            System.err.println("execption when 生成签名时发生异常：");
            e.printStackTrace();
        }
        params.put("sig", sig);

        System.out.println(new String("------------------------------------------------------------\n模拟上报充电桩状态，http参数：".getBytes("UTF-8"),"UTF-8"));
        System.out.println("app_id="+app_id);
        System.out.println("info="+info);
        System.out.println("sig="+sig);

        String response = httpPost(url, params);
        System.out.println("\n请求返回结果：");
        System.out.println(response);
        System.out.println("\n");
    }


    //发送电桩启动/停止回调到e充网
    public static void sendCallback() throws IOException {
        String url = "http://123.56.160.244:8084/v2/pile-opr/notify";  //启停回调url
        String app_id = "qjx6TcPLpgHZv4ZH5mJ2K6qj";  //e充网分配的app_id
        String app_key = "VjaOvn7zkukdmbeG8oplUj3WoJSm4TN1";  //e充网分配的app_key
        //模拟的要发送的info参数内容，json数据
        String info = "{\"pile_code\":\"1110108217001001\",\"inter_no\":1,\"session_id\":1903,\"user_id\":228,\"action\":1,\"result\":1,\"soc\":57,\"time\":1480508124,\"ecode\":0}";
        Map<String, String> params = new HashMap<>();
        params.put("app_id", app_id);
        params.put("info", info);
        String sig = null;
        try {
            sig = SigTool.getSignString(app_id, info, app_key);
        } catch (Exception e) {
            System.err.println("execption when 生成签名时发生异常：");
            e.printStackTrace();
        }
        params.put("sig", sig);

        System.out.println("------------------------------------------------------------\n模拟发送电桩启动/停止回调，http参数：");
        System.out.println("app_id="+app_id);
        System.out.println("info="+info);
        System.out.println("sig="+sig);

        String response = httpPost(url, params);
        System.out.println("\n请求返回结果：");
        System.out.println(response);
        System.out.println("\n");
    }

    //发送充电实时数据到e充网
    public static void sendPileChargeRealtimeData() throws IOException {
        String url = "http://123.56.160.244:8084/v2/realtime-record/notify";  //充电实时数据上报url
        String app_id = "qjx6TcPLpgHZv4ZH5mJ2K6qj";  //e充网分配的app_id
        String app_key = "VjaOvn7zkukdmbeG8oplUj3WoJSm4TN1";  //e充网分配的app_key
        //模拟的要发送的info参数内容，json数据
        String info = "{\"pile_code\":\"1110108217001001\",\"inter_no\":1,\"user_id\":35829,\"session_id\":683121,\"cur_elect\":13.69,\"cur_money\":20.46,\"stop\":1,\"soc\":97,\"cur_time\":51,\"stop_reason\":0,\"time\":1480586288,\"cur_elect_money\":0,\"cur_service_money\":0}";
        Map<String, String> params = new HashMap<>();
        params.put("app_id", app_id);
        params.put("info", info);
        String sig = null;
        try {
            sig = SigTool.getSignString(app_id, info, app_key);
        } catch (Exception e) {
            System.err.println("execption when 生成签名时发生异常：");
            e.printStackTrace();
        }
        params.put("sig", sig);

        System.out.println("------------------------------------------------------------\n模拟上报充电实时数据，http参数：");
        System.out.println("app_id="+app_id);
        System.out.println("info="+info);
        System.out.println("sig="+sig);

        String response = httpPost(url, params);
        System.out.println("\n请求返回结果：");
        System.out.println(response);
        System.out.println("\n");
    }
    //发送订单到e充网
    public static void sendBill() throws IOException {
        String url = "http://123.56.160.244:8084/v2/bill/notify";  //电桩状态上报url
        String app_id = "qjx6TcPLpgHZv4ZH5mJ2K6qj";  //e充网分配的app_id
        String app_key = "VjaOvn7zkukdmbeG8oplUj3WoJSm4TN1";  //e充网分配的app_key
        //模拟的要发送的info参数内容，json数据
        String info = "{\"pile_code\":\"1110108217001001\",\"session_id\":683222,\"user_id\":48521,\"money\":40.6,\"elect_money\":20.3,\"service_money\":20.3,\"elect\":22.51,\"start_elect\":70359.5,\"end_elect\":70382,\"cusp_elect\":0,\"cusp_elect_price\":1.0044,\"cusp_service_price\":0.8,\"cusp_money\":0,\"cusp_elect_money\":0,\"cusp_service_money\":0,\"peak_elect\":22.51,\"peak_elect_price\":1.0044,\"peak_service_price\":0.8,\"peak_money\":0,\"peak_elect_money\":22.6,\"peak_service_money\":18,\"flat_elect\":0,\"flat_elect_price\":0.6950000000000001,\"flat_service_price\":0.8,\"flat_money\":0,\"flat_elect_money\":0,\"flat_service_money\":0,\"valley_elect\":0,\"valley_elect_price\":0.3946,\"valley_service_price\":0.8,\"valley_money\":0,\"valley_elect_money\":0,\"valley_service_money\":0,\"start_time\":1480588539,\"end_time\":1480593339,\"stop_model\":2,\"stop_reason\":0,\"soc\":88,\"time\":1480593334}";
        Map<String, String> params = new HashMap<>();
        params.put("app_id", app_id);
        params.put("info", info);
        String sig = null;
        try {
            sig = SigTool.getSignString(app_id, info, app_key);
        } catch (Exception e) {
            System.err.println("execption when 生成签名时发生异常：");
            e.printStackTrace();
        }
        params.put("sig", sig);

        System.out.println("------------------------------------------------------------\n模拟上报充电完成后的消费单（订单），http参数：");
        System.out.println("app_id="+app_id);
        System.out.println("info="+info);
        System.out.println("sig="+sig);

        String response = httpPost(url, params);
        System.out.println("\n请求返回结果：");
        System.out.println(response);
        System.out.println("\n");
    }


    /**
     * POST方式发起http请求
     * @param url 要请求的url
     * @param params 请求参数
     * @return http返回的response的body内容
     */
    public static String httpPost(String url,Map<String,String> params) throws IOException {
        HttpPost post = new HttpPost(url);
        List<NameValuePair> list = new ArrayList<NameValuePair>();

        // params中参数放入list
        for (Map.Entry<String, String> entry : params.entrySet()) {
            BasicNameValuePair basicNameValuePair = new BasicNameValuePair(entry.getKey(), entry.getValue());
            list.add(basicNameValuePair);
        }
        post.setEntity(new UrlEncodedFormEntity(list, "UTF-8"));
        HttpClient httpClient = getHttpClient();
        HttpResponse response = httpClient.execute(post);
        StringBuffer sb = new StringBuffer();
        BufferedReader rd = new BufferedReader(new InputStreamReader(response.getEntity().getContent()));
        String line ;
        while ((line = rd.readLine()) != null) {
            sb.append(line);
        }
        return sb.toString();
    }




    public static HttpClient getHttpClient() {
        try {
            SchemeRegistry schemeRegistry = new SchemeRegistry();
            schemeRegistry.register(new Scheme("http", 80, PlainSocketFactory.getSocketFactory()));
            schemeRegistry.register(new Scheme("https", 443, SSLSocketFactory.getSocketFactory()));
            ClientConnectionManager ccm = new PoolingClientConnectionManager(schemeRegistry);

            //fixme 此处创建支持https的httpClient对象，但会接受任意的https证书，有安全隐患，生产环境中应避免不对https证书做校验
            SSLContext ctx = SSLContext.getInstance("TLS");
            X509TrustManager tm = new X509TrustManager() {
                public void checkClientTrusted(X509Certificate[] xcs, String string) {}
                public void checkServerTrusted(X509Certificate[] xcs, String string) {}
                public X509Certificate[] getAcceptedIssuers() {
                    return null;
                }
            };
            ctx.init(null, new TrustManager[]{tm}, null);
            SSLSocketFactory ssf = new SSLSocketFactory(ctx);
            ssf.setHostnameVerifier(SSLSocketFactory.ALLOW_ALL_HOSTNAME_VERIFIER);
            SchemeRegistry sr = ccm.getSchemeRegistry();
            sr.register(new Scheme("https", ssf, 443));
            return new DefaultHttpClient(ccm);
        } catch (Exception ex) {
            ex.printStackTrace();
            return null;
        }
    }

}
