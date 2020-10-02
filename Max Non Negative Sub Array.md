## Max Non Negative Subarray
**Problem Description**

Given an array of integers, A of length N, find out the maximum sum sub-array of
non negative numbers from A.

The sub-array should be contiguous i.e., a sub-array created by choosing the 
second and fourth element and skipping the third element is invalid.

Maximum sub-array is defined in terms of the sum of the elements in the sub-
array.

Find and return the required subarray.

**NOTE:**

1. If there is a tie, then compare with segment's length and return segment which
has maximum length.<br>
2. If there is still a tie, then return the segment with minimum starting index.<br>


**Problem Constraints**<br>
1 <= N <= 105<br>
-109 <= A[i] <= 109<br>



**Input Format**<br>
The first and the only argument of input contains an integer array A, of length N.



**Output Format**<br>
Return an array of integers, that is a subarray of A that satisfies the given conditions.



**Example Input**<br>
Input 1:<br>

```
 A = [1, 2, 5, -7, 2, 3] 
```
<br>

Input 2:<br>
```
  A = [10, -1, 2, 3, -4, 100]
```

**Example Output**<br>
Output 1:<br>
```
 [1, 2, 5]
```
Output 2:<br>
```
 [100]
```

**Example Explanation**<br>
Explanation 1:<br>
```
 The two sub-arrays are [1, 2, 5] [2, 3].
 The answer is [1, 2, 5] as its sum is larger than [2, 3].
```
Explanation 2:<br>
```
 The three sub-arrays are [10], [2, 3], [100].
 The answer is [100] as its sum is larger than the other two.
```
