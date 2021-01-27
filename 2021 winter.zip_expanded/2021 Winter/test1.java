import src.Student;
public class test1 {
    public static void main(String[] args) {
        System.out.println("안녕");

        String s1 = new String("A barking dog");
        String s2 = "never bites";
        int a = s1.length();
        System.out.println(a);
        int result = test();
        System.out.println(test());
        String s3 = "동해물과 " + "백두산이";
        System.out.println(s3);
        String s4 = s3.concat("마르고 닳도록"); // string은 자기 값은 바뀌지 않음
        System.out.println(s4);
        String s5 =s4.replace('마','동');
        System.out.println(s5);
        s4 = new String("A barking dog");
        if(s1.equals(s4)) {
            System.out.println("같음");
        } else {
            System.out.println("틀림");
        }
        if(s1.equalsIgnoreCase(s4)) {

        }

        s4 = s1.substring(2);
        System.out.println(s4);
        boolean flag = s2.startsWith("www");
        System.out.println(flag);

        Student std = new Student();
    }

    public static int test() {
        return 5;
    }

    public static void check() {
        
    }
}