package lambda;

public class CompareExam {
    public static void exec(Compare compare) {
        int k = 10;
        int j = 32;
        int value = compare.compareTo(k, j);
        System.out.println(value);
    }

    public static void main(String[] args) {
        exec((i, j) -> {
            return i - j;
        });

        exec((i, j) -> {
            return i * j;
        });

        exec((i, j) -> {
            return i % j;
        });
    }
}
