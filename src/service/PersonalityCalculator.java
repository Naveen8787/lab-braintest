package service;
import java.util.*;
//Create a class called PersonalityCalculator
public class PersonalityCalculator {

	// integer findAnswers(String options)
			// findAnswer() accepts String as an argument and returns integer array as an output
			 public int findAnswers(String options) {
				  String c[]=options.split(",");//split the options and store in an separate string array
					 int n=c.length;
					int a[]=new int[n];	
					for(int i=0;i<n;i++){
						a[i]=Integer.parseInt(c[i]);
						// Convert the string array into an integer array.
						//Change the type as integers - and store it in an integer array
						return a[i];//Return integer array					  	
					}
						 int x=a[0]+a[1]+a[2]+a[4]+a[7]+a[9]+a[10]+a[11]+a[13]+a[17]+a[19];
						 System.out.println(x);
						 int y=a[3]+a[5]+a[6]+a[12]+a[14]+a[15]+a[16]+a[18];
						 System.out.println(y);
						 int Z=66-x+y;
						 return Z;//return an integer which helps to find which type of brain your having
					}
					 
				 
	 
	// PersonalityCalculator has two methods findAnswers and findYourBrainType	
	// String findYourBrainType(String options) is the method prototype
	// findYourBrainType accepts String as an argument and returns String as an output
		 public String findYourBrainType(String options) {
			
			 int Z=findAnswers(options);// option is a string which contains all the options selected as a string
			        
			 if((Z>=2)&&(Z<=55)) {
				 return "Left-Brained";
			 }
			 else if((Z>=56)&&(Z<=64)) {
				 return "No clear preference ";
			 }
			 else if((Z>=65)&&(Z<=100)) {
			    return "Right-brained";
			 }
			 else 
				 return "something went wrong";
			
		 }
		 }
		

 






