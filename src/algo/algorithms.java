package algo;

import java.util.ArrayList;
import java.util.Random;
import java.util.Scanner;

public class algorithms {
	public static void DisplayIntArray(ArrayList<Integer> array,int howMany)
	{
		for (int i = 0; i < howMany; i++)
		{
			if (i % 10 == 0)
				System.out.println();
			System.out.printf("%d \t",array.get(i));
		}
		System.out.println();
	}
	
	public static void searchMenu()
	{
		System.out.println("Enter the size of the array.");
	}
	
	public static void sortMenu()
	{
		int Which, howMany;
		
		System.out.println("How many elements? ");
		
		Scanner cin = new Scanner(System.in);
		howMany = cin.nextInt(); //enter size of array
		
		
		System.out.println("Creating random array...");
		
		ArrayList<Integer> randList = new ArrayList<Integer>(howMany);
		randList = algorithms.randIntListGen(howMany); //create random array with given size (within 1 to 100)
		
		System.out.println("Which type of sort algorithm would you like to use?");
		System.out.println("(1) - Iterative Bubble Sort ");
		System.out.println("(2) - Recursive Bubble Sort ");
		System.out.println("(3) - Selection Sort ");
		System.out.println("(4) - Iterative Insertion Sort ");
		System.out.println("(5) - Recursive Insertion Sort ");
		System.out.println("(6) - Merge Sort");
		
		
		Which = cin.nextInt();
		
		
		if(Which == 1)
		{
			System.out.println("Sorting... ");
			ArrayList<Integer> temp = sortTypes.iterativeBubbleSort(randList,howMany);
			algorithms.DisplayIntArray(temp, howMany);
		}
		else if(Which == 2)
		{
			System.out.println("Sorting... ");
			ArrayList<Integer> temp = sortTypes.recursiveBubbleSort(randList,howMany);
			algorithms.DisplayIntArray(temp, howMany);
		}
		
		cin.close();
	}
	
	public static void hashMenu() {
		
	}
	public static void fibMenu() {
		
	}
	public static ArrayList<Integer> randIntListGen(int n)
	{
		Random randInst = new Random();
		ArrayList<Integer> temp = new ArrayList<Integer>(n);
		for(int i = 0; i < n; i++)
			temp.add(randInst.nextInt(100));
		return temp;
	}
	
}
