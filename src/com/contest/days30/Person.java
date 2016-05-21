package com.contest.days30;

import java.util.Scanner;

public class Person {
    private int age;	
  
	public Person(int initialAge) {
  		// Add some more code to run some checks on initialAge
        if(age>=0){
           this.age=initialAge; 
        }else{
            age=0;
            System.out.println("Age is not valid. setting age to 0.");
        }
        
	}

	public void amIOld() {
  		// Write code determining if this person's age is old and print the correct statement:
        if(age<13){
            System.out.println("You are young.");
        } 
        if(age>=13 && age<18){
            System.out.println("You are a teenager");
        }else{
            System.out.println("You are old.");
        }
        //System.out.println(/*Insert correct print statement here*/);
	}

	public void yearPasses() {
  		// Increment this person's age.
        age++;
	}







	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		int T = sc.nextInt();
		for (int i = 0; i < T; i++) {
			int age = sc.nextInt();
			Person p = new Person(age);
			p.amIOld();
			for (int j = 0; j < 3; j++) {
				p.yearPasses();
			}
			p.amIOld();
			System.out.println();
        }
		sc.close();
    }
}
