package test.datastructure;

import main.datastructure.Stack;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class StackTest {

    private Stack<String> testStack;

    @Before
    public void setup() {
        this.testStack = new Stack<>();
    }

    @Test
    public void push() {
        assert testStack.push("first").equals("first");
        assert testStack.push("second").equals("second");
    }
}
