package lombok;
import lombok.AllArgsConstructor;
import lombok.ToString;
import lombok.Getter;
import lombok.Builder;

@AllArgsConstructor
@ToString
@Getter
@Builder

public class Human {
    private String name;
    private int age;
    private String nationality;

}
