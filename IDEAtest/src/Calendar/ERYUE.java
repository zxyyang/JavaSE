package Calendar;

import jdk.swing.interop.SwingInterOpUtils;

import java.util.Calendar;
import java.util.Scanner;

public class ERYUE {
    public static void main(String[] args) {
        Scanner sc =new Scanner(System.in);
        System.out.println("请输入年份");
        int year =sc.nextInt();

        Calendar c= Calendar.getInstance();
        c.set(year,2,1);  //3.1
        c.add(Calendar.DATE,-1);
        int date = c.get(Calendar.DATE);
        System.out.println(year+"年有"+date+"天");
    }
}
