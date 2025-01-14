/*-
 * #%L
 * JSQLParser library
 * %%
 * Copyright (C) 2004 - 2019 JSQLParser
 * %%
 * Dual licensed under GNU LGPL 2.1 or Apache License 2.0
 * #L%
 */
package net.sf.jsqlparser.expression.operators.relational;

import net.sf.jsqlparser.statement.select.ParenthesedSelect;

@SuppressWarnings({"PMD.UncommentedEmptyMethodBody"})
public class ItemsListVisitorAdapter implements ItemsListVisitor {

    @Override
    public void visit(ParenthesedSelect subSelect) {

    }

    @Override
    public void visit(NamedExpressionList namedExpressionList) {

    }

    @Override
    public void visit(ExpressionList expressionList) {

    }

    @Override
    public void visit(MultiExpressionList multiExprList) {
        for (ExpressionList list : multiExprList.getExprList()) {
            visit(list);
        }
    }
}
