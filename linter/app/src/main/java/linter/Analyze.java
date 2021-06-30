package linter;

import java.util.*;
public class Analyze {
    public static void main(String[] args) {
        int[][] weeklyMonthTemperatures = {
                {66, 64, 58, 65, 71, 57, 60},
                {57, 65, 65, 70, 72, 65, 51},
                {55, 54, 60, 53, 59, 57, 61},
                {65, 56, 55, 52, 55, 62, 57}
        };
        Analyzing(weeklyMonthTemperatures);

        List<String> votes = new ArrayList<>();
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Bush");
        votes.add("Shrub");
        votes.add("Hedge");
        votes.add("Shrub");
        votes.add("Bush");
        votes.add("Hedge");
        votes.add("Bush");

        String winner = tally(votes);
        System.out.println(winner + " received the most votes!");
    }

    public static void Analyzing(int [][] weatherData){
        Set <Integer> data= new HashSet<>();
        int min=Integer.MAX_VALUE, max=Integer.MIN_VALUE;

        for (int i=0; i<weatherData.length; i++){
            for (int j = 0; j < weatherData[i].length; j++) {
                data.add(weatherData[i][j]);

                if (weatherData[i][j]<min){
                    min= weatherData[i][j];

                }else if(weatherData[i][j]>max){
                    max=weatherData[i][j];

                }

            }


        }
        System.out.println("Low: "+min);
        System.out.println("High: "+max);
        int minTemp=min;
        for (int i = min; i <= max; i++) {
            if (!data.contains(i)){
                System.out.println("Never saw temperature: "+minTemp);
            }
            minTemp++;
        }
    }

    public static String tally(java.util.List<String> votes){
        Map<String , Integer> name= new HashMap<>();
        for (int i = 0; i < votes.size(); i++) {
            name.put(votes.get(i),0);
        }
        int totalVotes=0, max=0;

        for (int i = 0; i < votes.size() ; i++) {
            totalVotes=name.get(votes.get(i));
            name.put(votes.get(i), ++totalVotes);
        }
        String winner="";
        Object[] arr = name.keySet().toArray();

        for (int i = 0; i < name.size(); i++) {
            if (name.get(arr[i])>max){
                max= name.get(arr[i]);
                winner=arr[i].toString();

            }
        }
        return winner;
    }
}
