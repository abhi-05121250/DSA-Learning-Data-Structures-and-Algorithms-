class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        
        for(int i=0;i<numRows;i++){
            List<Integer> ll=new ArrayList<>();
            ll.add(1);
            for(int j=1;j<i;j++){
                int res=list.get(i-1).get(j-1)+list.get(i-1).get(j);
                ll.add(res);
            }
            if(i>0)
                ll.add(1);
            list.add(ll);
            
        }
        
        return list;
        
    }
}