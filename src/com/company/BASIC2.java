package com.company;

public class BASIC2 {
    /**
     * 问题描述
     * 对于长度为5位的一个01串，每一位都可能是0或1，一共有32种可能。它们的前几个是：
     *
     * 00000
     *
     * 00001
     *
     * 00010
     *
     * 00011
     *
     * 00100
     *
     * 请按从小到大的顺序输出这32种01串。
     *
     * 输入格式
     * 本试题没有输入。
     * 输出格式
     * 输出32行，按从小到大的顺序每行一个长度为5的01串。
     * 样例输出
     * 00000
     * 00001
     * 00010
     * 00011
     * <以下部分省略>
     * @param args
     */

    public static void main(String[] args) {

        for(int i = 0;i<32;i++){
            String s = Integer.toBinaryString(i);
            if(s.length()==1){
                s = "0000"+s;
            }else if(s.length()==2){
                s = "000"+s;
            }else if(s.length()==3){
                s = "00" + s;
            }else if(s.length()==4){
                s = "0"+s;
            }
            System.out.println(s);
        }

    }

}
