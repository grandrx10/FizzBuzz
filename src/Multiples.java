public class Multiples {
    public static void main(String[] args) {
        int count = 0;
        for (var i = 1; i < 1000; i ++) {
            if (i % 5 == 0 || i % 3 == 0) {
                count ++;
            }
        }

        System.out.println(count);
    }
}