
public class Greaterthan {

	private static Object countGreaterThan;
	public static void main(String[] args) {
		System.out.println(int count[], int countGreaterThan);
	}
	public static <T extends Comparable<T>> int countGreaterThan(T[] anArray, T elem) {
	    int count = 0;
	    for (T e : anArray)
	        if (e.compareTo(elem) > 0)
	            ++count;
	    return count;
	}
}
