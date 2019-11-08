package Iterator;

import java.util.Iterator;

/**
 * The {@code ListTest} class tests the {@code LinkedList} and {@code ArrayList} classes.
 * 
 * @author Jeong-Hyon Hwang (jhh@cs.albany.edu)
 */
public class ListTest {

	/**
	 * The main method of {@code ListTest}.
	 * 
	 * @param args
	 *            the program arguments.
	 */
	public static void main(String[] args) {
		test(new LinkedList<Integer>());
	}

	/**
	 * Tests the specified list.
	 * 
	 * @param list
	 *            the list to test.
	 */
	protected static void test(List<Integer> list) {
		for (int i = 4; i >= 0; i--)
			list.addFirst(i);
		System.out.println(list);

		if (list instanceof LinkedList) {
			Iterator<Integer> i = list.iterator();
			while (i.hasNext())
				System.out.print(i.next() + " ");
			System.out.println();
			i = ((LinkedList<Integer>) list).iterator2();
			while (i.hasNext())
				System.out.print(i.next() + " ");
			System.out.println();
			i = ((LinkedList<Integer>) list).iterator3();
			while (i.hasNext())
				System.out.print(i.next() + " ");
			System.out.println();
			i = ((LinkedList<Integer>) list).iterator4();
			while (i.hasNext())
				System.out.print(i.next() + " ");
			System.out.println();
			// test list as an Iterable instance
			for (Integer j : list) {
				System.out.print(j  + " ");
			}
			System.out.println();
		}

	}

}
