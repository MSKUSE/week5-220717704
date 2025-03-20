public class rectangle {
    private point topLeft;
    private int sideA, sideB;

    public rectangle(point topLeft, int sideA, int sideB) {
        this.topLeft = topLeft;
        setSideA(sideA);
        setSideB(sideB);
    }

    public rectangle(point topLeft, int sideA) {
        this.topLeft = topLeft;
        setSideA(sideA);
        setSideB(sideA);
    }


    public point getTopLeft() {
        return topLeft;
    }

    public void setTopLeft(point topLeft) {
        this.topLeft = topLeft;
    }

    public int getSideA() {
        return sideA;
    }

    public void setSideA(int sideA) {
        this.sideA = sideA;
    }

    public int getSideB() {
        return sideB;
    }

    public void setSideB(int sideB) {
        if (sideB < 0 ){
            this.sideB = 0;
            System.out.println("sideB can't be negative");
        }else {
            this.sideB = sideB ;
        }
        this.sideB = sideB;
    }
    public int perimeter(){
        return 2*sideA + (2*sideB);
    }
    public int area(){
        return sideA*sideB;
    }
}