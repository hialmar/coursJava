Plan du cours

P1 - Programmes 
LO : expliquer la structure d'un programme simple en langage Java

Script :

Bienvenue dans cette vidéo du cours sur Java. Pour commencer, voilà un
premier programme très simple qui écrit la phrase Hello World à l'écran.

Avant de regarder en détail ce programme, regardons un petit peu la
fenêtre de l'application. Il s'agit de l'IDE (Integrated Development
Environment - Environnement de Développement Intégré) Eclipse. 

Nous pouvons voir une liste des projets sur la gauche (appelée Package
Explorer), Le projet ouvert appelé PremierProjet contient tous les
exemples du cours. On y voit aussi la version de Java que nous
utiliserons pour ce cours : Java SE 8. SE signifiant Standard Edition.

Sur la droite nous voyons une vue synthétique du fichier ouvert au
milieu. En bas, nous voyons la console qui affichera les sorties du
programme et permettra aussi, ensuite, de taper des informations en
entrée du programme. Enfin, la partie centrale, présente le programme en
cours d'édition.

Regardons maintenant ce programme : 

La première ligne indique un nom de paquetage. Il s'agit d'un concept 
qui permet de grouper entre eux de façon hiérarchique des fichiers Java.

Ici nous avons un premier paquetage appelé cours qui contient un second
paquetage appelé p1programmes. Nous pouvons voir cela dans la partie 
gauche de manière hiérarchique. Si vous ne le voyez pas comme ça dans
votre fenêtre vous pouvez modifier le réglage en cliquant sur l'icône
en forme de flèche en haut à droite du panneau et en choisissant 
"Package Presentation" et "Hierarchical".

Revenons au programme. Nous voyons aussi sur cette première ligne un
commentaire. Les commentaires en Java peuvent être ajoutés en tapant
deux fois le signe / 
Dans ce cas là tout le reste de la ligne (après les deux /) est un commentaire.
On peut aussi, comme on le voit, un peu plus bas, écrire le commentaire 
entre /* et */ dans ce cas le commentaire
peut s'étendre sur plusieurs lignes comme ici.

La ligne de code suivante est une déclaration de classe. Nous
reviendrons sur cette notion plus tard. Il suffit simplement de savoir
ici que toute fonction et toute déclaration de variable en Java doit se
trouver dans une classe. Donc il y aura toujours au moins une
déclaration de classe par fichier.

La ligne de code suivante déclare une fonction appelée main. Comme en
langage C dont Java hérite, la première méthode exécutée s'appelle
toujours main. En Java elle sera toujours déclarée comme cela. Nous
reviendrons plus tard sur la signification des différents mots clés.

Enfin, la dernière ligne de code (à part les accolades qui servent à
fermer les blocs de code) contient l'instruction qui permet d'afficher
du texte. 
System.out.println("Hello World"); 

On demande donc à Java d'afficher (println) le texte sur la sortie 
standard (out) du Système.
ln signifiant qu'on passera à la ligne suivante une fois le texte
affiché.

Exécutons le programme.

Il y a plusieurs solutions. La plus simple consiste à cliquer avec le
bouton droit sur l'icône du fichier dans le panneau de gauche et choisir
: Run As... puis Java Application.

On voit bien la phrase qui s'affiche dans la console.

Je modifie le programme en tapant "Bonjour le monde". Puis je le relance.
Et on voit bien la nouvelle phrase dans la console.

Essayons de créer un autre programme du même type.

Créons un nouveau projet. 

Dans les menus nous choisissons : File 
puis New 
puis Java Project 
On tape le nom du projet : SecondProjet

Je laisse tout le reste par défaut. 
On pourrait ici choisir un endroit spécifique ou stocker le projet.
On pourrait ici utiliser une autre version de Java.
On pourrait ne pas organiser le projet en plusieurs répertoires
(ce qui n'est pas très pratique).
La partie "Working Sets" permet d'organiser plusieurs ensembles de projets. 
Cliquons sur "Finish". 
Le projet vient d'être ajouté au panneau de gauche. 
Nous allons maintenant créer un fichier Java. 
Choisissons à nouveau File puis New et ensuite Class. 
Eclipse nous propose de mettre le fichier dans le répertoire de sources (src) 
Tapons main comme paquetage et Main comme nom de classe 
On peut écrire cela comme on veut mais la convention veut qu'on écrive tout
en minuscule pour les noms de paquetages et la première lettre de chaque
mot en majuscule pour le nom de la classe. 

Je vais ensuite demander à Eclipse la création de la fonction main en cliquant ici. 
Je vais aussi demander la génération automatique de commentaires et laisser le reste
par défaut. 
Je clique Finish et voilà ma classe. 

Il ne reste plus qu'a remplacer le commentaire TODO par 
System.out.println("Coucou"); 

Vous pouvez remarquer que l'éditeur de texte affiche tout ce qui pourrait
correspondre à ce que je tape. Ca peut permettre d'aller plus vite si le
nom des fonctions est très long à taper par exemple. Il ne faut pas
oublier le ; Je lance l'exécution comme tout à l'heure. Et voilà nous
sommes désormais capables d'écrire des programmes simples en Java.





P2 - Variables et constantes 
LO : déclarer et utiliser des variables en langage Java 
LO : déclarer et utiliser des constantes en langage Java

Script : Bienvenue dans cette vidéo du cours sur Java. Nous allons voir
dans cette séquence la déclaration et l'utilisation de Variables en
langage Java. C'est très similaire aux autres langages de programmation
dérivés du C donc vous devriez être en terrain connu. D'abord un petit
rappel : une variable est définie par un nom, une valeur et un type. 

On peut faire une analogie avec une boite. Si on considère la mémoire de
l'ordinateur comme un gigantesque entrepot, dans cet entrepot on va trouver 
des millions de boites. Ces boites peuvent avoir des tailles différentes pour
contenir différents types de choses.
Pour pouvoir les repérer on va coller dessus des étiquettes.
La variable est la boite, la taille de la boite correspond à son type, 
la chose dans la boite est la valeur. L'étiquette correspond au non de la 
variable.

Regardons ce programme, on va y trouver au début 4 variables de divers
types. Voyons la première. 
Le type de la variable est écrit en premier : int. Il s'agit d'un des types
entiers disponible en Java. 

Il y a aussi byte qui peut contenir des entiers
sur un octet, short, sur 2 octets, int sur 4 octets et long sur 8
octets. 

En Java il n'y a que des entiers signés. Donc pour les int, par
exemple comme notre variable, on pourra stocker des nombres allant de 
-2 milliard à +2 milliard. Les valeurs précises correspondant à des 
puissances de 2. On a donc une boite de taille 4 octets. 

Ensuite on voit le nom de la variable. Ici unEntier. On vous recommande
de bien nommer vos variables et d'utiliser la convention qui veut
que le premier mot soit en minuscule et les mots suivants commencent
par une majuscule.

Ensuite on va trouver une affectation qu'on appelle une initialisation.
On vous conseille de le faire systématiquement.
Notre boite est donc étiquetée avec le nom unEntier et contient une chose 
ici l'entier valant 1.

Ensuite nous trouvons une variable de type réel. Ici un double qui 
représente des réels en virgule flottante codés sur 64 bits.
Il y a aussi en Java comme en C le type float où les réels sont 
codés sur 32 bits (et donc ils sont moins précis).

Nous voyons ensuite une variable de type caractère qui stocke uniquement
un caractère. Et enfin une variable de type booléen qui ne peut stocker
que la valeur "vrai" ("true" en Anglais) ou la valeur "faux" ("false" en Anglais).

Ces dernières variables sont  surtout utilisées dans des instructions 
conditionnelles et des boucles que nous verrons dans la prochaine vidéo.

Une fois ces variables définies nous pouvons modifier leurs valeurs.
Ainsi, la valeur varie et c'est de là que vient le nom de "variable".

Pour modifier leur valeur on utilise le signe égal comme en C.
Attention, comme en C, pour comparer deux valeurs on utilisera le
signe == comme on le voit un peu plus bas.

On peut aussi récupérer la valeur d'une variable en écrivant le nom
de la variable dans une expression. Ca peut permettre de faire des
calculs.
Comme en C il y a des raccourcis pour les opérations les plus simples
comme l'incrémentation. Ici on voit ++ et +=, il existe aussi --,
-=, *=, /= ......
Attention, comme en C, si on divise deux entiers c'est une division entière
qui est utilisée et on peut utiliser le signe % pour obtenir un reste.

Dans certains cas on peut affecter des expression d'un type à un autre type.
C'est le cas pour les expressions entières et les expressions réelles.

Dans l'autre sens ça ne marche pas directement car on perd de l'information.
Il faut réaliser un transtypage comme en C.

Disons deux mots sur les constantes. Elles ressemblent à des variables
mais sont préfixées par le mot clé "final" et ne peuvent donc pas changer
de valeur.
Elles servent à rendre les expressions arithmétiques plus claires.



P3 - Structures de contrôle (et portée des variables) 
LO : utiliser des structures de contrôle dans un programme en langage Java

Le but de cette vidéo est d'apprendre à écrire des structures de contrôle en Java.
Les structures de contrôle sont, pour l'essentiel, identique au langage C.

On peut donc écrire des expressions conditionnelles if else.

Dans le programme d'exemple, après la déclaration de quelques variables, nous voyons
d'abord une instruction conditionnelle simple.
Java évalue l'expression booléenne a==b et si elle est vraie il
exécute le code compris entre les deux accolades.
La partie entre les accolades s'appelle un bloc de code.
Les variables définies dans un bloc, n'existent que dans ce bloc.
On vous conseille d'éviter, au début, de jouer avec les déclarations dans les blocs.
Il est plus facile de comprendre un programme ou une fonction si les variables
sont définies au début comme dans un algorithme.
On peut noter aussi que les accolades peuvent être omises s'il n'y a qu'une 
instruction.

Comme en C on peut ajouter une partie else comme dans le second exemple.
Le bloc de code qui se trouve après le else sera exécuté si l'expression
booléenne est fausse.

Les expressions booléennes peuvent être plus complexes qu'une simple 
déclaration et on pourra utiliser les opérateurs booléens "et", "ou", "non"...
On voit ici un "et" écrit avec deux signes "et commercial".
Le ou s'écrit avec deux barres verticales et le non avec un point d'exclamation
comme en C.
On vous recommande de bien parantheser les expressions comme on l'a fait ici.
La priorité des opérateurs n'aidant pas à la lisibilité.

A la place de l'expression booléenne on peut aussi, bien sûr, utiliser
une variable booléenne.

Il est possible aussi d'ajouter des else if dans la structure de contrôle 
s'il y a plus de deux alternatives comme ici. 

Comme en C si on veut tester différentes valeurs pour la même variable on
peut utiliser l'instruction switch case comme ici.
Attention de ne pas oublier les instructions break.
Sans cela, le code des cas suivants est aussi exécuté.
Cela n'aide pas à la compréhension.

Nous avons fait le tour des instructions conditionnelles, voyons maintenant
les boucles.

Nous retrouvons les boucles tant que exprimées avec le mot clé while.
Ici le bloc après le while sera exécuté tant que l'expression booléenne a < 10
sera vraie.
Il ne faut pas oublier de modifier cette expression dans le bloc de code.
Sinon on se retrouverait avec une boucle infinie.
Comme en C on peut utiliser l'instruction break pour quitter la boucle
et l'instruction continue pour sauter le reste du bloc de code.
Ces instructions n'aidant pas à la compréhension des algorithmes nous 
avons choisi de ne pas les utiliser.

Quand on écrit une boucle qui ne fait que répéter un bloc de code
un nombre fini de fois on peut utiliser une boucle pour avec le mot clé for
comme ici.
On verra plus tard une variante de la boucle for pour parcourir des tableaux
et d'autres structures de données.

Enfin on peut aussi utiliser des boucles do / while qui ont la particularité
d'exécuter au moins une fois le bloc de code.

Exécutons le code.






P4 - Objets et Collections 
LO : expliquer le principe de base de la programmation par objets 
LO : expliquer la notion de référence 
LO : expliquer la notion de méthode
LO : déclarer et utiliser des variables de type référence en langage Java 
LO : créer une instance en langage Java 
LO : invoquer des méthodes sur des objets en langage Java
LO : manipuler des ArrayList, HashSet et HashMap en Java

Nous voilà au premier concept de la programmation par objets : l'objet.

Dans cette leçon nous allons créer et manipuler des objets de types pré-existants.
Nous verrons, dans la leçon suivante, comment créer de nouveaux types d'objets.

En fait, dans les leçons précédentes nous avons déjà manipulé un premier objet :
System.out. Cet objet permet d'afficher du texte.
Voyons un autre objet du même type : System.err.
On remarque que pour tous les deux nous pouvons utiliser une sorte de fonction
appelée println qui prends en paramètre une chaine de caractères et l'affiche.

Les fonctions portées par les objets sont appelées des méthodes.
La différence essentielle avec une fonction normale est que dans le 
corps de la méthode on pourra utiliser des variables qui seront, elles aussi,
portées par l'objet. On appelle ces variables des attributs.

Un objet est donc une collection de variables et de fonctions qui sont liées.

La partie suivante du programme manipule des chaines de caractères.
En effet, en Java, les chaines sont des objets.
La première instruction de cette portion de code est une des manières de créer une chaine. 
On voit qu'on utilise le mot clé new. 
Ce mot clé sert à créer de nouveaux objets.
Pour créer un nouvel objet on doit donc utiliser new suivi d'un nom de type d'objet 
suivi de parenthèses. Entre parenthèses on peut passer des paramètres
qui servent à initialiser les données de l'objet comme ici.

Penchons nous un peu sur les variables. Il s'agit ici de variables qui contiennent
des références vers des objets. Pour reprendre l'analogie des boites, ici la boite
ne contient pas l'objet, elle contient une étiquette qui indique où se trouve
l'objet dans l'entrepot qui représente la mémoire.
Et donc deux variables peuvent référencer le même objet.
C'est ce que nous faisons ici.
On peut vérifier avec l'opérateur == qu'il s'agit de la même référence et donc du même objet.

Ensuite on crée une nouvelle chaine initialisée avec le premier objet.
On crée donc une copie de l'objet. On a ici bien deux objets en mémoire.
L'égalité n'est plus valable. Par contre, en interne, Java travaille avec la même zone mémoire.
On peut le vérifier en comparant le résultat de la méthode intern() pour chaque objet.

Le troisième exemple affecte à s2 une chaine constante en utilisant la notation classique.
Ne nous trompons pas, il s'agit ici aussi d'un objet.
Nous pouvons donc appeler des méthodes sur l'objet référencé par la variable.

Les chaines de caractères en Java étant des objets constants, pour des raisons d'optimisation,
l'objet référencé par la variable n'est ici jamais modifié.
On verra ensuite qu'on peut tout à fait modifier des objets. C'est ici une spécifité des chaines.

Nous créons ensuite un objet de type Scanner qui va travailler avec System.in, l'entrée standard.
Cet objet nous permet de lire au clavier diverses choses tapées par l'utilisateur.

Ici nous allons lire une ligne de texte.

Si on exécute plusieurs fois le programme nous pouvons voir que bien que les objets sont toujours
différents, les chaines internes peuvent éventuellement être identiques.


=========




P5 - Classes 
LO : expliquer la notion de type et de classe 
LO : expliquer la notion de constructeur 
LO : définir une classe simple en
langage Java

P6 - Méthodes et Passage de paramètres (et public et private) 
LO : expliquer les différents types de passage de paramètres 
LO : définir et utiliser des méthodes avec des paramètres et des résultats 
LO : rendre des attributs et méthodes privés ou publics en langage Java

P7 - Static, Méthodes et attributs de classe 
LO : expliquer la notion d'attribut et de méthode de classe en POO 
LO : rendre des attributs et méthodes statiques en langage Java

P8 - Exceptions 
LO : expliquer la notion d'exception en programmation 
LO : déclarer l'émission d'exceptions et attrapper des exceptions en
langage Java

P9 - Héritage (et protected) 
LO : expliquer la notion d'héritage en POO
LO : faire hériter une classe d'une autre classe en langage Java

P10 - Interfaces 
LO : expliquer la notion de classe abstraite et d'interface 
LO : utiliser des interfaces

P11 - debug 
LO : expliquer à quoi sert un debugger 
LO : localiser des erreurs de programmation en langage Java en utilisant un debugger



