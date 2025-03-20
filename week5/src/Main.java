public class Main {
    public static void main(String[] args) {
        point p1 = new point();
        String s1 = new String("ali");
        System.out.println(p1.xCood);
        System.out.println(p1.yCood);
        point p2 = new point(3,4);
        System.out.println(p2.xCood);
        System.out.println(p2.yCood);
        point p3 =new point(5);
        System.out.println(p3.xCood);
        System.out.println(p3.yCood);

        point tLeft = new point(3,4);

        rectangle r1 = new rectangle(
                tLeft,
                3,
                4
        );
        System.out.println(r1.getSideA());
        System.out.println(r1.getSideB());
        System.out.println(r1.getTopLeft().xCood);
        System.out.println(r1.getTopLeft().yCood);


        circle c1 = new circle(
                new point(3,4),
                5
        );
        System.out.println(c1.getRadus());
        c1.setRadus(-21);
        System.out.println(c1.getRadus());


    }
}