public class Main {
    public int[] add(int[] arrOne, int num) {

        int[] arrTwo = new int[arrOne.length + 1];
        for (int a = 0; arrOne.length > a; a++) {
            arrOne[a] = a + 1;
            arrTwo[a] = arrOne[a];
        }
        arrTwo[arrOne.length + 1] = num;

        return arrTwo;
    }
}
