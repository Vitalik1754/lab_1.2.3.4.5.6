package lab_rob_6;


public class Main {
    public static void main(String[] args) {
        Materials materials = new Materials(5,15,5,50);

        Workers workers = new Workers(5,15,5,50);

        RoomsProduct roomsProduct = new RoomsProduct(150, 70, 6, 7, "Диван", "Крісло");

        materials.allMaterials();

        System.out.println();

        materials.allMaterials();

        System.out.println();

        roomsProduct.numberWorkedHops();
        roomsProduct.largestToday();


    }
}
