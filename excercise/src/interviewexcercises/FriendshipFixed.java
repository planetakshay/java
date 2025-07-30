package interviewexcercises;

import java.util.*;

public class FriendshipFixed {

    class person{
        String name;
        int i;
        ArrayList<person> friends;
    }

    private static Map<String,ArrayList<String>> friendsCache;
    private static ArrayList<person> fCache;

    public FriendshipFixed() {
        friendsCache = new HashMap<String,ArrayList<String>>();
        fCache = new ArrayList<person>();
    }

    public void makeFriend(String name1, String name2) {
        if(name1==null || name2==null) return;

        if(friendsCache.containsKey(name1)){
            if(!friendsCache.get(name1).contains(name2)) friendsCache.get(name1).add(name2);
        }
        if(!friendsCache.containsKey(name1)){
            ArrayList<String> friend = new ArrayList<String>();
            friend.add(name2);
            friendsCache.put(name1,friend);
        }

        if(friendsCache.containsKey(name2)){
            if(!friendsCache.get(name2).contains(name1)) friendsCache.get(name2).add(name1);
        }
        if(!friendsCache.containsKey(name2)){
            ArrayList<String> friend = new ArrayList<String>();
            friend.add(name1);
            friendsCache.put(name2,friend);
        }
    }

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
                        friendsCache.put(name2, friendsOfName2);
                        break;
                    }
                }
            }
        }
    }

    public List<String> getDirectFriends(String name) {
        ArrayList<String> directFriends = new ArrayList<String>();
        if(friendsCache.containsKey(name)){
            directFriends.addAll(friendsCache.get(name));
        }
        return directFriends;
    }

    public List<String> getIndirectFriends(String name) {
        List<String> directFriends = getDirectFriends(name);
        Set<String> indirectFriends = new HashSet<>();

        for (String friend : directFriends) {
            indirectFriends.addAll(getDirectFriends(friend));
        }

        indirectFriends.removeAll(directFriends);
        indirectFriends.remove(name);

        return new ArrayList<>(indirectFriends);
    }
}
