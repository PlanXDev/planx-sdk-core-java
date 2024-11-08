package io.planx.api.core.util;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.regex.Matcher;
import java.util.regex.Pattern;

/**
 * @Author Todd
 * @Version 1.0
 **/
public class JsonUtil {
    public static Map<String, Object> jsonToMap(String jsonString) {
        Map<String, Object> map = new HashMap<>();

        Pattern keyPattern = Pattern.compile("\"([^\"]+)\":");
        Pattern valuePattern = Pattern.compile(":\"([^\"]+)\"|:\\[(.*?)\\]");
        Matcher keyMatcher = keyPattern.matcher(jsonString);
        Matcher valueMatcher = valuePattern.matcher(jsonString);

        while (keyMatcher.find() && valueMatcher.find()) {
            String key = keyMatcher.group(1);
            String valueStr = valueMatcher.group(1) != null ? valueMatcher.group(1) : valueMatcher.group().substring(1);

            if (valueStr.startsWith("[") && valueStr.endsWith("]")) {
                map.put(key, parseArray(valueStr));
            } else {
                map.put(key, valueStr);
            }
        }

        return map;
    }

    private static List<String> parseArray(String arrayStr) {
        List<String> list = new ArrayList<>();
        String[] values = arrayStr.substring(1, arrayStr.length() - 1).split(",");
        for (String value : values) {
            list.add(value.trim().replaceAll("^\"|\"$", ""));
        }
        return list;
    }
}
