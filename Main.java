package fr.dauphine.javaavance.td1;

/**
 * TD1
Exercice 1

2. Il complète « sysout » par « System.out.println() »
3. Il complète « toStr » par une méthode « toString() »
4. Il complète « main » par la méthode « main(String[] args) »
5. a) Dans mon cas, faire un ctrl + space à la suite de « int foo ; » me propose plusieurs choix, notamment de la transformer en fonction private – public – etc, ou encore de redéfinir certaines méthodes ou de créer un constructeur. 
	b) à la suite de « set » le ctrl + space crée une méthode setter
6) a) Le résultat est le refacto du nom de la classe (c’est un raccourci)
	b) pareillement on refacto le nom de la méthode

Exercice 2

1. Il instancie automatiquement la classe « Point » et initialise les variables à 0. Possible car la méthode est dans la classe Point.
2. Pas de visibilité sur les variables « x » et « y »
3. Toutes les variables doivent être « private » pour préserver le principe d’encapsulation de JAVA
4. Un accesseur permet d’accéder à une variable privée sans pouvoir la modifier. On en a besoin pour voir la valeur d’une variable
5. Pas de problème
6. On a un problème de référence, on a besoin du mot-clef « this » pour le compilateur différencie les variables « x » et « y »
7. On peut créer une variable static et s’incrémente à chaque appelle du constructeur
8. Le compilateur sait quel constructeur appeler en regardant les valeurs passées en paramètre lors de l’appel du constructeur.
9. ajout d’une méthode toString

Exerccie 3

1. Il affiche « true » puis « false », car p1 et p2 correspondent à la référence vers le même objet, tandis que p1 et p3 ne sont pas le même objet malgré le fait qu’ils aient les mêmes valeurs
3. Le problème est que la méthode « indexOf() » fait une recherche par rapport à l’adresse mémoire de l’objet passé en paramètre. Il faut redéfinir le equals !
	La méthode appelé est celle-ci : int indexOf(String str)

Exercice 4

2. En utilisant un « array » (donc un tableau), on remarque que l’ajout n’est pas pris en compte car on dépasse la taille du tableau.
	On peut utiliser la classe « ArrayList » par exemple pour remédier à cela.
5. Le Point p, initialisé à null, n’est pas initialisé en tant que Point mais en tant que null.
	Si l’on donne en paramètre null à add() au tout débout, il est tout de même ajouté à la fin du tableau.
6. nbPoints et pointCapacity deviennent une seule et même méthode car le nombre de points dans la liste correspond à la taille de la liste (la taille est dynamique ici).
	Et la méthode contains utilise juste la méthode contains de la classe LinkedList.

Exercice 5

1. Les 2 manières d’écrire la méthode translate(dx, dy) est de manière mutable ou non mutable.
5. Le problème est que le centre des 2 cercles sont modifiés et non pas seulement celui de c2 comme on le voudrais.
	Pour résoudre ce problème on doit rendre l’objet Point non mutable
6. Le problème est que le nouveau Point appelé par « c.getCenter().translate(1,1); » n’est pas stocké dans « center »
9. L’on doit faire une surcharge du de la méthode « contains() » et rajouter dans ses paramètres une « List <Circle> circles », le changement de paramètre est nécessaire pour le compilateur comprenne quelle méthode on utilise.

Exercice 6

1. On souhaite utiliser l’héritage, car un anneau a certaine caractéristique d’un cercle (il correspond à 2 cercles avec un centre).
4. System.out.println(Ring) affichera seulement le centre et l’anneau externe (rayon (radius) du cercle), car la méthode toString n’a pas été redéfini dans Ring, seulement dans Cercle dont il hérite.
	Il faut redéfinir la méthode toString dans Ring

 * @author Emmanuel
 *
 */

public class Main {

	public static void main(String[] args) {
		Point.exo2Question1();
		System.out.println();
	}
	
	
}

class Exo1Test {
	
	
	private int foo() {
		// TODO Auto-generated method stub
		return 0;
	}
	
	@Override
	public String toString() {
		// TODO Auto-generated method stub
		return super.toString();
	}
}