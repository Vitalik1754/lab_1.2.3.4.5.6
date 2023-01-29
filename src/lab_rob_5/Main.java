package lab_rob_5;



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
        materials.information();
        materials.callM();

        System.out.println();

        System.out.println("Кількість додаткових годин: " + workers.addHours(3));
        workers.employees();
        workers.employees(3);
        workers.allInfo();
        workers.returnManagers(workers);
        workers.information1();
        workers.callM();


        System.out.println();

        System.out.println("Площа приміщення: " + rooms.squareDemo());
        rooms.numberWorkedHopsDemo();
        System.out.println("Площа приміщення: " + rooms.squareDemo1());
        rooms.allInfoDemo();
        rooms.otherMDemo();
        rooms.callM();
        rooms.callM(4);

        System.out.println();

        Product.largestToday();
        Product.allTime();

        System.out.println();

        Finance finance = new Finance();
        finance.salary(100000);
        finance.showInfo();

        System.out.println();

        Auto auto = new Auto(5,15,5,50);
        auto.test();

        System.out.println();

        Dispatch dispatch = new Dispatch();
        dispatch.dispatch(1);
        dispatch.dispatch(2);
        dispatch.dispatch(3);
    }
}