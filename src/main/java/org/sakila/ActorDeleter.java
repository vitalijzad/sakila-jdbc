package org.sakila;

import java.util.Scanner;

import org.sakila.dao.ActorDAO;

public class ActorDeleter {
	public static void main(String[] args) {
		Scanner scanner = new Scanner(System.in);
		System.out.println("Inserire l'identificativo dell'attore da eliminare:");
		int id = scanner.nextInt();
		scanner.close();
		ActorDAO actorDAO = new ActorDAO();
		boolean result = actorDAO.delete(id);
		if(result){
		    System.out.println("Eliminazione effettuata con successo");
        }else{
		    System.out.println("Errore durante l'eliminazione");
        }
	}
}
