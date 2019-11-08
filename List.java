package Iterator;

import java.util.Iterator;

/**
 * The {@code List} interface defines essential methods supported by lists.
 * 
 * @author Jeong-Hyon Hwang (jhh@cs.albany.edu).
 * @param <E>
 *            the type of elements held in the list.
 */
public interface List<E> extends Iterable<E> {

	/**
	 * Inserts the specified element at the beginning of this list.
	 * 
	 * @param e
	 *            the element to insert.
	 */
	void addFirst(E e);

	@Override
	public Iterator<E> iterator();

}
