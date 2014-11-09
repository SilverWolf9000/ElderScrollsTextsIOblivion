import java.util.Scanner;

public class tes4oblivion {
	public static void main(String[] args) {
		/* Welcome to my first text-based adventure!
		 * This will revolve around the first main dungeon in the Elder Scrolls IV: Oblivion.
		 * I have about a month's worth of Java knowledge. Basic stuff, really.
		*/
		
		// User Input
		Scanner input = new Scanner(System.in);
		
		// Opening Dialogue
		System.out.println("Welcome to the Elder Scrolls Texts I: Oblivion.");
		System.out.println("Please select a race number:");
		
		// Elder Scrolls Races
		String[] race = {"(0) Imperial", "(1) Nord", "(2) Breton", "(3) Redguard", "(4) Wood Elf", "(5) Dark Elf", "(6) High Elf", "(7) Orc", "(8) Khajiit", "(9) Argonian"};
		
		// Displays the list of races
		for(String races: race) {
			System.out.println(races);
		}
		
		// Int value for selection
		int raceselection = input.nextInt();
		
		// While loop for the race selection
		while(raceselection <= 9) {
			if(raceselection == 0) {
				System.out.println("You are an Imperial hailing from Cyrodiil.");
			}
			else if(raceselection == 1) {
				System.out.println("You are a Nord hailing from Skyrim.");
			}
			else if(raceselection == 2) {
				System.out.println("You are a Breton hailing from High Rock.");
			}
			else if(raceselection == 3) {
				System.out.println("You are a Redguard hailing from Hammerfell.");
			}
			else if(raceselection == 4) {
				System.out.println("You are a Wood Elf hailing from Valenwood.");
			}
			else if(raceselection == 5) {
				System.out.println("You are a Dark Elf hailing from Morrowind.");
			}
			else if(raceselection == 6) {
				System.out.println("You are a High Elf hailing from the Summerset Isle.");
			}
			else if(raceselection == 7) {
				System.out.println("You are an Orc hailing from High Rock.");
			}
			else if(raceselection == 8) {
				System.out.println("You are a Khajiit hailing from Elsweyr.");
			}
			else if(raceselection == 9) {
				System.out.println("You are an Argonian hailing from Black Marsh.");
			}
			else {
				System.out.println("That is not a valid race.");
			}
		}
		
		// Closes UserInput to control resource leaks
		input.close();
	}
}
