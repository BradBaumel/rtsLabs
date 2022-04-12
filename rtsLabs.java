import java.util.*;

public class RTSLabs{

     public static void main(String []args){
         RTSLabs tests = new RTSLabs();
         
         List<Integer> list = Arrays.asList(1, 5, 2, 1, 10);
         System.out.println(tests.aboveBelow(list, 6));
         
         System.out.println(tests.stringRotation("MyString", 0));
         System.out.println(tests.stringRotation("MyString", 1));
         System.out.println(tests.stringRotation("MyString", 2));
         System.out.println(tests.stringRotation("MyString", 3));
         System.out.println(tests.stringRotation("MyString", 4));
         System.out.println(tests.stringRotation("MyString", 5));
         System.out.println(tests.stringRotation("MyString", 6));
         System.out.println(tests.stringRotation("MyString", 7));
         System.out.println(tests.stringRotation("MyString", 8));
         System.out.println(tests.stringRotation("MyString", 9));
     }
     
     // returns a map of the counts of values above or below the
     // target value not inclusive.
     public Map<String,Integer> aboveBelow(List<Integer> numList, int val){
         Map<String,Integer> map = new HashMap<String,Integer>();
         map.put("above", 0);
         map.put("below", 0);
         
         for(int i : numList){
             if(i > val){
                 map.put("above", map.get("above")+1);
             }
             else if(i < val){
                 map.put("below", map.get("below")+1);
             }
         }
         return map;
     }
     
     // returns a string rotated by the given value.
     public String stringRotation(String str, int rotAmount){
         String rotatedString = "";
         int length = str.length();
         
         if(rotAmount > length){
             rotAmount = rotAmount - length;
         }
        
        rotatedString += str.substring(length - rotAmount, length);
        rotatedString += str.substring(0, length - rotAmount);
        
        return rotatedString;
     }
}