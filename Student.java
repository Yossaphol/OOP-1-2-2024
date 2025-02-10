public class Student {
    public String name;
    public double mScore;
    public double fScore;
    public void showGrade() {
        double  s = (mScore * 0.4) + (fScore * 0.4)+ 20;
        System.out.println("Your grade is "+ s +".");
    }
}
