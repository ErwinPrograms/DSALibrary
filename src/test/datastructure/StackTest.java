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

    @Test
    public void pop() {
        assert testStack.pop() == null;

        testStack.push("first");
        testStack.push("second");
        testStack.push("third");

        assert testStack.pop().equals("third");
        assert testStack.pop().equals("second");
        assert testStack.pop().equals("first");
        assert testStack.pop() == null;
    }

    @Test
    public void peek(){
        assert testStack.peek() == null;

        testStack.push("peek me");

        assert testStack.peek().equals("peek me");
    }

    @Test
    public void empty() {
        assert testStack.empty();
        testStack.push("element");
        assert !testStack.empty();
    }
}
