package com.vianine.registration;

import model.User;
import org.springframework.boot.SpringApplication;
import org.springframework.boot.autoconfigure.SpringBootApplication;

import java.util.ArrayList;

@SpringBootApplication
public class RegistrationApplication {

	public static void main(String[] args) {
		SpringApplication.run(RegistrationApplication.class, args);
		User pers = new User( "Vianine","user@yahoo.com","1234");
		User pers1 = new User( "Djimafo","user@yahoo.fr","12345");
		User pers2 = new User( "Brile","user@yahoo.de","123456");

		ArrayList<User> etudiant = new ArrayList<User>();

		System.out.println(pers2.toString());
// element ajouter dans l'arrayList
		etudiant.add(pers1);
		etudiant.add(pers);
		etudiant.add(pers2);
		System.out.println(etudiant);
		System.out.println("-----------------------------------------------------");

		for (int i=0;i<etudiant.size();i++){
			// parcourir
			if(etudiant.get(i).getEmail()!="user@yahoo.fr"){
				System.out.println(etudiant.get(i));
			}
			else {
				System.out.println("n'est pas conforme");
			}




		}
	}


}