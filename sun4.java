// public class sun4{
//     String name;
//     class demo{
//         String sum(){
//             sun4 s1=new sun4();
//             s1.name="shakeen";
//             System.out.println(s1.name);

            
        
//         }
//         public static void main(String[] args){
//             sun4 obj=new sun4();
//             sun4.demo d=obj.new demo();
//             d.sum();
//         }
//     }
    
// }

class stu {
    String name;
    int age;
}

public class sun4 {
    
    void sum() {

        stu s1 = new stu();
        s1.name = "shakeen";
        s1.age=19;
        System.out.println(s1.name);
        
    }

    public static void main(String[] args) {

        sun4 obj = new sun4();

        

        obj.sum();
    }
}
