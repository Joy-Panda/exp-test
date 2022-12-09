package org.exp.benchmark;

import com.graphbuilder.math.Expression;
import com.graphbuilder.math.ExpressionTree;
import com.graphbuilder.math.FuncMap;
import com.graphbuilder.math.VarMap;

/**
 * @author zhaopan
 * @date 2022-12-08
 **/
public class Curvesapi extends EvalBenchmark {

    public static void main(String[] args) {
        Curvesapi curvesapi = new Curvesapi();
        curvesapi.benchmark();
    }

    @Override
    void eval(int i) {
        Expression x = ExpressionTree.parse(expr);
        VarMap vm = new VarMap();
        vm.setValue("x", i);
        FuncMap funcMap = new FuncMap();
        funcMap.loadDefaultFunctions();
        x.eval(vm, funcMap);
    }
}
