/** This class will extend the BaseErrorListener class from ANTLR, which will catch if an error occurs during the compiler execution.
* @author Ryan Meyer
* @author Caleb Proffitt
* @author Elena Milan Lopez
* @version 1.0
* Programming Project Two
* CS322 - Compiler Construction
* Fall 2019
**/

import org.antlr.v4.runtime.*;

import java.util.*;

public class ErrorListener extends BaseErrorListener{

	public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e){
												
		List<String> stack = ((Parser) recognizer).getRuleInvocationStack();   //This stack is created to store the recognized rules onto the stack
		Collections.reverse(stack);
		System.err.println("rule stack "+stack); //If an error is found, this will print the rule from the stack where it is found
		System.err.println("line "+line+":"+charPositionInLine+" at" + offendingSymbol + ": "+msg); //If an error is found, this will print the line and char position
		System.err.println(msg);
		System.err.println("An error occurred during the compilation process. Please review your code."); //This generic message will print if an error has occurred 
		System.exit(1);
	}


}
