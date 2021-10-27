package org.itstack.demo.newCase;

import java.util.HashMap;
import java.util.Map;

/**
 * @author shanke.jl
 * @Date: 2021/10/19 11:38 上午
 */
public class CheerFactory {
    private static Map<String, Chess> cheersMap = new HashMap<>();

    public static Chess getCherrs(String color) {
        Chess chess = cheersMap.get(color);
        if (chess == null) {
            chess = "BLACK".equalsIgnoreCase(color) ? new BlackCheer() :
                new WhiteCheer();
            cheersMap.put(color, chess);
        }
        return chess;
    }
}
