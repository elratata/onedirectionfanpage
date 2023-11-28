package org.exemption;

// Press Shift twice to open the Search Everywhere dialog and type `show whitespaces`,
// then press Enter. You can now see whitespace characters in your code.
public class Main {
    public static void main(String[] args) {
        String yoMama = "Yo mama’s so fat she can’t even jump to a conclusion!";

        String str1 = substring(yoMama, 10, 23);
        String str2 = yoMama.substring(10, 23);
        String str3 = substring(yoMama, 's');
        System.out.printf("%s \n%s\n", str1, str2);
        System.out.println(str3);


        System.out.println(calc(-3, 10));
    }

    public static String substring(String str, int startIndx, int endIndx){
        String outStr = "";
        for(int i = startIndx; i < endIndx; i++){
            outStr += str.charAt(i);
        }

        return outStr;
    }

    public static String substring(String str, char c){
        String outStr = "";
        for(int i = 0; i < str.length(); i++){
            outStr += str.charAt(i);
            if(str.charAt(i) == c){
                break;
            }
        }
        return outStr;
    }

    public static String substring(String str, char c, int startIdx){
        String outStr = "";
        for(int i = startIdx; i < str.length(); i++){
            outStr += str.charAt(i);
            if(str.charAt(i) == c){
                break;
            }
        }
        return outStr;
    }

    public static int calc(int numParam, int startNum){
        int outInt = 0;

        for (int i = 0; i != numParam; i += numParam/Math.abs(numParam)) {
            outInt += startNum + i;
        }
        return outInt;
    }
}
