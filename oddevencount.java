import java.util.Scanner;
public class oddevencount{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        int n=sc.nextInt();
        int[] arr=new int[n];
        for(int i=0;i<n;i++){
            arr[i]=sc.nextInt();
        }
        int oddcount=0;
        int evencount=0;
        for(int i=0;i<n;i++){
            if(arr[i]%2==0){
                evencount=evencount+1;
            }
            else{
                oddcount=oddcount+1;
            }
        }
        System.out.println("Even numbers="+ evencount);
        System.out.println("odd numbers="+ oddcount);
    }
}