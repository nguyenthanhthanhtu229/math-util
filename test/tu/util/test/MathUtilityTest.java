/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tu.util.test;

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
   public void getFactorial_RunsWell_IfValidArgument(){
       assertEquals(120, MathUtility.getFactorial(5));
       assertEquals(720, MathUtility.getFactorial(6));
   }
    
}
