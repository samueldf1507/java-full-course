package academy.devdojo.maratonajava.javacore.Qstring.test;

public class StringPerformanceMain {
    public static void main(String[] args) {
        long start = System.currentTimeMillis();
        StringBuilder(30000);
        long end = System.currentTimeMillis();

        System.out.println(end - start);
    }

    private static void concatString(int size) {
        String text = "";
        for (int i = 0; i < size; i++) {
            text += i; // 0, 01, 012
        }
    }

    private static void StringBuilder(int size) {
        StringBuilder sb = new StringBuilder(size);
        for (int i = 0; i < size; i++) {
            sb.append(i);
        }
    }

    private static void StringBuffer(int size) {
        StringBuffer sb = new StringBuffer(size);
        for (int i = 0; i < size; i++) {
            sb.append(i);
        }
    }


}
