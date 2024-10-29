public class FinalFilter extends World {
    public int red;
    public int blue;
    public int green;

    public void go() {
        plane.loadBackGround("Zebra 2.jpg");
        plane.showBackGround(); // loading and showing the zebra image

        WhiteSpace(); // calling the method
        UnicornHorn1(); // calling the next method
        Lollipop(); //calling the 3rd method
    }

    public void WhiteSpace() { // making the method to color white space
       for(int y= 8; y < 746 ; y=y+1){
            for(int x = 3; x< 628; x=x+1){
                plane.teleport(x,y);

                red=plane.howMuchRed();
                green=plane.howMuchGreen();
                blue=plane.howMuchBlue();
                if (red<256 && red>70 && green<256 && green>70 && blue<256 && blue>70){ // setting the color limit to just color white part
                    plane.setPixelColor(230,190-x/4,210); // setting the color to my choice - light pink to hot pink

                }
            }
        }
    }
    public void UnicornHorn1(){ // drawing the unicorn horn
        plane.isTrail=true;
        plane.pausetime = 0;
        plane.startingAngle(330);
        plane.teleport(414,224);
        plane.trailWidth=7;
        plane.setColor(52, 232, 235);
        plane.move(150);
        plane.turn(210);
        plane.move(150);
        plane.turn(255);
        plane.move(68);
        plane.teleport(450,208);
        plane.turn(180);
        plane.move(55);
        plane.teleport(490,186);
        plane.move(30);

    }
    public void Lollipop(){ // drawing the lollipop
        plane.isTrail=true;
        plane.pausetime=0;
        plane.startingAngle(340);
        plane.teleport(2,423);
        plane.trailWidth=5;
        plane.setColor(255, 255, 255);
        plane.move(25);
        plane.teleport(111,397);
        plane.move(40);
        plane.teleport(217,411);
        plane.setColor(209, 21, 175);
        plane.trailWidth=10;
        plane.circle(1);
        plane.teleport(620,743);



    }

}
