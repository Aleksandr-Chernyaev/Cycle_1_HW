//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {
        //TIP Press <shortcut actionId="ShowIntentionActions"/> with your caret at the highlighted text
        // to see how IntelliJ IDEA suggests fixing it.

        // task 1
        System.out.println("Задача 1");

        for (int i = 1; i <= 10; i++) {
            System.out.println(i);
        }


        // task 2
        System.out.println("Задача 2");

        for (int i = 10; i > 0; i--) {
            System.out.println(i);
        }


        // task 3
        System.out.println("Задача 3");

        for (int i = 0; i <= 17; i = i + 2) {
            System.out.println(i);
        }


        // task 4
        System.out.println("Задача 4");

        for (int i = 10; i >= -10; i--) {
            System.out.println(i);
        }


        // task 5
        System.out.println("Задача 5");

        for (int i = 1904; i <= 2096; i = i + 4) {
            System.out.println(i + " год является високосным");
        }


        // task 6
        System.out.println("Задача 6");

        for (int i = 7; i <= 98; i = i + 7) {
            System.out.println(i);
        }


        // task 7
        System.out.println("Задача 7");

        for (int i = 1; i <= 512; i = i * 2) {
            System.out.println(i);
        }


        // task 8
        System.out.println("Задача 8");

        int sun = 29000;
        int total = 0;

        for (int i = 1; i <= 12; i++) {
            total = total + sun;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
        }


        // task 9
        System.out.println("Задача 9");

        sun = 29000;
        total = 0;

        for (int i = 1; i <= 12; i++) {
            total = total + total / 100;
            total = total + sun;
            System.out.println("Месяц " + i + ", сумма накоплений равна " + total + " рублей.");
        }


        // task 10
        System.out.println("Задача 10");

        int nomber = 2;

        for (int i = 1; i <= 10; i++) {
            System.out.println(nomber + "*" + i + "=" + (nomber * i));
        }
    }
}