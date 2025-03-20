public class circle {
    private point center;
    private int radus;

    public circle(point center, int radus) {
        this.center = center;
        this.radus = radus;
    }

    public point getCenter() {
        return center;
    }

    public void setCenter(point center) {
        this.center = center ;
    }

    public int getRadus() {
        return radus;
    }

    public void setRadus(int radus) {
        if (radus < 0) {
            this.radus =0;
            System.out.println("radius cant be");


        }else {
            this.radus = radus;
        }
        this.radus = radus;
    }
}
