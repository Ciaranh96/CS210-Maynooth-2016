//Find the number that occurs the most in a list of numbers

import java.util.Scanner;
import java.util.Arrays;

public class Lab3_FindMode{
	public static void main(String args[]){
		Scanner sc = new Scanner(System.in);

		int size = sc.nextInt();
		int arr[] = new int[size];

		for(int i = 0; i < size; i++)
			arr[i] = sc.nextInt();

		Arrays.sort(arr); //Sort the array so that all the elements that are the same will be next to each other

		int count = 0, record = 0, recordnumber = 0;

		for(int i = 0; i < size-1; i++){ //Because the array is sorted you only have to iterate through it once
			if(arr[i] == arr[i+1]){
				count++; //Count how many times a number occurs
				if(count > record){
					record = count; //Update the number that's occured the most as you go
					recordnumber = arr[i];
				}
			}
			else
				count = 0; //Reset the counter each time you come accross a new number
		}
		if(record == 1)
			System.out.println("All the numbers occur only once");
		else
			System.out.println(recordnumber);
	}
}