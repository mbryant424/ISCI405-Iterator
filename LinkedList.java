package Iterator;

import java.util.Iterator;

/**
 * The {@code LinkedList} class implements the {@code List} interface using a linked list.
 * 
 * @author Jeong-Hyon Hwang (jhh@cs.albany.edu)
 * @param <E>
 *            the type of elements held in the list.
 */
public class LinkedList<E> implements List<E> {

	/**
	 * The Node class implements nodes used in linked lists.
	 * 
	 * @author Jeong-Hyon Hwang (jhh@cs.albany.edu)
	 */
	protected class Node {

		/**
		 * The element held in this Node.
		 */
		public E element;

		/**
		 * A reference to the next Node.
		 */
		public Node next;

		/**
		 * Constructs a Node.
		 * 
		 * @param element
		 *            the element held in the Node.
		 * @param next
		 *            the next Node in the list.
		 */
		Node(E element, Node next) {
			this.element = element;
			this.next = next;
		}
	}

	/**
	 * A reference to the first element in the list.
	 */
	protected Node start = null;

	@Override
	public void addFirst(E element) {
		start = new Node(element, start);
	}

	@Override
	public String toString() {
		Node n = start;
		String s = "(";
		while (n != null) {
			if (n == start)
				s += n.element;
			else
				s += ", " + n.element;
			n = n.next;
		}
		return s + ")";
	}

	@Override
	public Iterator<E> iterator() {
		return new StaticInnerIterator<E>(start);
	}

	/**
	 * Returns an {@code Iterator} over all elements of this {@code List}.
	 * 
	 * @return an {@code Iterator} over all elements of this {@code List}.
	 */
	public Iterator<E> iterator2() {
		return new InnerIterator();
	}

	/**
	 * Returns an {@code Iterator} over all elements of this {@code List}.
	 * 
	 * @return an {@code Iterator} over all elements of this {@code List}.
	 */
	public class InnerIterator implements java.util.Iterator<E> {

		/**
		 * The next node from which an element of a list is obtained.
		 */
		protected Node current;

		/**
		 * Constructs a LinkedListIterator.
		 * 
		 * @param start
		 *            the start node of a {@code LinkedList}.
		 */
		public InnerIterator() {
			current = start;
		}

		@Override
		public boolean hasNext() {
			return current != null;
		}

		@Override
		public E next() {
			E element = current.element;
			current = current.next;
			return element;
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}

	}

	/**
	 * Returns an {@code Iterator} over all elements of this {@code List}.
	 * 
	 * @return an {@code Iterator} over all elements of this {@code List}.
	 */
	public Iterator<E> iterator3() {
		return new StaticInnerIterator<E>(start);
	}

	/**
	 * Returns an {@code Iterator} over all elements of this {@code List}.
	 * 
	 * @return an {@code Iterator} over all elements of this {@code List}.
	 */
	public static class StaticInnerIterator<E> implements java.util.Iterator<E> {

		/**
		 * The next node from which an element of a list is obtained.
		 */
		protected LinkedList<E>.Node current;

		/**
		 * Constructs a LinkedListIterator.
		 * 
		 * @param start
		 *            the start node of a {@code LinkedList}.
		 */
		public StaticInnerIterator(LinkedList<E>.Node start) {
			current = start;
		}

		@Override
		public boolean hasNext() {
			return current != null;
		}

		@Override
		public E next() {
			E element = current.element;
			current = current.next;
			return element;
		}

		@Override
		public void remove() {
			throw new UnsupportedOperationException();
		}

	}

	/**
	 * Returns an {@code Iterator} over all elements of this {@code List}.
	 * 
	 * @return an {@code Iterator} over all elements of this {@code List}.
	 */
	public Iterator<E> iterator4() {

		return new java.util.Iterator<E>() {

			/**
			 * The next node from which an element of a list is obtained.
			 */
			protected Node current = start;

			@Override
			public boolean hasNext() {
				return current != null;
			}

			@Override
			public E next() {
				E element = current.element;
				current = current.next;
				return element;
			}

			@Override
			public void remove() {
				throw new UnsupportedOperationException();
			}

		};
	}

}

