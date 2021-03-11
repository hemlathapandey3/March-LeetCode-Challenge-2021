/*
The TreeMap in Java is used to implement Map interface and NavigableMap along with the AbstractMap Class. 
The map is sorted according to the natural ordering of its keys, or by a Comparator provided at map creation time, depending on which constructor is used. 
This proves to be an efficient way of sorting and storing the key-value pairs. 
The storing order maintained by the treemap must be consistent with equals just like any other sorted map, irrespective of the explicit comparators. 
The treemap implementation is not synchronized in the sense that if a map is accessed by multiple threads, concurrently 
and at least one of the threads modifies the map structurally, it must be synchronized externally.
*/

class Solution {
    public String intToRoman(int num) {
        
        TreeMap<Integer, String> map = new TreeMap<>();
        map.put(1, "I");
        map.put(4, "IV");
        map.put(5, "V");
        map.put(9, "IX");
        map.put(10, "X");
        map.put(40, "XL");
        map.put(50, "L");
        map.put(90, "XC");
        map.put(100, "C");
        map.put(400, "CD");
        map.put(500, "D");
        map.put(900, "CM");
        map.put(1000, "M");
        
        String ans = "";
        while(num > 0)
        {
            Integer near = map.floorKey(num);
            ans+= map.get(near);
            num = num - near;
        }
        
        return ans;
        
    }
}
