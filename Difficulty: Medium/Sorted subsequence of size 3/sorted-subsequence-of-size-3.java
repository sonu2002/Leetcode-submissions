       class Solution {

    public List<Integer> find3Numbers(int[] arr) {

        int n = arr.length;

        if (n < 3) return new ArrayList<>();

 

        // Potential candidates for the first and second elements

        int first = Integer.MAX_VALUE;

        int second = Integer.MAX_VALUE;

        

        // This will store the actual 'first' candidate tied to 'second'

        // to ensure we return a valid sequence.

        int firstCandidate = Integer.MAX_VALUE;

 

        for (int num : arr) {

            if (num <= firstCandidate) {

                // Update the smallest element seen so far

                firstCandidate = num;

            } else if (num <= second) {

                // Found an element greater than firstCandidate

                // We update 'first' and 'second' to represent a valid pair

                first = firstCandidate;

                second = num;

            } else {

                // Found an element greater than 'second'

                // This means first < second < num exists

                return Arrays.asList(first, second, num);

            }

        }

 

        return new ArrayList<>();

    }

}