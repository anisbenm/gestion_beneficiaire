package mian;

import java.io.File;

public class Fichiers {

	public static void main(String[] args) {
		File f =new File("geste.txt");
	    System.out.println("Est-ce qu'il existe ? " + f.exists());
	    f.delete();
	  System.out.println("chemin du ficher :"+ f.getAbsolutePath());
	}

}
