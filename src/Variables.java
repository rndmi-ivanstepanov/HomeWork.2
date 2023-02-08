import java.util.Locale;

public class Variables {
    public static void main(String[] args) {
        task1();
        task3();
        task4();
        task5();
        task6();
        task7();
        task8();
        }

    public static void task1() {
        int number = 1000;
        byte b = 64;
        short s = 350;
        long margin = 287432L;
        float measure = 254.123f;
        double d = 24.6;
        System.out.println("task1:");
        System.out.println("Значение переменной number с типом int равно " + number);
        System.out.println("Значение переменной b с типом byte равно " + b);
        System.out.println("Значение переменной s с типом short равно " + s);
        System.out.println("Значение переменной margin с типом long равно " + margin);
        System.out.println("Значение переменной measure с типом float равно " + measure);
        System.out.println("Значение переменной d с типом double равно " + d);
        System.out.println();
    }

    public static void task2() {
        float fl = 27.12f;
        long l = 987678965549L;
        double db = 1.786;
        char c = 569;
        short s = -159;
        int number = 27897;
        byte years = 67;
    }

    public static void task3() {
        byte classA = 23, classB = 27, classC = 30;
        short sheets = 480;
        int pupils = classA + classB + classC;
        int sheetsForOne = sheets / pupils;
        System.out.println("task3: ");
        System.out.println("На каждого ученика рассчитано " + sheetsForOne + " листов бумаги.");
        System.out.println();
    }

    public static void task4() {
        byte bottles = 16, time = 2;
        int twentyMinutes = bottles * 10;
        int bottlesPerHour = bottles * 30;
        int bottlesPerDay = bottlesPerHour * 24;
        int forThreeDays = bottlesPerDay * 3;
        int forMonth = bottlesPerDay * 30;
        System.out.println("task4:");
        System.out.println("За 20 минут машина произвела " + twentyMinutes + " штук бутылок.");
        System.out.println("За сутки машина произвела " + bottlesPerDay + " штук бутылок.");
        System.out.println("За 3 дня машина произвела " + forThreeDays + " штук бутылок.");
        System.out.println("За 1 месяц машина произвела " + forMonth + " штук бутылок.");
        System.out.println();
    }

    public static void task5() {
        byte cans = 120, white = 2, brown = 4;
        int numberOfClasses = cans / (white + brown);
        byte whiteAll = 120 / 3;
        int brownAll = whiteAll * 2;
        System.out.println("task5: ");
        System.out.println("В школе, гдe " + numberOfClasses + " классов, нужно " + whiteAll + " банок белой краски и " + brownAll + " банок коричневой краски.");
        System.out.println();
    }

    public static void task6() {
        short bananas = 5 * 80;
        short milk = (200 / 100) * 105;
        short iceCream = 2 * 100;
        short eggs = 4 * 70;
        int inGrams = bananas + milk + iceCream + eggs;
        double inKillos = inGrams / 1000D;
        System.out.println("task6: ");
        System.out.println("Вес спортзавтрака равен " + inGrams + " гр., что составляет " + inKillos + " кг.");
        System.out.println();
    }

    public static void task7() {
        short perDayMin = 250, perDayMax = 500;
        byte goal = 7;
        int daysIfMin = (goal * 1000) / perDayMin;
        int daysIfMax = (goal * 1000) / perDayMax;
        double lossAverage = (perDayMax + perDayMin) / 2D;
        double daysAverage = (goal * 1000) / lossAverage;
        System.out.println("task7: ");
        System.out.println(daysIfMin + " дней уйдет на похудение, если спортсмен будет терять каждый день по 250 грамм, но если - по 500 грамм в день, то он сможет сбросить 7 кг за " + daysIfMax + " дней.");
        System.out.printf(Locale.US,"В среднем, количество дней для потери веса равно %.2f%n", daysAverage);
        System.out.println();
    }

    public static void task8() {
        int incM = 67760, incD = 83690, incK = 76230;
        int newIncM = incM + ((incM * 10) / 100);
        int newIncD = incD + ((incD * 10) / 100);
        int newIncK = incK + ((incK * 10) / 100);
        int profitM = (newIncM * 12) - (incM * 12);
        int profitD = (newIncD * 12) - (incD * 12);
        int profitK = (newIncK * 12) - (incK * 12);
        System.out.println("task8: ");
        System.out.println("Маша теперь получает " + newIncM + " рублей. Годовой доход вырос на " + profitM + " рублей.");
        System.out.println("Денис теперь получает " + newIncD + " рублей. Годовой доход вырос на " + profitD + " рублей.");
        System.out.println("Кристина теперь получает " + newIncK + " рублей. Годовой доход вырос на " + profitK + " рублей.");
    }
}