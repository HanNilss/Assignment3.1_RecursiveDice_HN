/**
 * Class that represents a die roller mechanism, implemented recursively.
 * @author hNilsson
 * @version 1.0
 * CS215
 */
import java.util.Random;
public class RecDieRoller {

	private Random roll; //Random object to represent the roll of the die
	private int counter = 1; //Counter variable to keep track of how many times dice has been rolled
	
	/**
	 * Creates a RecDieRoller object. Instantiates the roll variable as a new random object.
	 */
	public RecDieRoller() {
		roll = new Random();
	}//end default constructor
	
	/**
	 * Rolls the die recursively until it results in a 2. Calls itself if needed.
	 * 
	 * @return amount of times rolled
	 */
	public int roll() {
		int result = roll.nextInt(6)+1;
		if(result == 2) {
			System.out.println(result);
			return this.counter;
			}
		else {
		System.out.println(result);
		this.counter++;
		return roll();
		}
	}//end roll
	
	/**
	 * @return counter variable
	 */
	public int getCounter() {
		return this.counter;
	}//end getCounter
	
	/**
	 * Resets the counter to 1, since no matter what there will always be one roll to be returned
	 */
	public void resetCounter() {
		this.counter = 1;
	}//end resetCounter
}//end class
