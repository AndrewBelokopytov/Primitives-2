public class Main {
    public static void main(String[] args) {
        System.out.printf("Здравствуйте!");

        //Задаем переменные для вводных данных

        double balanse = 300; // Текущая сумма на счету
        double deposit = 1100; // Сумма пополнения

        // Производим расчет начисленых бонусов и общую сумму на счету

        if (deposit > 1000) {
            int bonus = (int) (deposit / 100); // Начислено бонусов
            System.out.println(" Вам начислено бонусов " + bonus); // Вывод количества начисленых бонусов
            int result = (int) (balanse + deposit + bonus); // Итоговая сумма баланса
            System.out.println(" На вашем счету " + result); // Вывод общего баланса//
        } else {
            int bonus = (int) (0);
            System.out.println(" Бонусов не начислено "); // Вывод количества начисленых бонусов
            int result = (int) (balanse + deposit + bonus);
            System.out.println(" На вашем счету " + result); // Вывод общего баланса
        }
    }
}