package io.planx.api.core.common;

import javax.crypto.Mac;
import javax.crypto.spec.SecretKeySpec;
import java.nio.charset.StandardCharsets;
import java.util.*;

/**
 * @Author Todd
 * @Version 1.0
 **/
public class ParamsSign {
    public static String sign(String secretKey,Map params) {
        // Combine
        Set keySet = params.keySet();
        String finalStrForSign = "";
        for (Object next : keySet) {
            if (params.get(next) instanceof List) {
                List list = (List) params.get(next);
                String[] strings = (String[]) list.toArray(new String[]{});
                // 使用 String.join 方法将数组元素连接成一个字符串，元素之间用空格分隔
                String result = "[" + String.join(" ", strings) + "]";
                finalStrForSign = finalStrForSign + next + "=" + result + "&";
            }else{
                finalStrForSign = finalStrForSign + next + "=" + params.get(next) + "&";
            }
        }
        finalStrForSign = finalStrForSign.substring(0, finalStrForSign.length() - 1);
        try {
            // Sign
            SecretKeySpec secretKeySpec = new SecretKeySpec(secretKey.getBytes(StandardCharsets.UTF_8), "HmacSHA1");
            Mac hmac = Mac.getInstance("HmacSHA1");
            hmac.init(secretKeySpec);
            byte[] hash = hmac.doFinal(finalStrForSign.getBytes(StandardCharsets.UTF_8));
            return Base64.getEncoder().encodeToString(hash).replaceAll("\\r","").replaceAll("\\n","");
        } catch (Exception e) {
            throw new RuntimeException("Error generating HMAC: " + e.getMessage(), e);
        }
    }

}
