public class Client {
    public static void main(String[] args) {
        GroceryList list1 = new GroceryList();
        list1.add("milk");
        System.out.println(list1);
        list1.add("eggs");
        System.out.println(list1);
        list1.add("cheese");
        System.out.println(list1);
        list1.remove("milk");
        System.out.println(list1);
    }
}