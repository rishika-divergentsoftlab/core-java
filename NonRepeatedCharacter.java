/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package com.mycompany.core.java;

import java.util.Arrays;

/**
 *
 * @author Rishika
 */
public class NonRepeatedCharacter {
    
    static void removeDuplicate(char str[], int length)   
    {   
        //Creating index variable to use it as index in the modified string   
        int index = 0;   
    
      
        for (int i = 0; i < length; i++)   
        {   
              
            
            int j;   
            for (j = 0; j < i; j++)    
            {   
                if (str[i] == str[j])   
                {   
                    break;   
                }   
            }   
    
            
            if (j == i)    
            {   
                str[index++] = str[i];   
            }   
        }   
        System.out.println(String.valueOf(Arrays.copyOf(str, index)));   
    }   
    
    
    public static void main(String[] args)   
    {   
        String info = "My Name is Rishika JAIn";  
        
        char str[] = info.toCharArray();  
        
        int len = str.length;   
        
        removeDuplicate(str, len);   
    }   
}  
    

