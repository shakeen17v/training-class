class student{
    String student="shakeen d";
    int age=19;
}

public class main {
    public static void main(String[] args) {
        byte a = 21;
        int age = 18;
        double mark = 95.5;
        char grade = 'A';
        boolean passed = true;
        String name = "Shakeen";
        int[] num={1,3};

        System.out.println(a);
        System.out.println(age);
        System.out.println(mark);
        System.out.println(grade);
        System.out.println(passed);
        System.out.println(name);
        System.out.println(num[0]);
        //non primitive
        student s=new student();
        System.out.println(s.student);
        System.out.println(s.age);
    }
}    
