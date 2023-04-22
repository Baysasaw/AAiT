public class LightSwitch{
	private boolean on; //field
	//construcrors
	// a class can have more multiple constructors
	LightSwitch(){
		//this.on = true; // (same as on = true;)
		this(true);

	}
	LightSwitch(int on){
		//instance can refer to itself with the keyword - this
		this.on = on;
	}
	



	public boolean isOn (){ // returns
		return on; //the state
	} 
	public void Switch() //changes
	{
		on =!on ; //the state
	}
}
