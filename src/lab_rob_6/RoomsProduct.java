package lab_rob_6;

public class RoomsProduct implements ProductDemo{
    double length; // довжина
    double width; // ширина
    double height; // висота
    int workshops; // цехи

    String name1;
    String name2;


    public RoomsProduct(double length, double width, double height, int workshops, String name1, String name2) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.workshops = workshops;
        this.name1 = name1;
        this.name2 = name2;
    }

    public void numberWorkedHops() {
        System.out.println("Кількість  цехів: " + workshops);
    }

    public void largestToday() {
        System.out.println("Виготовлено продукції  за сьогодні " + name1 + ":15 " + name2 + ":30");
    }
}
