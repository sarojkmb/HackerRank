import java.io.*;
import java.util.*;
import java.text.*;
import java.math.*;
import java.util.regex.*;

/*
Did not pass all the test cases

Lisa just got a new math workbook. A workbook contains exercise problems, grouped into chapters.

There are  chapters in Lisa's workbook, numbered from  to .
The -th chapter has  problems, numbered from  to .
Each page can hold up to  problems. There are no empty pages or unnecessary spaces, so only the last page of a 
chapter may contain fewer than  problems.
Each new chapter starts on a new page, so a page will never contain problems from more than one chapter.
The page number indexing starts at .
Lisa believes a problem to be special if its index (within a chapter) is the same as the page number where it's 
located. Given the details for Lisa's workbook, can you count its number of special problems?
*/
public class LisaWorkBook {

    public static void main(String[] args) {
        Scanner in=new Scanner(System.in);
        int n=in.nextInt();
        int k=in.nextInt();
        int page=0;
        int ans=0;
        for(int i=0;i<n;i++){
            int x=in.nextInt();
            //System.out.println(x);
            for(int j=1;j<=x;j++){
                if(j==page){
                    ans++;
                    //System.out.println("Hello- "+j+" "+page);
                }
                if(j%k==0){
                    page++;
                }
            }
           if(x%k!=0){
                page++;
            }
            
        }
        System.out.println(ans);
    }
}
