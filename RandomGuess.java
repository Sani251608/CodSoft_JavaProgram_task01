package com.codsoft.numbergame;
import java.util.random.*;
import java.util.*;

public class RandomGuess {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Scanner sc=new Scanner(System.in);
		Random rand=new Random();
		int numGuess=rand.nextInt(100)+1;
		int attempts=10;
		boolean guessed=false;
		System.out.println("hi, lets play a number game.");
		System.out.println("you have "+attempts+" guesses.");
		for(int i=1;i<=attempts;i++) {
			System.out.println("Enter a number:");
			int num=sc.nextInt();
			if(num==numGuess) {
				System.out.println("You have guessed the correct number!!");
				guessed=true;
				break;
			}else if(num>numGuess){
				System.out.println("number guessed is too high,try again.");	
			}else {
				System.out.println("number is too low ,try again.");
			}
		}
		if(!guessed) {
			System.out.println("you have ran out of the attempts.");
		}

	}

}
