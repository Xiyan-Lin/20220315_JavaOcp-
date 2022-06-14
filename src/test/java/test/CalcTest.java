package test;

import day18.Calc;
import junit.framework.Assert;
import org.junit.Test;

public class CalcTest {
    @Test
    public void test() {
        // 3A 測試
        // 1. Arrange 初始目標物件, 參數, 期望的結果
        Calc calc = new Calc();
        int x = 5;
        int y = 2;
        double expected = 2.5;
        
        // 2. Act 調用目標物件的方法
        double actual = calc.div(x, y);
        
        // 3. Assert 驗證是否符合預期
        Assert.assertEquals(expected, actual);
    }
}
