class Solution {
    public boolean isProduct(int[] arr, long target) {
        // Use Long to prevent type mismatch when searching
        Set<Long> seen = new HashSet<>();
        
        for (int num : arr) {
            // 1. Handle zero explicitly to avoid division-by-zero crashes
            if (num == 0) {
                // If target is 0, 0 multiplied by ANY previously seen number works
                if (target == 0 && !seen.isEmpty()) {
                    return true;
                }
            } 
            // 2. Ensure perfect division (no decimal truncation)
            else if (target % num == 0) {
                long complement = target / num;
                
                // 3. Check if we've already seen the required complement
                if (seen.contains(complement)) {
                    return true;
                }
            }
            
            // Add the current number to the set AFTER checking.
            // This prevents an element from multiplying with itself.
            seen.add((long) num);
        }
        
        return false;
    }
}