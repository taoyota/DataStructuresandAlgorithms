public class CheckDoubleExistence {

	public boolean checkIfExist(int[] arr) {
		for (int i = 0; i < arr.length; i++) {
			for (int j = 0; j < arr.length; j++) {
			    if (arr[i] == 0) {
			    	if (arr[j] == 0 && i != j) {
			    		return true;
					}
				}
				if (arr[j] == 0) {
					continue;
				} else if (arr[j] == 2 * arr[i]) {
					return true;
				}
			}
		}

		return false;
	}
}
