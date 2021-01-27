package CH6;

public class AcessModifier {

    public static void main(String[] arg) {
            // public, protected, private
        Student std  = new Student();
        std.setName("홍길동");
 
        System.out.println(std.getName());

        grad grd = new grad();
        grd.setPhone("01023092437");
        System.out.println(grd.getPhone());

        std.addr = "seoul";
    }

}
