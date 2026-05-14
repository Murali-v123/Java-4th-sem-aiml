package com.assignment;

import java.util.Scanner;

public class Assment {
	public static void main(String[] args) {
		
	}

}

//to count number of digits
class CountDigits {
    public static void main(String[] args) {
        int num = 12345; 
        int count = 0;

        while (num != 0) {
            num = num / 10; 
            count++;        
        }

        System.out.println("Number of digits: " + count);
    }
}

//palindrome number 
class Palindrome {
    public static void main(String[] args) {
        int num = 121;
        int original = num;
        int reversed = 0;

        while (num != 0) {
            int digit = num % 10;         
            reversed = reversed * 10 + digit; 
            num = num / 10;                
        }

        if (original == reversed) {
            System.out.println(original + " is a palindrome");
        } else {
            System.out.println(original + " is not a palindrome");
        }
    }
}

//prime number or not
class Prime{
	public static void main(String[] args) {
		Scanner obj=new Scanner(System.in);
		
		System.out.println("Enter a number: ");
		int num=obj.nextInt();
		int cnt=0;
		int i=1;
		while(i<=num) {
			if(num%i==0) {
				cnt++;
			}
			i++;
		}
		if(cnt==2) {
			System.out.println("it is a prime number");
		}
		else {
			System.out.println("It is not a prime number");
		}
	}
}
