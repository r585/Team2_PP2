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

	 /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */

	@Override public void enterFile(KnightCodeParser.FileContext ctx) { }

	/**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */
 
        @Override public void exitFile(KnightCodeParser.FileContext ctx) { }

        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */

        @Override public void enterDeclare(KnightCodeParser.DeclareContext ctx) { }

        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */

        @Override public void exitDeclare(KnightCodeParser.DeclareContext ctx) { }
 
        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */
 
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

        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */

        @Override public void exitVariable(KnightCodeParser.VariableContext ctx) { }

        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */

	 @Override public void enterType(KnightCodeParser.TypeContext ctx) { }

        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */

	@Override public void exitType(KnightCodeParser.TypeContext ctx) { }

        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */

        @Override public void enterBody(KnightCodeParser.BodyContext ctx) { }

        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */

        @Override public void exitBody(KnightCodeParser.BodyContext ctx) { }

        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */

        @Override public void enterStat(KnightCodeParser.StatContext ctx) { }

        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */

	@Override public void exitStat(KnightCodeParser.StatContext ctx) { }

	/**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */

        @Override public void enterSetvar(KnightCodeParser.SetvarContext ctx) {
		


 }

        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */

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

	/**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
       	 */

        @Override public void enterComp(KnightCodeParser.CompContext ctx) { }

	/**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */

        @Override public void exitComp(KnightCodeParser.CompContext ctx) { }

        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */

	@Override public void enterPrint(KnightCodeParser.PrintContext ctx) { }

	/**
         * {@inheritDoc}
         *
         * <p>exitPrint is giving you ctx which holds String  or Id if there is a String with print we just print it. 
	 *    Otherwise if there is an id  we will fetch value from HashMap and print.</p>
         */

        @Override public void exitPrint(KnightCodeParser.PrintContext ctx) { 

		if(ctx.STRING() != null){
      			System.out.println(ctx.STRING().getText());
   		}

		else if(ctx.ID() != null){
     			 System.out.println(this.variableMap.get(ctx.ID().getText()));
   		}

	}//exitPrint

        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */

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

        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */

        @Override public void exitRead(KnightCodeParser.ReadContext ctx) { }

        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */

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

        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */

 	@Override public void exitDecision(KnightCodeParser.DecisionContext ctx) { }

	/**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */

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

        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */

        @Override public void exitLoop(KnightCodeParser.LoopContext ctx) { }

        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */

	@Override public void enterEveryRule(ParserRuleContext ctx) {

		System.out.println("Rule Used: " + ctx.getText());
 }

	/**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */

	 @Override public void exitEveryRule(ParserRuleContext ctx) { }

	/**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */

        @Override public void visitTerminal(TerminalNode node) { }

        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */

        @Override public void visitErrorNode(ErrorNode node) { }
}
