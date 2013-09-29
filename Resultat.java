package TPTLC;


public class Resultat {
    

 public static String type;
 public static String val;
 public static String valeur;

public Resultat(String typ, String val1) {
		type = typ;
		val = val1;
                valeur="";
	}

public String gettype(){
    
    return Resultat.type;
}

public String getval(){
    
    return Resultat.val;
}


}
