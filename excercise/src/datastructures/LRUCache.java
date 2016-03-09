package datastructures;

import java.util.LinkedHashMap;
import java.util.Map;

public class LRUCache<K,V> extends LinkedHashMap<K,V> {

	public static final long serialVersionUID = -4334343;
	int size;
	private LRUCache(int size){
		super(size,0.75f,true); // initial size, load factor and - "true" is for access order - "false" would be for insertion order 
		this.size = size;
	}
	public static <K,V> LRUCache<K,V> newInstance(int size){
		return new LRUCache<K,V>(size);
	}
	
	public void setMaxSize(int size){
		this.size =size;
	}
	
		@Override
	protected boolean removeEldestEntry(java.util.Map.Entry<K, V> eldest) {
		// TODO Auto-generated method stub
		return size()>size;
	}
	
	public static void main(String args[]){
		
		LRUCache<String,String> cache = LRUCache.newInstance(2);
		cache.put("1", "1");
		cache.put("2", "2");
		cache.put("3","3");
		cache.put("1","1");
		cache.put("1","1");

		System.out.println(cache);
				
		
	}
	
}
