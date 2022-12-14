package com.company;

public class Materials extends Rooms {
    private double skin; // шкіра
    private double board; // дерево
    private double paralon; // паралон
    private double glue; // клей

     public Materials(double skin, double board, double paralon, double gleu,double length,double width, double height,int workshops ) {
         super(length,width,height,workshops);
         this.skin = skin;
        this.board = board;
        this.paralon = paralon;
        this.glue = gleu;
    }
    private void allMaterials(double skin,double board,double paralon) {
        double allMaterials = skin + board + paralon;
        System.out.println("На складі знаходиться матеріалу  " + allMaterials);
    }
         void allMaterialsDemo(){allMaterials(15,10,17);}


    void sofa() {
        System.out.println("Кількість матеріалу на диван. Шкіри:" + (skin / 2) + ",дошок:" + (board / 3) + ",паралону: " + (paralon / 2) + " упаковки");
    }

    double need_glue() {
        double r = (skin + board + paralon + glue) / 20;
        return r;
    }

    int need_glue(int need_glue) {
        double e = (skin + board + paralon + glue) / 20;
        return (int) e;
    }

    //перевантажений метод
    void price(double kop) {
        double e = ((skin + board + paralon + glue) * 100);
        System.out.println("Затрати на матеріал " + e);
    }

    void people(Workers w) {
        if (skin + glue + board + paralon <= 100) {
            System.out.println("Достатньо одного робочого для вигрузки");
        } else {
            System.out.println("Потрібно більше робочих");
        }

    }
    void perenos(Workers r,Rooms b){
         double pereno = (r.getSimple_worker()/15)+b.getWorkshops();
         System.out.println("Потрібно робочих " +pereno + " в 15 цех");
    }

    public double getSkin() {
        return skin;
    }

    public void setSkin(double skin) {
        this.skin = skin;
    }

    public double getBoard() {
        return board;
    }

    public void setBoard(double board) {
        this.board = board;
    }

    public double getParalon() {
        return paralon;
    }

    public void setParalon(double paralon) {
        this.paralon = paralon;
    }

    public double getGlue() {
        return glue;
    }

    public void setGlue(double glue) {
        this.glue = glue;
    }


    @Override
    public void premium(){
         System.out.println("Всім працівникам премія в річницю заводу");

    }

}

