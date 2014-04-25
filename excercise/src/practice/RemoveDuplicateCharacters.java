package practice;

public class RemoveDuplicateCharacters {
	
	public static String removeDup(String s){
		
		StringBuilder sb = new StringBuilder();
		int tail=0;
		for(int i=0;i<s.length();i++){
			char c = s.charAt(i);
			boolean found = false;
			for(int j=0;j<tail;j++){
				char ch = s.charAt(j);
				if(ch==c){
					found=true;
					break;
				}
			}
			if(!found){
				sb.append(c);
			}
			tail++;
		}
		return sb.toString();
	}
	
	public static void main(String args[]){
		
		System.out.println(removeDup("ASADABHCBZ"));
		
	}

}
