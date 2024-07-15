import java.util.Scanner;
public class NokiaMenu {

	public static void main(String [] args) {
	Scanner scanner = new Scanner(System.in);

	boolean exitProgram = false;

	while (!exitProgram) {
	System.out.print("""
		    ^	  NOKIA	        ^
		    ^	Pay as you talk ^  
		    ^	31 July 2024    ^
		    ^	10 : 15 am      ^
		
			Main Menu
			1. Menu	
			2. Exit
			Enter your choice
			""");
	
	int menu = scanner.nextInt();

	switch (menu) {	
	case 1: 
		boolean backToMainMenu = false;
		while (!backToMainMenu) {
		System.out.println("""
				Menu
				1. Phone book
				2. Messages
				3. Chat
				4. Call register
				5. Tones
				6. Settings
				7. Call divert
				8. Games
				9. Calculator
				10. Reminders
				11. Clocks
				12. Profiles
				13. SIM services
				14. Back to Main Menu
				Enter your choice
				""");
		int choice = scanner.nextInt();

		switch (choice) {
			case 1: 
				boolean exitPhoneBook = false;
				while (!exitPhoneBook) {
				System.out.println("""
						Phone book
						1. Search
						2. Service Nos.
						3. Add name
						4. Erase
						5. Edit
						6. Assign tone
						7. Send b'card
						8. Options
						9. Speed dials
						10. Voice tags
						11. Exit phone book
						Enter Filechoice
						""");
				int filechoice = scanner.nextInt();

				switch (filechoice) {
					
					case 1:
						System.out.print("Search");
						break;
					case 2:
						System.out.print("Service Nos");
						break;
					case 3:
						System.out.print("Add name");
						break;
					case 4:
						System.out.print("Erase");
						break;
					case 5:
						System.out.print("Edit");
						break;
					case 6:
						System.out.print("Assign tone");
						break;
					case 7:
						System.out.print("Send b'card");
						break;
					case 8:
						boolean exitOptions = false;
						while (!exitOptions) {
						System.out.print("""
								Options
								1. Type of view
								2. Memory status
								3. Exit options
								Select option
								""");
								int option = scanner.nextInt();

								switch (option) {

								case 1:
									boolean exitTypeOfView = false;
									while (!exitTypeOfView) {
									System.out.print("""
											Type of view
											1. Grid
											2. List
											3. exit list view
											select view type
											""");
											int view = scanner.nextInt();
											
											switch (view) {
											case 1:
												System.out.print("Updating grid");
												break;
											case 2:
												System.out.print("Updating list");
												break;
											case 3:
												exitTypeOfView = true;
												break;
											default:
												System.out.print("invalid input try again");
												break;
												}
											}
											break;
								case 2:
									System.out.print("Memory status");
									break;
								case 3:
									exitOptions = true;
									break;
								default:
									System.out.print("Invalid input try again");
									break;
									}
								}
								
						break;
					case 9:
						System.out.print("Speed dials");
						break;
					case 10:
						System.out.print("Voice tags");
						break;
					case 11:
						exitPhoneBook = true;
						break;
					default:
						System.out.print("invalid input");
						break;
						}
					}		
				break;
			case 2:
				boolean exitMessages = false;
				while (!exitMessages) {
				 System.out.print("""
						Messages
						1. Write messages
						2. Inbox
						3. Outbox
						4. Picture messages
						5. Templates
						6. Smileys
						7. Message settings
						8. Info service
						9. Voice mail number
						10. Service command editor
						11. To exit messages
						Enter your choice
						""");
						int message = scanner.nextInt();

						switch (message) {
						case 1:
							System.out.print("Write message");
							break;
						case 2:
							System.out.print("Inbox");
							break;
						case 3:
							System.out.print("outbox");
							break;
						case 4:
							System.out.print("Picture messages");
							break;
						case 5:
							System.out.print("Templates");
							break;
						case 6: 
							System.out.print("Smileys");
							break;
						case 7:
							boolean exitMessageSettings = false;
							while (!exitMessageSettings) {
							System.out.print("""
									Message settings
									1. Set 1
									2. Common
									3. To exit message settings
									Enter your choice
									""");
									int settings = scanner.nextInt();
							
									switch (settings) {
									case 1:
										boolean exitSet1 = false;
										while (!exitSet1) {
										System.out.print("""
												Set 1
												1. Message center number
												2. Message sent as
												3. Message validity
												4. To exit set1
												Enter your choice
												""");
												int set = scanner.nextInt();

												switch (set) {
												case 1:
													System.out.print("Message center number");
													break;
												case 2:
													System.out.print("Message sent as");
													break;
												case 3:
													System.out.print("Message validity");
													break;
												case 4:
													exitSet1 = true;
													break;
												default:
													System.out.print("Invalid input try again");
													break;
													}
												}
										break;
									case 2:
										boolean exitCommon = false;
										while (!exitCommon) {
										System.out.print("""
												Common
												1. Delivery
												2. Reply via same centre
												3. Character support
												4. To exit common
												Enter your choice
												""");
												int common = scanner.nextInt();
											

												switch (common) {
												case 1:
													System.out.print("Delivery");
													break;
												case 2:
													System.out.print("Reply via same centre");
													break;
												case 3:
													System.out.print("Character");
													break;
												case 4:
													exitCommon = true;
													break;
												default:
													System.out.print("invalid input try again");
													break;
													}
												}
										break;
									case 3:
										exitMessageSettings = true;
										break;
									default:
										System.out.print("Invalid input try again");
										break;
										}
									}
							break;
						case 8:
							System.out.print("Info service");
							break;
						case 9:
							System.out.print("Voice mailbox number");
							break;
						case 10:
							System.out.print("Service command editor");
							break;
						case 11:
							exitMessages = true;
							break;
						default :
							System.out.print("Invalid input try again");
							break;
							}
						}	
					break;
			case 3: 
				System.out.print("Chat");
				break;
			case 4: 
				boolean exitCallRegister = false;
				while (!exitCallRegister) {
				System.out.print("""
						Call register
						1. Missed calls
						2. Received calls
						3. Dialled numbers
						4. Erase recent call lists
						5. Show call duration
						6. Show call costs
						7. Call cost settings
						8. Prepaid credit
						9. To exit call register
						Enter your choice
						""");
						int register = scanner.nextInt();
						
						switch (register) {
						case 1:
							System.out.print("Missed calls");
							break;
						case 2:
							System.out.print("Received calls");
							break;
						case 3:
							System.out.print("Dialled numbers");
							break;
						case 4:
							System.out.print("Erase recent call lists");
							break;
						case 5:
							boolean exitShowCallDuration = false;
							while (!exitShowCallDuration) {
							System.out.print("""
									Show call duration
									1. Last call duration
									2. All call duration
									3. Received calls' duration
									4. Dialled calls' duration
									5. Clear timers
									6. To exit show call duration
									Enter your choice
									""");
									int duration = scanner.nextInt();

									switch (duration) {
									case 1:
										System.out.print("last call duration");
										break;
									case 2:
										System.out.print("All call duration");
										break;
									case 3:
										System.out.print("Received call duration");
										break;
									case 4:
										System.out.print("Dialled calls' duration");
										break;
									case 5:
										System.out.print("Clear timers");
										break;
									case 6:
										exitShowCallDuration = true;
										break;
									default:
										System.out.print("Invalid input try again");
										break;
										}
									}
							break;
						case 6:
							boolean exitShowCallCosts = false;
							while (!exitShowCallCosts) {
							System.out.print("""
									Show call costs
									1. Last call cost
									2. All calls' cost
									3. Clear counters
									4. To exit show call costs
									Enter your choice
									""");
									int costs = scanner.nextInt();
								
									switch (costs) {
									case 1:
										System.out.print("last call cost");
										break;
									case 2:
										System.out.print("All calls' cost");
										break;
									case 3:
										System.out.print("Clear counters");
										break;
									case 4: 
										exitShowCallCosts = true;
										break;
									default:
										System.out.print("invalid input try again");
										break;
										}
									}
							break;
						case 7:
							boolean exitCallCostSettings = false;
							while (!exitCallCostSettings) {
							System.out.print("""
									Call cost settings
									1. Call cost limit
									2. Show credit
									3. To exit call costs settings
									Enter your choice
									""");
									int call = scanner.nextInt();
									
									switch (call) {
									case 1:
										System.out.print("Call cost limit");
										break;
									case 2:
										System.out.print("Show credit");
										break;
									case 3:
										exitCallCostSettings = true;
										break;
									default:
										System.out.print("invalid input try again");
										break;
										}
									}
							break;
						case 8:
							System.out.print("Prepaid credit");
							break;
						case 9:
							exitCallRegister = true;
							break;
						default:
							System.out.print("invalid input try again");
							break;
							}
						}
				break;
			case 5: 
				boolean exitTones = false;
				while (!exitTones) {
				System.out.print("""
						Tones
						1. Ringing tone
						2. Ringing volume
						3. Incoming call alert
						4. Composer
						5. Message alert tone
						6. Keypad tones
						7. Warning and game tones
						8. Vibrating alert
						9. Screen saver
						10. To exit tones
						Enter your choice
						""");
						int tones = scanner.nextInt();

						switch (tones) {
						case 1:
							System.out.print("Ringing tone");
							break;
						case 2:
							System.out.print("Ringing volume");
							break;
						case 3:
							System.out.print("Incoming call alert");
							break;
						case 4:
							System.out.print("Composer");
							break;
						case 5:
							System.out.print("Message alert tone");
							break;
						case 6:
							System.out.print("Keypad tones");
							break;
						case 7:
							System.out.print("Warning and game tones");
							break;
						case 8:
							System.out.print("Vibrating alert");
							break;
						case 9:
							System.out.print("Screen saver");
							break;
						case 10:
							exitTones = true;
						default:
							System.out.print("invalid input try again");
							break;
							}
						}
				break;
			case 6: 
				boolean exitSettings = false;
				while (!exitSettings) {
				System.out.print("""
						Settings
						1. Call settings
						2. Phone settings
						3. Security settings
						4. Restore factory settings
						5. Exit settings
						6. Enter your choice
						""");
						int settings = scanner.nextInt();

						switch (settings) {
						case 1:
							boolean exitCallSettings = false;
							while (!exitCallSettings) {
							System.out.print("""
									Call settings
									1. Automatic redial
									2. Speed dialling
									3. call waiting options
									4. Own number sending
									5. Phone line is use
									6. Automatic answer
									7. To exit settings
									Enter your choice
									""");
									int automatic = scanner.nextInt();

									switch (automatic) {
									case 1:
										System.out.print("automatic redial");
										break;
									case 2:
										System.out.print("Speed calling");
										break;
									case 3:
										System.out.print("Call waiting options");		
										break;
									case 4:
										System.out.print("Own number sending");
										break;
									case 5:
										System.out.print("Phone line in use");
										break;
									case 6:
										System.out.print("Automatic answer");
										break;
									case 7:
										exitCallSettings = true;
										break;
									default:
										System.out.print("invalid input try again");
										break;
										}
									}
							break;
						case 2:
							boolean exitPhoneSettings = false;
							while (!exitPhoneSettings) {
							System.out.print("""
									Phone settings
									1. Language
									2. Cell info display
									3. Welcome note
									4. Network selection
									5. Lights
									6. Confirm SIM service actions
									7. To exit phone settings
									Enter your choice
									""");
									int language = scanner.nextInt();
	
									switch (language) {
									case 1: 
										System.out.print("Language");
										break;
									case 2:
										System.out.print("Cell info display");
										break;
									case 3:
										System.out.print("Welcome note");
										break;
									case 4:
										System.out.print("Network selection");
										break;
									case 5:
										System.out.print("Lights");
										break;
									case 6:
										System.out.print("Confirm SIM service actions");
										break;
									case 7:
										exitPhoneSettings = true;
										break;
									default:
										System.out.print("invalid input try again");
										break;
										}
									}
							break;
						case 3:
							boolean exitSecuritySettings = false;
							while (!exitSecuritySettings) {
							System.out.print("""
									Security settings
									1. PIN settings
									2. Call settings
									3. Fixed dialling
									4. Closed user group
									5. Phone security
									6. Change access codes
									7. To exit security settings
									Enter your choice
									""");
									int security = scanner.nextInt();

									switch (security) {
									case 1:
										System.out.print("PIN settings");
										break;
									case 2:
										System.out.print("Call settings");
										break;
									case 3:
										System.out.print("Fixed dialling");
										break;
									case 4:
										System.out.print("Closed user group");
										break;
									case 5:
										System.out.print("Phone security");
									case 6: 
										System.out.print("Change access codes");
										break;
									case 7:
										exitPhoneSettings = true;
										break;
									default:
										System.out.print("invalid input try again");
										break;
										}
									}
							break;
						case 4:
							System.out.print("Restore factory settings");
							break;
						case 5:
							exitSettings = true;
							break;
						default: 
							System.out.print("Invalid input try again");
							break;
							}
						}

				break;
			case 7:	
				System.out.print("Call divert");
				break;
			case 8: 	
				System.out.print("Games");
				break;
			case 9: 
				System.out.print("Calculator");
				break;
			case 10: 
				System.out.print("Reminders");
				break;
			case 11: 
				boolean exitClock = false;
				while (!exitClock) {
				System.out.print("""
						Clock
						1. Alarm
						2. Clock settings
						3. Date settings
						4. Stopwatch
						5. Countdown timer
						6. Auto update of date and time
						7. To exit clock 
						Enter your choice
						""");
						int clock = scanner.nextInt();

						switch (clock) {
						case 1:
							System.out.print("Alarm");
							break;
						case 2:
							System.out.print("Clock ettings");
							break;
						case 3:
							System.out.print("Date settings");
							break;
						case 4:
							System.out.print("Stopwatch");
							break;
						case 5:
							System.out.print("Countdown");
							break;
						case 6:
							System.out.print("Auto update of date and time");
							break;
						case 7:
							exitClock = true;
							break;
						default:
							System.out.print("invalid input try again");
							break;
							}
						}
				break;
			case 12: 
				System.out.print("profiles");
				break;
			case 13: 
				System.out.print("SIM service");
				break;
			case 14:
				backToMainMenu = true;
				break;
			default: 
				System.out.print("Invalid input try again");
				break;	
				}
			}
		break;
	case 2:
		exitProgram = true;
		System.out.println("Exiting program");
		break;
	default:
		System.out.println("Invalid input try again");
		break;
		}
	}
		scanner.close();
	}

}