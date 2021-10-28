package de.uni.koeln.se.state;


public class Elevator{
	
	public static int current_Floor=5;
	int dest_Floor;
	
	private Elv_States State = new Elv_States();
	
	public Elevator (int dest_floor)
	{
		this.dest_Floor=dest_floor;
	System.out.println("*** Destination floor is: "+ dest_Floor);
	arrive_atFloor();


	}

	private void arrive_atFloor() {
		if(dest_Floor < current_Floor) {
			current_Floor--;
			System.out.println("State: " + State.Moving_down + "; current floor: " + dest_Floor);
			arrive_atFloor();
		} else if(dest_Floor > current_Floor) {
			current_Floor++;
			System.out.println("State: " + State.Moving_up + "; current floor: " + dest_Floor);
			arrive_atFloor();
		} else {
			System.out.println("We arrived the Destination floor: " + dest_Floor);
		}
	}

	
}
