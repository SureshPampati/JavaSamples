public class Box {
    static double volumeBox(double l,double b,double h)
    {

        return l*b*h;
    }
    public static void main(String[] args){
        double v=volumeBox(2,3,4);
        System.out.println( "the volume of the Box is :"+v);
    }
}
