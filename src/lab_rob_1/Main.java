package lab_rob_1;

public class Main {
    public static void main(String[] args) {
        Materials materials = new Materials(5,15,5,50);

        Workers workers = new Workers(10,64,1,2,1);

        Rooms rooms = new Rooms(150, 70, 6, 7);

        materials.allMaterials();
        System.out.println("Кількість матеріалу: " + materials.countM(3));

        System.out.println();

        System.out.println("Кількість додаткових годин: " + workers.addHours(3));
        workers.employees();

        System.out.println();

        System.out.println("Площа приміщення: " + rooms.square());
        rooms.numberWorkedHops();
    }
}