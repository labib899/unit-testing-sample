package math;

import java.util.ArrayList;
import java.util.List;

import io.FileIO;

public class ArrayOperations 
{
	public int[] findPrimesInFile(FileIO fileio, String filepath, MyMath myMath) 
	{
		int[] arrayOfNumbers = fileio.readFile(filepath);
		List<Integer> arrayOfPrimeNumbers = new ArrayList<>();
		for (int i = 0; i < arrayOfNumbers.length; i++) 
		{
			if (myMath.isPrime(arrayOfNumbers[i])) arrayOfPrimeNumbers.add(arrayOfNumbers[i]);
		}
		return arrayOfPrimeNumbers.stream().mapToInt(i -> i).toArray();
	}
}