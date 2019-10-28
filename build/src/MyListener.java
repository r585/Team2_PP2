/* This class is used to implement each part of our grammar file with the language KnightCode for it to communicate with the compiler.
* @author Ryan Meyer
* @author Elena Milan Lopez
* @author Caleb Proffitt
* @version 1.0
* Programming Project Two
* CS322 - Compiler Construction
* Fall 2019
**/

import org.antlr.v4.runtime.ParserRuleContext;
import org.antlr.v4.runtime.tree.ErrorNode;
import org.antlr.v4.runtime.tree.TerminalNode;
import java.util.HashMap;
import java.util.Scanner;

/**
 * This class provides an extension  of {@link KnightCodeListener},
 * which is extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class MyListener extends KnightCodeBaseListener {

	//This is a hashmap that will store the variables of the symbol table.
	
	HashMap<String, Integer> variableMap = new HashMap();
	
	/**
	 *This method is called when the parser is going to parse the type with an ID. 
	 *
	 */
 
        @Override public void enterVariable(KnightCodeParser.VariableContext ctx) {

		String type = ctx.type().getText(); //Gets variable type and context, which is placed in the String 
                 if(!variableMap.containsKey(type)) { //If the String is not in the hashmap, it will be added to the Hashmap
                        variableMap.put(type,variableMap.size());
                 }
                 else {
                         if(variableMap.containsKey(type)) { //If the String is in the Hashmap, it is not added
                                 variableMap.put(type,-1);
                         }
                 }
 	}//enterVariable

	/**
	 *This method is called when the parser has finished parsing the setvar statement. This will give a value to each variable instantiated. 
	 *
	 */
	
        @Override public void exitSetvar(KnightCodeParser.SetvarContext ctx) {

		 String type = ctx.STRING().getText(); //Gets variable type and context, which is placed in the String and later used as a String
                 String num = ctx.expr(1).getText(); //Gets variable type and context, which is placed into String that will be later converted to an integer

                 if(!variableMap.containsKey(type)) { //If the String(type) is not in the Hashmap, it will be added to the Hashmap
                        variableMap.put(type,variableMap.size());
                 }
                 else {
                         if(variableMap.containsKey(type)) { //If the String(type) is in the Hashmap, it is not added
                                 variableMap.put(type,-1);
                         }
                 }
                if(!variableMap.containsKey(num)) { //If the String(num) is not in the Hashmap, it will be added to the Hashmap
                        variableMap.put(num,variableMap.size());
                 }
                 else {
                         if(variableMap.containsKey(num)) { //If the String(num) is in the Hashmap, it is not added
                                 variableMap.put(type,-1);
                         }
                 }
 	}//exitSetvar

	/**
	 *This method is called when the parser has finished parsing the print statement that will print this message to the screen. 
	 *
	 */
	
        @Override public void exitPrint(KnightCodeParser.PrintContext ctx) { 

		if(ctx.STRING() != null){ //If the value is a String and not empty, it will be printed
      			System.out.println(ctx.STRING().getText());
   		}

		else if(ctx.ID() != null){ //Else if the value is an ID and not empty, it will be retrieved from the HashMap and printed
     			 System.out.println(this.variableMap.get(ctx.ID().getText()));
   		}

	}//exitPrint

	/**
	*This method is called when the program requires input from the user. The user is then prompted to enter a given value.
	*/

        @Override public void enterRead(KnightCodeParser.ReadContext ctx) {
		
		String type  = ctx.ID().getText(); //Gets variable type and context, which is placed in the String 

		Scanner reader = new Scanner(System.in); //Scanner that is used to receive input from user
		type  = reader.nextLine(); //Reads what the user inputs
		if(!variableMap.containsKey(type)) { //If the String is not in the Hashmap, it will be added to the Hashmap
                        variableMap.put(type,variableMap.size());
                 }
                 else {
                         if(variableMap.containsKey(type)) { //If the String is in the Hashmap, it is not added
                                 variableMap.put(type,-1);
                         }
                 }
 	}//enterRead

	/**
	*This method is called when the program needs to perform an 'IF' statement. 
	*/

        @Override public void enterDecision(KnightCodeParser.DecisionContext ctx) {

		String exp = ctx.expr(0).getText(); //Gets variable type and context from the first expression value (expr(0)), then places this in the String
		int value = Integer.parseInt(exp); //Converts String to Int for comparison
		String dec = ctx.expr(1).getText(); //Gets variable type and context from the second expression value (expr(1), then places this in the String
		int value2 = Integer.parseInt(dec); //Converts String to Int for comparison
		String cond = ctx.comp().getText(); //Gets variable type and context for the condition to be stored in the String
		String operation = "cond"; //Places the operation symbol into this String from cond, to be used later in 'IF' statement
		
		if(operation.equals(">")) { //If the comparison symbol is greater then, then this code segment is performed
			if(value > value2 ) //If the value is true, then the variable type and context is received for result 
				ctx.stat(0).getText();
		}
		else if(operation.equals("<")){ //If the comparison symbol is less then, then this code segment is performed
			if(value < value2) ////If the value is true, then the variable type and context is received for result
				ctx.stat(0).getText();
		}
		else if(operation.equals("=")){ //If the comparison symbol is equals to then, then this code segment is performed
			if(value == value2) //If the value is true, then the variable type and context is received for result
				ctx.stat(0).getText();
		}else if(operation.equals("<>")){ //If the comparison symbol is not  equals to then, then this code segment is performed
			if(value != value2) //If the value is true, then the variable type and context is received for result
				ctx.stat(0).getText();
		}			
	}//enterDecision

	/**
	*This method is called when the program needs to perform a 'WHILE' Loop.
	*/

        @Override public void enterLoop(KnightCodeParser.LoopContext ctx) {

		String first = ctx.expr(0).getText(); //Gets variable type and context from the first expression value (expr(0)), then places this in the String
                int num1 = Integer.parseInt(first); //Converts String to Int for comparison
                String second  = ctx.expr(1).getText(); //Gets variable type and context from the second expression value (expr(1), then places this in the String
                int num2 = Integer.parseInt(second); //Converts String to Int for comparison
                String cond = ctx.comp().getText(); //Gets variable type and context for the condition to be stored in the String
                String operation = "cond"; //Places the operation symbol into this String from cond, to be used later in 'IF' statement
                
                if(operation.equals(">")) { //If the comparison symbol is greater then, then this code segment is performed
                        while(num1 > num2) //If the value is true, then the variable type and context is received for result upon Loop execution
                                ctx.stat(0).getText();
                }
                else if(operation.equals("<")){  //If the comparison symbol is less then, then this code segment is performed
                        while(num1 < num2) //If the value is true, then the variable type and context is received for result upon Loop execution
                                ctx.stat(0).getText();
                }
                else if(operation.equals("=")){ //If the comparison symbol is equals to then, then this code segment is performed
                        while(num1 < num2) //If the value is true, then the variable type and context is received for result upon Loop execution
                                ctx.stat(0).getText();
                }else if(operation.equals("<>")){  //If the comparison symbol is not  equals to then, then this code segment is performed
                        while(num1 < num2) //If the value is true, then the variable type and context is received for result upon Loop execution
                                ctx.stat(0).getText();
                }
 	}//enterLoop

	/**
	*This method is called when the parser uses a specific rule during execution and prints which rule this was.
	*/

	@Override public void enterEveryRule(ParserRuleContext ctx) {

		System.out.println("Rule Used: " + ctx.getText()); //Prints which rule was used during each part of execution of the KnightCode files
 	}//enterEntryRule
}
