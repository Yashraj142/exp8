import Engineering.*;
import java.util.*;

public class exp8
{
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);
        System.out.println("Enter the number of students: ");
        int n = sc.nextInt();
        int rno[] = new int[n];
        int total_marks[] = new int[n];
        int eng[] = new int[n];
        int maths[] = new int[n];
        int sci[] = new int[n];
        String name[] =  new String[n];
        System.out.println("\t\t\t\t\tEnter the details of Student");
        for (int i=0; i<n;i++)
        {
            System.out.println("Enter roll no.");
            rno[i] = sc.nextInt();
            System.out.println("Enter marks in english");
            eng[i] = sc.nextInt();
            System.out.println("Enter marks in maths");
            maths[i] = sc.nextInt();
            System.out.println("Enter marks in science");
            sci[i] = sc.nextInt();
            System.out.println("Enter name of the student");
            name[i] = sc.next();
            System.out.println("\n");
        }
        Marks obj1 = new Marks();
        System.out.println("Name\t\t\tRoll no.\t\tEnglish\t\t\tMaths\t\t\tScience\t\t\tTotal marks");
        Student obj2 = new Student(rno, eng, maths, sci, name);
        for (int i=0;i<n;i++)
        {
            total_marks[i] = obj2.cal(eng[i], maths[i], sci[i]);
        }
        obj1.sort(rno, eng, maths, sci, name, total_marks,n);
        obj1.display(rno, eng, maths, sci, name, total_marks,n);
    }
}