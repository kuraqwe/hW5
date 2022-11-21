public class Main {
    public static void main(String[] args) {
        boolean clientOS = true;
        if (clientOS == true) {
            System.out.println("Установите версию приложения для Android по ссылке.");          //the first task
        } else {
            System.out.println("установите версию приложения для IOS по ссылке.");
        }

        boolean clientOS1 = false;
        int clientDeviceYear = 2015;
        if (clientOS1 == true) {
            if (clientDeviceYear >= 2015) {
                System.out.println("Установите версию приложения для Android по ссылке.");
            } else {
                System.out.println("Установите облегченную версию проиложения для Android по ссылке.");
            }
        }else
                if (clientDeviceYear >= 2015) {                                                             //the second task
                    System.out.println("Установите версию приложения для IOS по ссылке.");
                } else {
                    System.out.println("Установите облегченную версию проиложения для IOS по ссылке.");
            }

        int year = 604;
        if (year % 100 != 0 && year % 4 == 0){
            System.out.println("Год является високосным");
        }else if (year % 400 == 0){
            System.out.println("Год является високосным");                                                   //the third task
        }else{
            System.out.println("год не является високосным");
        }

        int deliveryDistance = 61;
        if (deliveryDistance <= 20){
            System.out.println("Потребуется дней: 1");                                                      //the fourth task
        } else{
            System.out.println("Потребуется дней: " + ((deliveryDistance - 21) / 40 + 2));
        }

        int monthNumber = 10;
        switch(monthNumber) {
            case 12:
            case 1:
            case 2:
                System.out.println("Зима");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Весна");
                break;
            case 6:                                                                                                 //the fifth task
            case 7:
            case 8:
                System.out.println("Лето");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Осень");
                break;
            default:
                break;
        }
    }
}