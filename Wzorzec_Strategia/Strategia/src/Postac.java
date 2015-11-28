
public abstract class Postac  {
	SelectWeapon select;
	abstract void walcz();
	abstract void speak();
	
	public void selectWeap(){
		select.selectWeapon();
	}
	public void changeWeapon(SelectWeapon ob){
		select = ob ;
	}
	
	public void mov(){
		System.out.println("all character can run");
	}

	
}
