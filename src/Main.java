import java.util.Scanner;

public class Main {

	public static void main(String[] args) {
		// TODO Auto-generated method stub
		System.out.println("Hello World !");
		
		int age = 30;
		String name = "Alice";
		boolean isStudent = false;
		System.out.println(name + " a " + age + " ans.");
		
		int[] numbers = {1, 2, 3, 4, 5};
		for (int number : numbers) {
			System.out.println(number);
		}
		
		for (int i = 0; i < 5; i++) {
			System.out.println("Compteur : " + i);
		}
		
		Scanner myObj = new Scanner(System.in);
		System.out.println("Entrez un numeros d'exercice");
		System.out.println("Exercice 1 : \"La garde des fruits\"");
		System.out.println("Exercice 2 : \"La sécurité du musée\"");
		System.out.println("Exercice 3 : \"La salle des trésors\"");
		System.out.println("Exercice 4 : \"Le marathon de calculs\" (avec tableaux)");
		System.out.println("Exercice 5 : \"L'énigme du coffre-fort\" (avec tableaux)");
		int numeroExercice = myObj.nextInt();
		switch (numeroExercice) {
		case 1:
		//Exercice 1 : "La garde des fruits"
		//Vous travaillez pour un marché local, et on vous demande de créer un programme qui aide à vérifier
		//si la quantité de fruits dans le stock est suffisante pour le lendemain. Si le stock de pommes est
		//supérieur à 100, alors il n'y a pas besoin d'en acheter plus. Sinon, il faudra en commander.
			final int seuilStockDePomme = 100;
			
			
			System.out.println("Exercice 1 : \"La garde des fruits\"");
			System.out.println("Entrez un stock de pommes");
			
			int stockDePomme = myObj.nextInt();
			
			if (stockDePomme > seuilStockDePomme) {
				System.out.println("il n'y a pas besoin d'en acheter plus.");
			}else {
				System.out.println("il faudra en commander");
			}
			break;
		case 2:
			//Exercice 2 : "La sécurité du musée"
			//Vous êtes en charge de la sécurité d'un musée. Le musée ne peut accueillir que des personnes
			//majeures (18 ans ou plus) pendant certaines expositions. Vous devez créer un programme pour
			//vérifier l'âge des visiteurs et décider s'ils peuvent entrer.
			final int Majeur = 18;
			
			System.out.println("Exercice 2 : \"La sécurité du musée\"");
			System.out.println("Entrez l\'age");
			
			int ageVisiteur = myObj.nextInt();
			
			if (ageVisiteur > Majeur) {
				System.out.println("Vous pouvez entrer.");
			}else {
				System.out.println("Vous ne pouvez pas entrer");
			}
			break;
		case 3:
			/*
			 * Exercice 3 : "La salle des trésors" Le gardien d'une salle des trésors vous
			 * demande de concevoir un système qui puisse afficher chaque jour le nombre de
			 * trésors comptabilisés. À chaque fois qu'un trésor est compté, il faut
			 * l'afficher sur l'écran avec une description spéciale pour les trésors comptés
			 * à des positions multiples de 3.
			 */			
			System.out.println("Exercice 3 : \"La salle des trésors");
			System.out.println("Entrez le nombre de trésors comptabilisés");
			
			int nombreDeTresorsComptabilise = myObj.nextInt();
			String description;
			
		    for (int i = 0; i < nombreDeTresorsComptabilise; i++) {
		    	System.out.println("Entrez une description ");
		    	description = myObj.nextLine();
		    	if (i%3 == 0) {
		    		System.out.println("Description " + description);
		    	}
		      }  
			
		    break;
		case 4:
			//Exercice 4 : "Le marathon de calculs" (avec tableaux)
			//Vous travaillez pour une école qui organise un marathon de calculs. Les élèves doivent additionner
			//une série de nombres entre 1 et un nombre donné par l'utilisateur. De plus, vous devez stocker
			//chaque résultat partiel de la somme dans un tableau pour le réutiliser plus tard.
			//Ajout : Utilisez un tableau pour stocker chaque étape de la somme.
			
			System.out.println("Exercice 4 : Le marathon de calculs");
			System.out.println("Entrez un nombre de calcul Max");
			int nombreDeCalculMax = myObj.nextInt();
			int[] sommeResultatPartiel = new int[nombreDeCalculMax];
			int somme = 0;
			
		    for (int i = 1; i < nombreDeCalculMax; i++) {
		    	System.out.println("Entrez un nombre " + i + " / " + nombreDeCalculMax);
		    	somme += myObj.nextInt();
		    	sommeResultatPartiel[i] = somme;
		      }  
		    
			System.out.println("La somme est " + somme );
			System.out.println("Les résulats partiel sont ");
			
		    for (int i = 0; i < nombreDeCalculMax; i++) {
		    	System.out.println("Partiel : " + sommeResultatPartiel[i]);
		      } 
			
			break;
			
		case 5:
			//Exercice 5 : "L'énigme du coffre-fort" (avec tableaux)
			//Un coffre-fort contient un trésor, mais il ne s'ouvrira que si un certain mot de passe est trouvé. Ce
			//mot de passe est une chaîne de caractères spécifique que l'utilisateur doit deviner. Le programme
			//doit également stocker chaque tentative de mot de passe dans un tableau et afficher toutes les
			//tentatives incorrectes à la fin.
			//Ajout : Utilisez un tableau pour stocker chaque tentative de mot de passe incorrecte.
			
			String MotDePasseSaisi = "";
			System.out.println("Exercice 5 : \"L'énigme du coffre-fort\"");
			
			final String MotDePasse = "fontaine";
			
			int nombreDeTentative = 0;
			int nombreDeTentativeMax = 10;
			boolean trouve = false;
			
		    do {
		    	System.out.println("Entrez un mot de passe");
		    	MotDePasseSaisi = myObj.nextLine();
		    	System.out.println("Vous avez saisi >"  + MotDePasseSaisi + "<");
		    	if (MotDePasse.equals(MotDePasseSaisi)) {
		    		System.out.println("Trouvé en "  + nombreDeTentative + " tentative ");
		    		trouve = true;
		    		break;				
		    	}
		    	nombreDeTentative++;
		    	System.out.println(nombreDeTentative);
		    }
		    while (nombreDeTentative < nombreDeTentativeMax);  
		    
		    if (!trouve){
		    	System.out.println("Pas trouvé ");	
		    }
		    
		
			break;
			
		default: 
			System.out.println("Pas de numéros correspondant");
			
		}
		

		
		
		

		
		
		
		



		

	}

}
