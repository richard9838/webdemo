package com.demo.kit;

import java.util.Objects;

/**
 * @author coder
 */
public class StringKit {

    /**
     * 判断字符串是否为空
     * @param value
     * @return
     */
    public static boolean isEmpty(String value) {
        if (Objects.isNull(value) || value.length() == 0) {
            return true;
        }
        return false;
    }

}
