package interviewexcercises.orgconflict;

import org.junit.Assert;

import java.util.*;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.HashSet;
import java.util.List;

/**
 * Created by Deodhar Family on 2/16/2017.
 *          				  							CEO
 *          				 SVP1-SBG                    |                       SVP2-CTG
 *      		VP1   			|  VP2                               				 VP3
 *    		  Anil      		|        AnilC
 *  	Seema     Archana   	|  			Aijaz                                     Ojas [ IC ]
 *  Peter,Akshay   Rick,Raja 	|  			Sujeeth
 *
 * Problem Description: any two employees in the company can have conflict. find their common manager who would then
 * be able to solve the conflict.
 *
 *  For Example: Rick,Akshay -> Anil   Seema,Archana->Anil, Peter,Akshay -> Seema
 */
public class Company {

	public static Queue<Employee> employees =new LinkedList<>();

	public static Company intuit = new Company();
	//SBG ---------------------------------
	//platform
	//ICs
	Employee akshay = new Employee(new HashSet<>(),"Akshay",0);
	Employee peter = new Employee(new HashSet<Employee>(),"Peter",0);
	Employee rick = new Employee(new HashSet<Employee>(),"Rick",0);
	Employee raja = new Employee(new HashSet<Employee>(),"Raja",0);

	//L2 managers
	Employee seema = new Employee(new HashSet<Employee>(Arrays.asList(akshay,peter)),"Seema",2);
	Employee archana = new Employee(new HashSet<Employee>(Arrays.asList(rick,raja)),"Archana",2);

	//Directors
	Employee anil = new Employee(new HashSet<Employee>(Arrays.asList(seema,archana)),"Anil",2);
	//VP
	Employee vp1 = new Employee(new HashSet<Employee>(Arrays.asList(anil)),"VP1",3);

	//Compliance
	//ICs
	Employee sujeeth = new Employee(new HashSet<Employee>(),"Sujeeth",0);
	//L1 managers
	Employee aijaz = new Employee(new HashSet<Employee>(Arrays.asList(sujeeth)),"Aijaz",1);

	//Directors
	Employee anilc = new Employee(new HashSet<Employee>(Arrays.asList(aijaz)),"Anilc",2);
	//VP
	Employee vp2 = new Employee(new HashSet<Employee>(Arrays.asList(anilc)),"VP2",3);
	//SVP
	Employee svp1 = new Employee(new HashSet<Employee>(Arrays.asList(vp1,vp2)),"SVP1",4);


	//CTG ----------------------------------

	//ICs
	Employee ojas = new Employee(new HashSet<Employee>(),"Ojas",0);
	//Directors - no one
	//VP
	Employee vp3 = new Employee(new HashSet<Employee>(Arrays.asList(ojas)),"VP3",3);

	Employee svp2 = new Employee(new HashSet<Employee>(Arrays.asList(vp3)),"SVP2",4);

	Employee ceo = new Employee(new HashSet<Employee>(Arrays.asList(svp1,svp2)),"CEO",5);

	public  void createOrg(){

		akshay.setManager(seema);
		peter.setManager(seema);
		rick.setManager(archana);
		raja.setManager(archana);

		seema.setManager(anil);
		archana.setManager(anil);
		anil.setManager(vp1);
		vp1.setManager(svp1);

		sujeeth.setManager(aijaz);
		aijaz.setManager(anilc);
		anilc.setManager(vp2);
		vp2.setManager(svp1);

		ojas.setManager(vp3);
		vp3.setManager(svp2);

		svp1.setManager(ceo);
		svp2.setManager(ceo);
		ceo.setManager(ceo);

	}
	//Takes in two employees who have a conflic and returns the employee who is responsible to resolve the conflict
	// Uses level and the manager informtion to make the decision.
	public Employee resolveConflictViaLevelAndGetManager(Employee a, Employee b){

		Employee resolver=null;
		//Basic: If both employees have the same manager, their manager resolves the conflict
		if(a.getManager().equals(b.getManager())){
			resolver = a.getManager();
			return resolver;
		}
		//If b is a's manager, b resolves the conflict
		if( a.getManager().equals(b)){
			resolver = b;
			return resolver;
		}
		//if a is b's manager, a resolves the conflict
		if( b.getManager().equals(a)){
			resolver = a;
			return resolver;
		}
		//If none of the above is true
		//if a is at a lower level in hirerarchy than b, then see if a's manager can resolve conflict with b
		if(a.getLevel()<b.getLevel()){
			return resolveConflictViaLevelAndGetManager(a.getManager(),b);
		}else if(a.getLevel()>b.getLevel()){  // if a is higher in level, then see if b's manager can resolve it with a
			return resolveConflictViaLevelAndGetManager(a,b.getManager());
		}else if(a.getLevel() == b.getLevel()){ // if both are at the same level then see if a's manager and b's manager can resolve it
			return resolveConflictViaLevelAndGetManager(a.getManager(),b.getManager());
		}
		return resolver;
	}


	public  Employee resolveConflictViaDirectReports(Employee a,Employee b){
		Employee resolver =null;
		List<Employee> leadersOfA = new LinkedList<>();
		//Basic: If both employees have the same manager, their manager resolves the conflict
		if(a.getManager().equals(b.getManager())){
			resolver = a.getManager();
			return resolver;
		}
		//If b is a's manager, b resolves the conflict
		if( a.getManager().equals(b)){
			resolver = b;
			return resolver;
		}
		//if a is b's manager, a resolves the conflict
		if( b.getManager().equals(a)){
			resolver = a;
			return resolver;
		}
		// Now since none of the above conditions are true
		//Create a linked list of all the managers till CEO starting with a's manager
		a = a.getManager();
		while(!a.getFirstName().equalsIgnoreCase("CEO")){
			leadersOfA.add(a);
			a = a.getManager();
		}
		//now last manager is the CEO and a is now CEO after while look so add that to leadersOf a
		leadersOfA.add(a.getManager());
		//Now start from b and start comparing each leader in the hierarchy to see if that leader is also part of a's leaders.
		while(!leadersOfA.contains(b)){
			b = b.getManager();
		}
		return b;
	}


	public static void printValidations(Employee a,Employee b, Employee resolver,String resolverFirstName){
		System.out.println("Conflict between " + a.getFirstName()+" and " +b.getFirstName() +" -> resolver = "+resolver.toString());
		Assert.assertTrue("Expected Resolver = "+ resolverFirstName + " Actual Resolver = " + resolver.getFirstName(),resolver.getFirstName().equalsIgnoreCase(resolverFirstName));
	}

	//This method basically takes two employes that have conflict and finds a resolvers of the conflict using two different methods.
	// First one uses level of the employee and their manager to find the resolver
	//Second one uses hierarchy  of one employee. a while building the hierarchy of the other employee if checks against first employee's hierarchy to find the solution
	public static  void validations(Employee a, Employee b, String resolverFirstName){

		System.out.println();
		//First method
		System.out.print("resolveConflictViaLevelAndGetManager: ");
		printValidations(a,b,intuit.resolveConflictViaLevelAndGetManager(a,b),resolverFirstName);
		//Second method.
		System.out.print("resolveConflictViaDirectReports:      ");
		printValidations(a,b,intuit.resolveConflictViaDirectReports(a,b),resolverFirstName);
	}

	//Print the complete organization
	public static void printOrganiation(){

		employees.add(intuit.ceo);
		while(!employees.isEmpty()){
			Employee e = employees.remove();
			System.out.println(e.getFirstName());
			for(Employee employee : e.getDirectReports()){
				employees.add(employee);
			}
		}
	}

	public static void main(String args[]){
		intuit.createOrg();
		validations(intuit.peter,intuit.rick,"Anil");
		validations(intuit.peter,intuit.aijaz,"SVP1");
		validations(intuit.peter,intuit.anil,"Anil");
		validations(intuit.peter,intuit.vp1,"VP1");
		validations(intuit.peter,intuit.sujeeth,"SVP1");
		validations(intuit.peter,intuit.vp2,"SVP1");
		validations(intuit.peter,intuit.ceo,"CEO");
		validations(intuit.raja,intuit.peter,"Anil");
		validations(intuit.aijaz,intuit.archana,"SVP1");
		validations(intuit.seema,intuit.ojas,"CEO");
		validations(intuit.rick,intuit.aijaz,"SVP1");
		validations(intuit.sujeeth,intuit.anilc,"Anilc");
		validations(intuit.archana,intuit.seema,"Anil");
		System.out.println("########## All Employees################");
		printOrganiation();
	}
}
