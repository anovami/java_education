public class week4_2 {
//    2. Известны ккатеты прямоугольного треугольника: основание = 5,
//    боковая сторона = 8. Найти площадь и периметр, вывести.
    public static void main(String args[]){
        int a = 5;
        int b = 8;
        int P;
        double S;
        P = 2*b + a;
        System.out.println("Периметр прямоугольного треугольника: " + P);
        System.out.println("Периметр больше 15?");
        System.out.println(P > 15);
        S = 0.5 * (a * b);
        System.out.println("Площадь прямоугольного треугольника: " + S);
        System.out.println("Площадь меньше 30?");
        System.out.println(S < 30);

    }
}
