public class TestScores {
    int[] scores;

    public TestScores(int[] s) {
        try {
            for (int n: s) {
                if(n < 0 || n > 100) {
                    throw new IllegalArgumentException("Wynik z tablicy wykracza poza zakres");
                }
            }
            scores = s;
        } catch (IllegalArgumentException e) {
            scores = new int[0];
            System.out.println(e.getMessage());
        }
    }

    double average() {
        double average = 0;
        for (int n: scores) {
            average += n;
        }
        return average/scores.length;
    }
}
