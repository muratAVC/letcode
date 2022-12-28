package RomeToLatin;

import java.util.ArrayList;

public class RomeToLatin {


    public static void main(String[] args) {
        String input="MCMXCIV";
        System.out.println(romanToInt(input));
    }

   public static int romanToInt(String s) {//  M CM XC IV
        int result=0;
        String str;

          if (s.contains("IV")){
              int a=s.indexOf("IV");
              result+=4;
              str=s.substring(0,a)+s.substring(a+2);
              s=str;
          }
            if (s.contains("IX")){
                int a=s.indexOf("IX");
                result+=9;
                str=s.substring(0,a)+s.substring(a+2);
                s=str;
            }
            if (s.contains("XL")){
                int a=s.indexOf("XL");
                result+=40;
                str=s.substring(0,a)+s.substring(a+2);
                s=str;
            }
            if (s.contains("XC")){
                int a=s.indexOf("XC");
                result+=90;
                str=s.substring(0,a)+s.substring(a+2);
                s=str;
            }
            if (s.contains("CD")){
                int a=s.indexOf("CD");
                result+=400;
                str=s.substring(0,a)+s.substring(a+2);
                s=str;
            }
            if (s.contains("CM")){
                int a=s.indexOf("CM");
                result+=900;
                str=s.substring(0,a)+s.substring(a+2);
                s=str;
            }
        for(int i=0;i<s.length();i++){
            String str1=s.substring(i,i+1);
            if(str1.equals("M")){
                result+=1000;
            }
            /*
            I can be placed before V (5) and X (10) to make 4 and 9.      IV    IX
            X can be placed before L (50) and C (100) to make 40 and 90.  XL    XC
            C can be placed before D (500) and M (1000) to make 400 and 900   CD   CM
             */
            if(str1.equals("D")){

                result+=500;
            }
            if(str1.equals("C")){
                result+=100;
            }
            if(str1.equals("L")){
                result+=50;
            }
            if(str1.equals("X")){
                result+=10;
            }
            if(str1.equals("V")){
                result+=5;
            }
            if(str1.equals("I")){
                result+=1;
            }
        }

        return result;
    }
}
/*
Symbol       Value
I             1
V             5
X             10
L             50
C             100
D             500
M             1000
 */