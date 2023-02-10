package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int first = number % 10;
        number /= 10;
        int second = number % 10;
        number /= 10;
        System.out.println(first + "" + second + "" + number);
    }

}
