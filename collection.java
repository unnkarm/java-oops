// Generics allow you to specify what type of data a class or collection should store.

// ArrayList<Integer> numbers;  [Generic]

/*
Method	Description	Return Type
sort()	Sorts the list in ascending order (according to natural ordering)	void
binarySearch()	Searches for a key in a sorted list and returns its index (otherwise < 0)	int
reverse()	Reverses the order of elements in a list	void
reverseOrder()	Returns a comparator that imposes the reverse of natural ordering	Comparator
shuffle()	Randomly permutes the elements of a list	void
swap()	Swaps the elements at the specified positions in a list	void
frequency()	Returns the number of elements equal to the specified object	int
max()	Returns the maximum element of a collection (according to natural ordering)	T
min()	Returns the minimum element of a collection (according to natural ordering)	T
disjoint()	Checks if two collections have no elements in common	boolean
copy()	Copies all elements from one list into another	void
fill()	Replaces all elements of the list with the specified object	void
replaceAll()	Replaces all occurrences of one value with another in a list	boolean
unmodifiableList()	Returns an unmodifiable (read-only) view of the specified list	List
unmodifiableSet()	Returns an unmodifiable (read-only) view of the specified set	Set
unmodifiableMap()	Returns an unmodifiable (read-only) view of the specified map	Map

 */

import java.util.*;

public class collection {
    public static void main(String[] args) {

        ArrayList<Integer> numbers = new ArrayList<Integer>();

        numbers.add(5);
        numbers.add(2);
        numbers.add(8);
        numbers.add(1);

        System.out.println("Original List: " + numbers);

        Collections.sort(numbers);
        System.out.println("Sorted List: " + numbers);

        int index = Collections.binarySearch(numbers, 8);
        System.out.println("Index of 8: " + index);

        Collections.reverse(numbers);
        System.out.println("Reversed List: " + numbers);

        Collections.shuffle(numbers);
        System.out.println("Shuffled List: " + numbers);

        int frequency = Collections.frequency(numbers, 2);
        System.out.println("Frequency of 2: " + frequency);

        int max = Collections.max(numbers);
        System.out.println("Maximum Element: " + max);

        int min = Collections.min(numbers);
        System.out.println("Minimum Element: " + min);
    }
}