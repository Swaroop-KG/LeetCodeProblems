class Solution {
    public int calPoints(String[] operations) {
        List<Integer> li = new ArrayList<>();

        for(int i=0;i<operations.length;i++){
            if(operations[i].equals("D")){
                li.add((li.get(li.size()-1) * 2)) ;
            }else if(operations[i].equals("+")){
                li.add( li.get(li.size()-1) + li.get(li.size()-2) );
            }else if(operations[i].equals("C")){
                li.remove(li.size()-1);
            }else{
                li.add(Integer.parseInt(operations[i]));
            }
            
        }
        

        int sum = 0;
        for(int ele:li)
            sum += ele;

        return sum;
    }   
}