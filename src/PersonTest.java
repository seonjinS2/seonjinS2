import java.lang.*;

public class PersonTest {
    public static void main(String[] args) {

        Person p1 = new Person("hong", 123456);
        Person p2 = new Person("hong", 123456);

        if (p1==p2) {
            System.out.println("같다 ");
        } else {
            System.out.println("다르다 ");
        }
        System.out.println("----------------------");
       try {
           if (p1.equals(p2)) {
               System.out.println("같다 ");
           } else {
               System.out.println("다르다 ");
           }
       }catch (NullPointerException e ){
           System.out.println("null입니다 ");
       }

        System.out.println(p1.hashCode());
        System.out.println(p2.hashCode());
    }
}
