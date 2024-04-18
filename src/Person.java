import lombok.EqualsAndHashCode;
import lombok.NoArgsConstructor;

import java.util.Objects;

@NoArgsConstructor
@EqualsAndHashCode
public class Person {

  String name;
   int jumin;

    public Person(String name, int jumin) {
    }

    @Override
    public boolean equals(Object obj) {     // person타입
        if (obj != null && obj instanceof Person) {
            Person other = (Person) obj;
            return this.name.equals(other.name) && this.jumin == other.jumin;
        }
        return  false;
    }


    @Override
    public int hashCode() {
        return Objects.hash(name,jumin);        // 매개변수 복수

//        return Objects.hashCode(name+jumin);

    }
}
