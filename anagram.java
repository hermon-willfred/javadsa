import java.util.Scanner;
public class anagram{
    public static void main(String[]args){
        Scanner sc=new Scanner(System.in);
        String s1=sc.nextLine();
        String s2=sc.nextLine();
        int[] freq=new int[26];
        if(s1.length()!=s2.length()){
            System.out.println("Not anagram");
            return;
        }
        for(int i=0;i<s1.length();i++){
            freq[s1.charAt(i)-'a']++;
            freq[s2.charAt(i)-'a']--;
        }
        for(int i=0;i<26;i++){
            if(freq[i]!=0){
                System.out.println("Not anagram");
                return;
            }
        }
        System.out.println("Anagram");

    }
}