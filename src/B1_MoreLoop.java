public class B1_MoreLoop extends World {

    public void go() {
        plane.pausetime = 0;
        plane.trailWidth = 5;



        for (int y = 0; y<800;y+=1) { // ++ means y+=1 or maybe like y+=2

            for (int x = 0; x < 1000; x = x + 1) {
                plane.teleport(x, y); // starts at y=150 x=0 you can see it in line above
//                plane.setColor(x/5,0,100); // max x = 200
//                square(1);
                plane.setPixelColor(150,0,x/4);
                System.out.println("x: " + x); //what does green mean?
            }
        }
      //  plane.teleport(300, 300);
    //    hexagon(50);


    }

    public void square(int distance) { // distance is the parameter
        for (int z = 0; z < 4; z=z+1){
            plane.isTrail = true;
            plane.move(distance);
            plane.turn(90);
            System.out.println("z: " + z);
        }
    }

    public void hexagon (int distance) {
        for (int h = 0; h <= 6; h = h + 1) {
            plane.isTrail = true;
            plane.move(distance);
            plane.turn(60);
            System.out.println("h:" + h);
            // level 1 use move and turn
            // level 2 use move and turn in a for loop
            // level 3 would be also use a parameter to determine the side length

        }
    }
    public void polygon (int n, int sideLength){
        // level 4 draw a shape with n number of sides
        // where n is a parameter
    }
}

