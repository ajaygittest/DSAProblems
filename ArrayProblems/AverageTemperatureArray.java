package Sample;

import java.util.Scanner;

public class AverageTemperatureArray {
	
	public static void main(String args[]) {
		Scanner console = new Scanner(System.in);
		System.out.println("How many day's temperature ?");
		int numDays=console.nextInt();
		int[] temps= new int[numDays];
		int sum=0;
		for(int i=0; i<numDays; i++) {
			System.out.println("Day "+(i+1)+"'s high temp: ");
			temps[i]=console.nextInt();
			sum+=temps[i];
		}
		
		double average =sum/numDays;
		int above=0;
		
		for(int i=0; i<temps.length;i++) {
			if(temps[i]>average) {
				above++;
			}
		}
		
		System.out.println();
		System.out.println("Average temp = "+average);
		System.out.println(above+"day's above");
	}

}
