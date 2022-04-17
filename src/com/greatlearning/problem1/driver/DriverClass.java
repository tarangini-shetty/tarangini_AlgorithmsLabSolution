package com.greatlearning.problem1.driver;
import java.util.Scanner;
import com.greatlearning.problem1.transaction.Transaction;

public class DriverClass {

	public static void main(String[] args) {
		
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the size of transaction array:\n");
		int sizeOfArray = input.nextInt();
		
		System.out.println("Enter the values of array\n");
		int[] transactionArray = new int[sizeOfArray];
		for (int i=0; i < sizeOfArray; i++)
		{
			transactionArray[i] = input.nextInt();
		}
		
		System.out.println("Enter the total no of targets that needs to be achieved:\n");
		int totalTargets = input.nextInt();
		
		for (int j=0; j < totalTargets; j++)
		{
			System.out.println("Enter the value of target:\n");
			int target = input.nextInt();
			
			Transaction t = new Transaction();
			int numberOfTransactions = t.calculateTransactions(transactionArray, target);
			if (numberOfTransactions != 0)
			{
				System.out.println("Target achieved after " + numberOfTransactions + " transactions\n");
			}
			else
			{
				System.out.println("Given target is not achieved\n");
			}
		}
		

	}

}
