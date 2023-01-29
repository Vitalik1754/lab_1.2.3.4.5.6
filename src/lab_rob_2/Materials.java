package lab_rob_2;

public class Materials {
    double skin; // шкіра
    double board; // дерево
    double paralon; // паралон
    double glue; // клей

    public Materials(double skin, double board, double paralon, double gleu) {
        this.skin = skin;
        this.board = board;
        this.paralon = paralon;
        this.glue = gleu;
    }

    public Materials() {
    }

    public Materials(double skin, double board) {
        this.skin = skin;
        this.board = board;
    }

    public Materials(double paralon) {
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

}
