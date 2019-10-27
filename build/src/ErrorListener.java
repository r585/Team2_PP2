/** This class will extend the BaseErrorListener class from ANTLR, which will tell that parser what types of errors to catch.
* @author Ryan Meyer
* @author Caleb Proffitt
* @author Elena Milan Lopez
* @version 1.0
* Programming Project Two
* CS322 - Compiler Construction
* Fall 2019
**/

import org.antlr.v4.runtime.*;
//import org.antlr.v4.runtime.misc.Nullable;

import java.util.*;

public class ErrorListener extends BaseErrorListener{

	public void syntaxError(Recognizer<?, ?> recognizer, Object offendingSymbol, int line, int charPositionInLine, String msg, RecognitionException e){

		List<String> stack = ((Parser) recognizer).getRuleInvocationStack();
		Collections.reverse(stack);
		System.err.println("rule stack "+stack);
		System.err.println("line "+line+":"+charPositionInLine+" at" + offendingSymbol + ": "+msg);
		System.err.println(msg);
		System.err.println("An error occurred during the compilation process. Please review your code.");
		System.exit(1);
	}


}
