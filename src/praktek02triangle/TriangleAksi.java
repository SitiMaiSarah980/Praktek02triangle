package praktek02triangle;
public class TriangleAksi {
    public static void main(String[] args) {
        Triangle t1 = new Triangle();
        t1.sisi1 = 3;
        t1.sisi2 = 4;
        t1.sisi3 = 5;
        
        t1.cetakInfo();
        System.out.println("Keliling triangle = "+t1.hitungkeliling());
        t1.cetakkeliling();
        
        Triangle t2 = new Triangle();
        t2.cetakInfo();
        
        Triangle t3 = new Triangle(30,40,60);
        t3.cetakInfo();
    }
}
