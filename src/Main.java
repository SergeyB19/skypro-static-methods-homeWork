public class Main {
    public static void main(String[] args) {
        System.out.println("|Задание №1|");
    public static void checkYear (); {
                int year = 2021;
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    System.out.println(year + "является високосным");
                } else {
                    System.out.println(year + " Не является високосным");
                }

            }


        System.out.println("|Задание №2|");


    public static void operationSystemAndYear (){
        int currentYear = LocalDate.now().getYear();
        }


        System.out.println("|Задание №3|");
    public static void distanceAndDays(){
            int deliveryDistance =95;

            int deliveryDays = 1;

            if (deliveryDistance >20) {
                deliveryDays++;
            }
            if (deliveryDistance>60) {
                deliveryDays++;
            }
            System.out.println("Потребуется дней" + deliveryDays);
        }
        }
    }
