package algo;

import java.util.ArrayList;

public class sortTypes extends algorithms {
	private int howMany;
	//private ArrayList<Integer> temp;
	
	sortTypes(int amount)
	{
		howMany = amount;
	}
	
	public static ArrayList<Integer> iterativeBubbleSort(ArrayList<Integer> temp,int howMany)
	{
		for (int i = 0; i < howMany - 1; i++)
		{
			for (int j = 0; j < howMany - 1 - i; j++)//the minus i because we know the last place where the list is properly ordered
			{
				if (temp.get(j) > temp.get(j+1))
				{
					int between = temp.get(j);
					temp.set(j,temp.get(j+1));
					temp.set(j+1, between);
				}
			}
		}
		return temp;
	}
	
	public static ArrayList<Integer> recursiveBubbleSort(ArrayList<Integer> temp, int howMany)
	{
		if (howMany == 1)
			return temp;
		for (int i = 0; i < howMany - 1; i++)
		{
			if(temp.get(i) > temp.get(i+1)) {
				int between = temp.get(i);
				temp.set(i, temp.get(i+1));
				temp.set(i+1, between);
			}
		}
		return recursiveBubbleSort(temp, howMany-1);
	}
	
}
