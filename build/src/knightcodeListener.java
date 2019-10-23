// Generated from knightcode.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link knightcodeParser}.
 */
public interface knightcodeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link knightcodeParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(knightcodeParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link knightcodeParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(knightcodeParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link knightcodeParser#declare}.
	 * @param ctx the parse tree
	 */
	void enterDeclare(knightcodeParser.DeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link knightcodeParser#declare}.
	 * @param ctx the parse tree
	 */
	void exitDeclare(knightcodeParser.DeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link knightcodeParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(knightcodeParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link knightcodeParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(knightcodeParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link knightcodeParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(knightcodeParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link knightcodeParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(knightcodeParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link knightcodeParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(knightcodeParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link knightcodeParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(knightcodeParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link knightcodeParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(knightcodeParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link knightcodeParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(knightcodeParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link knightcodeParser#setvar}.
	 * @param ctx the parse tree
	 */
	void enterSetvar(knightcodeParser.SetvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link knightcodeParser#setvar}.
	 * @param ctx the parse tree
	 */
	void exitSetvar(knightcodeParser.SetvarContext ctx);
	/**
	 * Enter a parse tree produced by {@link knightcodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterExpr(knightcodeParser.ExprContext ctx);
	/**
	 * Exit a parse tree produced by {@link knightcodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitExpr(knightcodeParser.ExprContext ctx);
	/**
	 * Enter a parse tree produced by {@link knightcodeParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(knightcodeParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link knightcodeParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(knightcodeParser.CompContext ctx);
	/**
	 * Enter a parse tree produced by {@link knightcodeParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(knightcodeParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link knightcodeParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(knightcodeParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link knightcodeParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(knightcodeParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link knightcodeParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(knightcodeParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link knightcodeParser#decision}.
	 * @param ctx the parse tree
	 */
	void enterDecision(knightcodeParser.DecisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link knightcodeParser#decision}.
	 * @param ctx the parse tree
	 */
	void exitDecision(knightcodeParser.DecisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link knightcodeParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(knightcodeParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link knightcodeParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(knightcodeParser.LoopContext ctx);
}