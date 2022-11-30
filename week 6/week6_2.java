public class week6_2 {
    public static void main(String args[]) {
        int i = 0;
        int num = 0;
        while (i < 50) {
            num += 1;
            if (num == 5) {
                continue;
            }
            if (num == 25) {
                continue;
            }

            if (num == 49) {
                break;
            }
            i++;
            System.out.println(num);
        }
    }
}
