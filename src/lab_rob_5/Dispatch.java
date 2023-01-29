package lab_rob_5;

public class Dispatch {

    Rooms rooms = new Rooms(150, 70, 6, 7);
    Materials materials = new Materials(5,15,5,50);
    Workers workers = new Workers(10,64,1,2,1);
    Rooms r;

    void dispatch(int j) {
        if (j == 1){
            r = rooms;
            r.callM();
        } else if (j == 2){
            r = materials;
            r.callM();
        } else if (j == 3) {
            r = workers;
            r.callM();
        }
    }
}
