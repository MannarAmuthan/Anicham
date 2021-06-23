// Generated from grammar/Tamizh.g4 by ANTLR 4.5.1

package grammar;

import org.antlr.v4.runtime.tree.AbstractParseTreeVisitor;

/**
 * This class provides an empty implementation of {@link TamizhVisitor},
 * which can be extended to create a visitor which only needs to handle a subset
 * of the available methods.
 *
 * @param <T> The return type of the visit operation. Use {@link Void} for
 * operations with no return type.
 */
public class TamizhBaseVisitor<T> extends AbstractParseTreeVisitor<T> implements TamizhVisitor<T> {
	/**
	 * {@inheritDoc}
	 *
	 * <p>The default implementation returns the result of calling
	 * {@link #visitChildren} on {@code ctx}.</p>
	 */
	@Override public T visitWord(TamizhParser.WordContext ctx) { return visitChildren(ctx); }
}