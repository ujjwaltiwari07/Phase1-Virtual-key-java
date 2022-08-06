package aVir;

import java.util.Scanner;
public class Main {
	 public static void main(String[] args) {

		 	System.out.println("================================================================"); 
	        System.out.println("Welcome Virtual Key");
	        System.out.println("================================================================"); 
	        System.out.println("Developer Ujjwal Kr' Tiwari");
	        System.out.println("================================================================"); 
	        
	 Scanner sc=new Scanner(System.in);
	        code.mainMenu();
	        while(true) {            
	                try {	        	
	              int option=sc.nextInt();
	              switch(option) {
	                case 1 :
	                    System.out.println("|---      files in ascending        ---|");
	                    code.listingFile();
	                    break;
	                    
	                case 2 :
	                	code.fileMenuOperations();
	                	break;
	                    
	                case 3 :
	                   System.out.println("|---       Application closed        ---|");

	                   System.exit(option);
	                    break;
	                default:
	                    System.out.println(" Enter valid number ");
	                    break;

	            }
	        }catch(Exception e){
	          System.out.println(" Enter valid number ");
	          main(args);
	        }
	                
	        }
	 }
}