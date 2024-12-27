package Test;

import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.*;

public class ContainerTest {

    @Test
    public void testAddAndGet() {
        Container<String> container = new Container<>();
        container.add("Hello");
        container.add("World");
        assertEquals("Hello", container.get(0));
        assertEquals("World", container.get(1));
    }

    @Test
    public void testRemove() {
        Container<String> container = new Container<>();
        container.add("Hello");
        container.add("World");
        container.remove(0);
        assertEquals("World", container.get(0));
        assertEquals(1, container.size());
    }

    @Test
    public void testSize() {
        Container<String> container = new Container<>();
        assertEquals(0, container.size());
        container.add("Hello");
        assertEquals(1, container.size());
        container.add("World");
        assertEquals(2, container.size());
    }

    @Test
    public void testIndexOutOfBounds() {
        Container<String> container = new Container<>();
        assertThrows(IndexOutOfBoundsException.class, () -> container.get(0));
        assertThrows(IndexOutOfBoundsException.class, () -> container.remove(0));
    }
}