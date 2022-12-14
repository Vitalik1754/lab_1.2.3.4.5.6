package com.company;

import java.io.FilterOutputStream;

public class Main {
    public static final String ANSI_RESET = "\u001B[0m";
    public static final String ANSI_RED = "\u001B[31m";

    public static void main(String[] args) {
        Rooms w = new Rooms(150, 70, 6, 7) {

            public void premium() {

            }
        };
        Workers s = new Workers(10,64,1,2,1);
        Materials l = new Materials(5,15,5,50, w.getLength(), w.getWidth(), w.getHeight(), w.getWorkshops());

        ///////////////////////////////////////////////////////////////////////////////////////////////////////////


        NameWorkers.allTime();

        w.namberWorkdhops();
        System.out.println("Площа заводу " + w.square());
        System.out.println("Площа цехів " + w.squarre());
        w.price(19);
        s.viskrchehy(w,l);
        /////////////////////////////////////////////////////////////////////////////////////////////////////////

        s.employeesDemo();
        System.out.println (ANSI_RED + "Робочий час працівників з понеділка по п'ятницю: " + ANSI_RESET + s.working_hours());
        System.out.println("Робочий час працівників у суботу: " + s.working_hourss());
        s.allWorkers();
        s.price(42);
        System.out.println(s.Workers());
        w.peoplechex(s,l);
        ;
        /////////////////////////////////////////////////////////////////////////////////////////////////////////


        l.sofa();
        System.out.println("Потрібно клею на диван: " + l.need_glue()+"л");
        l.price(25);
        l.perenos(s,w);

        /////////////////////////////////////////////////////////////////////////////////////////////////////////

        w.place(l);
        s.tsekh(w);
        l.people(s);

    }

}
