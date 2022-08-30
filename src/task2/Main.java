package task2;

public class Main {
        public static void main(String[] args) {
            int[] arrNum = {5, 6, 3, 2, 5, 1, 4, 9};

            int temp = 0;
            System.out.println("Sorted array elements:");
            for (int i = 0; i < arrNum.length; i++) {
                for (int j = i + 1; j < arrNum.length; j++) {
                    if (arrNum[i] > arrNum[j]) {
                        temp = arrNum[i];
                        arrNum[i] = arrNum[j];
                        arrNum[j] = temp;
                    }

                }
                System.out.println(arrNum[i]);
            }
        }
    }



