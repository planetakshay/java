package interviewexcercises;

import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public class TestFriendship {

	// A sample test to get you started.
    //
    // Note that this is in NO WAY providing adequate test coverage
    // Please write additional tests to demonstrate your ability to
    // achieve the best test coverage with the least number of test cases.
    //
    // Note this test only exercises 2 of the Friendship methods.
	@Test
	public void testGetDirectFriends() {
		Friendship friendship = new Friendship();
        friendship.makeFriend("Aaron", "Bella");
        friendship.makeFriend("Bella", "Cindy");
        friendship.makeFriend("Bella", "David");
        friendship.makeFriend("David", "Elizabeth");
        friendship.makeFriend("Cindy", "Frank");
        
        List<String> directFriends = friendship.getDirectFriends("David");
        
   		ArrayList<String> expectedFriends = new ArrayList<String>();
        expectedFriends.add("Bella");
        expectedFriends.add("Elizabeth");

        assertEquals(expectedFriends, directFriends);
	}
	@Test
	public void testGetDirectFriendsOne(){
		Friendship friendship = new Friendship();
        friendship.makeFriend("A", "B");
        friendship.makeFriend("B", "C");
        friendship.makeFriend("C", "D");
        friendship.makeFriend("C", "G");
        
        List<String> indirectFriends = friendship.getIndirectFriends("A");
        ArrayList<String> expectedFriends = new ArrayList<String>();
        expectedFriends.add("C");
        
        assertEquals(expectedFriends, indirectFriends);
        
        
	}

}

