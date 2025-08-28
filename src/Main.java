public class Main {
    public static void main(String[] args) {

        //task 1
        System.out.println("Task 1");
        int age = 15;
        if (age >= 18) {
            System.out.println("Если возраст человека равен " + age + ", то он совершеннолетний");
        } else {
            System.out.println("Если возраст человека равен " + age + ", то он не достиг совершеннолетия, нужно немного подождать");
        }
        System.out.println();

        //Task 2
        System.out.println("Task 2");
        int temp = 5;
        if (temp < 5) {
            System.out.println("На улице " + temp + " градусов, нужно надеть шапку");
        } else {
            System.out.println("На улице " + temp + " градусов, можно идти без шапки");
        }
        System.out.println();

        //task 3
        System.out.println("Task 3");
        int speed = 60;
        if (speed > 60) {
            System.out.println("Если скорость " + speed + ", то придется заплатить штраф ");
        } else {
            System.out.println("Если скорость " + speed + ", то можно ездить спокойно");
        }
        System.out.println();

        //Task 4
        System.out.println("Task 4");
        int ageMan = 29;
        if (ageMan > 2 && ageMan <= 6) {
            System.out.println("Если возраст человека равен " + ageMan + ", то ему нужно ходить в детский сад");
        } else if (ageMan >= 7 && ageMan <= 17) {
            System.out.println("Если возраст человека равен " + ageMan + ", то ему нужно ходить в школу");
        } else if (ageMan >= 18 && ageMan <= 24) {
            System.out.println("Если возраст человека равен " + ageMan + ", то его место в университете");
        } else {
            System.out.println("Если возраст человека равен " + ageMan + ", то ему пора ходить на работу");
        }
        System.out.println();

        //Task 5
        System.out.println("Task 5");
        int ageChilde = 18;
        if (ageChilde < 5) {
            System.out.println("Если возраст ребенка равен " + ageChilde + ", то ему нельзя кататься на аттракционе");
        } else if (ageChilde >= 5 && ageChilde < 14) {
            System.out.println("\"Если возраст ребенка равен " + ageChilde + ", то ему можно кататься на аттракционе в сопровождении взрослого");
        } else {
            System.out.println("Если возраст ребенка равен " + ageChilde + ", то ему можно кататься на аттракционе без сопровождения взрослого");
        }
        System.out.println();

        //Task 6
        System.out.println("Task 6");
        int places = 754;
        if (places < 60) {
            System.out.println("В вагоне осталось " + (60 - places) + " сидячих мест и 42 стоячих места");
        } else if (places >= 60 && places < 102) {
            System.out.println("В вагоне отсалось " + (102 - places) + " cтоячих местa. Свободных мест для сидения нет");
        } else {
            System.out.println("В вагоне свободных мест нет");
        }
        System.out.println();

        //Task 7
        System.out.println("Task 7");
        int one = 1;
        int two = 2;
        int three = 3;
        if (one > two && one > three) {
            System.out.println("Первое число большее");
        } else if (two > one && two > three) {
            System.out.println("Второе число большее");
        } else {
            System.out.println("Третье число большее");
        }
    }
}