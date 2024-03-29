package com.company;

import java.util.Scanner;

public class Specialpalindromenumber {
    /**
     * 问题描述
     * 　　123321是一个非常特殊的数，它从左边读和从右边读是一样的。
     * 　　输入一个正整数n， 编程求所有这样的五位和六位十进制数，满足各位数字之和等于n 。
     * 输入格式
     * 　　输入一行，包含一个正整数n。
     * 输出格式
     * 　　按从小到大的顺序输出满足条件的整数，每个整数占一行。
     * 样例输入
     * 52
     * 样例输出
     * 899998
     * 989989
     * 998899
     * 数据规模和约定
     * 　　1<=n<=54。
     * @param args
     */

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        for(int i = 10000;i<999999;i++){
            if(Inst(i,n)){
                System.out.println(i);
            }
        }
    }
    public static boolean Inst(int i,int n){
        String ans = ""+i;
        StringBuffer str = new StringBuffer(ans);
        int sum = 0;
        for(int j= 0;j<ans.length();j++){
            sum = sum + (ans.charAt(j)-48);
        }
        if(sum==n&&str.reverse().toString().equals(ans)){
            return true;
        }else
            return false;
    }
}
