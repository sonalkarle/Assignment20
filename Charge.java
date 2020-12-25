public class Charge
{
	//instance variable
        private final double rx,ry;
        private final double q;
	//Constructor
        public Charge (double x0,double y0,double q0 )
        { rx = x0; ry = y0; q = q0; }
//Instance methof
public double potentialAt(double x, double y)
{       double k =8.99e09;
        double dx = x - rx;
        double dy = y - ry;
        return k = q / Math.sqrt(dx*dx + dy*dy );
}
public String toStrign()
{       return q +" at " + "("+ rx + "," + ry +")";}
public static void main(String[] args)
{
	//object
        double x = Double.parseDouble(args[0]);
        double y = Double.parseDouble(args[1]);
        Charge c1=new Charge(0.51,063,21.3);
        Charge c2=new Charge(0.13,0.94,81.9);
        double v1=c1.potentialAt(x, y);
        double v2=c2.potentialAt(x, y);
        StdOut.printf("%.2e\n" , (v1+v2));
}
}

