# A Very Big Sum

You are given an array of integers of size N. You need to print the sum of the elements in the array, keeping in mind that some of those integers may be quite large
<br />

### Input Format
The first line of the input consist of an integer N. The next line contains N space-separated integers contained in the array
<br />

### Output Format
Print a single value equal to the sum of the elements in the array
<br />

### Constraints
**1 <= N <= 10**
<br />
**0 <= A[i] <= 10^10**
<br />

### Sample Input
```
5
1000000001 1000000002 1000000003 1000000004 1000000005
```
<br />

### Output
```
5000000015
```
<br />

<blockquote>
  
### Note :
The range of the 32-bit integers is **(-2^31) to (2^31 - 1) *or* [-2147483648,2147483647]**
When we add several integer values, the resulting sum might exceed the above range. You might need to use long int C/C++/Java to store such sums. 
</blockquote>
