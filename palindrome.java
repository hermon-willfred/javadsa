import java.util.Scanner;
public class palindrome{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s=sc.nextLine();
        int i=0;
        int j=s.length()-1;
        boolean ispal=true;
        while(i<j){
            if(s.charAt(i)!=s.charAt(j)){
                ispal=false;
                break;
            }
            i++;
            j--;
        }
        System.out.println(ispal);
    }
}