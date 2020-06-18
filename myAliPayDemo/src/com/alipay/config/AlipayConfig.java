package com.alipay.config;

import java.io.FileWriter;
import java.io.IOException;

/* *
 *类名：AlipayConfig
 *功能：基础配置类
 *详细：设置帐户有关信息及返回路径
 *修改日期：2017-04-05
 *说明：
 *以下代码只是为了方便商户测试而提供的样例代码，商户可以根据自己网站的需要，按照技术文档编写,并非一定要使用该代码。
 *该代码仅供学习和研究支付宝接口使用，只是提供一个参考。
 */

public class AlipayConfig {
	
//↓↓↓↓↓↓↓↓↓↓请在这里配置您的基本信息↓↓↓↓↓↓↓↓↓↓↓↓↓↓↓

	// 应用ID,您的APPID，收款账号既是您的APPID对应支付宝账号
	public static String app_id = "2016102800773842";
	
	// 商户私钥，您的PKCS8格式RSA2私钥
    public static String merchant_private_key = "MIIEvgIBADANBgkqhkiG9w0BAQEFAASCBKgwggSkAgEAAoIBAQCmqc6ofYZ/g7wAvej8PAuqU0Md2YgMUdhftOttYEROIvk8VYUhnVS7w0wFUwWAGYYarH0sAmhE52AiKo8juGVkPHvS0qoxJWb/srgd6OTNdNr5cVFpZqupg5vslsoeNVqjlK8VdCs1os0l0Bo+4n4TWVrcrhjUYfS/PPZEuwYOQ5LmPek3DBNKHzBZecUzJRbZjuH2+liZUZQp4vkMOWfFf4p8e/N34duyvbPWaq8RX563GOJgpQr71ot84NiwoxeU8frpR3S4XYmGPM/SOjOLGla7fWA/1TDGCPf918BDW1h7biti1cz8NHVAeR0AoZilVB1skMwom4G0cIozYQa7AgMBAAECggEAeFGk2Szt+YbQJjT0S4zJ2ygLDzSpLEO2EroZMLhL96D2D+GpoC/mKTt/2WQrV2SV1RHrt+bxAbWMSH4zIlWQFUI5HmVp6tsWtch/dVBaRh1zrJtra81sZo+V9MKTniVkjy3bDID2ZN1of0Dyga2f2TYsC59AW6twNtO68rmWUJq75PBC5GKTGChO/9ZwMsLXtvvRBr3fZNOBDW4P5zMhss7QeM+nyBCYVdrcJwCJUCBVyvmLAuulJUkDTtXS+1ur7T23KEyXBpe+9+JFvPd82B/mNJsN/OBNXYbkjWDNLTnxom9HvG12avHMJrhqK0nbNIDZo0LfGbRtb8p06QMOGQKBgQDQOx9Qnn2advsjdrNG6WFxYfnMJaL441AvNsmiNQwFxJ7LSN1fDkeYkVagB3thriQywkZMqoPT6O07IvQQ3zpHEbqPCczVsOSaVdF8T6U5RzXfPtEMxj3CFLE5D5s3vO5FEY9Q6mE14jRxjVnH/jOiXUbECuaUyEB1YSEJNlH31QKBgQDM5YXHzSsbHJF6HMQD1ffQgV98bLZWcELX/m2zxOkKNWGdIcuxCt0AgVLlKEo9TwIv3NLxJqo3MXs9QIap+gIjWhzeWUFYrWO/hE0aierwieooN2cq8Xc3IACl7QtO+HUfVjw7TEUcjPu3wFJVqnHdrp+4fdNCr+x04GyVPnFcTwKBgCR01Wy18uOiRSHWXFjj7018i9F0HW5ZzeYWP4MIqowv+mU44pkL1PkfKP1nkfBuHqRMYyZ1DBODylT6L6TskDV1IyZ73sLi74Md10leYF0A3KuzQcJsys859DU7SD+f8k9hXagbAN4ANpJS3w8msD+S+RrFlc0iqjZixPfp7LvpAoGBAJPvrBXEZrkeeVLnbgcu98wNfLnDbCsgxsJYqzA+nduHC0F+YykipMp2lTlrS57UasnP8GW4+vD6wvZInnIfVmfb6jgHzYyPNBPVHC5rIbwmd3AuAEkbKm4cpxsl+SI9daL4imht+wBQMnZLX6cGd0wNhriX8G6Xwmvolb1z5jk1AoGBAJGTQcqHamAq3WSw6P9jBQ0Z5JMumxQoWT7YEKs5fI2QC9gXZsForxS/3JyJCetYD2nq2kz+Ysj4kxlZKXNuYwAYOlUMVX+54NOWmGzg3BG7ECKpb30HlbNQvNzHVFbtIdi13GPpG0PJszFDshLZ1d9XmV4qC7ppQscH2PSGgusJ";
	
	// 支付宝公钥,查看地址：https://openhome.alipay.com/platform/keyManage.htm 对应APPID下的支付宝公钥。
    public static String alipay_public_key = "MIIBIjANBgkqhkiG9w0BAQEFAAOCAQ8AMIIBCgKCAQEAjglXrOU9ACmTNWieTFvjuNrLfqtuH/VuvVIRF7/lSVz69kEBi7IZ28VxV51TxgKbgFd6fi0UT7qSCJbNZyrtttR0tXuCczZOK6gfwRLCuzZcEejZvvuShl560kE0p+y1mBXervJ5Gr/LgTb6/MGr9lXFvkfCShxuoAzcM63NEYnSJBx7KoL1ThoH/ZlfRvNwgXlphA5uZw6DPYMJ+VUGFFgtwOQHxH/gU9tvyNYznbvc6Wh/Nh5UN67/NTHU/p0TIUIfZA9aiJG/zE1yFUYfStwdSVagot/Iig6zEtiVn+dTbMUqfYs+4BwXcaDloy03TGU9Er8lZhacOADMmlI4rQIDAQAB";

	// 服务器异步通知页面路径  需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String notify_url = "http://工程公网访问地址/alipay.trade.page.pay-JAVA-UTF-8/notify_url.jsp";

	// 页面跳转同步通知页面路径 需http://格式的完整路径，不能加?id=123这类自定义参数，必须外网可以正常访问
	public static String return_url = "http://工程公网访问地址/alipay.trade.page.pay-JAVA-UTF-8/return_url.jsp";

	// 签名方式
	public static String sign_type = "RSA2";
	
	// 字符编码格式
	public static String charset = "utf-8";
	
	// 支付宝网关
	public static String gatewayUrl = "https://openapi.alipaydev.com/gateway.do";
	
	// 支付宝网关
	public static String log_path = "D:\\JavaSoft\\Workspase\\myAliPayDemo";


//↑↑↑↑↑↑↑↑↑↑请在这里配置您的基本信息↑↑↑↑↑↑↑↑↑↑↑↑↑↑↑

    /** 
     * 写日志，方便测试（看网站需求，也可以改成把记录存入数据库）
     * @param sWord 要写入日志里的文本内容
     */
    public static void logResult(String sWord) {
        FileWriter writer = null;
        try {
            writer = new FileWriter(log_path + "alipay_log_" + System.currentTimeMillis()+".txt");
            writer.write(sWord);
        } catch (Exception e) {
            e.printStackTrace();
        } finally {
            if (writer != null) {
                try {
                    writer.close();
                } catch (IOException e) {
                    e.printStackTrace();
                }
            }
        }
    }
}

