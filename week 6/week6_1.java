public class week6_1 {
    public static void main(String args[]){
        int i = 0;
        int num = 1;
        System.out.println(num);
//        while (i < 9) {
//            num *= 2;
//            i++;
//            System.out.println(num);
//         }
        do {
            num *= 2;
            i++;
            System.out.println(num);
        } while (i < 9);
    }
}
