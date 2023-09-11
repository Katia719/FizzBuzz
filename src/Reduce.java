public class Reduce {
    public static void main(String[] args) {
        int numSteps = 0;
        int curr = 100;
        while (curr > 0) {
            if (curr % 2 == 0) {
                curr = curr / 2;
            }
            else {
                curr = curr - 1;
            }
            numSteps++;
        }
        System.out.println(numSteps);
    }
}
