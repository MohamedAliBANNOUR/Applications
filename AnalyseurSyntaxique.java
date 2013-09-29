package TPTLC;

import java.util.ArrayList;


public class AnalyseurSyntaxique {
 
    
    
public static Resultat symbole ;  
public static int resultat ;
public static  boolean NPE=true;
 public static String msg="CALCUL ERRONEE "+"\n";
public static int i=0;
public static AnalyseurLexical anal;
public static String j;

public  AnalyseurSyntaxique(AnalyseurLexical anal) 
{
this.anal=anal;
symbole= anal.Lexeme();
System.out.println("premier symbole constructeur +"+symbole.getval());
resultat=0;
 
}


public static void accepter() 
{   
System.out.println(" symbole accepte +"+symbole.getval());
    symbole=anal.Lexeme();
    System.out.println(" symbole accepte Lexemesuivant +"+symbole.getval());
	if ((symbole.type).equals("Erreur")) {Erreur(0);}
       
}
  



public static int E(){ 
   int x=0,y=0;
System.out.println(" entrer dans E() et symbole+"+symbole.getval());
x=T();
System.out.println(" valeur retourner par T est"+x);
y=E1(x);
System.out.println(" valeur retourner par E1 est"+y);
return y;
}



public static int T(){ 
    int x=0;
    System.out.println(" entrer dans T() et symbole+"+symbole.getval());
    x=S();
    System.out.println(" valeur retourner par S est"+x);
    int y=E2(x);
    System.out.println(" valeur retourner par E2x est"+y);
   return (y);
}


public static int E1(int val){
    int x=0;
    System.out.println(" appel a E1 ()+val="+val);
    if(symbole.type=="OPLus"){
        System.out.println(" Oplus++appel a accepter");
        accepter();
        x=val+T();
        System.out.println(" valeur de x dan E1"+x);
        if(x>60){Erreur(1);}
        
        return(E1(x));
    }else 
        if(symbole.type=="OMoins"){
            System.out.println(" Omoin +appel a accepter");
        accepter();
        x=val-T();
        System.out.println(" valeur de x dan E1"+x);
        if(x>60){Erreur(1);}
      return(E1(x));
        
    }   
    
    return val;
}    

public static int E2(int val){
    int x=0,y=0;
    System.out.println(" appel a E1 ()+val="+val);
    if(symbole.type=="OMul"){
         System.out.println(" OMul +appel a accepter");
        accepter();
        x=val*T();
	System.out.println(" valeur de x dan E2"+x);
        if(x>60){Erreur(1);}
       return  E2(x);
    }else if(symbole.type=="ODiv"){
        accepter();
        try {
            x=val/T();
        } catch (Exception e) {
            Erreur(5);
        }
 
       System.out.println(" valeur de x dan E2"+x);
        if(x>60){Erreur(1);}
        return  E2(x);
        
    }
    return val;
}  

public static int S(){
     System.out.println(" appel a S ()");  
    int x=0;
    if(symbole.type=="NB"){
     System.out.println(" S()Symole est NB");
       symbole.valeur=valeurdecimal(symbole);
       
       x=Integer.parseInt(symbole.valeur);
       System.out.println(" S()x retourner"+x);
       resultat=x;
       if(resultat>60)
       {Erreur(1);}
       
         accepter();
    
    }
    
     if(symbole.type=="NbZero"){
         System.out.println(" S()Symole est NbZero");
       symbole.valeur=valeurdecimal(symbole);
       x=Integer.parseInt(symbole.valeur);
      System.out.println(" S()x retourner"+x);
       resultat=x;
       if(resultat>60){Erreur(1);}
        accepter();
    }else if(symbole.type=="Pouv"){
         System.out.println(" S()Symole est Puv+accepter()");
            accepter();
            x=E();
            System.out.println("valeur retourner par x=E()"+x);
            resultat=x;
            if(resultat>60){Erreur(1);}
           if(symbole.type=="Pferm")
           {accepter();}
           
           else{Erreur(2);}
            
    }
    return x;
}
          

public static String Erreur(int n){
    
    NPE= false;
   
    
    switch(n){
        
        case 0:
            msg+="ATTENTION IL Y A UNE ERREUR LEXICAL"+" '"+symbole.getval()+"'\n";
            return(msg);
        
        case 1:
            msg+="CALCLUER ERRONEE CAR VOUS AVEZ DEASSER XXXXXX=60!\n";            
            return(msg);
            
        case 2:
            msg+="PARENTHESE MANQUANTE!\n";            
            return(msg);
        
        case 3:
            msg+="IMPOSSIBLE DE DIVISER PAR ZERO\n";            
            return(msg);
        case 4:
            msg+="PAS D' OPERATEUR!\n";            
            return(msg);
            case 5:
            msg+="Division par ZERO!\n";            
            return(msg);
            
      }
    
    return msg;
}
    public static String Affichage(){
        
        
    String affiche="VOTRE RESULTAT EN ROMAINS EST :";
   
    int re=E();
    if(symbole.type=="Fin-op"&&NPE==true){
        
        
        return affiche+" "+intToRomain(re);
        
    }else{
        return msg;
    }
    
    
}




public static  String intToRomain(int num){
       String ch;
       int n=num;
       String ten[]={"","X","XX","XXX","XXXX","XXXXX","XXXXXX"};
       String unit[]={"","I","II","III","IV","V","VI","VII","VIII","IX"};
       if (num<0){
          n=num*(-1);
       }
       int t=(n/10);
       int u=n%10;
       if (num<0){
          ch= "-"+ten[t]+unit[u];}
          else{
          ch= ten[t]+unit[u];}
       return ch;
    }


	

public static String valeurdecimal(Resultat r){
    
    String cal=r.val;
    int decimal = 0;
    int lastNumber = 0;
    
   for (int x = cal.length() - 1; x >= 0 ; x--) {
        char cd = cal.charAt(x);

        switch (cd) {
            

            case 'X':
                decimal = Decimal(10, lastNumber, decimal);
                lastNumber = 10;
                break;

            case 'V':
                decimal = Decimal(5, lastNumber, decimal);
                lastNumber = 5;
                break;

            case 'I':
                decimal = Decimal(1, lastNumber, decimal);
                lastNumber = 1;
                break;
        }
    }
    return String.valueOf(decimal);
    
}



public static int Decimal(int decimal, int lastNumber, int lastDecimal) {
    
    if (lastNumber > decimal) {
        return lastDecimal - decimal;
    } else {
        return lastDecimal + decimal;
    }
 }
}    




















