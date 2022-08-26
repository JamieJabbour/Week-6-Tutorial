public class week 2 {
    public static int[] swap(int[] input, int pos1, int pos2){
        int temp = input[pos1];
        input[pos1] = input[pos2];
        input[pos2] = temp;
        return input;
    }
    public static int[] sort(int[] input) {
        int n = input.length;
        for(int i = 0; i < n-1; i++) {
            for(int j = 0; j < n-1-i; j++) {
                if(input[j] > input[j+1]) {
                    swap(input, j, j+1);
                }
            }
        }
        return input;
    }
}