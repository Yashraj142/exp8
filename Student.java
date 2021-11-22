package Engineering;
import java.util.*;

public class Student 
{
    public int roll_no[];
    public int English[];
    public int Maths[];
    public int Science[];
    public String Student_name[];
    public Student(int roll_no[], int English[], int Maths[], int Science[], String Student_name[])
    {
        this.roll_no = roll_no;
        this.English = English;
        this.Maths = Maths;
        this.Science = Science;
        this.Student_name = Student_name;
    }
    public int cal(int e, int m, int s)
    {
            int total_marks = e+m+s;
            return total_marks;
    }
}