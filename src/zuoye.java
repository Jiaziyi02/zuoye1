public class zuoye{
    double x;
    double y;
    double z;
    public zuoye(double a,double b,double c){
        x = a;
        y = b;
        z = c;
    }
    public double getX() {
        return x;
    }
    public double getY() {
        return y;
    }
    public double getZ() {
        return z;
    }
    public void show(){
        System.out.println("点坐标为"+ "(" + this.x + "," + this.y + "," + this.z + ")" );
    }
    public double calc(zuoye a){
        double h;
        h = Math.sqrt((a.x - this.x)*(a.x - this.x)+(a.y - this.y)*(a.y - this.y)+(a.z - this.z)*(a.z - this.z));
        System.out.println("结果为"+h);
        return h;
    }
    public static void main(String[] args){
    	zuoye t1 = new zuoye(1,2,3);
        zuoye t2 = new zuoye(4,5,6);
        t1.show();
        t2.show();
        t1.calc(t2);
    }
}