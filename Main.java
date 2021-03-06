package fr.dauphine.javaavance.td1;

/**
 * TD1
Exercice 1

2. Il compl?te ? sysout ? par ? System.out.println() ?
3. Il compl?te ? toStr ? par une m?thode ? toString() ?
4. Il compl?te ? main ? par la m?thode ? main(String[] args) ?
5. a) Dans mon cas, faire un ctrl + space ? la suite de ? int foo ; ? me propose plusieurs choix, notamment de la transformer en fonction private ? public ? etc, ou encore de red?finir certaines m?thodes ou de cr?er un constructeur. 
	b) ? la suite de ? set ? le ctrl + space cr?e une m?thode setter
6) a) Le r?sultat est le refacto du nom de la classe (c?est un raccourci)
	b) pareillement on refacto le nom de la m?thode

Exercice 2

1. Il instancie automatiquement la classe ? Point ? et initialise les variables ? 0. Possible car la m?thode est dans la classe Point.
2. Pas de visibilit? sur les variables ? x ? et ? y ?
3. Toutes les variables doivent ?tre ? private ? pour pr?server le principe d?encapsulation de JAVA
4. Un accesseur permet d?acc?der ? une variable priv?e sans pouvoir la modifier. On en a besoin pour voir la valeur d?une variable
5. Pas de probl?me
6. On a un probl?me de r?f?rence, on a besoin du mot-clef ? this ? pour le compilateur diff?rencie les variables ? x ? et ? y ?
7. On peut cr?er une variable static et s?incr?mente ? chaque appelle du constructeur
8. Le compilateur sait quel constructeur appeler en regardant les valeurs pass?es en param?tre lors de l?appel du constructeur.
9. ajout d?une m?thode toString

Exerccie 3

1. Il affiche ? true ? puis ? false ?, car p1 et p2 correspondent ? la r?f?rence vers le m?me objet, tandis que p1 et p3 ne sont pas le m?me objet malgr? le fait qu?ils aient les m?mes valeurs
3. Le probl?me est que la m?thode ? indexOf() ? fait une recherche par rapport ? l?adresse m?moire de l?objet pass? en param?tre. Il faut red?finir le equals !
	La m?thode appel? est celle-ci : int indexOf(String str)

Exercice 4

2. En utilisant un ? array ? (donc un tableau), on remarque que l?ajout n?est pas pris en compte car on d?passe la taille du tableau.
	On peut utiliser la classe ? ArrayList ? par exemple pour rem?dier ? cela.
5. Le Point p, initialis? ? null, n?est pas initialis? en tant que Point mais en tant que null.
	Si l?on donne en param?tre null ? add() au tout d?bout, il est tout de m?me ajout? ? la fin du tableau.
6. nbPoints et pointCapacity deviennent une seule et m?me m?thode car le nombre de points dans la liste correspond ? la taille de la liste (la taille est dynamique ici).
	Et la m?thode contains utilise juste la m?thode contains de la classe LinkedList.

Exercice 5

1. Les 2 mani?res d??crire la m?thode translate(dx, dy) est de mani?re mutable ou non mutable.
5. Le probl?me est que le centre des 2 cercles sont modifi?s et non pas seulement celui de c2 comme on le voudrais.
	Pour r?soudre ce probl?me on doit rendre l?objet Point non mutable
6. Le probl?me est que le nouveau Point appel? par ? c.getCenter().translate(1,1); ? n?est pas stock? dans ? center ?
9. L?on doit faire une surcharge du de la m?thode ? contains() ? et rajouter dans ses param?tres une ? List <Circle> circles ?, le changement de param?tre est n?cessaire pour le compilateur comprenne quelle m?thode on utilise.

Exercice 6

1. On souhaite utiliser l?h?ritage, car un anneau a certaine caract?ristique d?un cercle (il correspond ? 2 cercles avec un centre).
4. System.out.println(Ring) affichera seulement le centre et l?anneau externe (rayon (radius) du cercle), car la m?thode toString n?a pas ?t? red?fini dans Ring, seulement dans Cercle dont il h?rite.
	Il faut red?finir la m?thode toString dans Ring

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