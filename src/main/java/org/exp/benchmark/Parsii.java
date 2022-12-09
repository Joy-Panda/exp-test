package org.exp.benchmark;

import parsii.eval.Expression;
import parsii.eval.Parser;
import parsii.eval.Scope;
import parsii.eval.Variable;
import parsii.tokenizer.ParseException;

/**
 * @author zhaopan
 * @date 2022-12-08
 **/
public class Parsii extends EvalBenchmark {
    public static void main(String[] args) {
        Parsii parsii = new Parsii();
        parsii.benchmark();
    }

    @Override
    void eval(int i) {
        Scope scope = new Scope();
        Variable x = scope.getVariable("x");
        x.setValue(i);
        Expression expression = null;
        try {
            expression = Parser.parse(expr, scope);
        } catch (ParseException e) {
            throw new RuntimeException(e);
        }
        expression.evaluate();
    }
}
