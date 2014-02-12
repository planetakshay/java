package interviewexcercises;
import static org.junit.Assert.*;

import java.util.ArrayList;
import java.util.List;

import org.junit.Test;


public class TestFriendship1 {

	// A sample test to get you started.
    //
    // Note that this is in NO WAY providing adequate test coverage
    // Please write additional tests to demonstrate your ability to
    // achieve the best test coverage with the least number of test cases.
    //
    // Note this test only exercises 2 of the Friendship methods.
	//@Test
	public void testGetDirectFriends() {
		Friendship1 friendship1 = new Friendship1();
        friendship1.makeFriend("Aaron", "Bella");
        friendship1.makeFriend("Bella", "Cindy");
        friendship1.makeFriend("Bella", "David");
        friendship1.makeFriend("David", "Elizabeth");
        friendship1.makeFriend("Cindy", "Frank");
        
        List<String> directFriends = friendship1.getDirectFriends("David");
        
   		ArrayList<String> expectedFriends = new ArrayList<String>();
        expectedFriends.add("Bella");
        expectedFriends.add("Elizabeth");

        assertEquals(expectedFriends, directFriends);
        
	}
	
	@Test
	public void testGetDirectFriendsOne() {
		Friendship1 friendship1 = new Friendship1();
        friendship1.makeFriend("A", "B");
        friendship1.makeFriend("B", "C");
        friendship1.makeFriend("B", "D");
        friendship1.makeFriend("D", "E");
        friendship1.makeFriend("C", "F");
        friendship1.makeFriend("C", "Z");
        
        List<String> directFriends = friendship1.getDirectFriends("A");
        List<String> indirectFriends = friendship1.getIndirectFriends("A");
   		
        ArrayList<String> expectedInFriends = new ArrayList<String>();
        expectedInFriends.add("C");
        expectedInFriends.add("D");
        expectedInFriends.add("E");
        expectedInFriends.add("F");
        expectedInFriends.add("Z");
        

        assertEquals(expectedInFriends, indirectFriends);
	}

}
