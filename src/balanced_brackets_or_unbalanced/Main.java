package balanced_brackets_or_unbalanced;

import java.util.Scanner;
import java.util.Stack;

public class Main {
	public static void main(String[] args) {
		Scanner sc = new Scanner(System.in);
		System.out.println("Enter String");
		String input = sc.next();
		if(checkExpression(input)) {
			System.out.println("The entered String has balanced Brackets");
		}
		else {
			System.out.println("The entered String do not conatain balanced Brackets ");
		}
		
		
	}

	private static boolean checkExpression(String input) {
		Stack<Character> stack=new Stack<>();
		for(char k:input.toCharArray()) {
			if(k=='{'||k=='['||k=='(') 
			{
				stack.push(k);
				continue;	
			}
			
			if(stack.isEmpty())
				return false;
			
			char z;
			switch(k)
			{
			case '}':
						z=stack.pop();
						if(z=='[' || z=='(')
							return false;
						break;
						
			case ']':
						z=stack.pop();
						if(z=='{' || z=='(')
							return false;
						break;
				
			case ')':
						z=stack.pop();
						if(z=='[' || z=='{')
							return false;
						break;	
						
			}
		}
		
		return(stack.isEmpty());
		
	}

}
