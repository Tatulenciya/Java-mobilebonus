public class Main {
    public static void main(String[] args) {

        int startBalance = 450;    // начальный баланс счета
        int replenishment = 1253;  // сумма пополнения счета
        int bonus = 1;             // бонус за каждые полные 100 руб пополнения счета
        int balance;               // итоговый баланс счета

        if (replenishment < 1000) {
            balance = startBalance + replenishment;
        } else {
            balance = replenishment * bonus / 100 + startBalance + replenishment;
        }
        System.out.println("Баланс счета равен " + balance + " рублей.");

    }
}