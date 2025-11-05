package BTAAssingments;

public class Employees {
	
	//stores the following employee names and IDs in separate variables:
	
	/* Employee Names: "Bharath", "John", "Aarav"
	Employee IDs: 1234, 1235, 1236 */

	
        String emp1 = "Bharath";
        String emp2 = "John";
        String emp3 = "Aarav";

        int Id1 = 1234;
        int Id2 = 1235;
        int Id3 = 1236;
        
        public static void main(String[] args) {
    		// TODO Auto-generated method stub
        	
        	//Print statement with Object
        	Employees obj = new Employees();
        	System.out.println("Employee name is :"+ obj.emp1+" and "+ "Employee ID is :"+obj.Id1);
        }
}

