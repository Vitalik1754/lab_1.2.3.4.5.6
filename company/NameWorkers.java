package com.company;

public class NameWorkers {
    private static String name1 = "Дивани";
    private static String name2 = "Ліжка";

    public static String largestToday() {
        System.out.println("Виготовлено продукції  за сьогодні " + name1+ ":15 " +name2+":30");
        String QQQ = name1+ ":20  " + name1 +":45 ";
        return QQQ;
    }
    public static void allTime(){
        System.out.println("Найбільше виготовлено продукції на заводі за весь час " + largestToday() + "в одну зміну");
    }

    public static String getName1() {
        return name1;
    }

    public static void setName1(String name1) {
        NameWorkers.name1 = name1;
    }

    public static String getName2() {
        return name2;
    }

    public static void setName2(String name2) {
        NameWorkers.name2 = name2;
    }
}

