package lab_rob_5;

public class Finance {
    final double profit = 500000.5;
    final double costs = 200000.7;
    final double tax = 50000.0;

    void showInfo(){
        System.out.println("Дохід: " + profit);
        System.out.println("Витрати: " + costs);
        System.out.println("Податок: " + tax);
    }

    void salary(final int salary){
        System.out.println("Витрати на зарплату: " + salary);
    }


}
