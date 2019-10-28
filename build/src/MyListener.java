/* This class is used to search for specific errors within each function of our grammar.
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
 * This class provides an empty implementation of {@link KnightCodeListener},
 * which can be extended to create a listener which only needs to handle a subset
 * of the available methods.
 */
public class MyListener extends KnightCodeBaseListener {

	HashMap<String, Integer> variableMap = new HashMap();
 
        @Override public void enterVariable(KnightCodeParser.VariableContext ctx) {

		String type = ctx.type().getText();
                 if(!variableMap.containsKey(type)) {
                        variableMap.put(type,variableMap.size());
                 }
                 else {
                         if(variableMap.containsKey(type)) {
                                 variableMap.put(type,-1);
                         }
                 }
 	}

        @Override public void exitSetvar(KnightCodeParser.SetvarContext ctx) {

		 String type = ctx.STRING().getText();
                 String num = ctx.expr(1).getText();
                 int var = Integer.parseInt(num);
                 if(!variableMap.containsKey(type)) {
                        variableMap.put(type,variableMap.size());
                 }
                 else {
                         if(variableMap.containsKey(type)) {
                                 variableMap.put(type,-1);
                         }
                 }
                if(!variableMap.containsKey(num)) {
                        variableMap.put(num,variableMap.size());
                 }
                 else {
                         if(variableMap.containsKey(num)) {
                                 variableMap.put(type,-1);
                         }
                 }
 	}

        @Override public void exitPrint(KnightCodeParser.PrintContext ctx) { 

		if(ctx.STRING() != null){
      			System.out.println(ctx.STRING().getText());
   		}

		else if(ctx.ID() != null){
     			 System.out.println(this.variableMap.get(ctx.ID().getText()));
   		}

	}//exitPrint

        @Override public void enterRead(KnightCodeParser.ReadContext ctx) {
		
		String type  = ctx.ID().getText();

		Scanner reader = new Scanner(System.in);
		type  = reader.nextLine();
		if(!variableMap.containsKey(type)) {
                        variableMap.put(type,variableMap.size());
                 }
                 else {
                         if(variableMap.containsKey(type)) {
                                 variableMap.put(type,-1);
                         }
                 }
 	}

        @Override public void enterDecision(KnightCodeParser.DecisionContext ctx) {

		String exp = ctx.expr(0).getText();
		int value = Integer.parseInt(exp);
		String dec = ctx.expr(1).getText();
		int value2 = Integer.parseInt(dec);
		String cond = ctx.comp().getText();
		String operation = "cond";
		
		if(operation.equals(">")) {
			if(value > value2 )
				ctx.stat(0).getText();
		}
		else if(operation.equals("<")){
			if(value < value2)
				ctx.stat(0).getText();
		}
		else if(operation.equals("=")){ 
			if(value == value2) 
				ctx.stat(0).getText();
		}else if(operation.equals("<>")){
			if(value != value2) 
				ctx.stat(0).getText();
		}			
	}

        @Override public void enterLoop(KnightCodeParser.LoopContext ctx) {

		String first = ctx.expr(0).getText();
                int num1 = Integer.parseInt(first);
                String second  = ctx.expr(1).getText();
                int num2 = Integer.parseInt(second);
                String cond = ctx.comp().getText();
                String operation = "cond";
                
                if(operation.equals(">")) {
                        while(num1 > num2) 
                                ctx.stat(0).getText();
                }
                else if(operation.equals("<")){
                        while(num1 < num2)
                                ctx.stat(0).getText();
                }
                else if(operation.equals("=")){ 
                        while(num1 < num2) 
                                ctx.stat(0).getText();
                }else if(operation.equals("<>")){
                        while(num1 < num2) 
                                ctx.stat(0).getText();
                }
 	}

	@Override public void enterEveryRule(ParserRuleContext ctx) {

		System.out.println("Rule Used: " + ctx.getText());
 }
