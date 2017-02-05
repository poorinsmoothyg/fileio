package ku.util;

import java.util.Iterator ;
import java.util.NoSuchElementException;

/**
 * The Iterator that return the elements in array without knowing the array structure.
 * 
 * @author Poorin Pichayamogkol 
 *
 * @param <T> the type of thing in the ArrayIterator.
 */
public class ArrayIterator<T> implements Iterator<T> {
	 
	/** attribute for the array we want to iterate over */
	 private T[ ] array;
	 private int cursor;
	
	 /**
	 * Initialize a new array iterator with the array to process.
	 * @param array is the array to iterate over
	 */
	 public ArrayIterator(T[] array) {
	 this.array = array;
	 // TODO initialize any other variables you need
	 }
	 
	 /**
	 * Return the next non-null element from array, if any.
	 * @return the next non-null element in the array.
	 * @throws NoSuchElementException if there are no more elements to return.
	 */
	 public T next( ) {
		 if (hasNext() == true){
			 T word = array[cursor];
			 this.cursor++;
			 return word;
		 }
		 else throw new NoSuchElementException( );
	 }
	 
	 //TODO the other methods don't use the type parameter,
	 // so you should have no problem writing them.
	 /**
	  * Method decides if there is another element available and move the cursor to the start of the next (non-null) element.
	  * Use for indicating between null or non-null.
	  * @return true if the cursor in array is non-null.
	  * 		false if the cursor in array is null. 
	  */
	 public boolean hasNext(){
		 for (int i = this.cursor; i < this.array.length; i++){
			 if (this.array[i] != null){
				 return true ;
			 }
		 }
		 return false ; 
	 }
	 
	 /**
	  * This method is optional. You can leave the remove() method empty.
	  */
	 public void remove(){

	 }
}

