package de.isento.git.first;

import de.isento.git.first.utils.HelloWorldUtils;

/**
 * Hauptklasse - Git Erste
 */
public class FirstGitMain {

	/**
	 * Kommentar für main
	 */
	public static void main(String[] args){
		
		System.out.println("********************************************************************************");
		System.out.println("********************************************************************************");
		
		if (args != null && args.length == 2){
			System.out.println(HelloWorldUtils.sayHello(args[0], args[1]));
		} else {
			System.out.println(HelloWorldUtils.sayHello("ISENTO GMBH", "ES"));
		}
		
		System.out.println("********************************************************************************");
		System.out.println("********************************************************************************");
	}
}
