public class GradedActivity {
    private double score; // Wynik punktowy.

    public void setScore(double s)
    {
        score = s;
    }

    public double getScore()
    {
        return score;
    }

    public char getGrade(){
        char letterGrade;
        if (score >= 90)
            letterGrade = '5';
        else if (score >= 80)
            letterGrade = '4';
        else if (score >= 70)
            letterGrade = '3';
        else if (score >= 60)
            letterGrade = '2';
        else
            letterGrade = '1';
        return letterGrade;
    }
}
