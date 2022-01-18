package pe.edu.galaxy.traiming.java;

public class appDemo {
   
	 public static void main(String[] args) {
		 
		 
		 String dni="A1061698";
		 
		 boolean sw=true;
		 
		 for (int i = 0; i < dni.length(); i++) {
			 System.out.println(dni.charAt(1));
			 if (!Character.isDigit(dni.charAt(i))) {
				 System.err.println("Error - dni no valido");
				 sw=false;
				 break;
			 }
		 }
		 if (sw) {
			 System.out.println("Dni correcto");
		 }
		 
		 
		 if (dni.matches("[0-9]*")) {
			 System.out.println("Dni correcto");
		 }else {
			 System.out.println("Dni incorrecto");
		 }
	 }
 }
		 
	