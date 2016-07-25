package com.dream.real;

import com.dream.real.dubbo.provider.DemoServiceImpl;
import com.dream.real.dubbo.provider.intf.DemoService;
import com.dream.real.entity.City;
import org.junit.Assert;
import org.junit.Test;
import org.junit.runner.RunWith;
import org.powermock.api.mockito.PowerMockito;
import org.powermock.core.classloader.annotations.PrepareForTest;
import org.powermock.modules.junit4.legacy.PowerMockRunner;

/**
 * Desc:     PowerMockTest类
 * Author:   licheng
 * Datetime: 2016-07-25 13:48
 */
//@RunWith(PowerMockRunner.class)
//@PrepareForTest(DemoService.class)
public class PowerMockTest {

    @Test
    public void testMock() {

        DemoService demoService = new DemoServiceImpl();
        String returnStr = demoService.sayHello("licheng");
        Assert.assertEquals("Hello licheng",returnStr);
        System.out.println("chengli");
    }
}
