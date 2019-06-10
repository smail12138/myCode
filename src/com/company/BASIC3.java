package com.company;

import java.util.Scanner;

public class BASIC3 {
    /**
     * 问题描述
     * 利用字母可以组成一些美丽的图形，下面给出了一个例子：
     *
     * ABCDEFG
     *
     * BABCDEF
     *
     * CBABCDE
     *
     * DCBABCD
     *
     * EDCBABC
     *
     * 这是一个5行7列的图形，请找出这个图形的规律，并输出一个n行m列的图形。
     *
     * 输入格式
     * 输入一行，包含两个整数n和m，分别表示你要输出的图形的行数的列数。
     * 输出格式
     * 输出n行，每个m个字符，为你的图形。
     * 样例输入
     * 5 7
     * 样例输出
     * ABCDEFG
     * BABCDEF
     * CBABCDE
     * DCBABCD
     * EDCBABC
     * 数据规模与约定
     * 1 <= n, m <= 26。
     * @param args
     */

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int m = in.nextInt();
        int n = in.nextInt();
        String[] arr = {"A","B","C","D","E","F","G","H","I","J","K","L","M","N","O","P","Q","R","S","T","U","V","W","X","Y","Z"};
        for(int i = 0;i<m;i++){
            String s = "";
            for(int j = i%26,k = j;j>0&&k-j<n;j--){
                s += arr[j];
            }
            for(int j = 0;j<n-i;j++){
                s += arr[j];
            }
            System.out.println(s);
        }

    }

}
