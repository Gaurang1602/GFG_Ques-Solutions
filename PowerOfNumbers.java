Question-



Given a non-negative integer N. The task is to check if N is a power of 2. More formally, check if N can be expressed as 2x for some x.

Example 1:

Input: N = 1
Output: YES
Explanation:1 is equal to 2 
raised to 0 (20 = 1).
Example 2:

Input: N = 98
Output: NO
Explanation: 98 cannot be obtained
by any power of 2.

Your Task:Your task is to complete the function isPowerofTwo() which takes n as a parameter and returns true or false by checking if the given number can be represented as a power of two or not.

Expected Time Complexity:O(log N).
Expected Auxiliary Space:O(1).

Constraints:
0 ≤N ≤1018




Solution-




class Solution{
    public:
    //You need to complete this fucntion
    
    long long power(int N,int R)
    {
         
    int m = 1e9+7;
        
       if(R == 1) {  
            return N;
       }
       long long t = power(N, R / 2) % m;
       t = (t* t) % m;
       if(R % 2 != 0){
           return (t * N) % m;
       }
       return t;
        
    }

};
