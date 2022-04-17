package com.greatlearning.problem2.Payment;
import java.util.Arrays;

public class Payment {
	
	public int calculatePaymentNotes(int[] currencyDenominationsArray,int [] notesCount, int amount)
	{
		
		int remaining = amount ;
		for (int i=currencyDenominationsArray.length - 1 ; i >=0 ; i--)
		{
			notesCount[i] = remaining / currencyDenominationsArray[i];
			remaining = remaining - notesCount[i] * currencyDenominationsArray[i];
			if (remaining == 0)
			{
				return remaining;
			}
			
		}
		return remaining;
		
		
	}

}
