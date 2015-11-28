
public class Strategy {
	
	
	
	
	public static void main(String []args){
		
		Postac knight = new Knight();
		knight.speak();
		knight.selectWeap();
		knight.changeWeapon(new Machete());
		knight.walcz();
		knight.mov();
		knight.selectWeap();
		knight.changeWeapon(new Sword());
		knight.selectWeap();
		
		
		System.out.println("\n");
		Postac troll = new Troll();
		troll.selectWeap();
		troll.speak();
		troll.mov();
		troll.changeWeapon(new Sword());
		troll.selectWeap();
		
	}

}
