package lab_rob_5;



public class Auto extends Materials {
    public Auto(double skin, double board, double paralon, double gleu) {
        super(skin, board, paralon, gleu);
    }

    void showMaterials(){
        allMaterials();
    }

    void test(){
        Driver driver = new Driver();
        driver.showName();
    }

    class Driver{
        String n = "Андрій";
        void showName(){
            System.out.println("Імя водія: " + n);
            showMaterials();
        }
    }
}
