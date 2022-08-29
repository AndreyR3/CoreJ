public class Main {

    public static void main(String[] args) {
        int[][] array = new int[2][5];
        double average = 0;
        int min = Integer.MAX_VALUE;
        int max = Integer.MIN_VALUE;

        for (int i = 0; i < array.length; i++) {
            for (int j = 0; j < array[0].length; j++) {
                array[i][j] = (int) (Math.random() * 10) - 4;
                average += (double) array[i][j] / (array.length * array[0].length);
                if (array[i][j] < min) {
                    min = array[i][j];
                }
                if (array[i][j] > max) {
                    max = array[i][j];
                }
            }
        }


        System.out.println("Maximum value -> " + max);
        System.out.println("Minimum value -> " + min);
        System.out.println("Average value -> " + average);
    }
}
