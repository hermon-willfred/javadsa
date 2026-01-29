import java.util.Scanner;
public static void main(String[]args){
    Scanner sc=new Scanner(System.in);
    int n=sc.nextInt();
    int[] stack=new int[n];
    int top=-1;
    for(int i=0;i<n;i++){
        int value=sc.nextInt();
        top++;
        stack[top]=value;
    }
    System.out.println(stack[top]);
    stack[top].pop();
    top--;
    System.out.println(stack[top]);
}