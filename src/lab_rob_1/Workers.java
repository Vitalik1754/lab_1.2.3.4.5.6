package lab_rob_1;

public class Workers {
    int manager; // менеджер
    int simple_worker; // простий робітник
    int director; // деректор
    int secretary; // секретар
    int working_hours;// робочий час



    Workers(int manager, int simple_worker, int director, int secretary, int working_hours) {
        this.manager = manager;
        this.simple_worker = simple_worker;
        this.director = director;
        this.secretary = secretary;
        this.working_hours = working_hours;
    }

    void employees() {
        System.out.println("Кількість проcтих робочих на  заводі: " + (simple_worker));
    }

    int addHours(int i){
        return i;
    }
}
