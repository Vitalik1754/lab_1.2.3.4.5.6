package lab_rob_6;

public class Workers extends Materials{
    public Workers(double skin, double board, double paralon, double gleu) {
        super(skin, board, paralon, gleu);
    }

    public void allMaterials(){
        System.out.println("Матеріали: ");
        System.out.println(skin);
        System.out.println(board);
        System.out.println(paralon);
        System.out.println(glue);
    }
}
