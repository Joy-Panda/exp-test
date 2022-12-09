package org.exp.benchmark;

import net.objecthunter.exp4j.ExpressionBuilder;

/**
 * @author zhaopan
 * @date 2022-12-08
 **/

public class Exp4jObjecthunter extends EvalBenchmark {

    public static void main(String[] args) {
        Exp4jObjecthunter exp4j = new Exp4jObjecthunter();
        exp4j.benchmark();
    }

    @Override
    void eval(int i) {
        new ExpressionBuilder(expr)
                .variables("x")
                .build()
                .setVariable("x", i)
                .evaluate();
    }
}
