public class Main {
    public static void main(String[] args) {
        //Задание 1
        System.out.println("Task 1");
        int person = 17;
        if (person >= 18) {
            System.out.println("Поздравляем с совершеннолетием!");
        } else {
            System.out.println("Потерпите ещё немного! Вам ещё нет восемнадцати!");
        }

        //Задание 2
        System.out.println("Task 2");
        int child = 9;
        if (child >= 7) {
            System.out.println("Ребёнок ходит в школу");
        } else {
            System.out.println("Ребёнку ещё рано идти в школу");
        }
        if (child >= 18) {
            System.out.println("Ребёнок уже закончил школу");
        } else {
            System.out.println("Ребёнок ещё не закончил школу");
        }
        if (child >= 24) {
            System.out.println("Уже взрослый");
        } else {
            System.out.println("Ещё не повзрослел");
        }
    }
}