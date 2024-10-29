public class B3_HalfTheRed extends World {
    public int red;
    public int blue;
    public int green;

    public void go() {
        plane.loadBackGround("mickey4.jpg");
        plane.showBackGround();

        MickeyEarsFilter();
        MickeyShoes();


    }

    public void MickeyEarsFilter() {
        for (int y = 34; y < 300; y = y + 1) {
            for (int x = 100; x < 500; x = x + 1) {
                plane.teleport(x, y);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                if (red < 30 && green < 30 && blue < 30) {
                    plane.setPixelColor(227, 143, 223);

                }
            }
        }
    }

    public void MickeyShoes() {
        for (int y = 515; y < 684; y = y + 1) {
            for (int x = 50; x < 482; x = x + 1) {
                plane.teleport(x, y);

                red = plane.howMuchRed();
                green = plane.howMuchGreen();
                blue = plane.howMuchBlue();
                if (red < 240 && green < 255 && blue < 30 && red > 230 && green > 245 && blue > 20) {
                    plane.setPixelColor(227, 143, 223);

//
                }
            }
        }
    }
}




