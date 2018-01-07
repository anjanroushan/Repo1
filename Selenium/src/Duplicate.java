import java.util.HashMap;
import java.util.Map;
import java.util.Set;

public class Duplicate {

	public static void duplicatecharCount(String word)
	{
		char [] characters = word.toCharArray();
		Map<Character, Integer> charMap = new HashMap<Character,Integer>();
		for(Character ch:characters)
		{
			if(charMap.containsKey(ch))
			{
				charMap.put(ch, charMap.get(ch)+1);
			}
			
			else{
				charMap.put(ch, 1);
			}
		}
		
		Set<Map.Entry<Character, Integer>> entrySet = charMap.entrySet();
		System.out.println("List of duplicate '%s'"+word);
		for(Map.Entry<Character, Integer> entry:entrySet)
		{
			if(entry.getValue()>1)
			{
				System.out.println(entry.getKey()+":"+entry.getValue());
			}
		}
	}
	
	public static void main(String args[])
{
duplicatecharCount("JavaJ2EE");	
}


}
