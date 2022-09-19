package git_home;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.Test;

import java.util.Random;

public class Test1 {
    @Test
    void exampleTest1(){
        Assertions.assertTrue(new Random().nextInt() >1);
    }
    @Test
    void exampleTest2(){
        Assertions.assertTrue(new Random().nextInt()>2);
    }
}
