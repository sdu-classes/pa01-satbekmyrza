public class TimeMain {
    public static void main(String[] args) {
        Time t = new Time(15, 42, 33);
        System.out.println(t);

        for (int i = 0; i < 100; i++) {
            t.nextSecond();
        }
        t.nextSecond().nextSecond();
        System.out.println(t);
        
    }
}
