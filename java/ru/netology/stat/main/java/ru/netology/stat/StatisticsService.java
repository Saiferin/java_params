package ru.netology.stat;



public class StatisticsService {


    //Сумму всех продаж
    public int calculateSum(int[] purchases) {
        int sum = 0;
        for (int purchase : purchases) {
            // аналог sum = sum + purchase;
            sum += purchase;
        }

        return sum;

    }


    private int getMax(int[] purchases) {
        int max = purchases[0];

        for (int purchase : purchases) {
            if ( purchase > max){
                max = purchase;
            }

        }
        return max;
    }

    private int getMin(int[] purchases) {
        int min = purchases[0];

        for (int purchase : purchases) {
            if ( purchase < min){
                min = purchase;
            }

        }
        return min;
    }
//Номер месяца, в котором был минимум продаж (осуществлены продажи на минимальную сумму)*
    public int findMax(int[] purchases) {
        int max = getMax(purchases);
        int maxMonth = 0;
        int maxWithMonth = 0;
        for (int purchase : purchases) {
            maxMonth ++;
            if (purchase == max){
                maxWithMonth = maxMonth;
            }
        }
        return maxWithMonth;
    }


    //Номер месяца, в котором был пик продаж (осуществлены продажи на максимальную сумму)*
    public int findMin(int[] purchases) {
        int min = getMin(purchases);

        for (int purchase : purchases) {
            if (purchase < min){
                min = purchase;
            }

        }
        int minMonth = 0;
        int minWithMonth = 0;
        for (int purchase : purchases) {
            minMonth ++;
            if (purchase == min){
                minWithMonth = minMonth;
            }
        }
        return minWithMonth;
    }

//Среднюю сумму продаж в месяц
    public int average(int[] purchases){
        return calculateSum(purchases) / purchases.length;
    }
//Кол-во месяцев, в которых продажи были ниже среднего (см. п.2)
    public int lessThanAverage(int[] purchases){
        long average = average(purchases);

        int count = 0;

        for (int purchase : purchases) {
            if (purchase > average);
            count++;
        }

        return count;


    }
//Кол-во месяцев, в которых продажи были выше среднего (см. п.2)
    public int moreThanAverage(int[] purchases){

        int average = average(purchases);

        int count = 0;

        for (int purchase : purchases) {
            if (purchase < average);
            count++;
        }

        return count;
    }
}

