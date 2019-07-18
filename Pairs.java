import java.util.*;
public class abc {

    public static void main(String args[]){
        
        int noofpairs=0;
        int arr[];
        int n,target;
        HashMap<Integer,Integer> h=new HashMap<Integer,Integer>();
        Scanner obj=new Scanner(System.in);
        
        n=obj.nextInt();
        target=obj.nextInt();
        
        arr=new int[n];
        
        for(int i=0;i<n;i++)
        {
            arr[i]=obj.nextInt();
            h.put(arr[i],1);
        }
        
        for(int i=0;i<n;i++)
        {
            int tofind;
            tofind=Math.abs(target+arr[i]);
            if(h.containsKey(tofind))
                noofpairs++;
        }
        System.out.println(noofpairs);
    }
}