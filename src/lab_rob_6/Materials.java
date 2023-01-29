package lab_rob_6;

public class Materials implements MaterialsDemo{
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

    public void allMaterials(){
        System.out.println("Матеріали: ");
        System.out.println(skin);
        System.out.println(board);
        System.out.println(paralon);
        System.out.println(glue);
    }
}
