// Generated from /home/lu/IdeaProjects/compiler/src/main/java/lab1demo2/Lab1_2.g4 by ANTLR 4.8
package lab1demo2;
import org.antlr.v4.runtime.tree.ParseTreeListener;

/**
 * This interface defines a complete listener for a parse tree produced by
 * {@link Lab1_2Parser}.
 */
public interface Lab1_2Listener extends ParseTreeListener {
	/**
	 * Enter a parse tree produced by {@link Lab1_2Parser#prog}.
	 * @param ctx the parse tree
	 */
	void enterProg(Lab1_2Parser.ProgContext ctx);
	/**
	 * Exit a parse tree produced by {@link Lab1_2Parser#prog}.
	 * @param ctx the parse tree
	 */
	void exitProg(Lab1_2Parser.ProgContext ctx);
	/**
	 * Enter a parse tree produced by {@link Lab1_2Parser#stat}.
	 * @param ctx the parse tree
	 */
	void enterStat(Lab1_2Parser.StatContext ctx);
	/**
	 * Exit a parse tree produced by {@link Lab1_2Parser#stat}.
	 * @param ctx the parse tree
	 */
	void exitStat(Lab1_2Parser.StatContext ctx);
}