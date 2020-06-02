import java.util.ArrayList;
import java.util.Collections;
import java.util.List;
import java.util.Set;
import java.util.TreeSet;

public class Interview {

	public static void main(String[] args) {
		int a[] = { 4, 5, 6, 71, 12, 1, 3, 4, 71 };
		List<Integer> numbers = new ArrayList<Integer>();
		for (int i = 0; i < a.length; i++) {
			numbers.add(a[i]);
		}
		System.out.println("Before duplicate check " + numbers);
		Set<Integer> numbersWithoutDuplicate = new TreeSet<Integer>();
		numbersWithoutDuplicate.addAll(numbers);
		if (numbers.size() != numbersWithoutDuplicate.size()) {
			numbers.clear();
			numbers.addAll(numbersWithoutDuplicate);
		}
		System.out.println("After duplicate check " + numbers);
		Collections.sort(numbers);
		System.out.println("Second Highest Number " + numbers.get(numbers.size() - 2));
		Collections.reverse(numbers);
		System.out.println("Second Lowest Number " + numbers.get(numbers.size() - 2));
	}
}
