public class A1_HowToMove extends World { // class = program

    // you can highlight brackets and find the matching one, don't write code after end of class/program
    // public void "go" = method (the recipe) has parentheses


    public void go() { // method

        System.out.println("This message will be printed to the window below."); // printing the window below, green means it's not technically code
        plane.isTrail = true;
        plane.trailWidth = 5;
        plane.pausetime = 2;
        plane.setColor(200, 0, 0);
        plane.startingAngle(90);
        house();
    }

    public void house(){
        plane.pausetime = 1;
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.move(200);
        plane.pausetime = 1;
        plane.startingAngle(360);
        plane.isTrail = true;
        plane.move(200);
        plane.pausetime = 1;
        plane.startingAngle(270);
        plane.isTrail = true;
        plane.move(200);
        plane.pausetime = 1;
        plane.startingAngle(230);
        plane.isTrail = true;
        plane.move(150);
        plane.pausetime = 1;
        plane.startingAngle(130);
        plane.isTrail = true;
        plane.move(153);
        plane.pausetime = 1;
        plane.startingAngle(360);
        plane.isTrail = true;
        plane.move(200);
        plane.pausetime = 1;
        plane.startingAngle(90);
        plane.isTrail = false;
        plane.move(110);
        plane.pausetime = 1;
        plane.startingAngle(180);
        plane.isTrail = false;
        plane.move(90);
        plane.pausetime = 1;
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.move(87);
        plane.pausetime = 1;
        plane.startingAngle(180);
        plane.isTrail = false;
        plane.move(30);
        plane.pausetime = 1;
        plane.startingAngle(270);
        plane.isTrail = true;
        plane.move(87);
        plane.pausetime = 1;
        plane.startingAngle(360);
        plane.isTrail = true;
        plane.move(30);
        plane.pausetime = 1;
        plane.startingAngle(360);
        plane.isTrail = false;
        plane.move(30);
        plane.pausetime = 1;
        plane.startingAngle(270);
        plane.isTrail = false;
        plane.move(30);
        plane.pausetime = 1;
        plane.startingAngle(270);
        plane.isTrail = true;
        plane.move(20);
        plane.pausetime = 1;
        plane.startingAngle(360);
        plane.isTrail = true;
        plane.move(20);
        plane.pausetime = 1;
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.move(20);
        plane.pausetime = 1;
        plane.startingAngle(180);
        plane.isTrail = true;
        plane.move(20);
        plane.pausetime = 1;
        plane.startingAngle(180);
        plane.isTrail = false;
        plane.move(110);
        plane.pausetime = 1;
        plane.startingAngle(270);
        plane.isTrail = true;
        plane.move(20);
        plane.pausetime = 1;
        plane.startingAngle(360);
        plane.isTrail = true;
        plane.move(20);
        plane.pausetime = 1;
        plane.startingAngle(90);
        plane.isTrail = true;
        plane.move(20);
        plane.pausetime = 1;
        plane.startingAngle(180);
        plane.isTrail = true;
        plane.move(20);
        plane.pausetime = 1;
        plane.startingAngle(180);
        plane.isTrail = false;
        plane.move(60);
    }

} // end of program/class

