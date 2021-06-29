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
     * Complete the 'timeConversion' function below.
     *
     * The function is expected to return a STRING.
     * The function accepts STRING s as parameter.
     */

    public static String timeConversion(String s) {
    // Write your code here
    
        if (s.charAt(0) == '1' && s.charAt(1) == '2' && s.charAt(8) == 'A') {
            return "00" + s.substring(2,8);
        } else if (s.charAt(8) == 'P') {
            int n = 2;
            int sI = Character.getNumericValue(s.charAt(1));
            System.out.println(s.substring(0,2 ));
            System.out.println(sI);
            if (sI < 8 && s.charAt(0) != '1') {
                //1n
                for (int i = 0; i < sI; i++) {
                    n++;
                }
                char m = (char) (n+'0');
                return "1" + m + s.substring(2,8);
            } else if (sI > 8) {
                //2n
                sI = sI - 8;
                char m = '0';
                for (int i = 0; i < sI; i++) {
                    i++;
                    if (i == sI-1) {
                       m = (char) (i+'0');
                       break;
                    }
                }
                return "2" + m + s.substring(2,8);
            } else {
                if (s.startsWith("10")) {
                    return "22" + s.substring(2,8);
                } else if (s.startsWith("11")) {
                    return "23" + s.substring(2,8);
                }
            }
        }
        return s.substring(0,8);
        
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        String s = bufferedReader.readLine();

        String result = Result.timeConversion(s);

        bufferedWriter.write(result);
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
