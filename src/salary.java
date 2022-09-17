import java.util.Arrays;
public class salary {
    public static double average(int[] salary) {
        int n=salary.length;
        int mn=Integer.MAX_VALUE,mx=Integer.MIN_VALUE,sum=0;
        for(int i=0;i<n;i++)
        {
            sum=sum+salary[i];
            mn=Math.min(mn,salary[i]);
            mx=Math.max(mx,salary[i]);
        }
        double ans=(sum-mn-mx)/((n-2)*1.0);
        if(n>2)
            return ans;
        else return 0;
    }
    public static void main(String[] args) {
        int [] arr = {4000,3000,1000,2000};
        double ans=  average(arr);
        System.out.println(ans);
    }
}