package Engineering;
import java.util.*;

//import Engineering.Student;

public class Marks {
    public void display(int roll_no[], int English[], int Maths[], int Science[], String Student_name[], int total_marks[], int n)
    {
        for (int i=0;i<n;i++)
        {
            System.out.println(Student_name[i] + "\t\t\t" + roll_no[i] + "\t\t\t" + English[i] + "\t\t\t" + Maths[i] + "\t\t\t" + Science[i] + "\t\t\t" + total_marks[i]);
        }
    }
    public void sort(int roll_no[], int English[], int Maths[], int Science[], String Student_name[], int total_marks[], int n)
    {
        for(int i=n-1;i>0;i--)
        {
            for(int j=0;j<i;j++)
            {
                if (total_marks[j]>total_marks[j+1])
                {
                    int t1 = total_marks[j];
                    int t2= roll_no[j];
                    int t3= English[j];
                    int t4= Maths[j];
                    int t5 = Science[j];
                    String t6= Student_name[j];

                    total_marks[j]=total_marks[j+1];
                    roll_no[j] = roll_no[j+1];
                    English[j] = English[j+1];
                    Maths[j] = Maths[j+1];
                    Science[j] = Science[j+1];
                    Student_name[j] = Student_name[j+1];

                    total_marks[j+1]=t1;
                    roll_no[j+1] = t2;
                    English[j+1] = t3;
                    Maths[j+1] = t4;
                    Science[j+1] = t5;
                    Student_name[j+1] = t6;
                }
            }
        }
    }
}
