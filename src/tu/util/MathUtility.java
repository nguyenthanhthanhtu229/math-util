/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tu.util;

/**
 *
 * @author ASUS
 */
public class MathUtility {

    //mình sẽ làm class này fake y chang class Math của JDK
    //Math.PI.abs() .sqrt() .pow() .sin()
    //cái gì mà là đồ xài chung , ko lưu trữ riêng lẻ info ta sẽ
    //chơi static
    public static final double PI = 3.1415;
    // xài MathUtility<PI y chang Math.PI

    //hàm tính n!=1.2.3.4,..,n
    //n phải >=0, 0!=1!=1 quy uoc
    //ta chỉ tính n! từ -..20
    //ngoia2 vung này dù âm hay > 20 eo tính chủi=Exception
    //ko them trả ve -1 hàm ý giá tri ko xài
    //hoc cách ném ngoai le lun
    public static long getFactorial(int n) {
        if(n<0||n>20)
            throw new IllegalArgumentException("n must be between 0...20");
        
        if(n==0||n==1)
            return 1; //1 lệnh if thì xong xài ngoặc
        
        //chỗ này thằng nào xài else trừ điểm
        //ngay chỗ này chính là 2...20
        long result=1;
        for (int i = 2; i <= n; i++) 
            result *=i;
        
        return result;
    }
// ta tư tin hàm chay chay ngon , chay đúng
    //nhưng : team thì cần chứng minh dieu2 dó, dảm bảo chat luong code, chat luong hàm
    //test nghia là dưa hàm ra xài goi vs cac tham so khac nhau
    //vi du goi hàm getFactorial (vs cac so n khac nhau dua vào)
    //getF(-5), getF(-1) getF(0) ,...
    //cac giá tri dàu vào dai diện cho viec xài hàm
    //ta còn goi hàm là test cases, các tình huong càn test tình huong xài hàm
    //khi test hàm ta càn qtam 2 viec
    //1 vd kiểm hàm trả về giá tri gì khi hàm chay vs 1 đầu vào nào dó
    // vd kiểm hàm trả về gia tri, goi la EXPECTED VALUE
    //vd: hàm trả vè gia tri 120 goi là getF(5!)
    //2 các value trả vè của hàm khi chay dc goi là ACTUAL VALUE
    
//Nghề TEST chính là : so sánh cac Expected Value có bằng vs Actual Value k?
    ///Nếu có bằng, hàm dúng cho case// tính hướng này
    //Neu ko bằng , hàm tính toán sai hoac kì vọng sai
    
    //Hàm mà tốt thì phải là Expected==Actual Mọi tình hong71
    //Nếu tốt ta mới dem ra xài,bán, public cộng đồng  xài
    
    //Làm sao dể test hàm coi có tốt ko Expected==Actual
    //Hai kĩ thuat dc áp dung:
        //Kỹ thuat 1:Nhìn bằng mắt và so sánh từng cap expected vs actual
        // chính là ky thuat sout(expected),sout(actual-hàm ói về khi chay)
        // kỹ này don giản . de làm nhung mắc sai sót do có quả nhìu cap expected actual cần so sánh bằng mắt
    
        //Ky thuat 2: Nhìn bằng mắt , ko can so sánh từng cap, de máy so sánh giùm lun
                     // mat chỉ nhìn 2 màu Xanh Dỏ duy nhát
                     //Nếu tất cả cac cap actual vs expected deu thỏa . màu xanh cho tất cả
                     // nếu hầu het các cap actula vs expected deu thỏa, có 1 vài cái k thỏa
                     //Thì ket luan ngay hàm sai màu dỏ cho tất cả
                     //Diêu này giải ính là dúng thì phải dung cho tất cả mọi th hàm chạy chỉ cần 1 thang sai hàm sai
                     // tuong duong câu: Hàm tui chay ngon lám dúng 99,99% , lau lau sai ti
                     // nói cau dó hàm k tin cay dể xài
                     //Kỹ thuat 2 này dùng màu sắc mún làm v thì phải có thư vien bỏ sung
                     //chính là FIle .JAR .DLL dc cup cấp them ngoài JDK
                     //các thu vien này tùy thuoc vào ngon ngữ lap trinh dc goi là Unit Test Framework
                     //C#:thu vien cu thể Unit,xUnit,MSUnit
                     //Java: thu vien cu thẻ JUnit,TetsNC.xUnit
                     //PHP: PHPUnit
                     //C++ :CPPUnit
                     //...
}
