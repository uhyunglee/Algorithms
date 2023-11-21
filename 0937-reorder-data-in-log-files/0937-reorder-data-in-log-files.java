import java.util.StringTokenizer;

class Solution {
    public String[] reorderLogFiles(String[] logs) {
        // letterList that contain letter log
        List<String> letterList = new ArrayList<>();
        // digitList that contain digit log
        List<String> digitList = new ArrayList<>();
        
        for(String log : logs){
            // insert to digitList if log is digit log
            if(Character.isDigit(log.split(" ")[1].charAt(0))){
                digitList.add(log);
            }else{
                // if log is not digit log, insert to letterList
                letterList.add(log);
            }
        }
        
        // sorting letterList
        letterList.sort((s1, s2) ->{
            // divide into two part, identifier and except identifier
            String[] s1x = s1.split(" ", 2);
            String[] s2x = s2.split(" ", 2);
            
            // compare letter log lexicographically
            int compared = s1x[1].compareTo(s2x[1]);
            // if digits are same, compare identifier
            if(compared == 0){
                return s1x[0].compareTo(s2x[0]);
            }else{
                // if ordered are same, compared is 0, greater than s2x -> 1, less than s2x -> -1
                return compared;
            }
        });
        
        // add digitList after letterList
        // don't sort digit log
        letterList.addAll(digitList);
        
        // return list to String array
        return letterList.toArray(new String[0]);
    }
}