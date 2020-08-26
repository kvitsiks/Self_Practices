package Day28;

import java.util.Arrays;

public class MultiDemArray {
    public static void main(String[] args) {

        String[] arr1 = {"Name1", "Name2", "Name3", "Name4"};
        String[] arr2 = {"Name5", "Name6", "Name7", "Name8", "Name9"};
        String[] arr3 = {"Name10", "Name11", "Name12", "Name13", "Name14", "Name15"};

        String[][] arr4 = {arr1, arr2,arr3};



        for (int i = 0; i < arr4.length; i++) {
            for (int j = 0; j < arr4[i].length; j++) {
                System.out.println(arr4[i][j]);
            }

        }


    }
}
