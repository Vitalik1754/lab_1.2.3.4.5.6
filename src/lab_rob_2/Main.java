package lab_rob_2;


public class Main {
    public static void main(String[] args) {
        Materials materials = new Materials(5,15,5,50);
        Materials materials1 = new Materials();
        Materials materials2 = new Materials(5,15);
        Materials materials3 = new Materials(5);

        Workers workers = new Workers(10,64,1,2,1);

        Rooms rooms = new Rooms(150, 70, 6, 7);

        materials.allMaterials();
        System.out.println("Кількість матеріалу: " + materials.countM(3.0));
        System.out.println("Кількість додаткового матеріалу: " + materials.countM(3));
        materials.allInfo();
        materials.up(2);

        System.out.println();

        System.out.println("Кількість додаткових годин: " + workers.addHours(3));
        workers.employees();
        workers.employees(3);
        workers.allInfo();
        workers.returnManagers(workers);


        System.out.println();

        System.out.println("Площа приміщення: " + rooms.square());
        rooms.numberWorkedHops();
        System.out.println("Площа приміщення: " + rooms.square(140, 60, 6));
        rooms.allInfo();
    }
}