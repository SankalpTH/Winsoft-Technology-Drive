import java.util.*;
class MaximumSumPath { 
    int max(int x, int y) { return (x > y) ? x : y; } 
    int maxPathSum(int ar1[], int ar2[], int m, int n) 
    { 
        int i = 0, j = 0; 
        int result = 0, sum1 = 0, sum2 = 0;  
        while (i < m && j < n) { 
            if (ar1[i] < ar2[j]) 
                sum1 += ar1[i++]; 
            else if (ar1[i] > ar2[j]) 
                sum2 += ar2[j++]; 
            else { 
                result += max(sum1, sum2) + ar1[i]; 
                sum1 = 0; 
                sum2 = 0; 
                i++; 
                j++; 
            } 
        } 
        while (i < m) 
            sum1 += ar1[i++]; 
        while (j < n) 
            sum2 += ar2[j++]; 
        result += max(sum1, sum2); 
        return result; 
    } 
    public static void main(String[] args) 
    { 
        MaximumSumPath sumpath = new MaximumSumPath(); 
            Scanner sc = new Scanner(System.in);
            System.out.println("Enter size of Array AR1 : ");
        int a=sc.nextInt();
        System.out.println("Enter size of Array AR2 : ");
        int b=sc.nextInt();
        int[] ar1=new int[a];
        int[] ar2=new int[b];
        for(int i=0;i<a;i++){
            ar1[i]=sc.nextInt();
        }
        for(int i=0;i<b;i++){
            ar2[i]=sc.nextInt();
        }
        int m = ar1.length; 
        int n = ar2.length; 
        System.out.println("Maximum sum path is :" + sumpath.maxPathSum(ar1, ar2, m, n));
    } 
}