package de.isento.git.first;

import de.isento.git.first.utils.HelloWorldUtils;

/**
 * Hauptklasse - Git Erste
 */
public class FirstGitMain {

	/**
	 * Kommentar f�r main
	 */
	public static void main(String[] args){
		if (args != null && args.length == 2 && args[1].length()==2){
			System.out.println(HelloWorldUtils.sayHello(args[0], args[1]));
		} else {
			System.out.println(HelloWorldUtils.sayHello("ISENTO GMBH", "DE"));
		}
	}
}
