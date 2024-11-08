package io.planx.api.core.common;

import java.util.Comparator;

/**
 * @Author Todd
 * @Version 1.0
 **/
public class AccsiiAscComparator implements Comparator {
    @Override
    public int compare(Object str1, Object str2) {
        return str1.toString().compareTo(str2.toString());
    }
}
