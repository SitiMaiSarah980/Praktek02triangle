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
    }
}
