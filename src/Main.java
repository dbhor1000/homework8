public class Main {
    public static void main(String[] args) {


        ///Task 1.1 (+2)

        int[] firstTaskArr2 = new int[3];
        firstTaskArr2[0] = 1;
        firstTaskArr2[1] = 2;
        firstTaskArr2[2] = 3;

        for (int i = 0; i < firstTaskArr2.length; i++) {

            if(i == (firstTaskArr2.length - 1)){
                System.out.print(firstTaskArr2[i] + " ");
            } else {

                System.out.print(firstTaskArr2[i] + ", ");
            }

        }

        System.out.println();



        ///Task 1.2 (+2)

        double[] secondTaskArr = {1.57, 7.654 ,9.986};

        for (int i = 0; i < secondTaskArr.length; i++) {

            if(i == (secondTaskArr.length - 1)){
                System.out.print(secondTaskArr[i] + " ");
            } else {

                System.out.print(secondTaskArr[i] + ", ");
            }

        }

        System.out.println();


        ///Task 1.3 (+2)

        double[] thirdTaskArr = {1.11, 2.222 ,3.33 , 4.55, 5.55};

        for (int i = 0; i < thirdTaskArr.length; i++) {

            if(i == (thirdTaskArr.length - 1)){
                System.out.print(thirdTaskArr[i] + " ");
            } else {

                System.out.print(thirdTaskArr[i] + ", ");
            }

        }

        System.out.println();

        ///Task 3.1

        int[] thirdTaskArr1 = new int[3];
        thirdTaskArr1[0] = 1;
        thirdTaskArr1[1] = 2;
        thirdTaskArr1[2] = 3;

        for (int i = (thirdTaskArr1.length - 1); i >= 0; i--) {

            if(i == (thirdTaskArr1.length - 1)){
                System.out.print(thirdTaskArr1[i] + " ");
            } else {

                System.out.print(thirdTaskArr1[i] + ", ");
            }

        }

        System.out.println();


        ///Task 3.2 (+2)

        double[] thirdTaskArr2 = {1.57, 7.654 ,9.986};

        for (int i = (thirdTaskArr2.length - 1); i >= 0; i--) {

            if(i == (thirdTaskArr2.length - 1)){
                System.out.print(thirdTaskArr2[i] + " ");
            } else {

                System.out.print(thirdTaskArr2[i] + ", ");
            }

        }

        System.out.println();



        ///Task 3.3

        double[] thirdTaskArr3 = {1.11, 2.222 ,3.33 , 4.55, 5.55};

        for (int i = (thirdTaskArr3.length) - 1; i >= 0; i--) {

            if(i == (thirdTaskArr3.length - 1)){
                System.out.print(thirdTaskArr3[i] + " ");
            } else {

                System.out.print(thirdTaskArr3[i] + ", ");
            }

        }

        System.out.println();


        ///Task 4

        int[] fourthTaskArr = new int[3];
        fourthTaskArr[0] = 1;
        fourthTaskArr[1] = 2;
        fourthTaskArr[2] = 3;

        for (int i = 0; i < fourthTaskArr.length; i++) {

            if(i == (fourthTaskArr.length - 1) && fourthTaskArr[i] % 2 != 0){          /// Если имеем дело с последним элементом массива и число нечётное
                System.out.print((fourthTaskArr[i] + 1) + " ");
            } else if(i == (fourthTaskArr.length - 1) && fourthTaskArr[i] % 2 == 0){       /// Если имеем дело с последним элементом массива и число чётное
                System.out.print(fourthTaskArr[i] + " ");
            } else if(i < (fourthTaskArr.length - 1) && fourthTaskArr[i] % 2 != 0){        /// Если имеем дело не с последним элементом массива и число нечётное
                System.out.print((fourthTaskArr[i] + 1) + ", ");
            } else if(i < (fourthTaskArr.length - 1) && fourthTaskArr[i] % 2 == 0){        /// Если имеем дело не с последним элементом массива и число чётное
                System.out.print(fourthTaskArr[i] + ", ");
            }

        }

        System.out.println();






    }
}