// Generated from Scheme.g4 by ANTLR 4.5
import org.antlr.v4.runtime.misc.NotNull;
import org.antlr.v4.runtime.tree.ParseTreeVisitor;

/**
 * This interface defines a complete generic visitor for a parse tree produced
 * by {@link SchemeParser}.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public interface SchemeVisitor<T> extends ParseTreeVisitor<T> {
	/**
	 * Visit a parse tree produced by {@link SchemeParser#prog}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitProg(SchemeParser.ProgContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Double}
	 * labeled alternative in {@link SchemeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDouble(SchemeParser.DoubleContext ctx);
	/**
	 * Visit a parse tree produced by the {@code Boolean}
	 * labeled alternative in {@link SchemeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBoolean(SchemeParser.BooleanContext ctx);
	/**
	 * Visit a parse tree produced by the {@code OpExpr}
	 * labeled alternative in {@link SchemeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitOpExpr(SchemeParser.OpExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DefExpr}
	 * labeled alternative in {@link SchemeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefExpr(SchemeParser.DefExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code IfExpr}
	 * labeled alternative in {@link SchemeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitIfExpr(SchemeParser.IfExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code PrintExpr}
	 * labeled alternative in {@link SchemeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitPrintExpr(SchemeParser.PrintExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code WhileExpr}
	 * labeled alternative in {@link SchemeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitWhileExpr(SchemeParser.WhileExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code BlockExpr}
	 * labeled alternative in {@link SchemeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBlockExpr(SchemeParser.BlockExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code LetExpr}
	 * labeled alternative in {@link SchemeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitLetExpr(SchemeParser.LetExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code FuncExpr}
	 * labeled alternative in {@link SchemeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitFuncExpr(SchemeParser.FuncExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code DefFuncExpr}
	 * labeled alternative in {@link SchemeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitDefFuncExpr(SchemeParser.DefFuncExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code CallExpr}
	 * labeled alternative in {@link SchemeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitCallExpr(SchemeParser.CallExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code TryExpr}
	 * labeled alternative in {@link SchemeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitTryExpr(SchemeParser.TryExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RaiseExpr}
	 * labeled alternative in {@link SchemeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRaiseExpr(SchemeParser.RaiseExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code QuitExpr}
	 * labeled alternative in {@link SchemeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitQuitExpr(SchemeParser.QuitExprContext ctx);
	/**
	 * Visit a parse tree produced by the {@code RefExpr}
	 * labeled alternative in {@link SchemeParser#expr}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitRefExpr(SchemeParser.RefExprContext ctx);
	/**
	 * Visit a parse tree produced by {@link SchemeParser#bind}.
	 * @param ctx the parse tree
	 * @return the visitor result
	 */
	T visitBind(SchemeParser.BindContext ctx);
}