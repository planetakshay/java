package mathproblems;

/**
 *Implement int sqrt(int x).
 * Compute and return the square root of x.
 */
public class Sqrt {


	public static int sqrt(int x) {
		if (x == 0)
			return 0;
		int left = 1, right = Integer.MAX_VALUE;
		while (true) {
			int mid = left + (right - left)/2;
			if (mid > x/mid) {
				right = mid - 1;
			} else {
				if (mid + 1 > x/(mid + 1))
					return mid;
				left = mid + 1;
			}
		}
	}
	public static void main(String args[]){
		//int i = Integer.MAX_VALUE-1;
		int i=64;
		System.out.println(sqrt(i));
	}
}
