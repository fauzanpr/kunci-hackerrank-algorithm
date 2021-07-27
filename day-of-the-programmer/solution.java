import java.io.*;
import java.math.*;
import java.security.*;
import java.text.*;
import java.util.*;
import java.util.concurrent.*;
import java.util.function.*;
import java.util.regex.*;
import java.util.stream.*;
import static java.util.stream.Collectors.joining;
import static java.util.stream.Collectors.toList;

class Result {

    /*
     * Complete the 'dayOfProgrammer' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts INTEGER year as parameter.
     */

    public static String dayOfProgrammer(int year) {
    // Write your code here
    
        int[] dt = {31,28,31,30,31,30,31,31,30,31,30,31};
        
        if (year > 1918) {
            //gregorian
            if (((year%4==0) && (year%100 != 0)) || (year%400==0)) {
                dt[1] = 29;
            }
        } else if (year < 1918) {
            //julian
            if (year%4==0) {
                dt[1] = 29;
            }
        } else {
            //transition
            dt[1] = 29-14;
        }
        
        String ds = "";
        String ms = "";
        String ys = Integer.toString(year);
        int di = 0;
        int mi = 0;
        int dayin = 0;
        
        for (int i = 0; i < dt.length-1; i++) {
            dayin += dt[i];
            if (dayin + dt[i+1] >= 256) {
                di = 256-dayin;
                mi = i+1;
                break;
            }
        }
        
        if (di == 0) {
            di = dt[mi]; 
        } else if (di > 0) {
            mi += 1;
        }
        
        ds = Integer.toString(di);
        ms = Integer.toString(mi);
        
        if (ds.length() == 1) {
            ds = "0" + ds;
        } 
        if (ms.length() == 1) {
            ms = "0" + ms;
        }
        
        return ds + "." + ms + "." + ys;

    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int year = Integer.parseInt(bufferedReader.readLine().trim());

        String result = Result.dayOfProgrammer(year);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
