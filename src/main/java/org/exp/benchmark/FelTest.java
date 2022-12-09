package org.exp.benchmark;

import com.greenpineyu.fel.FelEngine;
import com.greenpineyu.fel.FelEngineImpl;
import com.greenpineyu.fel.context.FelContext;

/**
 * @author zhaopan
 * @date 2022-12-08
 **/
public class FelTest extends EvalBenchmark {
    public static void main(String[] args) {
        FelTest felTest = new FelTest();
        felTest.benchmark();
    }

    @Override
    void eval(int i) {
        FelEngine fel = new FelEngineImpl();
        FelContext ctx = fel.getContext();
        ctx.set("x", i);
        fel.eval(expr);
    }
}
