package StringOperations;

import java.util.ArrayList;
import java.util.HashMap;
import java.util.Map;
import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.IOException;
//import java.nio.file.Files;
//import java.nio.file.Path;
//import java.nio.file.Paths;

import javax.swing.text.html.HTMLDocument.Iterator;

import com.sun.xml.internal.bind.v2.schemagen.xmlschema.List;

/**
 * Given a text file with several lines find out word frequency.
 * also print the word and their frequency.
 * @author Akshay
 *
 */
public class WordFrequencyInAFile {		

		public HashMap<String,Integer> findUniqueWordsAndFrequency(File  file){
			HashMap<String,Integer> freqMap = new HashMap<String,Integer>();
			BufferedReader reader = null;
			
			try {
			    reader = new BufferedReader(new FileReader(file));
			    String text = null;

			    while ((text = reader.readLine()) != null) {
			    	String str = text;
				   	String[] words = str.split(" ");
					for(int i=0; i< words.length;i++){
						int freq=0;
						if(freqMap.containsKey(words[i])){
							freq = freqMap.get(words[i]);
						}
						freqMap.put(words[i], ++freq);
					}	
			    }
			} catch (FileNotFoundException e) {
			    e.printStackTrace();
			} catch (IOException e) {
			    e.printStackTrace();
			} finally {
			    try {
			        if (reader != null) {
			            reader.close();
			        }
			    } catch (IOException e) {
			    }
			}	
		return freqMap;	
			}

		public static void main(String args[]){

		WordFrequencyInAFile horton = new WordFrequencyInAFile();
		File f = new File("C:\\Akshay\\workspace3\\java\\excercise\\src\\StringOperations\\file.txt");

		HashMap<String,Integer> myFreqMap = horton.findUniqueWordsAndFrequency(f);
			for (Map.Entry<String, Integer> entry : myFreqMap.entrySet()) {
			    String word = entry.getKey();
			    Integer i = entry.getValue();
			    System.out.println(word+"="+i);
			}
				
		}
		
		}
		
		





