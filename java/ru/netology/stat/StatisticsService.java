package ru.netology.stat;

public class StatisticsService {
    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            // аналог sum = sum + purchase;
            sum += purchase;
        }
        return sum;
    }

    public long findMax(long[] purchases) {
        long max = purchases[0];
        for(int i=0;i<purchases.length;i++){
            if(purchases[i] > max){
                max = purchases[i];
            }
        }
        return max;
    }

    public long findMin(long[] purchases) {
        long min = purchases[0];
        for(int i=0;i<purchases.length;i++){
            if(purchases[i] < min){
                min = purchases[i];
            }
        }
        return min;
    }

    public long averageAmounted(long[] purchases){
        long sum = 0;
        for (long purchase : purchases) {
            // аналог sum = sum + purchase;
            sum += purchase;
        }
        long size = purchases.length;
        long result = sum/size;
        return result;
    }

    public int lastElement(long[] purchases){

        long lastElem = 1;

        for(int i=0;i<purchases.length;i++){
            if(purchases[i] > lastElem){
                lastElem += 1;
            }
        }
        return (int) lastElem;
    }

    public int firstElement(long[] purchases){
        long firstElem = 1;

        for(int i=0;i<purchases.length;i++){
            if(purchases[i] < firstElem){
                firstElem += 1;
            }
        }
        return (int) firstElem;
    }

}