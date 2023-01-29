package lab_rob_5;

public class Product {
    static String name1 = "Диван";
    static String name2;
    static {
        name2 = "Крісло";
    }

    static void largestToday() {
        System.out.println("Виготовлено продукції  за сьогодні " + name1 + ":15 " + name2 + ":30");
    }

    static void allTime(){
        System.out.println("Найбільше виготовлено продукції на заводі за весь час в одну зміну: ");
        largestToday();
    }


}
