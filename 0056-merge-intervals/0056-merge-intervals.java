class Solution {
    public int[][] merge(int[][] intervals) {
        
        List<List<Integer>> ans = new ArrayList<>();
        
        Arrays.sort(intervals, (a, b) -> {
            for (int i = 0; i < a.length; i++) {
                if (a[i] != b[i]) {
                    return Integer.compare(a[i], b[i]);
                }
            }
            return 0;
        });
        
        for (int i = 0; i < intervals.length; i++) { // select an interval:
            int start = intervals[i][0];
            int end = intervals[i][1];

            //Skip all the merged intervals:
            if (!ans.isEmpty() && end <= ans.get(ans.size() - 1).get(1)) {
                continue;
            }

            //check the rest of the intervals:
            for (int j = i + 1; j < intervals.length; j++) {
                if (intervals[j][0] <= end) {
                    end = Math.max(end, intervals[j][1]);
                } else {
                    break;
                }
            }
            ans.add(Arrays.asList(start, end));
        }
        
        int[][] matrix=new int[ans.size()][2];
        
      for(int i=0;i<ans.size();i++){
          List<Integer> ll=ans.get(i);
          matrix[i][0]=ll.get(0);
          matrix[i][1]=ll.get(1);
          
      }
        
        return matrix;
        
    }
}