package leetcode;

public class leet1791 {
	public static int findCenter(int[][] edges) {
		int answer = 0;
		if (edges[0][0] == edges[1][0]) {
			answer = edges[0][0];
		} else if (edges[0][0] == edges[1][1]) {
			answer = edges[0][0];
		} else if (edges[0][1] == edges[1][0]) {
			answer = edges[0][1];
		} else {
			answer = edges[0][1];
		}

		return answer;

		// return (edges[0][0] == edges[1][0] || edges[0][0] == edges[1][1]) ?
		// edges[0][0] : edges[0][1];
	}

	public static void main(String[] args) {
		int[][] arr = { { 1, 2 }, { 5, 1 }, { 1, 3 } };
		System.out.println(findCenter(arr));
	}
}
