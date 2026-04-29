import java.util.Scanner;

public class Player {
	private int damage,healty,money,rHealthy;
	private String name,cName;
	private Inventory inv;
	Scanner scan =new Scanner(System.in);
	
	public Player(String name) {
		this.name = name;
		this.inv =new Inventory();
	}
	
	public void selectCha() {
		switch (chaMenu()) {
		case 1:
			initPlayer("SAMURAY",5,21,15);
			break;
		case 2:
			initPlayer("OKÇU",7,18,20);
			break;
		case 3:
			initPlayer("ŞÖVALYE",3,24,5);
			break;
		default:
			setcName("SAMURAY");
			setDamage(5);
			setHealty(21);
			setMoney(15);
			break;
				
		}
		System.out.println("Karakter:" + getcName() + " Hasar:" + getDamage() + " Sağlık:" + getHealty() + " Para:" + getMoney());
	}
	
	public int chaMenu() {
		System.out.println("Lütfen bir karakter seçiniz:");
		System.out.println("1- SAMURAY  HASAR : 5   SAĞLIK : 21   PARA : 15");
		System.out.println("2- OKÇU     HASAR : 7   SAĞLIK : 18   PARA : 20");
		System.out.println("3- ŞÖVALYE  HASAR : 3   SAĞLIK : 24   PARA : 5");
		System.out.print("Karakter seçiminiz:");
		int chaID = scan.nextInt();
		
		while(chaID<1 || chaID>3) {
			System.out.println("Lütfen geçerli bir sayı giriniz:");
			chaID = scan.nextInt();
		}
		return chaID;
	}
	
	public int getTotalDamage() {
		return this.getDamage()+this.getInv().getDamage();
	}
	
	public void initPlayer( String cName, int dmg, int hlthy, int mny ) {
		setcName(cName);
		setDamage(dmg);
		setHealty(hlthy);
		setMoney(mny);
		setrHealthy(hlthy);
	}

	public int getDamage() {
		return damage;
	}

	public void setDamage(int damage) {
		this.damage = damage;
	}

	public int getHealty() {
		return healty;
	}

	public void setHealty(int healty) {
		this.healty = healty;
	}

	public int getMoney() {
		return money;
	}

	public void setMoney(int money) {
		this.money = money;
	}

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public String getcName() {
		return cName;
	}

	public void setcName(String cName) {
		this.cName = cName;
	}

	public Inventory getInv() {
		return inv;
	}

	public void setInv(Inventory inv) {
		this.inv = inv;
	}

	public int getrHealthy() {
		return rHealthy;
	}

	public void setrHealthy(int rHealthy) {
		this.rHealthy = rHealthy;
	}
	
	
	
	
	
}
