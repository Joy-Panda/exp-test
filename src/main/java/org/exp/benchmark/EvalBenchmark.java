package org.exp.benchmark;

/**
 * @author zhaopan
 * @date 2022-12-08
 **/
public abstract class EvalBenchmark {

    public String expr = "2+2*3.14159*x^2+sin(-3.141)";

    abstract void eval(int i);

    public void benchmark() {
        for (int i = 0; i < 10; i++) {
            execute();
        }
        long start = System.currentTimeMillis();
        for (int i = 0; i < 15; i++) {
            execute();
        }
        System.out.println((System.currentTimeMillis() - start)/15);
    }

    private void execute() {
        for (int i = 0; i < 100000; i++) {
            eval(i);
        }
    }

}
