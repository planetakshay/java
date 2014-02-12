package interviewexcercises;

import java.util.*;

//The Friendship class
//
//Feel free to modify it however you want to implement the 3-4 methods and make them work.
//
public class Friendship {

 class person{
	 String name;
	 int i;
	 ArrayList<person> friends;
 }
 
 private static Map<String,ArrayList<String>> friendsCache;
 private static ArrayList<person> fCache;
 
 // constructor
 public Friendship() {   
	 friendsCache = new HashMap<String,ArrayList<String>>();
	 fCache = new ArrayList<person>();
	 
 }
 
 

 // This is for you to implement
 //
 // This method takes 2 String parameters and
 // makes them "friend" of each other.  
 //
 // Note: The order of names does not matter
 // Note: Don't forget to write tests to have good test coverage for this method
 public void makeFriend(String name1, String name2) {  	
	 
	 if(name1==null || name2==null) return;
	 
	 if(friendsCache.containsKey(name1)){
		 //add only if name2 is not friends with name1 already
		 if(!friendsCache.get(name1).contains(name2)) friendsCache.get(name1).add(name2);
	 }
	 if(!friendsCache.containsKey(name1)){
		 ArrayList<String> friend = new ArrayList<String>();
		 friend.add(name2);
		 friendsCache.put(name1,friend);
	 }
	 
	 if(friendsCache.containsKey(name2)){
		 // add only if name 1 is not friends with name2 already
		 if(!friendsCache.get(name2).contains(name1)) friendsCache.get(name2).add(name1);
	 }
	 if(!friendsCache.containsKey(name2)){
		 ArrayList<String> friend = new ArrayList<String>();
		 friend.add(name1);
		 friendsCache.put(name2,friend);
	 }
	 
	 
 }
 
 // This is for you to implement
 //+
 // This method takes 2 String parameters and
 // makes them no longer friends of each other.  
 //
 // Note: The order of names does not matter
 // Note: Don't forget to write tests to have good test coverage for this method
 public void unmakeFriend(String name1, String name2) {  
	 
	 if(name1==null || name2==null) return;
	 
	 if(friendsCache.containsKey(name1)){
		 
		 ArrayList<String> friendsOfName1;
		 friendsOfName1 = friendsCache.get(name1);
		 if(friendsOfName1.contains(name2)){
			 for(int i=0;i<friendsOfName1.size();i++){
				 String friend = friendsOfName1.get(i);
				 if(friend.equals(name2)){
					 friendsOfName1.remove(i);
					 friendsCache.put(name1, friendsOfName1);
					 break;
				 }
			 }
		 }
	 }
	 
	 if(friendsCache.containsKey(name2)){
		 ArrayList<String> friendsOfName2 = new ArrayList<String>();
		 friendsOfName2 = friendsCache.get(name2);
		 if(friendsOfName2.contains(name1)){
			 for(int i=0;i<friendsOfName2.size();i++){
				 String friend = friendsOfName2.get(i);
				 if(friend.equals(name1)){
					 friendsOfName2.remove(i);
					 friendsCache.put(name1, friendsOfName2);
					 break;
				 }
			 }
		 }
	 }
	 
	 return;
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
 		
	 ArrayList<String> directFriends = new ArrayList<String>();
	 
	 if(friendsCache.containsKey(name)){
		 directFriends.addAll(friendsCache.get(name));
	 }
	 // Traverse each friend's list to see if we find name, if we do, then enter the name in to direct friends name.
//	 for(Map.Entry<String, ArrayList<String>> entry : friendsCache.entrySet()){
//		 ArrayList<String> friends = entry.getValue();
//		 if(friends.contains(name) && directFriends.contains(entry)){
//			 directFriends.add(entry.getKey());
//		 }
//	 }
//	 
	 
	 return directFriends;
 }
 
 // This is for you to implement
 //
 // This method takes a single argument (name) and 
 // returns all the indirect "friends" of that name
 //
 // For example, A & B,C are friends, B & C,Z are friends and C & D are friends.
 // getInirectFriends(A) would return C and D
 // A,B  B,C   C,D
 // Note: It should not return duplicate names
 // Note: Don't forget to write tests to have good test coverage for this method
 public List<String> getIndirectFriends(String name) {
	
	 ArrayList<String> indirectFriends = new ArrayList<String>();
	Set<String> uniqueIndirectFriends = new HashSet<String>();
	
	 
	 //Get the first level direct friends
	
	 if(friendsCache.containsKey(name)){
		 
		 ArrayList<String> firstLevelFriends = friendsCache.get(name);
		 
		 //Traverse all first level friends and add to a uniqueIndirectFriends Set.
		 for(int i=0;i<firstLevelFriends.size();i++){
			if(friendsCache.containsKey(firstLevelFriends.get(i))){
				uniqueIndirectFriends.addAll(friendsCache.get(firstLevelFriends.get(i)));
			}
		 }
		 
		 //Now remove any first level friends that got added to this set
		 for(String friend: uniqueIndirectFriends){
			 if(firstLevelFriends.contains(friend) && !friend.equals(name)){
				 // if first level friends already contain this value - then do nothing
			 }else{  // Else add to the arralist that we are going to return back
				 indirectFriends.add(friend);
			 }
		 }
		 
	 }
	 
     return indirectFriends;
 }
 
}