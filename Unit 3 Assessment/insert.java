public class Main {
    public static int[] insert(int[] arrOne, int num, int pos) {

        int[] arrTwo = new int[arrOne.length+1];
        for (int i = 0; arrTwo.length > i; i++){
            if (i < pos){
                arrTwo[i] = arrOne[i];
            }
            else if (i == pos){
                arrTwo[i] = num;
            }
            else {
                arrTwo[i] = arrOne[i - 1];
            }
        }

        return arrTwo;
    }
}
