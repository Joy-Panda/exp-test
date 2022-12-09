package org.exp.benchmark;

import com.ql.util.express.DefaultContext;
import com.ql.util.express.ExpressRunner;

/**
 * @author zhaopan
 * @date 2022-12-08
 **/
public class QLExpress extends EvalBenchmark {

    public static void main(String[] args) {
        QLExpress qlExpress = new QLExpress();
        qlExpress.benchmark();
    }

    @Override
    void eval(int i) {
        ExpressRunner runner = new ExpressRunner();
        DefaultContext<String, Object> context = new DefaultContext<String, Object>();
        context.put("x", i);
        try {
            runner.addFunctionOfClassMethod("sin", Math.class.getName(), "sin", new String[] {"double"}, null);
            Object r = runner.execute(expr, context, null, true, false);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }
}
