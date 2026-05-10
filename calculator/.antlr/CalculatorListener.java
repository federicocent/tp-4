// Generated from c:/Users/Hp/Documents/tp4/antlr-calculator/calculator/Calculator.g4 by ANTLR 4.13.1
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link CalculatorParser}.
 */
public interface CalculatorListener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#program}.
	 * @param ctx the parse tree
	 */
	void enterProgram(CalculatorParser.ProgramContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#program}.
	 * @param ctx the parse tree
	 */
	void exitProgram(CalculatorParser.ProgramContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void enterStatement(CalculatorParser.StatementContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#statement}.
	 * @param ctx the parse tree
	 */
	void exitStatement(CalculatorParser.StatementContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#declaration}.
	 * @param ctx the parse tree
	 */
	void enterDeclaration(CalculatorParser.DeclarationContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#declaration}.
	 * @param ctx the parse tree
	 */
	void exitDeclaration(CalculatorParser.DeclarationContext ctx);
	/**
	 * Enter a parse tree produced by {@link CalculatorParser#assignment}.
	 * @param ctx the parse tree
	 */
	void enterAssignment(CalculatorParser.AssignmentContext ctx);
	/**
	 * Exit a parse tree produced by {@link CalculatorParser#assignment}.
	 * @param ctx the parse tree
	 */
	void exitAssignment(CalculatorParser.AssignmentContext ctx);
	/**
	 * Enter a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterMulDiv(CalculatorParser.MulDivContext ctx);
	/**
	 * Exit a parse tree produced by the {@code MulDiv}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitMulDiv(CalculatorParser.MulDivContext ctx);
	/**
	 * Enter a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterAddSub(CalculatorParser.AddSubContext ctx);
	/**
	 * Exit a parse tree produced by the {@code AddSub}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitAddSub(CalculatorParser.AddSubContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterParens(CalculatorParser.ParensContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Parens}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitParens(CalculatorParser.ParensContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Num}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterNum(CalculatorParser.NumContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Num}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitNum(CalculatorParser.NumContext ctx);
	/**
	 * Enter a parse tree produced by the {@code Id}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void enterId(CalculatorParser.IdContext ctx);
	/**
	 * Exit a parse tree produced by the {@code Id}
	 * labeled alternative in {@link CalculatorParser#expression}.
	 * @param ctx the parse tree
	 */
	void exitId(CalculatorParser.IdContext ctx);
}