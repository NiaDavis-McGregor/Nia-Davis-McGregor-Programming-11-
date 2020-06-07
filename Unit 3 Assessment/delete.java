public class Main {
    public static String delete(int[] arrayOne) {

        int pop = arrayOne.length;
        int[] arrayTwo = new int[arrayOne.length - 1];
        for (int i = 0; arrayTwo.length > i; i++) {
            arrayOne[i] = i + 1;
            arrayTwo[i] = arrayOne[i];
        }

        return arrayOne + " Popped Variable: " + pop;
    }
}


