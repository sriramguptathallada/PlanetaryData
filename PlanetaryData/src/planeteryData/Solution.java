package planeteryData;
import java.util.ArrayList;
import java.util.Collections;
import java.util.HashMap;
import java.util.ListIterator;
import java.util.Map;

public class Solution {

	public static void main(String[] args) {
		ArrayList<Planet> al = new ArrayList<>();
		
		String[] gases  = {};
		al.add(new Planet("Mercury",0,false,gases));
		
		String[] gases1  = {"Carbon Dioxide", "Nitrogen"};
		al.add(new Planet("Venus",0,false,gases1));
		
		String[] gases2  = {"Nitrogen", "Oxygen"};
		al.add(new Planet("Earth",1,false,gases2));
		
		String[] gases3  = {"Hydrogen", "Helium"};
		al.add(new Planet("Jupitor",79,true,gases3));
		
		String[] gases4  = {"Hydrogen", "Helium"};
		al.add(new Planet("Saturn",83,true,gases4));
		
		String[] gases5  = {"Hydrogen", "Helium","Methane"};
		al.add(new Planet("Uranus",27,true,gases5));
		
		System.out.println(countOfMoonsWithRings(al));
		System.out.println(gasFoundOnMaxPlanets(al));
		
	}
		
	public static int countOfMoonsWithRings(ArrayList<Planet> al)
	{	
		int moonsCount = 0;
		for (Planet planet : al) {
			if(planet.haveRings()) {
				moonsCount += planet.getMoons();
			}
		}
		
		return moonsCount;
		
	}
	public static ArrayList<String> gasFoundOnMaxPlanets(ArrayList<Planet> al)
	{
		HashMap<String,Integer> hm = new HashMap<>();
		for (Planet planet : al) {
			for(String gas:planet.getGases())
			{
				if(!hm.containsKey(gas))
				{
					hm.put(gas, 1);
				}
				else
				{
					hm.put(gas, hm.get(gas) + 1);
				}
			}
		}
		
		int maxValue = Collections.max(hm.values());
		
		
		ArrayList<String> retGases = new ArrayList<>();
		
		for(Map.Entry<String, Integer> a : hm.entrySet()) {
			if(a.getValue() == maxValue) retGases.add(a.getKey());
		}
		
		return retGases;
		
	}
	
	

}

