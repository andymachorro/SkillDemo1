import static org.junit.Assert.*;
import org.junit.*;

public class  SkillDemo1{

    public static int add (int a, int b){
        return a+b;
    }
    @Test
    public void additionCheck(){
        assertEquals(4, SkillDemo1.add(2,1));
    }    



}
