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
    public void addAndGetTest() {
        assert this.testList.add("first");
        assert this.testList.get(0).equals("first");
        assert this.testList.add("second");
        assert this.testList.get(1).equals("second");
        testList.add(1, "new second");
        assert this.testList.get(1).equals("new second");
        assert this.testList.get(2).equals("second");
        assert testList.size() == 3;
    }
}
