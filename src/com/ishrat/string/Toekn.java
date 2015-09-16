package com.ishrat.string;

import java.util.Scanner;

import com.cd.Parser;

public class Toekn {
	
	public static void main(String []argh)
	{
		 Scanner scan = new Scanner(System.in);
         String s=scan.nextLine().trim();
         
         if(s.length()>400000)
        	 return;
        
         if(s.length()==0){
        	 System.out.println(0);
        	 return;
         }
        	 
           String[] chars = s.split("[ !,?.\\_'@]+");
           System.out.println(chars.length);
           for(String ss : chars){
               System.out.println(ss);
           }
		
	}
}
