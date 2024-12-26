import java.util.ArrayList;
import java.util.List;

class Solution {
    public List<List<Integer>> generate(int numRows) {
        List<List<Integer>> result = new ArrayList<>(); 

        
        result.add(new ArrayList<>());
        result.get(0).add(1);

       
        for (int i = 1; i < numRows; i++) {
            List<Integer> prevRow = result.get(i - 1); 
            List<Integer> currentRow = new ArrayList<>();

            currentRow.add(1); 

            
            for (int j = 1; j < prevRow.size(); j++) {
                currentRow.add(prevRow.get(j - 1) + prevRow.get(j));
            }

            currentRow.add(1); 

            result.add(currentRow); 
        }

        return result;
    }
}
