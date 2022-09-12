//Write a program to determine whether the character is vowel or not.
import java.util.Scanner;
public class P03_Vowel{
    public void checkVowel(char ch){
        if(ch == 'a' || ch == 'e' || ch == 'i' || ch == 'o' || ch == 'u'){
            System.out.println(ch + " is Vowel");
        }
        else
            System.out.println(ch + " is Not Vowel, It's consonants");
    }
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.print("Enter the Character = ");
        P03_Vowel vowel = new P03_Vowel();   
        char ch = sc.next().charAt(0);   
        vowel.checkVowel(ch);
    }
}