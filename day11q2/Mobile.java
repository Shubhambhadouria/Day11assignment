package day11q2;

import java.util.Scanner;

public class Mobile {

	String[] outdatedModels = {"note4","note5","note6","note7"};
	
	public void searchOutdatedModel(String input){
		
		for(int i=0; i<outdatedModels.length; i++)
		{
			if(outdatedModels[i]==input)
			{
				System.out.println(input+"_OUTDATED");
			}
		}
	}
	public static void main(String[] args) {
		
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter the Mobile Model");
		String input = sc.next();
		Mobile m1 = new Mobile();
		m1.searchOutdatedModel(input);
	}
	
}
