package tutorial.comparator_comparable;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;
import java.util.List;

class Student
{
    int age;
    String name;

    public Student(int age, String name) {
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
}


public class ComparatorDemoStudent {
    public static void main(String[] args) {
        List<Student1> studs = new ArrayList<>();
        studs.add(new Student1(21,"Debu"));
        studs.add(new Student1(35,"Biplab"));
        studs.add(new Student1(18,"Sonu"));
        studs.add(new Student1(45,"Priya"));
        studs.add(new Student1(39,"Dibya"));

//        Collections.sort(studs); //This will not work


        Comparator<Student1> com = new Comparator<Student1>() {
            @Override
            public int compare(Student1 o1, Student1 o2) {
                if(o1.age>o2.age)
                    return 1;
                else if (o1.age<o2.age)
                    return -1;
                else
                    return 0;
            }
        };

        Collections.sort(studs,com);
        System.out.println(studs);
    }
}
