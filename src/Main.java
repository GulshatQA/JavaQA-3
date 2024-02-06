//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int score = 100; // начальный счёт
        int deposit = 1550; // пополнение
        int bonus = 1;

        if (deposit >= 1000) {
            bonus = deposit / 100;
        }

        int balance = score + deposit + bonus;

        System.out.println(balance);
        
    }
}