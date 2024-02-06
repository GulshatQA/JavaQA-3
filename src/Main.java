//TIP To <b>Run</b> code, press <shortcut actionId="Run"/> or
// click the <icon src="AllIcons.Actions.Execute"/> icon in the gutter.
public class Main {
    public static void main(String[] args) {

        int initialBalance = 1_100; // начальный счёт
        int addend = 4_550; // пополнение
        int bonus = 1;

        if (addend > 1_000) {
            bonus = addend / 100;
        }

        int finalBalance = initialBalance + addend + bonus;

        System.out.println("Бонус: " + bonus);
        System.out.println("Итоговый счёт: " + finalBalance);
        
    }
}