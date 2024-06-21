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

            //Skip all the merged intervals:
            if (ans.isEmpty() || intervals[i][0]>ans.get(ans.size()-1).get(1)) {
               ans.add(Arrays.asList(intervals[i][0], intervals[i][1]));
            }
            else{
                ans.get(ans.size()-1).set(1,Math.max(ans.get(ans.size()-1).get(1),intervals[i][1]));
            }
                                     

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