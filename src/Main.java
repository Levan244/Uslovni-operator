public class Main { 
    
    public static void main (String[] args){
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1(){
        System.out.println("Задание 1");
        int age = 18;
        if (age >= 18) {
        System.out.println("Вы совершеннолетний ");
    }
        else {
            System.out.println("Вы не совершеннолетний ");
        }
        System.out.println();
    }

    private static void task2() {
        System.out.println("Задание 2");
        int temperature = 5;
        if ( temperature < 5 )  {
            System.out.println("На улице холодно, нужно надеть шапку ");
        } else {
            System.out.println("Сегодня тепло, можно идти без шапки");
        }
        System.out.println();
    }

    private static void task3() {
        System.out.println("Задание 3");
        int speed = 60;
        if (speed > 60) {
            System.out.println("Скорость превышена");
        }
        else {
            System.out.println("Превышения скорости нет");
        }
        System.out.println();


        }


    private static void task4() {
        System.out.println("Задание 4");
        int man = 17
                ;

        if ( man > 2 && man < 6 ) {
            System.out.println("Ходит в детский сад");
            } else if (man > 7 && man < 18 ) {
            System.out.println("Ходит в школу");
        }else if ( man > 18 && man <= 24 ) {
            System.out.println("Учиться в университете");
        } else {
            System.out.println("Пора работать");
        }
        System.out.println();


    }

    private static void task5() {
        System.out.println("Задание 5");
        int child = 22;
        if (child <= 5) {
            System.out.println("Может кататься на отракционе ");
        } else if (child > 5 && child <= 14) {
            System.out.println("Может кататься только в сопровождении взрослого.");
        } else {
            System.out.println("может кататься без сопровождения взрослого");

        }
        System.out.println();
    }

    private static void task6() {
        System.out.println("Задание 6");
        System.out.println();
        int trainTotalSit = 102;
        int trainSitPlace = 60;
        int place = 66;
        if (place <= trainTotalSit) {
            if (place <= trainSitPlace) {
                System.out.println("Есть сидячие места");
            } else {
                System.out.println("Стоячие места в вогоне");
            }

        }
        else {
            System.out.println("Мест нет");
        }
        System.out.println();
    }


    private static void task7() {
        System.out.println("Задание 7");
        int one = 15;
        int two = 29;
        int three =33;
        boolean number = one > two && one > three;
        boolean number1 = two > three && two > one;
        boolean number2 = three > one && three > one;

        if (number ) {
            System.out.println("Число"+ one + "больше");
        }else if (number1){
            System.out.println("Число"+ two + "больше");
        }else if (number2) {
            System.out.println("Число "+ three + " больше");
        }
        System.out.println();
    }



}