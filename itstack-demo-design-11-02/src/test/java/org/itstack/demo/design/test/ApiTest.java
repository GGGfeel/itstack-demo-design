package org.itstack.demo.design.test;

import com.alibaba.fastjson.JSON;
import org.itstack.demo.design.Activity;
import org.itstack.demo.design.ActivityController;
import org.itstack.demo.newCase.CheerFactory;
import org.itstack.demo.newCase.Chess;
import org.junit.Test;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;

/**
 * 博客：https://bugstack.cn - 沉淀、分享、成长，让自己和他人都能有所收获！
 * 公众号：bugstack虫洞栈
 * Create by 小傅哥(fustack) @2020
 */
public class ApiTest {

    private Logger logger = LoggerFactory.getLogger(ApiTest.class);

    private ActivityController activityController = new ActivityController();

    @Test
    public void test_queryActivityInfo() throws InterruptedException {
        for (int idx = 0; idx < 10; idx++) {
            Long req = 10001L;
            Activity activity = activityController.queryActivityInfo(req);
            logger.info("测试结果：{} {}", req, JSON.toJSONString(activity));
            Thread.sleep(1200);
        }
    }

    @Test
    public void test_chess(){
        Chess black = CheerFactory.getCherrs("BLACK");
        black.draw(30,123);

        Chess black1 = CheerFactory.getCherrs("BLACK");
        black1.draw(50,10);
        //即使x，y不一样， 但这个时候两个类的内存地址都一样，其实只有一个类
        System.out.println(black.hashCode() + " " + black1.hashCode());
    }

}
