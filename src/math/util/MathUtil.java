/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package math.util;

import tu.util.MathUtility;

/**
 *
 * @author ASUS
 */
public class MathUtil {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        long expected = 120;                       // hy vong 120 ói ve nếu
        long actual = MathUtility.getFactorial(5); //t goi hàm 5!
        System.out.println("5!? expected: " + expected + "; actual: " + actual);
        //dung cho case tình huống dàu tiên

        expected = 720; //hy vong ói về 720;
        actual = MathUtility.getFactorial(6); //6!
        System.out.println("6!? expected: " + expected + "; actual: " + actual);

        //case 3:
        System.out.println("0!? expected: 1; actual: " + MathUtility.getFactorial(0));

        //case 4:
        //t kỳ vọng nhận về ngoai le IllegalArgumentException
        //nếu t gọi -5!
        MathUtility.getFactorial(-5);
        //thay ngoai lệ lại mừng vì hàm chạy nhu thiết kế
    }
}

//cất code len server Github
//cần:
//phải nhớ kho trên Github, url: https://github.com/nguyenthanhthanhtu229/math-util.git
//nhớ username và pass và email vài GitHub của mình
//cần tool dể dòng bộ code từ máy tính mình(local) len server(Github,Gitlab,BitBucket)
//tool có thể là cmd;GUI(Git Desktop,Source Tree),chính IDE(click,cmd)
//vì ta pro ta chơi cmd
//cài git scm dã nói download sẵn
//file dặc biet dể nói vs git toll rằng : ai len server ai ở lai local
//file này dcc goi là .gitignore (thuần text)
//nó sẽ khác nhau content tùy vào IDE mình xài, ngôn ngữ lap trình mình xài
