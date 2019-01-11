public class Bhaskara {
    public static void main(String[] args) {
        int a = 1;
        int b = 5;
        int c = 6; 

        int delta = (int)(Math.pow(b, 2))-4*a*c;

        int x1 = (-b + (int)(Math.sqrt(delta)))/(2*a);
        int x2 = (-b - (int)(Math.sqrt(delta)))/(2*a);

        System.out.println(delta);
        System.out.println(x1);
        System.out.println(x2);
    }
}