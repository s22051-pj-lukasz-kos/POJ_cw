public class Main {
    public static void main(String[] args) {
        CourseGrades s22051 = new CourseGrades();
        s22051.addScore(45);
        s22051.addScore(75);
        s22051.addScore(89);
        System.out.println("Średnia z ocen to: " + s22051.getAverage());
        System.out.println("Najwyższa ilość punktów to " + s22051.getHighest().getScore() + " co daje ocenę " + s22051.getHighest().getGrade());
        System.out.println("Najniższa ilość punktów to " + s22051.getLowest().getScore() + " co daje ocenę " + s22051.getLowest().getGrade());
    }
}
