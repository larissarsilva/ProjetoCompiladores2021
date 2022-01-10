// Generated from grammar.e4 by ANTLR 4.8
import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;


public class CompiladorBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements CompiladorVisitor<T> {

	@Override public T visitStart(CompiladorParser.StartContext ctx) { return visitChildren(ctx); }
	

	@Override public T visitGroup(CompiladorParser.GroupContext ctx) { return visitChildren(ctx); }


	@Override public T visitNum(CompiladorParser.NumContext ctx) { return visitChildren(ctx); }
	

	@Override public T visitSoma(CompiladorParser.SomaContext ctx) { return visitChildren(ctx); }
	

	@Override public T visitId(CompiladorParser.IdContext ctx) { return visitChildren(ctx); }
	
	@Override public T visitProduto(CompiladorParser.ProdutoContext ctx) { return visitChildren(ctx); }
}