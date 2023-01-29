package lab_rob_2;

public class Rooms {
    double length; // довжина
    double width; // ширина
    double height; // висота
    int workshops; // цехи

    Rooms(double length, double width, double height, int workshops) {
        this.length = length;
        this.width = width;
        this.height = height;
        this.workshops = workshops;
    }
    void numberWorkedHops() {
        System.out.println("Кількість  цехів: " + workshops);
    }

    double square() {
        double q = length * width * height;
        return q;
    }
    int square(int l, int w, int h){
        return l * w * h;
    }

    void allInfo(){
        numberWorkedHops();
        System.out.println(square());
    }
}
