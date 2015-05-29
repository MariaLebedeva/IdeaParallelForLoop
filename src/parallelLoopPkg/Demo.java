package parallelLoopPkg;

/**
 * Created by Maria.Lebedeva on 29.05.2015.
 */
public class Demo {
    public static void main(String[] args) {
        Demo.run();
    }

    private static void run() {
        int[] ints = {1,2,3,4,5};
        new Calculator().calculate(ints);
    }

}
