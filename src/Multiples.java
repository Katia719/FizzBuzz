public class Multiples {
    public static void main(String[] args) {
        int multSoFar = 0;
        for (int curr = 999; curr > 0; curr--){
            boolean divisibleBy3 = curr % 3 == 0;
            boolean divisibleBy5 = curr % 5 == 0;

            if (divisibleBy3 || divisibleBy5) {
                multSoFar++;
            }
        }
        System.out.println(multSoFar);
    }
}
