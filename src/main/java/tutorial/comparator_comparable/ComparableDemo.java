package tutorial.comparator_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

class Student1 implements Comparable<Student1>
{
    int age;
    String name;

    public Student1(int age, String name) {
        this.age = age;
        this.name = name;
    }
    //If we dont override then on Print it will give ClassName@Hash
    @Override
    public String toString() {
        return "Student{" +
                "age=" + age +
                ", name='" + name + '\'' +
                '}';
    }
    @Override
    public int compareTo(Student1 that )
    {
        if(this.age>that.age)
            return 1;
        else if (this.age<that.age)
            return -1;
        else
            return 0;
    }
}


public class ComparableDemo {
    public static void main(String[] args) {
        List<Student1> studs = new ArrayList<>();
        studs.add(new Student1(21,"Debu"));
        studs.add(new Student1(35,"Biplab"));
        studs.add(new Student1(18,"Sonu"));
        studs.add(new Student1(45,"Priya"));
        studs.add(new Student1(39,"Dibya"));

        Collections.sort(studs);
        System.out.println(studs);
    }
}
