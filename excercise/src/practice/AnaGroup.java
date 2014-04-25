package practice;

import java.util.Arrays;
import java.util.HashMap;
import java.util.Map;

public class AnaGroup{

public static void main (String args[]){
String[] list = new String[]{"i love java","ADD" , "DAD" , "TOY", "ABC" , "ACB", "BAC" , "XYZ", "XYY" , "YYX" };
Map<String,String> anaMap = new HashMap<String,String>();

for(int i=0;i<list.length;i++){
String str = list[i];
String value ="";
char [] c = new char[list[i].length()]; 
c = list[i].toCharArray();
Arrays.sort(c);
String key = String.valueOf(c);
if(anaMap.containsKey(key)){
	value = anaMap.get(key);
	value = value+" , "+ list[i];
	anaMap.put(key,value);
}
else{
	value = key;
	anaMap.put(key,value);
}
 }
 for(Map.Entry<String,String> entry: anaMap.entrySet()){
	 	System.out.println( entry.getValue());
}	

}	
}

