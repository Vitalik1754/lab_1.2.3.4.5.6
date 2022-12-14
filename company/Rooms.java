package com.company;

public abstract class Rooms  {
    private double length; // довжина
    private double width; // ширина
    private double height; // висота
    private int workshops; // цехи

     Rooms(double length, double width, double height, int workshops) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.workshops = workshops;
    }
    void peoplechex(Workers q,Materials p){
         double rozgryzka = 2 * p.getSkin()/q.getManager();
         System.out.println("Щоб прийняти розгрузку потрібно "+rozgryzka + " менеджера ");
    }
    void namberWorkdhops() {
        System.out.println("Кількість  цехів: " + workshops);
    }

    double square() {
        double q = length * width * height;
        return q;
    }

    double squarre() {
        double e = length * width * height / 7;
        return e;
    }

    int squarre(int squarre) {
        double e = length * width * height / 7;
        return (int) e;
    }

    //перевантажений метод
    void price(double kop) {
        double e = ((workshops) * 100);
        System.out.println("Затрати на цехи " + e);
    }

    void place(Materials m) {
        if (workshops <= 100) {
            System.out.println("Достатньо одного цеху на матеріал");
        }
    else{
        System.out.println("Потрібно більше місця");
        }
    }

    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        this.length = length;
    }

    public double getWidth() {
        return width;
    }

    public void setWidth(double width) {
        this.width = width;
    }

    public double getHeight() {
        return height;
    }

    public void setHeight(double height) {
        this.height = height;
    }

    public int getWorkshops() {
        return workshops;
    }

    public void setWorkshops(int workshops) {
        this.workshops = workshops;
    }


    public abstract void premium();
}