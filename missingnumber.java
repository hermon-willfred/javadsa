import java.util.Scanner;
public class missingnumber{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n-1];
        for(int i=0;i<n-1;i++){
            arr[i]=sc.nextInt();
        }
        int total=n*(n+1)/2;
        int arraysum=0;
        for(int i=0;i<n-1;i++){
            arraysum=arraysum+arr[i];
        }
        int missingnum=total-arraysum;
        System.out.println(missingnum);
    }
}