import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		
		System.out.println("Veuiller introduire le nombre utilisateur :");
		Scanner sc= new Scanner(System.in);
		int n= sc.nextInt();
		int i=1;
		while(i<=n){

			System.out.println("veuiller introduire les infos du : "+i + " utilisateur");
			System.out.println("saisir username: "); String username= sc.next();
			System.out.println("saisir userfirstname : "); String userfirstname= sc.next();
		    System.out.println("saisir userlogin : "); String userlogin= sc.next();
		    System.out.println("saisir userpassword : "); String  userpassword= sc.next();
		    System.out.println("saisir roleName : "); String roleName= sc.next();
		    Role role= new Role(roleName);
		    
		    User u= new User(username, userfirstname, role, userlogin, userpassword);
		   
		    role.afficherRole();
		    u.afficherUser();
		    
		    i++;
		}

		
	}

}
