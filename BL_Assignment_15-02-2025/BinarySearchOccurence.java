class BinarySearchOccurrences {
    public static int findFirstOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1, firstOccurrence = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                firstOccurrence = mid;
                right = mid - 1; 
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return firstOccurrence;
    }
    
    public static int findLastOccurrence(int[] arr, int target) {
        int left = 0, right = arr.length - 1, lastOccurrence = -1;
        while (left <= right) {
            int mid = left + (right - left) / 2;
            if (arr[mid] == target) {
                lastOccurrence = mid; 
                left = mid + 1; 
            } else if (arr[mid] < target) {
                left = mid + 1;
            } else {
                right = mid - 1;
            }
        }
        return lastOccurrence;
    }
    public static int[] findFirstAndLastOccurrence(int[] arr, int target) {
        int first = findFirstOccurrence(arr, target);
        int last = findLastOccurrence(arr, target);
        return new int[]{first, last};
    }
    
    public static void main(String[] args) {
        int[] arr = {1, 2, 2, 2, 3, 4, 5};
        int target = 2;
        int[] result = findFirstAndLastOccurrence(arr, target);
        System.out.println("First Occurrence: " + result[0]);
        System.out.println("Last Occurrence: " + result[1]);
    }
}
