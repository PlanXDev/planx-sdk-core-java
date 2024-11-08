package io.planx.api.core.common;

import java.util.Map;
import java.util.TreeMap;

/**
 * @Author Todd
 * @Version 1.0
 **/
public class ParamsSortMap {
    public static Map getSortMap() {
        return new TreeMap<>(new AccsiiAscComparator());
    }
}
