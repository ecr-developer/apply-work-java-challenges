public class PrintNumbers {

    public static void main(String[] args) {
        //int positiveValue = 10;
        int negativeValue = -10;
        PrintNumbers(Math.abs(negativeValue), 0);
    }

    public static void PrintNumbers(int target, int current) {
        if (current <= target) {
            System.out.println(current);
            PrintNumbers(target, current + 1);
        }
    }
}