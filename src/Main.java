import java.time.LocalDate;

public class Main {
    public static void main(String[] args) {
        printTask(1);

        calculateLeapYear(2025);
        calculateLeapYear(2028);

        printTask(2);
        checkValidSystemAndPrint(1, 2024);
        checkValidSystemAndPrint(0, 15);
        checkValidSystemAndPrint(-1, 2015);
        checkValidSystemAndPrint(0, 2026);

        printTask(3);
        int deliveryDays = getDeliveryDays(60);
        System.out.println(deliveryDays);


    }

    public static String calculateLeapYear(int year) {
        if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
            System.out.printf("%s год - високосный год%n", year);
        } else {
            System.out.printf("%s год - невискосный год%n", year);
        }


        return "";
    }

    public static void checkValidSystemAndPrint(int system, int year) {
        int currentYear = LocalDate.now().getYear();
        if (system == 0 && year < currentYear) {
            System.out.println("Установите облегченную версию приложения для iOS по ссылке");
        } else if (system == 0) {
            System.out.println("Установите  версию приложения для iOS по ссылке");
        } else if (system == 1 && year < currentYear) {
            System.out.println("Установите облегченную версию приложения для Android по ссылке");
        } else if (system == 1) {
            System.out.println("Установите  версию приложения для Android по ссылке");
        }
    }

    public static int getDeliveryDays(int distance) {
        if (distance >= 0 && distance <= 20) {
            return 1;
        } else if (distance > 20 && distance <= 60) {
            return 2;
        } else if (distance > 60 && distance <= 100) {
            return 3;
        }
        return distance;
    }

    public static void printTask(int number) {
        System.out.println("\n Task" + number);


    }
}





