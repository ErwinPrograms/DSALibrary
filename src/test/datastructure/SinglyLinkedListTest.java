package test.datastructure;

import main.datastructure.SinglyLinkedList;
import org.junit.After;
import org.junit.Before;
import org.junit.Test;

public class SinglyLinkedListTest {

    private SinglyLinkedList<String> testList;

    @Before
    public void setup() {
        this.testList = new SinglyLinkedList<>();
        assert testList.isEmpty();
    }

    @After
    public void cleanup() {
        this.testList.clear();
    }

    @Test
    public void initialValueConstructor() {
        SinglyLinkedList<String> stringList = new SinglyLinkedList<>("Hello");
        assert !stringList.isEmpty();
        assert stringList.get(0).equals("Hello");
    }

    @Test
    public void addTest() {
        assert this.testList.add("first");
    }
}
