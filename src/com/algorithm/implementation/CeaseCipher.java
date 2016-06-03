import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

public class CeaseCipher {

    public static void main(String[] args) {
        Scanner in = new Scanner(System.in);
        int n = in.nextInt();
        String s = in.next();
        String ns="";
        int k = in.nextInt();
        if(k>=26){
            k=k%26;
        }
        for(int i=0;i<n;i++){
            if (!(((char)s.charAt(i)>='a' && (char)s.charAt(i)<='z') || ((char)s.charAt(i)>='A' && (char)s.charAt(i)<='Z'))) {
                ns+=s.charAt(i);
                //System.out.println(s.charAt(i));
                continue;
            }
            char c=(char)(s.charAt(i)+k);
            if(c>'z'){
               // System.out.println(s.charAt(i));
               ns+= (char)(s.charAt(i)-(26-k));
            }else{
               ns+=(char)(s.charAt(i)+k);
                //System.out.println(s.charAt(i));
            }
        }
        System.out.println(ns);
    }
}
