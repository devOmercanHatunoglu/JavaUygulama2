package uygulama2;

public class Main {

	public static void main(String[] args) {
		
		
		
		GeneralManager generalManager = new GeneralManager();
		
		generalManager.add(new UserManager());
		generalManager.add(new InstructorManager());
		generalManager.add(new StudentManager());
		
		
		
		

	}

}
