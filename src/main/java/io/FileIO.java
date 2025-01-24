package io;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileReader;
import java.io.IOException;
import java.util.ArrayList;
import java.util.List;

public class FileIO 
{
	public int[] readFile(String filepath) 
	{
		File file = new File(filepath);
		if (!file.exists()) 
			throw new IllegalArgumentException("Input file does not exist");
		
		List<Integer> numbersList = new ArrayList<>();
		BufferedReader reader;
		try 
		{
			reader = new BufferedReader(new FileReader(file));
			String line = null;
			while ((line = reader.readLine()) != null) 
			{
				try 
				{
					int number = Integer.parseInt(line);
					numbersList.add(number);
				} 
				catch (NumberFormatException e) 
				{
					// Do nothing will skip the the current invalid line
				}
			}
		} 
		catch (IOException e) 
		{
			e.printStackTrace();
		}
		
		if (numbersList.size() == 0) 
			throw new IllegalArgumentException("Given file is empty");
		// Convert a List to an array using 
		return numbersList.stream().mapToInt(i -> i).toArray();
	}

}