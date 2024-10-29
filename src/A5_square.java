public class A5_square extends World {

    public void go() {
        plane.isTrail = true;
        plane.trailWidth = 5;
        plane.pausetime = 2;
        plane.setColor(0, 0, 80);
        plane.startingAngle(90);
        square(200); // call the square method
        plane.teleport(300,400);
        plane.setColor(150,0,0);
        square(300);
    }


    public void square(int length) { //define the square method
        //length is a parameter (a type of variable)
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.trailWidth = 10;
        plane.move(length);
        plane.turn(90);
        plane.move(length);
        plane.turn(90);
        plane.move(length);
        plane.turn(90);
        plane.move(length);
        plane.turn(90);
    }

}


