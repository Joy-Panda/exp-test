package org.exp.benchmark;

import org.apache.commons.jexl3.*;

/**
 * @author zhaopan
 * @date 2022-12-08
 **/
public class Jexl3 extends EvalBenchmark{
    public static void main(String[] args) {
        Jeval fel = new Jeval();
        fel.benchmark();
    }

    @Override
    void eval(int i) {
        // Create or retrieve an engine
        JexlEngine jexl = new JexlBuilder().create();

        JexlExpression e = jexl.createExpression(expr);

        // Create a context and add data
        JexlContext jc = new MapContext();
        jc.set("x", i);

        // Now evaluate the expression, getting the result
        Object o = e.evaluate(jc);
    }
}
