public class Algorithm {

	public static void main(String[] args) {
		int size = 8;
		int[] a = new int[] {5,3,2,6,4,1,7,9};
		System.out.println(findposition(a, size, 4));
		
		}
	
	static int findposition(int a[], int size, int find) {
		for(int i = 0; i < a.length; i++) {
			if(a[i] == find) {
				return i;
			}
		}
		return 0;
	}
}