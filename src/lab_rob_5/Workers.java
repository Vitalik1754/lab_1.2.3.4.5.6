package lab_rob_5;


public class Workers extends Materials {
    private int manager; // менеджер
    private int simple_worker; // простий робітник
    private int director; // деректор
    private int secretary; // секретар
    private int working_hours;// робочий час



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

    void  employees(int i){
        System.out.println("Кількість проcтих робочих на  заводі: " + (simple_worker + i));
    }

    void allInfo(){
        employees();
        System.out.println(addHours(3));
    }

    void returnManagers(Workers workers){
        employees();
        System.out.println("Кількість менеджерів: " + workers.manager);
    }

    void information1(){
        information();
        System.out.println("Кількість секретарів: " + secretary);
    }

    @Override
    public void callM() {
        allInfo();
    }






    public int getManager() {
        return manager;
    }

    public void setManager(int manager) {
        this.manager = manager;
    }

    public int getSimple_worker() {
        return simple_worker;
    }

    public void setSimple_worker(int simple_worker) {
        int s = simple_worker*2;
        this.simple_worker = s;
    }

    public int getDirector() {
        return director;
    }

    public void setDirector(int director) {
        this.director = director;
    }

    public int getSecretary() {
        return secretary;
    }

    public void setSecretary(int secretary) {
        this.secretary = secretary;
    }

    public int getWorking_hours() {
        return working_hours;
    }

    public void setWorking_hours(int working_hours) {
        this.working_hours = working_hours;
    }
}
