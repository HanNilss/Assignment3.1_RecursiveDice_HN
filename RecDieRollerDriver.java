/**
 * Driver class for the RecDieRoller class.
 * @author hNilsson
 * @version 1.0
 * CS215
 */
public class RecDieRollerDriver {
	
	public static void main(String[] args) {
		
		RecDieRoller dice = new RecDieRoller(); //new RecDieRoller object

		for (int i = 0;i<1000;i++) { //rolls die 1000 times
		dice.roll(); //Rolls die, counter is cumulative
		}//end for
		
		System.out.println("Average number of rolls needed for a 2: "+dice.getCounter()/1000);//Prints out average number of rolls needed to get a 2 as an integer
	}//end main

}//end class
