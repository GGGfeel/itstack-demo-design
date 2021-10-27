package org.itstack.demo.newCase;

/**
 * @author shanke.jl
 * @Date: 2021/10/19 11:38 上午
 */
public class BlackCheer implements Chess {

    public  String getColor() {
        return color;
    }

    private  final String color = "BLACK";

    @Override
    public void draw(int x, int y) {
        System.out.println(getColor() + "x:" + x + "y:" + y);
    }
}
