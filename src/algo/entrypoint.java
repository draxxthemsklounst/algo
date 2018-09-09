package algo;


import java.util.ArrayList;
import java.util.Scanner;

public class entrypoint {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		//GUI frame = new GUI();
		//frame.setDefaultCloseOperation(GUI.EXIT_ON_CLOSE);
		//frame.setVisible(true);
		//frame.setSize(500,500);
		//entrypoint selfInstance = new entryPoint();
		entrypoint.algoMenuWrapper();
		
	}
	
	private static void algoMenuWrapper() {
		boolean keepGoing = true;
		Scanner cin = new Scanner(System.in);
		while(keepGoing) {
			
			System.out.println("(1) Search an array\n"+
					           "(2) Sort an array\n"+
							   "(3) Use the Hash Table\n"+
					           "(4) Nth Fibonacci Function");
			
			int Which = cin.nextInt();
			
			
			if(Which == 1)
				algorithms.searchMenu();
			else if(Which == 2)
				algorithms.sortMenu();
			else if(Which == 3)
				algorithms.hashMenu();
			else if(Which == 4)
				algorithms.fibMenu();
			
			System.out.println("Do you want to perform another operation? (true)Yes or (false)No?");
			try {
				keepGoing = cin.nextBoolean();
			} catch(Exception e) {
				System.out.println("Error occured. Exiting program.");
				keepGoing = false;
			}
		
		}
		cin.close();
	}
}
