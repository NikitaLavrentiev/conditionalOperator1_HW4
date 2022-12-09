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
        if (age > 18 && age <= 24) {
            System.out.println("Если возраст человека равен " + age + ", то его место в университете");
        }

        if (age < 24){
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
        if (age > 5 && age <14 && adult >= 0) {
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

        int trainCapacity = 102;
        int sittingPlaces = 60;
        int otherPlaces = trainCapacity - sittingPlaces;

        int countSittingPlaces = 60;
        int countOtherPlaces = 42;


        if (sittingPlaces > countSittingPlaces) {
            System.out.println("В вагоне есть " + (sittingPlaces - countSittingPlaces) + " свободных сидячих мест");
        } else
            System.out.println("Сидячих мест нет");

        if (otherPlaces > countOtherPlaces) {
            System.out.println("В вагоне есть " + (otherPlaces - countOtherPlaces) + " свободных стоячих мест");
        } else System.out.println("Стоячих мест нет");

        if (sittingPlaces == countSittingPlaces && otherPlaces == countOtherPlaces) {
            System.out.println("Ждите следующий поезд");
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

