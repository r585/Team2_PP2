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
 
        @Override public void enterVariable(KnightCodeParser.VariableContext ctx) { }

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

        @Override public void enterSetvar(KnightCodeParser.SetvarContext ctx) { }

        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */

        @Override public void exitSetvar(KnightCodeParser.SetvarContext ctx) { }
 
	/**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */

        @Override public void enterExpr(KnightCodeParser.ExprContext ctx) { }

        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */

        @Override public void exitExpr(KnightCodeParser.ExprContext ctx) { }

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
         * <p>The default implementation does nothing.</p>
         */

        @Override public void exitPrint(KnightCodeParser.PrintContext ctx) { }

        /**
         * {@inheritDoc}
         *
         * <p>The default implementation does nothing.</p>
         */

        @Override public void enterRead(KnightCodeParser.ReadContext ctx) { }

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

        @Override public void enterDecision(KnightCodeParser.DecisionContext ctx) { }

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

        @Override public void enterLoop(KnightCodeParser.LoopContext ctx) { }

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

	@Override public void enterEveryRule(ParserRuleContext ctx) { }

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
