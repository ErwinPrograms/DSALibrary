package test.datastructure;

import main.datastructure.SinglyLinkedList;
import org.junit.Test;

public class SinglyLinkedListTest {

    @Test
    public void defaultConstructor() {
        SinglyLinkedList<String> emptyList = new SinglyLinkedList<>();
        assert emptyList.isEmpty();
    }

    @Test
    public void initialValueConstructor() {
        SinglyLinkedList<String> stringList = new SinglyLinkedList<>("Hello");
        assert !stringList.isEmpty();
        assert stringList.get(0).equals("Hello");
    }
}
