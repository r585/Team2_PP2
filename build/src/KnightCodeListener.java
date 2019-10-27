// Generated from KnightCode.g4 by ANTLR 4.7.2
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link KnightCodeParser}.
 */
public interface KnightCodeListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link KnightCodeParser#file}.
	 * @param ctx the parse tree
	 */
	void enterFile(KnightCodeParser.FileContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnightCodeParser#file}.
	 * @param ctx the parse tree
	 */
	void exitFile(KnightCodeParser.FileContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnightCodeParser#declare}.
	 * @param ctx the parse tree
	 */
	void enterDeclare(KnightCodeParser.DeclareContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnightCodeParser#declare}.
	 * @param ctx the parse tree
	 */
	void exitDeclare(KnightCodeParser.DeclareContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnightCodeParser#variable}.
	 * @param ctx the parse tree
	 */
	void enterVariable(KnightCodeParser.VariableContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnightCodeParser#variable}.
	 * @param ctx the parse tree
	 */
	void exitVariable(KnightCodeParser.VariableContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnightCodeParser#type}.
	 * @param ctx the parse tree
	 */
	void enterType(KnightCodeParser.TypeContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnightCodeParser#type}.
	 * @param ctx the parse tree
	 */
	void exitType(KnightCodeParser.TypeContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnightCodeParser#body}.
	 * @param ctx the parse tree
	 */
	void enterBody(KnightCodeParser.BodyContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnightCodeParser#body}.
	 * @param ctx the parse tree
	 */
	void exitBody(KnightCodeParser.BodyContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnightCodeParser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(KnightCodeParser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnightCodeParser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(KnightCodeParser.StatContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnightCodeParser#setvar}.
	 * @param ctx the parse tree
	 */
	void enterSetvar(KnightCodeParser.SetvarContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnightCodeParser#setvar}.
	 * @param ctx the parse tree
	 */
	void exitSetvar(KnightCodeParser.SetvarContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Number}
	 * labeled alternative in {@link KnightCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterNumber(KnightCodeParser.NumberContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Number}
	 * labeled alternative in {@link KnightCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitNumber(KnightCodeParser.NumberContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link KnightCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(KnightCodeParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link KnightCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(KnightCodeParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link KnightCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(KnightCodeParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link KnightCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(KnightCodeParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Compare}
	 * labeled alternative in {@link KnightCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterCompare(KnightCodeParser.CompareContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Compare}
	 * labeled alternative in {@link KnightCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitCompare(KnightCodeParser.CompareContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Id}
	 * labeled alternative in {@link KnightCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void enterId(KnightCodeParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Id}
	 * labeled alternative in {@link KnightCodeParser#expr}.
	 * @param ctx the parse tree
	 */
	void exitId(KnightCodeParser.IdContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnightCodeParser#comp}.
	 * @param ctx the parse tree
	 */
	void enterComp(KnightCodeParser.CompContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnightCodeParser#comp}.
	 * @param ctx the parse tree
	 */
	void exitComp(KnightCodeParser.CompContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnightCodeParser#print}.
	 * @param ctx the parse tree
	 */
	void enterPrint(KnightCodeParser.PrintContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnightCodeParser#print}.
	 * @param ctx the parse tree
	 */
	void exitPrint(KnightCodeParser.PrintContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnightCodeParser#read}.
	 * @param ctx the parse tree
	 */
	void enterRead(KnightCodeParser.ReadContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnightCodeParser#read}.
	 * @param ctx the parse tree
	 */
	void exitRead(KnightCodeParser.ReadContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnightCodeParser#decision}.
	 * @param ctx the parse tree
	 */
	void enterDecision(KnightCodeParser.DecisionContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnightCodeParser#decision}.
	 * @param ctx the parse tree
	 */
	void exitDecision(KnightCodeParser.DecisionContext ctx);
	/**
	 * Enter a parse tree produced by {@link KnightCodeParser#loop}.
	 * @param ctx the parse tree
	 */
	void enterLoop(KnightCodeParser.LoopContext ctx);
	/**
	 * Exit a parse tree produced by {@link KnightCodeParser#loop}.
	 * @param ctx the parse tree
	 */
	void exitLoop(KnightCodeParser.LoopContext ctx);
}