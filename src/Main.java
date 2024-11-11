import java.util.Arrays;

public class Main {
    public static void main(String[] args) {

        int deposit = 200;
        int addDeposit = 1300;
        if (addDeposit > 1000) {
            int bonus = addDeposit / 100;
            System.out.println("Получено бонусов: " + bonus);
            System.out.println("Сумма на Вашем счету: " + (deposit + bonus + addDeposit));
        } else {
            int bonus = 0;
            System.out.println("Получено бонусов: " + bonus);
            System.out.println("Сумма на Вашем счету: " + (deposit + addDeposit));
        }
    }
}