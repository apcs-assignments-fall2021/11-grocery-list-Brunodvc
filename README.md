# Grocery List Class

In this assignment, you'll be implementing a class to represent a grocery list. This class will use an **array** to keep track of what the user has added to the grocery list. 

The user will be able to add stuff to the grocery list, remove stuff from the grocery list, and print out the grocery list. Accordingly, you will write the three following methods, in addition to a constructor:
* public void add(String item)
* public void remove(String item)
* public String toString()

You should add code to the [GroceryList.java](src/main/java/GroceryList.java) file.

**Note that none of the tests will work until toString() works**

##### Examples:

Here are some examples of how each of the methods will work:
Assume that our list is called list1 and that we've already added "eggs" and "milk" to our list. list1 would look something like:

| eggs | milk | null | null | null | null |
|------|------|------|------|------|------|

Note that _null_ is a special value that represents that a String or object doesn't exist yet. You can check if a slot in the array is _null_ by using `==` such as: `if (arr[0] == null)`

###### add():

The **add()** method should add the data to the first empty (null) slot of our array. For example:

| eggs | milk | null | null | null | null |
|------|------|------|------|------|------|

`list1.add("oranges");`

| eggs | milk | oranges | null | null | null |
|------|------|------|------|------|------|

###### remove():

The **remove()** method should remove the matching data value if its finds it. If a data value is removed, you should shift all the later data values to the left.

| eggs | milk | oranges | null | null | null |
|------|------|------|------|------|------|

`list1.remove("eggs");`

| milk | oranges | null | null | null | null |
|------|------|------|------|------|------|

###### toString():

The **toString()** method should return a String containing all elements in your array. It should skip the _null_ values. 

| eggs | milk | oranges | null | null | null |
|------|------|------|------|------|------|

`System.out.println(list1);`

`Grocery List: eggs, milk, oranges`


## Run your code with:
The easiest way to run your code is to press the play button in [Client.java](src/main/java/Client.java).

However, you can also run your code by typing the following into the Terminal.

```shell script
make run
```

Alternatively, if that doesn't work, use:

```shell script
./gradlew run
```

## Run your tests with:
The easiest way to run your code is to press the play button in [MyTests.java](src/test/java/MyTests.java).

However, you can also run your code by typing the following into the Terminal.

```shell script
make test
```

Alternatively, if that doesn't work, use:

```shell script
./gradlew test
```
