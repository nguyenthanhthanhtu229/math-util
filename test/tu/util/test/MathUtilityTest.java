/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tu.util.test;

import java.sql.SQLException;
import org.junit.Test;
import static org.junit.Assert.*;
import tu.util.MathUtility;

/**
 *
 * @author ASUS
 */
public class MathUtilityTest {

    @Test //biến hàm ở trong class này thành public static void main()
    //nhờ có bộ thư vien JUnit.
    //tsao càn vay , vì mac dinh app từ main() chuản6
    //trong khi dó mình cần test thử hàm thoi , ko can thiep main()
    //v mình can main() khac ,@Test giup dieu do
    // nhung vì có nhìu main() CPU bi bói rói khi nhân F6
    //F6 dành cho main() default
    //Shift F6 dành cho bên này

    //Cú phap dat ten hàm dùng dể test hàm khác cho dân QC
    public void getFactorial_RunsWell_IfValidArgument() {
        assertEquals(120, MathUtility.getFactorial(5));
        assertEquals(720, MathUtility.getFactorial(6));
        assertEquals(24, MathUtility.getFactorial(4));
        assertEquals(6, MathUtility.getFactorial(3));
        assertEquals(1, MathUtility.getFactorial(0));
    }

    //bắt ngoai le thế nào??
    //ngoai le Exception ko phải là 1 value dẻ mà so sánh
    //do dó dùng hàm assertX() là k dc , vì ko là value dẻ so sanh
    //ta phải dùng ky thuat khác
    @Test(expected = SQLException.class)
    public void getFactorial_ThrowException_IfInvalidArgument(){
        MathUtility.getFactorial(-5);
    }
    
    //trc khi chay file jar cần sửa build-impl.xml
    //sửa 1005 test thành cong thì tao ra .jar 
    //fail thì k tao ra file .jar
}
