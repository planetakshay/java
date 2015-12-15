package datastructures;

import java.util.Stack;

//Testing Commit
//Given a string find out if the number of parenthesis are balanced in it or not.
// Meaning if string has { in it then the next parenthesis can be } or another { 

public class BalancedParenthesis {
	Stack<Character> stack ;
	
	public boolean isStringParanthesisBalanced(String s){
		stack = new Stack<Character>();
		for(int i=0;i<s.length();i++){
			char c = s.charAt(i);
			 
			switch(c){
			
			    case '{':  // if we find opening bracket, push it to the stack
			    case '<':
			    case '(':
			    		stack.push(c);
						break;
						
				case  '}':
					if(stack.isEmpty()) return false;//you have found a closing bracket before finding a corresponding opening bracket.
					if(!stack.isEmpty()){ // if we find closing bracket and if stack is not empty pop the character and if its 
						//not the corresponding opening bracket, return as not balanced
						if(stack.pop()!='{')return false;
						break;
					}
			    case  '>':
			    	if(stack.isEmpty()) return false;
					if(!stack.isEmpty()){
						if(stack.pop()!='<')return false;
					break;
					}
			    case ')':
			    	if(stack.isEmpty()) return false;
					if(!stack.isEmpty()){
						if(stack.pop()!='(')return false;
					break;
					}
			}
		}
		
		return stack.isEmpty()?true:false;
	}
	
	public static void main(String args[]){
		BalancedParenthesis bp = new BalancedParenthesis();
		System.out.println(bp.isStringParanthesisBalanced("{df}g"));
		System.out.println(bp.isStringParanthesisBalanced("f{ds{d 123}ghgh"));
		System.out.println(bp.isStringParanthesisBalanced("f(d){{a} s}<>"));
		System.out.println(bp.isStringParanthesisBalanced("}fdsf{}"));
		System.out.println(bp.isStringParanthesisBalanced("<<<< {{ }fdfsdf}dfsdfa>fdaff>dsfadsf>dfsdf>"));

	}
	
}
