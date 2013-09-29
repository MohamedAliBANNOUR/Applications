Applications
============
1-Objectif :
 Notre objective consiste à construire un STDS prédictif qui évalue une expression          arithmétique en chiffres romains en sa valeur en chiffres romains en sa valeur en chiffres romains en supposant que la borne sup des entiers manipulées (en valeur absolue) est 60 égale à XXXXXX en romains.

2-Présentation:
Ce travail est un Compilateur  (Traducteur dirigé par la syntaxe) écrit en langage JAVA qui traite les formules bien formé de la logique propositionnelle pour les rendre en une Forme normale conjonctive.
Un compilateur  est un traducteur simple permettant en une lecture  de l’entrée (une passe)(langage source) de réaliser la traduction (langue cible) .
Pour cela le compilateur effectue les opérations suivantes : analyse lexicale, prétraitement (préprocesseur), l'analyse syntaxique, analyse sémantique, génération de code et optimisation de code.
Les phases de la compilation sont :
l'analyse lexicale, qui découpe le code source en petits morceaux appelés jetons (tokens).
Chaque jeton est une unité atomique unique de la langue (unités lexicales ou lexèmes), par exemple un mot-clé, un identifiant ou un symbole. 
l'analyse syntaxique implique l'analyse de la séquence jeton pour identifier la structure syntaxique du programme.
Cette phase s'appuie généralement sur la construction d'un arbre d'analyse ; on remplace la séquence linéaire des jetons par une structure en arbre construite selon la grammaire formelle qui définit la syntaxe du langage.

3-Comment fonctionne le programme :
  Ce programme accepte une expression arithmétique en romains  qui est normalement une expression  bien formé qui se termine avec $ :
Lit le premier lexème, l’identifie, puis l’envoi a l’analyseur syntaxique, sinon erreur lexicale, et donc appel a la fonction erreur lexicale.
 L’analyseur syntaxique reçoit ce lexème.
Selon le type de ce dernier, l’analyseur syntaxique, décide de le refuser ou l’accepter.
Si le lexème est refusé, alors erreur syntaxique, et donc appel a la fonction erreur syntaxique.
Si non, le lexème est géré par l’algorithme correspondant.
La fin de l’analyse syntaxique se termine soit par succès (retour du résultat de l’expression arithmétique), soit par échec (message CACUL ERRONEE avec une délectation de position de l’erreur).
Pour cela l’analyseur syntaxique utilise une grammaire prédictive pour générer les lexèmes lus.
1-La grammaire est celle-ci :
E- > TE1
T- >TE2
E1 -> +TE1 / -TE1 /ε
E2 -> *TE2 / /TE2 /ε
S ->I/II/III/IV/V/VI/VII/VIII/IX/X/(E)
2-Comment insérer une expression arithmétique :

La formule doit  être insérée de la façon suivante :
‘ ‘ :  Considère comme 0
+  : Le symbole Oplus
- : Le symbole Omoins
*: Le symbole OMul
/: Le symbole ODiv
$ : Le symbole de EOF doit être inséré à la fin l’expression, si non expression non acceptée 
Exemple 1 :   (X+I)*(X+X)$  est une expression valide et acceptée 


 
Exemple 2: IIc+X$ est une expression non valide

 
Exemple 3: $  est une expression valide et acceptée 
 t 
Exemple 4: ((((X*II)/II)+I)$  est une expression valide et acceptée valeur de retour IX 
 
Exemple 4: XX-III*VI/II$ est une expression valide et acceptée valeur de retour  est XI

 

Exemple 5: XX-III*VI/II$ est une expression valide et acceptée valeur de retour  est XI

 
Exemple 6: XXXX*II$ est une expression valide mais elle dépasse XXXXXX=60 alors le retour est une message d’erreur aussi.

 

Exemple 6:X/$ est une expression non valide (division par zero)



Exemple 7 : ((IX+V$ est  une expression Mal parenthèse (manque 2 parenthèses).  
 
Exemple 8 : ((((XX*II)/VIII)+)-VII)$ est  une expression valide et valeur de retour  est –II. 

 

