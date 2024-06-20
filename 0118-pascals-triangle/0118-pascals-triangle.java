class Solution {
    public List<List<Integer>> generate(int numRows) {
        
        List<List<Integer>> list=new ArrayList<List<Integer>>();
        
        for(int i=0;i<numRows;i++){
            List<Integer> ll=new ArrayList<>();
            int res=1;
            ll.add(1);
            for(int j=0;j<i;j++){
                res=res*(i-j);
                res=res/(j+1);
                ll.add(res);
            }
            list.add(ll);
            
        }
        
        return list;
        
    }
}