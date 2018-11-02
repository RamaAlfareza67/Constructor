public class Setan extends MakhlukGhaib{
	
	public int power;

	public Setan(String nama, int power){
		super(nama);		
		this.power = power;
	}

	public Setan(String nama){
		super(nama);
	}


	public void showPower(){
		System.out.println(power);
	}

}