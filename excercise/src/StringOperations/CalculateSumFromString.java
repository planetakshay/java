package StringOperations;


/**
* input could be
* input - "-2+3+5-3" output=3
* input "3+5+3-2-2" output= 7
* @author
*
*/
public class CalculateSumFromString {
	
	
	public static boolean isOperator(char c){
        if(c=='+' || c=='-' ){
            return true;
        }
        return false;
    }

    public static Integer calculateAddition(String s){
        int result = 0;
        char lastOperator=' ';
        for(int i=0;i<s.length();i++){
            char c = s.charAt(i);
            if(isOperator(c)){
                    lastOperator=c;
                    continue;
                }
            if(!isOperator(c)){
                
                    switch(lastOperator){
                    case '+':
                        result = result + Integer.parseInt(c+"");
                        break;
                    case '-':
                        result = result - Integer.parseInt(c+"");
                        break;
                    case ' ':
                        result = Integer.parseInt(c+"");
                        break;
                    default:
                        break;
                    
                }
            }
        
        }
        return  result;
    }
    
    public static void main(String args[]){
        String[ ] input = new String[]{"3+3","4-2+5","-3-3+3","3+5"};
        for(String s: input){
            System.out.print("string="+s);
            System.out.print(" Answer is= "+calculateAddition(s)+"\n");
        }
        
    }

}
