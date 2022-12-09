package org.exp.benchmark;

import org.mariuszgromada.math.mxparser.Expression;

/**
 * @author zhaopan
 * @date 2022-12-08
 **/
public class Jeval extends EvalBenchmark {
    public static void main(String[] args) {
        Jeval felTest = new Jeval();
        felTest.benchmark();
    }

    @Override
    void eval(int i) {
        Expression expression  =  new Expression(expr);
        expression.setArgumentValue("x",i);
        expression.calculate();
    }
}
