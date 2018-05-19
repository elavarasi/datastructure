package javapractice;
import java.util.Arrays;
import java.util.Comparator;
import java.util.Iterator;
import java.util.LinkedList;
import java.util.List;
import java.util.ListIterator;
import java.util.Collections;

public class LinkedListProblems {

	public static void main(String args[]){
		
		Employee obj1 = new Employee("ela",12000,"CSE");
		Employee obj2 = new Employee("kanag",11000,"ECE");
		Employee obj3 = new Employee("trump",10000,"EEE");
		
		
		LinkedList<Employee> emplist = new LinkedList<Employee>();
		emplist.add(obj1);
		emplist.add(obj2);
		emplist.add(obj3);
		
		Iterator itr1 = emplist.iterator();
		
		while(itr1.hasNext()){
			System.out.println(itr1.next());	
		}		
		
		

		Collections.sort(emplist,new MySalaryComp1());
		for(Employee emp : emplist){
			System.out.println(emp);
		}
		
		Collections.reverse(emplist);
		for(Employee emp : emplist){
			System.out.println(emp);
		}
	}	
	
}


class MySalaryComp1 implements Comparator<Employee>{

		@Override
		public int compare(Employee o1, Employee o2) {
			// TODO Auto-generated method stub
			
			if(o1.salary < o2.salary){
				return 1;
			}
			else{
				return -1;
			}
		}
		
	}


class Employee {
	String name;
	int salary;
	String department;
	
	Employee(String name, int salary, String dept){
		this.name = name;
		this.salary = salary;
		this.department = dept;
	}

	public String toString(){
        return "Name: "+this.name+"-- Salary: "+this.salary;
    }
}	
	
