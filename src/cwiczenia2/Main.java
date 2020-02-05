package cwiczenia2;

import java.util.Random;
import java.util.Scanner;

public class Main {
	
	public static void main (String[] args) {
		System.out.println("Wybierz minigrê:");
		System.out.println("1 - Zgadula");
		System.out.println("2 - Lotto");
		System.out.println("3 - Liczby Pierwsze");
		System.out.println("4 - Znak Zodiaku");
		Scanner scan = new Scanner(System.in);
		int x = scan.nextInt();
		switch(x) {
		case 1: Zgadula();
		case 2: Lotto();
		case 3: LiczbyPierwsze();
		case 4: ZnakZodiaku();
		default: System.out.println("B³¹d"); kont();
		}
	    
	}
	
	public static void Zgadula() {
   	 System.out.println("Zgadnij liczbê o jakiej myœle od 0 do 9");
   	 Scanner scan = new Scanner(System.in);
   	 int x = scan.nextInt();
   	 Random r = new Random();
   	 int a = r.nextInt(10);
   	 if(x == a) {
   		 System.out.println("WYGRA£EŒ");
   		 System.out.println("LICZBA O JAKIEJ MYŒLA£EM TO :" + a);
   		 kont();
   	 }
   	 else {
   		 System.out.println("PRZEGRA£EŒ");
   		 System.out.println("LICZBA O JAKIEJ MYŒLA£EM TO :" + a);
   		 kont();
   	 }
   	 
   	 
   	 
		
	}
	
     public static void Lotto() {
    	 System.out.println("Podaj mi liczbê z zakresu 0 - 9");
    	 Random r = new Random();
    	 Scanner scan = new Scanner(System.in);
    	 int x = scan.nextInt();
    	 int[] tab = new int[10];
    	 for(int i = 0; i < 10; i++) {
    		 int a = r.nextInt(10);
    	      tab[i] = a;
    	      if(x == a){
    	    	  System.out.println("TRAFILES!");
    	      }
    	      else {
    	    	  System.out.println("NIE TRAFILES!");
    	      }
    	    
    	 }
    	 
	}

	
     
     public static void LiczbyPierwsze() {
    	 System.out.println("Podaj mi liczbê a ja sprawdzê czy jest ona liczb¹ pierwsz¹");
    	 Scanner scan = new Scanner(System.in);
    	 int x = scan.nextInt();
    	 if(x == 0||x == 1) {
    		 System.out.println("Liczba 0 i 1 nie jest liczb¹ pierwsz¹"); 
    	 }
    	 else {
    		 for(int i = 2; i*i<=x; i++) {
    			 if(x%i==0) {
    				 System.out.println("Liczba nie jest liczb¹ pierwsz¹"); 
    				 break;
    			 }
    			 else {
    				 System.out.println("Liczba jest liczb¹ pierwsz¹"); 
    			 }
    		 }
    			
    	 }
    	 
    	 kont();
     }
     
	 public static void ZnakZodiaku() {
		 System.out.println("Podaj mi datê swojego urodzenia");
    	 Scanner scan1 = new Scanner(System.in);
    	 Scanner scan2 = new Scanner(System.in);
    	 System.out.println("Podaj miesi¹c: ");
    	 int x = scan1.nextInt();
    	 System.out.println("Podaj dzieñ: ");
    	 int y = scan2.nextInt();
    	 switch(x) {
    	 case 1:
    		 if(y <= 19) {
    			 System.out.println("KOZIORO¯EC");
    		 }
    		 else {
    			 System.out.println("WODNIK"); 
    		 }
    		 break;
    	 case 2:
    		 if(y <= 18) {
    			 System.out.println("WODNIK");
    		 }
    		 else {
    			 System.out.println("RYBY"); 
    		 }
    		 break;
    	 case 3:
    		 if(y <= 20) {
    			 System.out.println("RYBY");
    		 }
    		 else {
    			 System.out.println("BARAN"); 
    		 }
    		 break;
    	 case 4:
    		 if(y <= 19) {
    			 System.out.println("BARAN");
    		 }
    		 else {
    			 System.out.println("BYK"); 
    		 }
    		 break;
    	 case 5:
    		 if(y <= 20) {
    			 System.out.println("BYK");
    		 }
    		 else {
    			 System.out.println("BLINIÊTA"); 
    		 }
    		 break;
    	 case 6:
    		 if(y <= 20) {
    			 System.out.println("BLINIÊTA");
    		 }
    		 else {
    			 System.out.println("RAK"); 
    		 }
    		 break;
    	 case 7:
    		 if(y <= 22) {
    			 System.out.println("RAK");
    		 }
    		 else {
    			 System.out.println("LEW"); 
    		 }
    		 break;
    	 case 8:
    		 if(y <= 22) {
    			 System.out.println("LEW");
    		 }
    		 else {
    			 System.out.println("PANNA"); 
    		 }
    		 break;
    	 case 9:
    		 if(y <= 22) {
    			 System.out.println("PANNA");
    		 }
    		 else {
    			 System.out.println("WAGA"); 
    		 }
    		 break;
    	 case 10:
    		 if(y <= 22) {
    			 System.out.println("WAGA");
    		 }
    		 else {
    			 System.out.println("SKORPION"); 
    		 }
    		 break;
    	 case 11:
    		 if(y <= 21) {
    			 System.out.println("SKORPION");
    		 }
    		 else {
    			 System.out.println("STRZELEC"); 
    		 }
    		 break;
    	 case 12:
    		 if(y <= 21) {
    			 System.out.println("STRZELEC");
    		 }
    		 else {
    			 System.out.println("KOZIORO¯EC"); 
    		 }
    		 break;
    		 
    	 }
    	 kont();
		
	 }
	 
	public static void kont() {
		 System.out.println("¯yczysz sobie kontynuowaæ? 1 - TAK, 2 - NIE");
    	 Scanner scan2 = new Scanner(System.in);
    	 int y = scan2.nextInt();
    	 switch(y) {
    	 case 1: main(null); 
    	 case 2: System.exit(0);
    	 default: System.out.println("B³¹d"); kont();
    	 }
	}

	

	
		
		
}
	


