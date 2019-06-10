package com.company;

import java.math.BigInteger;
import java.util.Scanner;

public class HtoI {

    public static void main(String[] args) {
	// write your code here
        Scanner in = new Scanner(System.in);
        BigInteger number;
        int a;
        number = in.nextBigInteger();
        System.out.println(Otoi(number));
    }
    public static String Otoi(BigInteger s){
        String str = "";
        BigInteger as = new BigInteger("16");
        while(s.compareTo(as)==1){
            BigInteger ans = s.divide(as);
            BigInteger a = s.subtract(as.multiply(ans));
            if("0".equals(a.toString())) {
                str = "0" + str;
            }else if("1".equals(a.toString())){
                str = "1"+str;
            }else if("2".equals(a.toString())){
                str = "2"+str;
            }else if("3".equals(a.toString())){
                str = "3"+str;
            }else if("4".equals(a.toString())){
                str = "4"+str;
            }else if("5".equals(a.toString())){
                str = "5"+str;
            }else if("6".equals(a.toString())){
                str = "6"+str;
            }else if("7".equals(a.toString())){
                str = "7"+str;
            }else if("8".equals(a.toString())){
                str = "8"+str;
            }else if("9".equals(a.toString())){
                str = "9"+str;
            }else if("10".equals(a.toString())){
                str = "A"+str;
            }else if("11".equals(a.toString())){
                str = "B"+str;
            }else if("12".equals(a.toString())){
                str = "C"+str;
            }else if("13".equals(a.toString())){
                str = "D"+str;
            }else if("14".equals(a.toString())){
                str = "E"+str;
            }else if("15".equals(a.toString())){
                str = "F"+str;
            }
            s = new BigInteger(""+ans);
        }
        if("0".equals(s.toString())) {
            str = "0" + str;
        }else if("1".equals(s.toString())){
            str = "1"+str;
        }else if("2".equals(s.toString())){
            str = "2"+str;
        }else if("3".equals(s.toString())){
            str = "3"+str;
        }else if("4".equals(s.toString())){
            str = "4"+str;
        }else if("5".equals(s.toString())){
            str = "5"+str;
        }else if("6".equals(s.toString())){
            str = "6"+str;
        }else if("7".equals(s.toString())){
            str = "7"+str;
        }else if("8".equals(s.toString())){
            str = "8"+str;
        }else if("9".equals(s.toString())){
            str = "9"+str;
        }else if("10".equals(s.toString())){
            str = "A"+str;
        }else if("11".equals(s.toString())){
            str = "B"+str;
        }else if("12".equals(s.toString())){
            str = "C"+str;
        }else if("13".equals(s.toString())){
            str = "D"+str;
        }else if("14".equals(s.toString())){
            str = "E"+str;
        }else if("15".equals(s.toString())){
            str = "F"+str;
        }else if("16".equals(s.toString())){
            str = "10"+str;
        }
        return str;
    }
}
