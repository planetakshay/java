package interviewexcercises;
import java.util.*;

// The Friendship class
//
// Feel free to modify it however you want to implement the 3-4 methods and make them work.
// 
public class Friendship1 {
	
    class Person{
    	String name;
    	HashSet<Person> friends;
    	Person(String name){
    		this.name=name;
    		friends = new HashSet<Person>();
    	}
    }
	private HashSet<Person> cache = new HashSet<Person>();
    
	public Person findFriendInCache(String name){
		
		for(Person p: cache){
			if(p.name.equals(name)){
				return p;
			}
		}
		return null;
	}
	
	// constructor
    public Friendship1() {   	
    }

    // This is for you to implement
    //
    // This method takes 2 String parameters and
    // makes them "friend" of each other.  
    //
    // Note: The order of names does not matter
    // Note: Don't forget to write tests to have good test coverage for this method
    public void makeFriend(String name1, String name2) {  	
    	Person p1 = findFriendInCache(name1);
    	Person p2 = findFriendInCache(name2);
    	Person person1,person2;
    	
    	if(p1==null && p2!=null){
    		person1 = new Person(name1);
        	person1.friends.add(p2);
        	p2.friends.add(person1);
        	cache.add(person1);
    	}else
    	if(p2==null && p1!=null){
    		person2 = new Person(name2);
    		person2.friends.add(p1);
    		p1.friends.add(person2);
        	cache.add(person2);
        	
    		
    	}else
    	if(p1==null && p2==null){
    		person1 = new Person(name1);
    		person2 = new Person(name2);
    		person1.friends.add(person2);
    		person2.friends.add(person1);
    		cache.add(person1);
        	cache.add(person2);        	
    	}
    	
    }
    
    // This is for you to implement
    //
    // This method takes 2 String parameters and
    // makes them no longer friends of each other.  
    //
    // Note: The order of names does not matter
    // Note: Don't forget to write tests to have good test coverage for this method
    public void unmakeFriend(String name1, String name2) {
    	Person p1 = findFriendInCache(name1);
    	Person p2 = findFriendInCache(name2);
    	p2.friends.remove(p1);
    	p1.friends.remove(p2);
    	if(p1.friends.isEmpty()) cache.remove(p1);
    	if(p2.friends.isEmpty()) cache.remove(p2);
    }
    
    // This is for you to implement
    //
    // This method takes a single argument (name) and 
    // returns all the immediate "friends" of that name
    //
    // For example, A & B are friends, B & C are friends and C & D are friends.
    // getDirectFriends(B) would return A and C
    // getDirectFriends(D) would return C
    //
    // Note: It should not return duplicate names
    // Note: Don't forget to write tests to have good test coverage for this method
    public List<String> getDirectFriends(String name) {
    	
    	Person p = findFriendInCache(name);
    	ArrayList<String> friendsList = new ArrayList<String>();
    	HashSet<Person> friendsSet = p.friends;
    	for(Person p1: friendsSet){
    		friendsList.add(p1.name);
    	}
    	return friendsList;
    }
    
    // This is for you to implement
    //
    // This method takes a single argument (name) and 
    // returns all the indirect "friends" of that name
    //
    // For example, A & B are friends, B & C are friends and C & D are friends.
    // getInirectFriends(A) would return C and D
	//
    // Note: It should not return duplicate names
    // Note: Don't forget to write tests to have good test coverage for this method
    public List<String> getIndirectFriends(String name) {
        
    	HashSet<Person> uniqueFriends = new HashSet<Person>();
    	HashSet<Person> friendsProcessed = new HashSet<Person>();
    	Person p = findFriendInCache(name);
    	HashSet<Person> firstLevelFriends = p.friends;
    
    	
    	Queue<Person> friendsToProcess = new LinkedList<Person>();
    	friendsToProcess.addAll(firstLevelFriends);
    	
    	while(!friendsToProcess.isEmpty()){
    		Person p1= friendsToProcess.poll();
    			
    		HashSet<Person> nextLevelFriend = p1.friends;
    		for(Person p2: nextLevelFriend ){
    			
    			if(!uniqueFriends.contains(p2) && !p2.equals(p) && !firstLevelFriends.contains(p2) && !friendsProcessed.contains(p2) ){
    				uniqueFriends.add(p2);
    				friendsToProcess.add(p2);
    			}
    			friendsProcessed.add(p2);
    		}
    	}
    	ArrayList<String> indirectFriends = new ArrayList<String>();
    	for(Person p3: uniqueFriends){
    		indirectFriends.add(p3.name);
    	}
    	return indirectFriends;
    }
}