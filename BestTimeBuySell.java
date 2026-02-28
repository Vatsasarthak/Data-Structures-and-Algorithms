import java.util.*;

import static java.util.Collections.max;

public class BestTimeBuySell {
    public static void main(String[] args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] num=new int[n];
        for(int i=0;i<n;i++){
            num[i]=sc.nextInt();
        }
        int min=num[0];
        int profit=0;
        int maxProfit=0;
        for(int i=1;i<num.length;i++){
            profit=num[i] - min;
            maxProfit = Math.max(maxProfit, profit);
            if(num[i]<min){
                min=num[i];
            }
        }
        System.out.println(maxProfit);
    }
}
