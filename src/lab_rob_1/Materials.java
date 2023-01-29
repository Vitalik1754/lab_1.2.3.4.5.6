package lab_rob_1;

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

    void allMaterials(){
        System.out.println("Матеріали: ");
        System.out.println(skin);
        System.out.println(board);
        System.out.println(paralon);
        System.out.println(glue);
    }
    double countM(int i) {
        return skin + board + paralon + glue + i;
    }
}
