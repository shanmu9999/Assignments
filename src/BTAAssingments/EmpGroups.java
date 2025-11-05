package BTAAssingments;

public class EmpGroups {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
	/*	Then, create another class called EmpGroups that contains two arrays to store the employee names
		and IDs.

		Retrieve the data from the Employees class, store it in these arrays, and finally print each employee's
		name along with their corresponding ID. */
		
		 // Create an object of Employees class
        Employees emp = new Employees();
        
     // Store data into arrays
        String[] empNames = { emp.emp1, emp.emp2, emp.emp3 };
        int[] empIds = { emp.Id1, emp.Id2, emp.Id3 };

        // Print without using a loop
        System.out.println("Employee Name: " + empNames[0] + ", Employee ID: " + empIds[0]);
        System.out.println("Employee Name: " + empNames[1] + ", Employee ID: " + empIds[1]);
        System.out.println("Employee Name: " + empNames[2] + ", Employee ID: " + empIds[2]);

	}

}
