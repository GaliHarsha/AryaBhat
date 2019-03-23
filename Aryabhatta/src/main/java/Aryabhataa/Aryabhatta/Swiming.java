package Aryabhataa.Aryabhatta;

public class Swiming {
	
	private SwimInterfacer swimInterfacer;
	public Swiming(SwimInterfacer swimInterfacer) {
	this.swimInterfacer=swimInterfacer;
}

public String getSwiming() {
	return "Swim daily 100 mtrs and his fortune is"+swimInterfacer.getSwimfortune();
}
}
