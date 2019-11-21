
public class Classroom {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		Wilder nummer1 = new Wilder("Metje",true);
		System.out.println(nummer1.whoAmI());
		
		Wilder nummer2 = new Wilder("Klaus",false);
		System.out.println(nummer2.whoAmI());
		
		nummer2.setPresent(true);
		System.out.println(nummer2.whoAmI());
		
		Wilder nummer3 = new Wilder ("Michael");
		System.out.println(nummer3.whoAmI());
		nummer3.setFirstname("bergermi");
		System.out.println(nummer3.whoAmI());
		

	}

}
