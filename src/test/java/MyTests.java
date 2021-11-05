import org.junit.jupiter.api.Test;
import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertNotNull;

public class MyTests {
    @Test
    public void testAdd() {
        GroceryList list1 = new GroceryList();
        list1.add("milk");
        assertEquals("Grocery List: milk", list1.toString().trim().replaceFirst(",$", ""), "Adding milk to an empty list should give: \"Grocery List: milk\"");
        list1.add("eggs");
        list1.add("cereal");
        assertEquals("Grocery List: milk, eggs, cereal", list1.toString().trim().replaceFirst(",$", ""), "Adding eggs and cereal should give: \"Grocery List: milk\"");
    }

    @Test
    public void testRemove() {
        GroceryList list1 = new GroceryList();
        list1.add("milk");
        list1.add("eggs");
        list1.add("cereal");
        list1.remove("milk");
        assertEquals("Grocery List: eggs, cereal", list1.toString().trim().replaceFirst(",$", ""), "Removing milk should give: \"Grocery List: eggs, cereal\"");
        list1.remove("cereal");
        assertEquals("Grocery List: eggs", list1.toString().trim().replaceFirst(",$", ""), "Removing cereal should give: \"Grocery List: eggs\"");
    }
    
}
