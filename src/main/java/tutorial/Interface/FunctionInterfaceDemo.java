package tutorial.Interface;

import java.util.function.Function;

public class FunctionInterfaceDemo {
    public static void main(String[] args) {
//        Function<String, Integer> getLength = x -> x.length();
//        System.out.println(getLength.apply("Biplab"));
//
//        Function<List<Student>, List<Integer>> st = x -> {
//            List<Integer> nameLength = new ArrayList<>();
//            for (Student s : x) {
//                nameLength.add(getLength.apply(s.getName()));
//            }
//            return nameLength;
//        };
//
//        Student s1 = new Student(1,"Biplab");
//        Student s2 = new Student(2,"Virat");
//        Student s3 = new Student(3,"abc");
//        List<Integer> l = st.apply(Arrays.asList(s1,s2,s3));
//        System.out.println(l);



        Function<Integer,Integer> multiply = x->10*x;
        Function<Integer,Integer> square = x->x*x;
        System.out.println(square.andThen(multiply).apply(2)); //40 First square then multiply
        System.out.println(multiply.andThen(square).apply(2)); //400 First multiply then square
        System.out.println(square.compose(multiply).apply(2)); //400 reverse of andthen i.e. First multiply then square
    }

    private static class Student {
        public Student(int id, String name) {
            this.id = id;
            this.name = name;
        }

        @Override
        public String toString() {
            return "Student{" +
                    "id=" + id +
                    ", name='" + name + '\'' +
                    '}';
        }

        int id;
        String name;

        public String getName() {
            return name;
        }

        public void setName(String name) {
            this.name = name;
        }

        public int getId() {
            return id;
        }

        public void setId(int id) {
            this.id = id;
        }


    }
}
