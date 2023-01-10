public class ArrayAlgorithms {
	public static String longestString(String[] stringList) {
		String longest = null;
		int longestLen = 0;
		for (String str : stringList) {
			int l = str.length();
			if (l >= longestLen) {
				longest = str;
				longestLen = l;
			}
		}
		return longest;
	}

	public static boolean containsPositive(int[] numList) {
		for (int num : numList)
			if (num > 0)
				return true;
		return false;
	}

	public static String[] makeLowercase(String[] wordList) {
		String[] lowered = new String[wordList.length];
		for (int i = 0; i < wordList.length; i++)
			lowered[i] = wordList[i].toLowerCase();
		return lowered;
	}

	public static int endsInExclamations(String[] stringList) {
		int cnt = 0;
		for (String str : stringList)
			if (str.endsWith("!")) cnt++;
		return cnt;
	}

	public static void makeUppercase(String[] wordList) {
		for (int i = 0; i < wordList.length; i++) {
			wordList[i] = wordList[i].toUpperCase();
		}
	}

	public static int[] arrayMaximums(int[] intArr1, int[] intArr2) {
		int l = intArr1.length;
		int[] maxes = new int[l];
		for (int i = 0; i < l; i++)
			maxes[i] = Math.max(intArr1[i], intArr2[i]);
		return maxes;
	}

	public static int countConsecutiveDoubles(int[] numList) {
		int cnt = 0;
		for (int i = 1; i < numList.length; i++)
			if (numList[i] == numList[i - 1]) cnt++;
		return cnt;
	}

	public static int longestStreak(int[] nums) {
		int longest = 0;
		for (int i = 0, j = 0; i < nums.length; i++) {
			for (j = i + 1; j < nums.length && nums[i] == nums[j]; j++);
			longest = Math.max(longest, j - i);
		}
		return longest;
	}
}
