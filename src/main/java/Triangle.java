public class Triangle {
    public static void main(String[] args) {
        System.out.printf("Площадь %.2f",triangleSquare(4, 5, 3));
    }
    public static double triangleSquare(int a, int b, int c) {
        int p = (a + b + c) / 2;
        return Math.sqrt(p * (p - a) * (p - b) * (p - c));
    }
}
