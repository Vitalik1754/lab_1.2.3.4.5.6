package lab_rob_4;

public class Materials extends Rooms{
    private double skin; // шкіра
    private double board; // дерево
    private double paralon; // паралон
    private double glue; // клей

    Materials(double skin, double board, double paralon, double gleu) {
        super();
        this.skin = skin;
        this.board = board;
        this.paralon = paralon;
        this.glue = gleu;
    }

    Materials() {
    }

    Materials(double skin, double board) {
        this.skin = skin;
        this.board = board;
    }

    Materials(double paralon) {
        this.paralon = paralon;
    }

    void allMaterials(){
        System.out.println("Матеріали: ");
        System.out.println(skin);
        System.out.println(board);
        System.out.println(paralon);
        System.out.println(glue);
    }
    double countM(double i) {
        return skin + board + paralon + glue + i;
    }

    int countM(int i){
        return i;
    }

    void allInfo(){
        allMaterials();
        System.out.println(countM(3.0));
    }

    Materials up(int i){
        Materials materials = new Materials(skin + i, board + i, paralon + i, glue + i);
        return materials;
    }

    void information(){
        numberWorkedHopsDemo();
        System.out.println("Кількість паралону: " + paralon);
    }








    public double getSkin() {
        return skin;
    }

    public void setSkin(double skin) {
        double s = skin*2;
        this.skin = s;
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
}
