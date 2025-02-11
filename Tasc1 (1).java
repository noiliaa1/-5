public class Tasc1 {
    public static final double a = 1.725;
    public static final double b = 19;
    public static final double c = 2.153;

    public static void main(String[] args) {
        
        double x = Math.abs(Math.pow(a, b / a) - Math.cbrt(b - 1));
        double y = ((b - a) * b - (c / (b - Math.cos(a)))) / (1 + Math.pow(b - a, 2));

        
        System.out.println("Значення виразу x = " + x);
        System.out.println("Значення виразу y = " + y);
    }
}
