package ru.netology.stat;

public class StatisticsService {



//Сумму всех продаж
    public long calculateSum(long[] purchases) {
        long sum = 0;
        for (long purchase : purchases) {
            // аналог sum = sum + purchase;
            sum += purchase;
        }

        return sum;
    }
//Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)*
    public long findMax(long[] purchases) {
        long max = purchases[0];
        for(int i=0;i<purchases.length;i++){
            if(purchases[i] > max){
                max = purchases[i];
            }
        }
        return max;
    }
//Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)*
    public long findMin(long[] purchases) {
        long min = purchases[0];
        for(int i=0;i<purchases.length;i++){
            if(purchases[i] < min){
                min = purchases[i];
            }
        }
        return min;
    }

//Среднюю сумму продаж в месяц
    public static long averageAmounted(long[] purchases){
        long result = 0;
        for (long d: purchases){
            result +=d;
        }

        return result/purchases.length;
    }
//Кол-во месяцев, в которых продажи были ниже среднего (см. п.2)
    public int lastElement(long[] purchases){

        long lastElem = 1;

        for(int i=0;i<purchases.length;i++){
            if(purchases[i] > lastElem){
                lastElem += 1;
            }
        }
        return (int) lastElem;
    }
//Кол-во месяцев, в которых продажи были выше среднего (см. п.2)
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
