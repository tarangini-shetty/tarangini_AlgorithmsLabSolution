package com.greatlearning.problem1.transaction;

public class Transaction {
	
	public int calculateTransactions(int[] transactionArray, int target)
	{
		int total = 0;
		int numberOfTransactions = 0;
		for ( int i=0; i < transactionArray.length; i++)
		{
			numberOfTransactions = numberOfTransactions + 1;
			total = total + transactionArray[i];
			if (total >= target)
			{
				return numberOfTransactions;
			}
			
		}
		return 0;
			
	}

}
