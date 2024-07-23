import java.util.Map.Entry;
class Solution {
    public int[] frequencySort(int[] nums) {

       // Count the frequency of each element
        Map<Integer, Integer> frequencyMap = new HashMap<>();
        for (int num : nums) {
            frequencyMap.put(num, frequencyMap.getOrDefault(num, 0) + 1);
        }

        // Convert the array to a list of integers for easier sorting
        List<Integer> list = Arrays.stream(nums).boxed().collect(Collectors.toList());

        // Sort the list with custom comparator
        list.sort((a, b) -> {
            int freqA = frequencyMap.get(a);
            int freqB = frequencyMap.get(b);
            if (freqA != freqB) {
                return Integer.compare(freqA, freqB); // Sort by frequency in increasing order
            } else {
                return Integer.compare(b, a); // Sort by value in decreasing order
            }
        });

        // Convert the list back to an array
        return list.stream().mapToInt(i -> i).toArray();
    }
        
}
    
   