public class Main {
    public static void main(String[] args) {
        task1();
        task2();
        task3();
        task4();
        task5();
        task6();
        task7();
    }

    public static void task1() {

        System.out.println("\nЗадача_1");

        int age = 18;

        if (age >= 18){
            System.out.println("Он совершеннолетний");
        } else {
            System.out.println("Он не достиг совершеннолетия, нужно немного подождать");
        }
    }
    public static void task2() {

        System.out.println("\nЗадача_2");
        int temperature = 10;

        if (temperature <= 5) {
            System.out.println("На улице " + temperature + " градусов нужно надеть шапку");
        } else {
            System.out.println("На улице " + temperature + " градусов можно идти без шапки");
        }

    }

    public static void task3() {

        System.out.println("\nЗадача_3");

        int speed = 50;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то ппридётся заплатить штраф");
        }
        if (speed <= 60) {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
    }

    public static void task4() {

        System.out.println("\nЗадача_4");
        int age = 7;
        if (age <2) {
            System.out.println("Гуляй пока молодой");
        }
        if (age >= 2 && age <= 6) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в детский сад");
        }
        if (age > 6 && age <= 18) {
            System.out.println("Если возраст человека равен " + age + ", то ему нужно ходить в школу");
        }
        if (age > 18 && age < 24) {
            System.out.println("Если возраст человека равен " + age + ", то его место в университете");
        }
        else {
            System.out.println("Если возраст человека равен " + age + ", то ему пора ходить на работу");
        }

    }

    public static void task5() {

        System.out.println("\nЗадача_5");
        int age = 6;
        byte adult = 1; // согласен, можно без врослого в переменных и тогода третье условие будет попроще, но так появляется интрига прокатится ребёнок или нет)

        if (age < 5) {
            System.out.println("Если возраст ребенка равен " + age + ", то он не может кататься на атракционе");
        }
        if (age > 5 && age <14 && adult >= 1) {
            System.out.println("Если возраст ребенка равен " + age + ", то он может кататься только в сопровождении взрослого.");
        }
        if (age > 5 && age <14 && adult < 1){
        System.out.println("Если возраст ребенка равен " + age + ", то он может кататься только в сопровождении взрослого. Если взрослого нет, то кататься нельзя");
        }
        else {
            System.out.println("Если возраст ребенка равен " + age + ", то он может кататься без сопровождения взрослого");
        }
    }


    public static void task6() {

        System.out.println("\nЗадача_6");

        int sittingPlace = 60;
        int standingPlace = 42;

        if (standingPlace > 42 || sittingPlace > 60) {
            System.out.println("Тесные контакты запрещены! Перерасспределитесь по местам или ждите следующий поезд");
        } else {

            if (sittingPlace < 60) {
                System.out.println("В вагоне есть сидячие места");
            }
            if (standingPlace < 42) {
                System.out.println("В вагоне есть стоячие места");
            } else {
                System.out.println("В вагоне мест нет, ждите следующий поезд");
            }
        }
    }
    public static void task7() {

        System.out.println("\nЗадача_7");
    int one = 1;
    int two = 1;
    int three = 3;

    if (one >= two && one > three) {
        System.out.println(one + " самое большое число");
    } if (two > one && two >= three ) {
        System.out.println(two + " самое большое число");
    } if (three >= one && three > two) {
            System.out.println(three + " самое большое число");
        } else {
                System.out.println("Все числа одинаковы");}
        }
    }

