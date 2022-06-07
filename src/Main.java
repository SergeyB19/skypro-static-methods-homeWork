public class Main {
    public static void main(String[] args) {

    public static void checkMonth() {
                int year = 2021;
                if (year % 4 == 0 && year % 100 != 0 || year % 400 == 0) {
                    System.out.println(year + "является високосным");
                } else {
                    System.out.println(year + " Не является високосным");
                }

            }
        }
    }
