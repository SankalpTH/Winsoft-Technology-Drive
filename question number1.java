import java.util.*;
class Main
{
    public static void main(int[] X, int[] Y, int m, int n)
    {
        int k = m + n + 1;
        while (m >= 0 && n >= 0)
        {
            if (X[m] > Y[n]) {
                X[k--] = X[m--];
            }
            else {
                X[k--] = Y[n--];
            }
        }
        while (n >= 0) {
            X[k--] = Y[n--];
        }
        Arrays.fill(Y, 0);
    }
    public static void rearrange(int[] X, int[] Y)
    {
        if (X.length == 0) {
            return;
        }
        int k = 0;
        for (int value: X)
        {
            if (value != 0) {
                X[k++] = value;
            }
        }
        main(X, Y, k - 1, Y.length - 1);
    }
    public static void main (String[] args)
    {
        Scanner sc=new Scanner(System.in);
        System.out.println("Enter size of Array X : ");
        int a=sc.nextInt();
        System.out.println("Enter size of Array Y : ");
        int b=sc.nextInt();
        int[] X=new int[a];
        int[] Y=new int[b];
        for(int i=0;i<a;i++){
            X[i]=sc.nextInt();
        }
        for(int i=0;i<b;i++){
            Y[i]=sc.nextInt();
        }
        
        rearrange(X, Y);
        System.out.println(Arrays.toString(X));
}
}