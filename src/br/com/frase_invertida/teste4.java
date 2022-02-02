package br.com.frase_invertida;

import java.util.Scanner;

public class teste4 {

    public static String revertestring(String string){
        if (string == null || string.equals("")) {
            return string;
        }
        int stringl = string.length();
        char[] ten = new char[stringl];

        for (int i = 0; i < stringl; i++) {
            ten[stringl - i - 1] = string.charAt(i);
        }

        return String.copyValueOf(ten);
    }
   public static void main(String[]args){
       Scanner sc = new Scanner(System.in);
       System.out.println("digite a palavra/frase");
       String cru = sc.next();
        cru.toLowerCase();
       System.out.println("Before : \"" + cru + "\"");
       System.out.println("Replace: \"" + cru.replace(" ", "") + "\"");

       String urc = revertestring(cru);
       Boolean result = false;

       if (cru == urc) {
           result = true;
       }else {
           result = false;
       }
       if (result == true){
           System.out.println(cru + "-> true");
       }else{
           System.out.println("" + "-> false" );
       }

   }
}
