package com.company;

public class Workers {
    private int manager; // менеджер
    private int simple_worker; // простий робітник
    private int director; // деректор
    private int secretary; // секретар
    private int working_hours;// робочий час

    String name1;


     Workers(int manager, int simple_worker, int director, int secretary, int working_hours) {
        this.manager = manager;
        this.simple_worker = simple_worker;
        this.director = director;
        this.secretary = secretary;
        this.working_hours = working_hours;
    }

    private void employees() {
        System.out.println("Кількість проcтих робочих на  заводі: " + (simple_worker));
    }

    void employeesDemo(){
         employees();
    }
    double working_hours() {
        double s = working_hours * 8;
        return s;
    }

    double working_hourss() {
        double e = working_hours * 6;
        return e;
    }

    void allWorkers() {
        int q = manager + simple_worker + director + secretary;
        System.out.println("Весь робочий персонал " + q + ":");
    }

    // перевизначений метод
    double working_hourss(double working_hours) {
        double e = working_hours * 6;
        return e;
    }

    //перевантажений метод
    void price(int kop) {
        int e = ((manager + simple_worker + secretary + director) * 100);
        System.out.println("Затрати на персонал " + e);
    }

    void tsekh(Rooms r) {
        if (simple_worker <= 30) {
            System.out.println("Достатньо одного цеху ");

        } else {
            System.out.println("Потрібно два цеха ");

        }
    }
    String Workers(){
        name1= "Ім'я деректороа Петро" ;
        return name1;

        }
        void viskrchehy(Rooms t,Materials a){
         int cge = t.getWorkshops()+1;
         System.out.println("Відкривається цех під номером "+ a.getBoard());
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
         simple_worker=simple_worker*2;
        this.simple_worker = simple_worker;
    }

    public int fine(int countFine){
         if (countFine==1){
             System.out.println("Вихідні " + countFine + "дні");
             return countFine;
         }
         System.out.println("Вихідні " + countFine + "дні");
         return countFine * fine(countFine-1);
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

    public String getName1() {
        return name1;
    }

    public void setName1(String name1) {
        this.name1 = name1;
    }
}
