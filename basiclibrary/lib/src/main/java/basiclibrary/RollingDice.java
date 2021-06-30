package basiclibrary;

import java.util.*;

public class RollingDice {
    public static void main(String[] args) {
        roll(4);
        int arr[] = {3, 2, 1, 5,5};
        System.out.println(containsDuplicates(arr));
        System.out.println(calAverage(arr));

        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };

        int x[] = minAverage(weeklyMonthTemperatures);
        System.out.println(Arrays.toString(x));

    }

    public static void roll(int n){

        int randomNum,max=6,min=1;
        Random random=new Random();

        ArrayList<Integer> arrayList=new ArrayList<>();

        for (int i=0;i<n;i++){

            randomNum=random.nextInt(max-min)+1;

            arrayList.add(randomNum);

        }
        System.out.println(arrayList);
    }

    public static boolean containsDuplicates(int [] arr){
        int item;

        for (int i = 0; i < arr.length; i++){
            item = arr[i];
            for (int j= i+1; j < arr.length; j++){
                if (arr[j] == item){
                    return true;
                }
            }

        }
        return false;
    }

    public static double calAverage(int [] arr){
        double sum = 0;
        double avg;
        for (int i = 0; i< arr.length; i++){
            sum = sum + arr[i];

        }
        avg = sum/arr.length;
        return avg;
    }

    public static int[] minAverage (int[][] arr){
        int sum;
        double avg;
        double minAvg= Integer.MAX_VALUE;

        int minArr[]=arr[0];

        for (int i=0 ; i < arr.length; i++){
            sum=0;
            for (int j=0 ; j<arr[i].length; j++){
                sum =sum + arr[i][j];
            }
            avg =sum/arr[i].length;

            if (avg<minAvg){
                minAvg = avg;
                minArr = arr [i];
            }
        }
        return minArr;
    }


}
