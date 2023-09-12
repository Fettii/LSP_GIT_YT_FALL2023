package org.howard.edu.lsp.assignment2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;

public class WordCounting {

	public static void main(String[] args) {
		String folderPath = "Users/drtun/git/LSP_GIT_YT_FALL2023/LSP_Assignment_Fall_2023/src/main/java/resources/";
		String fileName = "words.txt";
		
		String filePath = folderPath+fileName;
		try (FileReader fileReader = new FileReader(filePath);
	             BufferedReader bufferedReader = new BufferedReader(fileReader)) {
			
			String line;
            while ((line = bufferedReader.readLine()) != null) {
                // Process each line here (e.g., print it)
                System.out.println(line);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
			
			
		
		

	}

}
