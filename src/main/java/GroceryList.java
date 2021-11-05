public class GroceryList {
    private String[] arr;

    // Creates a new empty Grocery List of size 10
    // Remember to create the array!
    // You don't need to change any of the values in the array
    public GroceryList() {
        arr = new String[10];
    }

    // Adds an item to the grocery list
    public void add(String item) {
        for( int index =arr.length-2; index >= 0 ; index-- ) {
            arr[index + 1] = arr[index];
        }
        arr[0] = item;
    }

    // Removes an item from the grocery list
    // Replaces the item with null
    // Remember to shift anything to the left if necessary
    public void remove(String item) {
        int index = 0;

        for(int x = 0; x<arr.length;x++){
            if(arr[x] != null && arr[x].equals(item)){
                index = x;
            }
        }
        arr[index] = null;
        for(int i = index + 1; i < arr.length; i++) {
            if (arr[i] != null) {
                String temp = arr[1];
                arr[i] = arr[i+1];
                arr[i+1] = temp;
            }
        }
    }

    // Returns a String representation the grocery list
    // The String should start with "Grocery List:" and
    // contain each non-null value separated by a comma
    // For instance, the string should look something like:
    // Grocery List: eggs, milk, oranges

    // You **may** have an extra comma at the end
    @Override
    public String toString() {
        String message = "Grocery List: ";
        for (int i = 0; i < arr.length; i++){
            if(arr[i] != null){
                message+= arr[i];
                message+=", ";
            }
        }
        return message;
    }
}
