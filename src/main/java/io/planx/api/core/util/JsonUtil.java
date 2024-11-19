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
        parseObject(jsonString, map);
        return map;
    }

    private static void parseObject(String jsonString, Map<String, Object> map) {
        int start = jsonString.indexOf('{') + 1;
        int end = jsonString.lastIndexOf('}');
        String content = jsonString.substring(start, end).trim();

        Pattern keyPattern = Pattern.compile("\"([^\"]+)\":");
        Pattern valuePattern = Pattern.compile(":\"([^\"]+)\"|:(true|false|null)|:([-]?[0-9]+(\\.[0-9]+)?)|:\\[(.*?)\\]|:\\{.*?\\}");

        Matcher keyMatcher = keyPattern.matcher(content);
        Matcher valueMatcher = valuePattern.matcher(content);

        while (keyMatcher.find() && valueMatcher.find()) {
            String key = keyMatcher.group(1);
            String valueStr = valueMatcher.group(1) != null ? valueMatcher.group(1) : valueMatcher.group().substring(1);

            if (valueStr.startsWith("[") && valueStr.endsWith("]")) {
                map.put(key, parseArray(valueStr));
            } else if (valueStr.startsWith("{") && valueStr.endsWith("}")) {
                Map<String, Object> nestedMap = new HashMap<>();
                parseObject(valueStr, nestedMap);
                map.put(key, nestedMap);
            } else if (valueStr.equalsIgnoreCase("true") || valueStr.equalsIgnoreCase("false")) {
                map.put(key, Boolean.parseBoolean(valueStr));
            } else if (valueStr.equalsIgnoreCase("null")) {
                map.put(key, null);
            } else {
                map.put(key, valueStr);
            }
        }
    }

    private static List<Object> parseArray(String arrayStr) {
        List<Object> list = new ArrayList<>();
        int start = arrayStr.indexOf('[') + 1;
        int end = arrayStr.lastIndexOf(']');
        String content = arrayStr.substring(start, end).trim();

        Pattern valuePattern = Pattern.compile("\"([^\"]+)\"|(true|false|null)|(-?\\d+(\\.\\d+)?)|\\[(.*?)\\]|\\{.*?\\}");
        Matcher valueMatcher = valuePattern.matcher(content);

        while (valueMatcher.find()) {
            String valueStr = valueMatcher.group();

            if (valueStr.startsWith("[") && valueStr.endsWith("]")) {
                list.add(parseArray(valueStr));
            } else if (valueStr.startsWith("{") && valueStr.endsWith("}")) {
                Map<String, Object> nestedMap = new HashMap<>();
                parseObject(valueStr, nestedMap);
                list.add(nestedMap);
            } else if (valueStr.equalsIgnoreCase("true") || valueStr.equalsIgnoreCase("false")) {
                list.add(Boolean.parseBoolean(valueStr));
            } else if (valueStr.equalsIgnoreCase("null")) {
                list.add(null);
            } else if (valueStr.matches("-?\\d+(\\.\\d+)?")) {
                list.add(Double.parseDouble(valueStr));
            } else {
                list.add(valueStr.replaceAll("^\"|\"$", ""));
            }
        }

        return list;
    }
}
