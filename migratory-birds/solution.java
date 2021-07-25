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
     * Complete the 'migratoryBirds' function below.
     *
     * The function is expected to return an INTEGER.
     * The function accepts INTEGER_ARRAY arr as parameter.
     */

    public static int migratoryBirds(List<Integer> arr) {
    // Write your code here
        
        Collections.sort(arr);
        int size = arr.size();
        int max = Collections.max(arr);
        ArrayList<Integer> myKey = new ArrayList<>();
        for (int i = 1; i <= max; i++) {
            myKey.add(i); 
        }
        
        int keySize = myKey.size();
        int maxBird = 0;
        int currentCount = 0;
        int maxCount = 0;
        for (int i = 0; i < keySize; i++) {
            currentCount = 0;
            for (int j = i+1; j < size; j++) {
                if (myKey.get(i) == arr.get(j)) {
                    currentCount++;
                }
            }
            if (currentCount > maxCount) {
                maxBird = myKey.get(i);
                maxCount = currentCount;
            }
        }
        
        return maxBird;
             
    }

}

public class Solution {
    public static void main(String[] args) throws IOException {
        BufferedReader bufferedReader = new BufferedReader(new InputStreamReader(System.in));
        BufferedWriter bufferedWriter = new BufferedWriter(new FileWriter(System.getenv("OUTPUT_PATH")));

        int arrCount = Integer.parseInt(bufferedReader.readLine().trim());

        List<Integer> arr = Stream.of(bufferedReader.readLine().replaceAll("\\s+$", "").split(" "))
            .map(Integer::parseInt)
            .collect(toList());

        int result = Result.migratoryBirds(arr);

        bufferedWriter.write(String.valueOf(result));
        bufferedWriter.newLine();

        bufferedReader.close();
        bufferedWriter.close();
    }
}
