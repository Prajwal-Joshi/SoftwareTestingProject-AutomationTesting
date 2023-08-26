package learntestng;

import org.testng.annotations.Test;
public class Kgf {
	@Test(priority = 1,groups={"smoke"})
public void rocky() {
	System.out.println("Kgf Controlled by rocky");
}
	@Test(priority = 2, groups={"adhoc"})
public void reena() {
	System.out.println("Kgf Controlled by reena");
}
	@Test(priority = 5,groups={"integration"})
public void rajendraDesai() {
		
		
	System.out.println("Kgf Controlled by rajendraDesai");
}
	@Test(priority = 3,groups={"smoke"})
public void garuda() {
	System.out.println("Kgf Controlled by garuda");
}
	@Test(priority = 4,groups ={"system"})
public void chacha() {
	System.out.println("Kgf Controlled by chacha");
}
	@Test(priority = 8,groups={"globalization"})
public void ramikasen() {
	System.out.println("Kgf Controlled by ramikasen");	
}
	@Test(priority = 10,groups={"integration"})
public void adheera() {
	System.out.println("Kgf Controlled by adheera");
}
	@Test(priority = 6,groups={"adhoc"})
public void mumbaishetty() {
	System.out.println("Kgf Controlled by mumbaishetty");
	
}
	@Test(priority = 11,groups={"functionality"})
public void vanaram() {
	System.out.println("Kgf Controlled by vanaram");
}
	@Test(priority = 9,groups={"system"})
public void suryavardhan() {
	System.out.println("Kgf Controlled by suryavardhan");
}
}

