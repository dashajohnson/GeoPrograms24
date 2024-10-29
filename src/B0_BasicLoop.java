public class B0_BasicLoop extends World {

    public void go() {
        plane.isTrail = true;
        plane.trailWidth = 2;
        plane.teleport(26,22);

        for(int x=0;x<100;x=x+1)


//        for(int x=0;x<5;x=x+2) { //start, condition, increment - assign new value to x
//            System.out.println(x); // keep going unless condition isn't true
//            plane.square(100);
//        }
//        System.out.println("end of loop");
        plane.pausetime = 0;

        for (int x=0; x<6; x=x+1) {
            flower(x);
            plane.move(100);
        }

    } //end of go()

    public void flower(int x) {
        plane.startingAngle(65);
        for (int z = 0; z < 200; z = z + 1) { // 100 circles
            System.out.println("circle #" + z);
            plane.setColor(x*50,0,z+50);
            plane.circle(20);
            plane.turn(270);
            plane.move(z);

        }
    }
}
//1.  Check condition 2a. If condition is true, do the stuff. 2b. If condition is false, skip to end of loop. 3. increment. 4. repeat