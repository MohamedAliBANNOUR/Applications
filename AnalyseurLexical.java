package TPTLC;

public class AnalyseurLexical {
    public static String chaine;
    public static int i;
    public static int suivant; 
  
public AnalyseurLexical(String chaine, int debut) {
		this.chaine = chaine;
		i = debut;
                suivant=debut+1;
	}

public static Resultat Lexeme(){
    
     char car;
     String re="";
     int etat =1;
     boolean notfin=true;
     char ca=' ';
    while(notfin){ 
        
        car=chaine.charAt(i);
      
        switch(etat){
            
        
         
         case 1:
                
                if(car=='X'){re+=car;i++;etat=2;break;}
                else 
                    if(car=='I'){re+=car;i++;etat=3;break;} 
                else
                        if(car=='V'){re+=car;i++;etat=10;break;}
          else 
                            if(car=='+'||car=='-'||car=='*'||car=='/'){etat=18;break;} 
                else 
                                if(car=='('){etat=23;break;}              
                else 
                                    if(car==')'){etat=24;break;}
                else 
                                        if(car==' '){etat=25;break;}
                else{etat=0;break;}
                
        case 2:
                
                if (car=='X'){re+=car;i++;etat=2;break;}
                else
                    if(car=='I'){re+=car;i++;etat=3;break;} 
                else 
                        if(car=='V'){re+=car;i++;etat=10;break;}
                else 
                            if(car=='+'||car=='-'||car=='*'||car=='/'){
                  etat=18;return new Resultat("NB",re);} 
                else 
                                if(car=='('){etat=23;return new Resultat("NB",re);}              
                else 
                                    if(car==')'){etat=24;return new Resultat("NB",re);}
                else 
                                        if(car==' '){etat=25;return new Resultat("NB",re);}
                else 
                                            if(car=='$'){return new Resultat("NB",re);}
       
                else{etat=0;return new Resultat("NB",re);}
         
         case 3:
                
                if
                        (car=='X'){re+=car;i++;etat=8;break;}
                else 
                    if(car=='I'){re+=car;i++;etat=4;break;} 
                else 
                        if(car=='V'){re+=car;i++;etat=7;break;}
                else 
                            if(car=='+'||car=='-'||car=='*'||car=='/'){
                  etat=18;return new Resultat("NB",re);} 
                else 
                                if(car=='('){etat=23;return new Resultat("NB",re);}              
                else 
                                    if(car==')'){etat=24;return new Resultat("NB",re);}
                else 
                                        if(car==' '){etat=25;return new Resultat("NB",re);}
                else 
                                            if(car=='$'){return new Resultat("NB",re);}
       
                else{etat=0;return new Resultat("NB",re);}
             
             
             case 4:
           
                 if(car=='I'){re+=car;i++;etat=5;break;} 
                else 
                     if(car=='+'||car=='-'||car=='*'||car=='/'){
                  etat=18;return new Resultat("NB",re);} 
                else 
                         if(car=='('){etat=23;return new Resultat("NB",re);}              
                else 
                             if(car==')'){etat=24;return new Resultat("NB",re);}
                else 
                                 if(car==' '){etat=25;return new Resultat("NB",re);}
                else 
                                     if(car=='$'){return new Resultat("NB",re);}
       
                else{etat=0;return new Resultat("NB",re);}
         
  
   
        case 10:
           
            if(car=='I'){re+=car;i++;etat=11;break;} 
          
                else 
                
                if(car=='+'||car=='-'||car=='*'||car=='/'){
                  etat=18;return new Resultat("NB",re);} 
                else
                    if(car=='('){etat=23;return new Resultat("NB",re);}              
                else 
                        if(car==')'){etat=24;return new Resultat("NB",re);}
                else 
                            if(car==' '){etat=25;return new Resultat("NB",re);}
                else 
                                if(car=='$'){return new Resultat("NB",re);}
        
                else
                                {etat=0;return new Resultat("NB",re);}
      
        case 11:
           if(car=='I'){re+=car;i++;etat=12;break;} 
          
                 else 
                if(car=='+'||car=='-'||car=='*'||car=='/'){
                  etat=18;return new Resultat("NB",re);} 
                else 
                   
                   if(car=='('){etat=23;return new Resultat("NB",re);}              
                else
                       if(car==')'){etat=24;return new Resultat("NB",re);}
                else 
                           if(car==' '){etat=25;return new Resultat("NB",re);}
                else 
                               if(car=='$'){return new Resultat("NB",re);}
        
                else{etat=0;return new Resultat("NB",re);}
          
        case 12:
           if(car=='I'){re+=car;i++;etat=13;break;} 
           
           
           else 
               if(car=='+'||car=='-'||car=='*'||car=='/'){
                  etat=18;return new Resultat("NB",re);} 
                else 
                   if(car=='('){etat=23;return new Resultat("NB",re);}              
                else
                       if(car==')'){etat=24;return new Resultat("NB",re);}
                else 
                           if(car==' '){etat=25;return new Resultat("NB",re);}
                else                
                               if(car=='$'){return new Resultat("NB",re);}
        
                else{etat=0;return new Resultat("NB",re);}
          
            

             
     case 18:
            
   if
           (car=='+'){i++;etat=1;return new Resultat("OPLus",""+chaine.charAt(i-1));}
  else if(car=='-'){i++;etat=1;return new Resultat("OMoins",""+chaine.charAt(i-1));}     
  else if(car=='*'){i++;etat=1;return new Resultat("OMul",""+chaine.charAt(i-1));}     
  else if(car=='/'){i++;etat=1;return new Resultat("ODiv",""+chaine.charAt(i-1));}     
        
        
       case 23:    
           i++;etat=1;
           return new Resultat("Pouv",""+chaine.charAt(i-1));
       
       case 24:     
          i++;etat=1;
           return new Resultat("Pferm",""+chaine.charAt(i-1));

       case 25:
           i++;etat=1;
            return new Resultat("NbZero",""+"0");
      
       case 26:
           
           ca+=chaine.charAt(i);
           notfin=false;
           
          default:    
   if(etat==5||etat==6||etat== 7||etat== 8||etat==9||etat== 13||etat== 14||etat== 15||etat== 16||etat== 17){           
        
        
        if(car=='+'||car=='-'||car=='*'||car=='/'){
                  etat=18;return new Resultat("NB",re);} 
                else 
            if(car=='('){etat=23;return new Resultat("NB",re);}              
                else 
                if(car==')'){etat=24;return new Resultat("NB",re);}
                else 
                    if(car==' '){etat=25;return new Resultat("NB",re);}
                else 
                        if(car=='$'){return new Resultat("NB",re);}
        
                else{etat=0;return new Resultat("NB",re);}
   }
     
           
        
       case 0:
          int nb=0;  i++;etat=1;
       
          if(chaine.charAt(i-1)=='$'||chaine.charAt(i-1)=='$'&&nb==0){nb++;return new Resultat("Fin-op","fin");}
  
          return new Resultat("Erreur", ""+chaine.charAt(i-1)+" "+"non accepter dans:"+i);
        } 

} 
         
return new Resultat("Fin-op",""+ca);         
}       
         

}         
         
         
         
         
         
         
         
         
         
         
         
  
     
     
    
    
    
    
    





