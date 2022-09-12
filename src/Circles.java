public class Circles {
    public static void main(String[] args) {
//6.Циклы.Часть 2.
    // ДЗ 1
        //Задание 1.
        int mounth;
        int sumAccumulation = 29_000;
        mounth = 1;
        while (sumAccumulation <= 2_500_000) {
            System.out.println(mounth + "й месяц накоплено: " + sumAccumulation);
            sumAccumulation = sumAccumulation + (29_000 + (sumAccumulation / 100));
            mounth++;
        }
        //Задание 2.
        int numSubsequence;
        numSubsequence = 1;
        while (numSubsequence <= 10) {
            System.out.print(numSubsequence + " ");
            numSubsequence++;
        }
        System.out.println();
        for (numSubsequence = 10; numSubsequence >0; numSubsequence -= 1) {
            System.out.print(numSubsequence + " ");
        }
        //Задание 3.
        int population = 12_000_000;
        int partPopulation = 1_000;
        int fertility = 17 * (population / partPopulation);
        int mortality = 8 * (population / partPopulation);
        int growthToYear = (fertility - mortality);
        int sumGrowth = population + growthToYear;
        int year;
        for (year = 1; year <= 10; year++) {
            System.out.println(year + "й год прирост населения: " + sumGrowth);
            sumGrowth += growthToYear;
        }
    //ДЗ 2
        //Задание 1.
        int deposition = 15_000;
        int percentOfDeposit = deposition / 100 * 7;
        int month = 1;
        sumAccumulation = deposition + percentOfDeposit;
        while (sumAccumulation <= 12_006_000) {
            System.out.println(mounth + "й месяц накоплено:" + sumAccumulation);
            sumAccumulation += (deposition + percentOfDeposit);
            month++;
        }
        //Задание 2.
        percentOfDeposit = deposition / 100 * 7;
        month = 1;
        sumAccumulation = deposition + percentOfDeposit;
        int sumAllAccumulation = sumAccumulation / 100 * 7 + sumAccumulation;
        while (sumAllAccumulation <= 12_039_000) {
            if (month % 6 == 0) {
                System.out.println(month + "й месяц накоплено:" + sumAllAccumulation);
            }
            sumAllAccumulation += (deposition + percentOfDeposit);
            month++;
        }
        //Задание 3.
        deposition = 15_000;
        percentOfDeposit = deposition / 100 * 7;
        year = month * 12;
        int dete = year * 9;
        sumAccumulation = deposition + percentOfDeposit;
        sumAllAccumulation = sumAccumulation / 100 * 7 + sumAccumulation;
        for (month = 1; month <= dete; month++) {
            if (mounth % 6 == 0) {
                System.out.println(month + "й месяц накоплено:" + sumAllAccumulation);
            }
            sumAllAccumulation += (deposition + percentOfDeposit);
        }
        //Задание 4.
        int interval;
        month = 31;
        for (interval = 7; interval <= month; interval += 7)
            System.out.println("Today friday " + interval + "th. Need to prepare a report.");
    //ДЗ 3
        //Задание 1.
        int date = 2096;
        int min = date - 200;
        int max = date + 100;
        for (interval = min; interval <= max; interval += 79)
            System.out.println(interval);
        //Задание 2.
        int num;
        int numConst = 2;
        for (num = 1; num <= 10; num++)
            System.out.println("2 * " + num + " = " + numConst * num);
    }
}
