package java8;
import java.util.*;
import java.util.List;

 public class recursion {
 
	public static void main(String[] args) throws Exception {
		List<Integer> arr = Arrays.asList(1,2,3,4);
		System.out.println(permute(arr));
 	}

  public static List<List<Integer>> permute(List<Integer> arr) {
    List<List<Integer>> result = new ArrayList<>();
    permutation(0, arr, result);
    return result;
  }

  private static void permutation(int i,List<Integer> arr, List<List<Integer>> result) {
    if (i == arr.size() - 1) {
      List<Integer> list = new ArrayList<>();
      for (int n : arr) list.add(n);
      result.add(list);
    } else {
      for (int j = i, l = arr.size(); j < l; j++) {
        Collections.swap(arr,i,j);
        permutation(i + 1, arr, result);
        Collections.swap(arr,i,j);
      }
    }
  }
}
