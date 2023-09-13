package org.howard.edu.lsp.assignment2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordCounting {

	public static void main(String[] args) {
		String folderPath = "C:\\Users\\drtun\\git\\LSP_GIT_YT_FALL2023\\LSP_Assignment_Fall_2023\\src\\main\\java\\resources\\";
		String fileName = "words.txt";
		 Map<String,Integer> wordCounts = new HashMap<>();
		
		String filePath = folderPath+fileName;
		try (FileReader fileReader = new FileReader(filePath);
	             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
			
			String line;
            while ((line = bufferedReader.readLine()) != null) {
            	line = line.toLowerCase();
            	wordCounts.put(line, wordCounts.getOrDefault(line, 0) + 1);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
		
		for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
		    System.out.println(entry.getKey() + ": " + entry.getValue());
		}
			
			
		
		

	}

}
