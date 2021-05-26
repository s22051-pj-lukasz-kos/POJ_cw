public class Main {
    public static void main(String[] args) {
	    int[] wyniki = {24, 76, 50, 10};
        TestScores scores = new TestScores(wyniki);
        System.out.println(scores.average());

        int[] wyniki2 = {24, 76, 50, 10, 101};
        TestScores scores2 = new TestScores(wyniki2);
        System.out.println(scores2.average());
    }
}
