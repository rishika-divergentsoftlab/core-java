import java.io.*;
 
public class CountVowelConsonant {
 
    static void CountVowelConsonant(String str)
    {   int vowels = 0, consonant = 0;
            for (int i = 0; i < str.length(); i++) {
             
            char ch = str.charAt(i);
     
            if ( (ch >= 'a' && ch <= 'z') ||
                (ch >= 'A' && ch <= 'Z') ) {
     
                // To handle upper case letters
                ch = Character.toLowerCase(ch);;
     
                if (ch == 'a' || ch == 'e' || ch == 'i' ||
                    ch == 'o' || ch == 'u')
                    vowels++;
                else
                    consonant++;
            }
            
        }
         
        System.out.println("Vowels: " + vowels);
        System.out.println("Consonant: " + consonant);
        
    }
     
    // Driver function.
    static public void main (String[] args)
    {
        String str = "Rishika Jain";
         
        CountVowelConsonant(str);
    }
}
