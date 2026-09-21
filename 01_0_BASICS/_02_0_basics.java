import java.util.Scanner;

class _02_0_basics {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        int day = sc.nextInt(), month = sc.nextInt(), year = sc.nextInt();
   
        if (year <= 0) {
            System.out.println("Invalid Date");
        }
        else {
            if (month < 1 || month > 12) {
                System.out.println("Invalid Date");
            }
            else {
                if (month == 2) {

                    if ((year % 400 == 0) || 
                        (year % 4 == 0 && year % 100 != 0)) {

                        if (day >= 1 && day <= 29)
                            System.out.println("Valid Date");
                        else
                            System.out.println("Invalid Date");

                    } else {

                        if (day >= 1 && day <= 28)
                            System.out.println("Valid Date");
                        else
                            System.out.println("Invalid Date");
                    }
                }
                else if (month == 4 || month == 6 ||
                         month == 9 || month == 11) {

                    if (day >= 1 && day <= 30)
                        System.out.println("Valid Date");
                    else
                        System.out.println("Invalid Date");
                }

                else {
                    if (day >= 1 && day <= 31)
                        System.out.println("Valid Date");
                    else
                        System.out.println("Invalid Date");
                }
            }
        }
        sc.close();
    }
}