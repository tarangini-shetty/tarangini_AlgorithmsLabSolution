package com.greatlearning.problem2.driver;

import java.util.Arrays;
import java.util.Collections;
import java.util.Scanner;

import com.greatlearning.problem2.Payment.Payment;

public class DriverClass {

	public static void main(String[] args) {
		Scanner input = new Scanner(System.in);
		
		System.out.println("Enter the size of currency denominations :\n");
		int sizeOfDenominations = input.nextInt();
		
		System.out.println("Enter the currency denominations value:\n");
		int[] currencyDenominationsArray = new int[sizeOfDenominations];
		for (int i=0; i < sizeOfDenominations; i++)
		{
			currencyDenominationsArray[i] = input.nextInt();
		}
		
		System.out.println("Enter the amount you want to pay:\n");
		int amount = input.nextInt();
		
		Arrays.sort(currencyDenominationsArray);
		
		Payment p = new Payment();
		int[] notesCount = new int[currencyDenominationsArray.length];
		int remaining = p.calculatePaymentNotes(currencyDenominationsArray, notesCount, amount);
		if (remaining > 0)
		{
			System.out.println("With the amount and denominations, its NOT possible to calculate the notes ");
		}
		else
		{
			System.out.println("Your payment approach in order to give min no of notes will be");
			for (int i=notesCount.length - 1 ; i >=0 ; i--)
			{
				if (notesCount[i] != 0)
				{
					System.out.println(currencyDenominationsArray[i]+":"+notesCount[i]);

				}
			}
		}

	}

}
