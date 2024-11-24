package setcodeapp;

import java.util.HashSet;
import java.util.Set;

public class SetCodeApp {

    public static void main(String[] args) {
        // Declare and initialize a Set that can store String objects representingcustomer name
        Set<String> setList=new HashSet<>();
        
        //Add the following customers to the queue in this order: Alice, Bob,Charlie, Diana, Eve, Eve
        setList.add("Alice");
        setList.add("Bob");
        setList.add("Charlie");
        setList.add("Diana");
        setList.add("Eve");
        
        //Print the current set
        System.out.println("Current set : "+setList);
        
        //Serve the first one customers (remove them from the set) and printtheir names
        System.out.println("first remove in the set : "+setList.remove("Alice"));
        
        //Print the set after removing the set
        System.out.println("After removing in the set : "+setList);
        
        //add two more customers to the set 
        setList.add("Frank");
        setList.add("Grace");
        
        //Print the final state of the set
        System.out.println("Final set after adding two customers : "+setList);
        
    }
    
}
