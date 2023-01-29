package lab_rob_3;

public class Rooms {
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
    private void numberWorkedHops() {
        System.out.println("Кількість  цехів: " + workshops);
    }

    private double square() {
        double q = length * width * height;
        return q;
    }
    private int square(int l, int w, int h){
        return l * w * h;
    }

    private void allInfo(){
        numberWorkedHops();
        System.out.println(square());
    }

    private void otherM(Materials materials, Workers workers){
        System.out.println("Кількість шкіри: " + materials.getSkin());
        System.out.println("Кількість простих робочих: " + workers.getSimple_worker());

    }

    public void numberWorkedHopsDemo(){
        numberWorkedHops();
    }
    public double squareDemo(){
        return square();
    }
    public double squareDemo1(){
        return square(100, 80, 4);
    }
    public void allInfoDemo(){
        allInfo();
    }
    public void otherMDemo(){
        otherM(new Materials(5,15,5,50), new Workers(10,64,1,2,1));
    }









    public double getLength() {
        return length;
    }

    public void setLength(double length) {
        double l = length*2;
        this.length = l;
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
}
