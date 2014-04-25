package practice;

import java.io.BufferedReader;
import java.io.File;
import java.io.FileNotFoundException;
import java.io.IOException;
import java.util.HashMap;
import java.util.Map;

public class WordFreqFile {

	
	public static Map<String,Integer> getFreq(File f){
		BufferedReader reader = null;
		String text=null;
		Map<String,Integer> freqMap = new HashMap<String,Integer>();
		try{
		while((text =reader.readLine())!=null){
			String[] words = text.split(" ");
			for (int i=0;i<words.length;i++){
				int freq=0;
		if(freqMap.containsKey(words[i])){
					freq = freqMap.get(words[i]);
		}
		freqMap.put(words[i],++freq);
		}
		}	
		

		}catch(FileNotFoundException e){
			e.printStackTrace();
		}
		catch(IOException e){
			e.printStackTrace();
		}finally{
			try{
			if(reader !=null){
			reader.close();
		}
		}catch (IOException e){
		  e.printStackTrace();	
		}
		}
		return freqMap;
		}
		public static void main(String args[]){

		File f = new File("C:\\Akshay\\workspace3\\java\\excercise\\src\\practice\\file.txt");
		WordFreqFile wff = new WordFreqFile();
		Map<String,Integer> freqMap = wff.getFreq(f);
		for(Map.Entry<String,Integer> entry: freqMap.entrySet()){
			System.out.println(entry.getKey() +" = "+ entry.getValue());
		}


		}

	
}
