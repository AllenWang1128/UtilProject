package cn.lidd.util;

import org.junit.Test;

import static org.junit.Assert.*;

/**
 * Created by lidong on 2016/3/17.
 */
public class DateUtilTest {

    @Test
    public void testGetAge() throws Exception {
        assertEquals("31", DateUtil.getAge("1985-02-14"));
    }
}