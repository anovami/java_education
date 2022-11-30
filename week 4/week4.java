public class week4 {
//    1. Выполните упаковку каждого примитива в соответствующую ему обертку
//    разными способами и обратную распаковку.
//    (byte, short, int, long, char, float, double, boolean)
    public static void main(String[] args) {
        byte a = 1;
        Byte boxed_a;
        boxed_a = new Byte(a);
        a = boxed_a.byteValue();
        System.out.println(a);

        short b = 100;
        Short boxed_b;
        boxed_b = Short.valueOf(b);
        b = boxed_b.shortValue();
        System.out.println(b);

        int c = 147000;
        Integer boxed_c;
        boxed_c = c;
        c = boxed_c.intValue();
        System.out.println(c);

        long d = 12345678L;
        Long boxed_d;
        boxed_d = d;
        d = boxed_d.longValue();
        System.out.println(d);

        char e = 'e';
        Character boxed_e;
        boxed_e = Character.valueOf(e);
        e = boxed_e;
        System.out.println(e);

        float f = 34F;
        Float boxed_f;
        boxed_f = new Float(f);
        f = boxed_f;
        System.out.println(f);

        double g = 10.3;
        Double boxed_g;
        boxed_g = g;
        g = boxed_g.doubleValue();
        System.out.println(g);

        boolean i = true;
        Boolean boxed_i;
        boxed_i = Boolean.valueOf(i);
        i = boxed_i.booleanValue();
        System.out.println(i);




    }
}
