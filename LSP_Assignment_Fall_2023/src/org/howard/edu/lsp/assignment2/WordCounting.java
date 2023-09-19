package org.howard.edu.lsp.assignment2;

import java.io.BufferedReader;
import java.io.FileReader;
import java.io.IOException;
import java.util.HashMap;
import java.util.HashSet;
import java.util.Map;

public class WordCounting {

    public static void main(String[] args) {
        String folderPath = "C:\\Users\\drtun\\git\\LSP_GIT_YT_FALL2023\\LSP_Assignment_Fall_2023\\src\\main\\java\\resources\\";
        String fileName = "words.txt";
        HashMap<String, Integer> wordCounts = new HashMap<>();
        String line;
        

        
        String filePath = folderPath + fileName;

        try (FileReader fileReader = new FileReader(filePath);
             BufferedReader bufferedReader = new BufferedReader(fileReader)) {

            
            while ((line = bufferedReader.readLine()) != null) {
                
                line = line.toLowerCase();
                String[] words = line.split(" ");
                
                for (String word : words) {
                	
                	if(!isNumeric(word) && isShort(word)) {
                    
	                    if (wordCounts.containsKey(word)) {
	                        int count = wordCounts.get(word);
	                        wordCounts.put(word, count + 1);
	                    } else {
	                        
	                        wordCounts.put(word, 1);
	                    }
                	}
                }
                
               
            }

            
        } catch (IOException e) {
            e.printStackTrace();
        }
        for (Map.Entry<String, Integer> entry : wordCounts.entrySet()) {
            String word = entry.getKey();
            int count = entry.getValue();
            System.out.println(word + ": " + count);
        }
    }
    
    private static boolean isNumeric(String str) {
        try {
            Integer.parseInt(str);
            return true;
        } catch (NumberFormatException e) {
            return false;
        }
        
    }
    private static boolean isShort(String str) {
    	if(str.length() <= 3) {
    		return false;
    	}
    	else {
    		return true;
    	}
    }
}
