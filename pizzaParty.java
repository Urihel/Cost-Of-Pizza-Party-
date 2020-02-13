import java.util.Scanner;
public class pizzaParty {
	//pizzaParty function
	

	public static int numberOfPizzas(int partyPeople , int slices, int perBox) {
		int totalNumberOfPizza = (partyPeople*slices)/perBox;
		return totalNumberOfPizza;
		
	}
	public static int numberOfSlices(int partyPeople, int slices, int perBox) {
		int totalNumberOfSlices = (partyPeople*slices);
		return totalNumberOfSlices;
	}
	public static double costOfCustomer(int totalNumberOfPizza, double customerPizzaCost ) {
		double costToCustomer = totalNumberOfPizza*customerPizzaCost;
		return costToCustomer;
	}
	public static double costOfCaterer(int totalNumberOfPizza, double catererPizzaCost ) {
		double costToCaterer = totalNumberOfPizza*catererPizzaCost;
		return costToCaterer;
	}
	public static void printData(int totalNumberOfPizza, int totalNumberOfSlices,double costToCustomer, int perBox, double costToCaterer) {
		System.out.println("\nTotal number of slices " + totalNumberOfSlices + "(30 people * 4 slices = " + totalNumberOfSlices + ")");
		System.out.println("Total number of pizzas " + totalNumberOfPizza + "(120 slices/8 slices per pizza = " + totalNumberOfPizza + ")");
		System.out.println("Number of extra slices left over " + totalNumberOfPizza/perBox);
		System.out.println("this is the cost of the party " + costToCustomer);
		System.out.println("this is the cost to the caterer " + costToCaterer);
	}
	
	
	public static void main(String[] args) {
		
		double catererPizzaCost = 16.50;
		double customerPizzaCost = 20.00;
		Scanner atendees = new Scanner(System.in);
		System.out.print("Enter number of people attending Party: ");
		int partyPeople = atendees.nextInt();
		//System.out.println(partyPeople);// for debugging purpose.
		
		Scanner pizzaSlices = new Scanner(System.in);
		System.out.print("How many slices per person?: ");
		int slices = pizzaSlices.nextInt();
		//System.out.println(slices);//for debugging purposes. 
		
		Scanner slicesPerPizza  = new Scanner(System.in);
		System.out.print("How many slice per box?: ");
		int perBox = slicesPerPizza.nextInt();
		
		
		int totalNumberOfPizza =  numberOfPizzas(partyPeople,slices,perBox);
		int totalNunmberOfSlices = numberOfSlices(partyPeople,slices,perBox);
		double costToCustomer = costOfCustomer(totalNumberOfPizza,customerPizzaCost);
		double costToCaterer = costOfCaterer(totalNumberOfPizza,catererPizzaCost);
		printData(totalNumberOfPizza,totalNunmberOfSlices,costToCustomer,perBox,costToCaterer);
