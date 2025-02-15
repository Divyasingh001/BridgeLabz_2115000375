public class StringBufferVsStringBuilder {
    public static void main(String[] args) {
        int n = 1_000_000;
        String word = "hello";
        StringBuffer sbf = new StringBuffer();
        long startTime1 = System.nanoTime();
        for (int i = 0; i < n; i++) {
            sbf.append(word);
        }
        long endTime1 = System.nanoTime();
        long durationBuffer = endTime1 - startTime1;
        StringBuilder sbd = new StringBuilder();
        long startTime2 = System.nanoTime();
        for (int i = 0; i < n; i++) {
            sbd.append(word);
        }
        long endTime2 = System.nanoTime();
        long durationBuilder = endTime2 - startTime2;
        System.out.println("Time taken by StringBuffer: " + durationBuffer / 1_000_000 + " ms");
        System.out.println("Time taken by StringBuilder: " + durationBuilder / 1_000_000 + " ms");
        if (durationBuffer > durationBuilder) {
            System.out.println("StringBuilder is faster.");
        } else {
            System.out.println("StringBuffer is faster.");
        }
    }
}
