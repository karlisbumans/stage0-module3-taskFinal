package lang.print.gaps.finalModuleTask;

public class NumberReverter {
    public void revert(int number) {
        int hundreds = number / 100;
        int tens = (number / 10) % 10;
        int units = number % 10;
        System.out.println("" + units + tens + hundreds);
    }
}
