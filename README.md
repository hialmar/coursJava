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

Un objet est donc une collection de variables et de méthodes qui sont liées.

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

Dans cette leçon nous allons examiner les tableaux en Java.
Les tableaux en Java ressemblent aux Objets car ils sont créés en utilisant new
Il faudra préciser après le type des éléments des crochets pour que Java
comprenne qu'il s'agit d'un tableau.
Ensuite, lors de la création du tableau on reprécise le type des éléments
et le nombre d'éléments (ou de cases) dans le tableau.

Pour éviter de gérer avec une variable spécifique (ou une constante) la taille
du tableau les concepteurs de Java ont fourni une sorte d'attribut sur le tableau
appelé length.
On voit ici un exemple de boucle qui parcourt un tableau et l'initialise.
Pour manipuler une case du tableau on utilise la notation traditionnelle
nom du tableau, suivi d'un crochet ouvrant, suivi de l'indice, suivi d'un crochet
fermant.
Attention : comme en C, les tableaux commencent à l'indice 0.
Comme toute variable on peut y affecter quelque chose avec = ou l'utiliser
dans une expression pour réaliser un calcul ou l'afficher.

Pour les tableaux d'objets il faudra en plus des cases, créer les objets
référencés par les cases avec d'autres new.

Pour simplifier les boucles de parcours de tableau il y a une version
simplifiée de la boucle for. Cela consiste, en paramètre du for, à 
déclarer une variable du même type que les "cases" du tableau et à
indiquer après le signe : le nom du tableau à parcourir.
La variable prendra successivement la valeur (ou la référence pour
des objets) contenue dans chaque case du tableau.


P5 - Classes 
LO : expliquer la notion de type et de classe 
LO : expliquer la notion de constructeur 
LO : définir une classe simple en langage Java

[Try it online!](https://tio.run/##nVO9btswEJ6lpzh4sQM0DtDV6NQ5U8aiA01d7HMpUuUdkxRF3iWrn0MP5hwpRo3rTAEkQNLdfX9HHcyDuT50v04n6wwzfN8bgb9tc3MDFi0BskDyYEQibZO0zZ0@@B3YSJu2KX0Pgdz4ol0I/XiUfejwC9jlNIlwH7wVCorBHCyNRwSTniBsDygMHYIzULixbRSqy9AYV1dZRYYnVWESM4FiDJgUVcgRY4SOIlrBHr2AQ55V/g/b3P1hbVuHJOtB5YvzK2W5UgfP1cR7szZ4lpgUOcWpOJvhEAUz@uzqd6pzRVR2N4QUgTwJmUnmmbQC6EKcNcbxaApSfl@WWNomr@FfBJ83ri7hGyxuyYS0KHaf27Yd0taRnbrg1pDPRPUji6qxUDbRa2k1LfzHTzBxx7OkLFtjynENEXvdGFjVrMVygiT0yuvxESYnm2nq3hDnKYf5MaKmh05vnQ1Fr86t6/43F0QmScQzmj1GmxTsAyqX3o5Nia6AaqVOvCeZrky1N36HVV9OrlvW9vPBkiiGx0WdrqLnoL@@FRSTMbkLONDfpZCNx/Wl6Y8kls2dTq8 "Java (JDK) – Try It Online")

Dans cette leçon nous allons apprendre à créer de nouveaux types d'objets 
grâce au concept de Classe.

Une classe est un modèle pour les futurs objets qui seront créés.
On va y définir des attributs et des méthodes.
Une fois la classe créée et compilée par le compilateur Java,
nous pourrons utiliser son nom comme type, exactement comme pour les types 
d'objets que nous avons vu jusqu'ici : String, ArrayList et ainsi de suite.
Pour créer de nouveaux objets nous utiliserons donc le mot clé new.

Voyons une première classe très simple.

Pour déclarer une nouvelle classe nous utilisons le mot clé class déjà
vu rapidement lors de la première leçon. Ensuite nous donnons un nom
à la classe. 
Cette classe porte le nom Chat et définira donc le type Chat.

Ensuite on a un bloc entre deux accolades.

Dans ce bloc on peut définir des variables qui seront portées par
les futurs objets de type Chat. 
Ces variables s'appellent des attributs.
Ici on définit l'attribut "cri" de type objet String.
Chaque objet créé aura une variable "cri" personnelle.
C'est un peu comme les champs d'une strucure en C.

On peut aussi définir des fonctions qui seront, elles aussi portées
par les futurs objets de type Chat. 
Ces fonctions s'appellent des méthodes.

Ici on a défini une méthode crier(). On peut remarquer que
dans la méthode on utlilise l'attribut cri défini plus avant.

Comme chaque objet aura une variable cri personnelle, la méthode
affichera la bonne variable quand on l'appellera sur le bon objet.
Nous allons voir cela dans quelques instants.

Regardons d'abord la dernière fonction définie. Elle est un peu
spéciale. Tout d'abord elle a le même nom que la classe et elle
n'a pas de type retour void. On reviendra sur ces types retours
dans la leçon suivante.
Cette méthode spéciale s'appelle un constructeur. Elle est
appelée automatiquement quand on utilise le mot-clé new.
C'est pour ça qu'il y avait des paranthèses après le nom d'un
type objet quand on le constuisait. Comme toute autre méthode
elle pourra avoir des paramètres. C'est ce qu'on a vu avec le
type String qui pouvait prendre en paramètre une autre chaîne
de caractères. Ici pour simplifier on n'a pas mis de paramètre.
Le corps de la méthode donne une valeur par défaut à la variable
cri de l'objet qui est en train d'être créé.

Regardons comment utiliser notre nouvelle classe.

Nous avons ici aussi une classe Main contenant la méthode main
que nous connaissons déjà et qui définit le programme principal.

Dans ce programme nous déclarons une première variable de type
Chat appelée tom et nous l'initialisons en créant un nouvel
objet de type Chat avec le mot clé new comme dans la leçon
précédente.
Une fois l'objet créé nous pouvons appeler des méthodes comme
pour les objets des types standards de Java.
Ici nous appelons la seule méthode disponible : crier.
On peut définir une autre variable et créer un autre chat.

Exécutons le programme.

L'ennui c'est qu'ici les deux chats sont identiques.
Modifions la variable cri du second chat.
Comme pour les méthodes on utilise le . entre la variable
hercule et l'attribut cri de l'objet référencé par la 
variable hercule. hercule.cri signifie donc la variable cri
de l'objet référencé par la variable hercule.
Si on appelle à nouveau les méthodes crier pour chacun
des deux objets on note bien que seul le cri d'hercule à changé.

Les classes nous permettent donc de créer de nouveaux types d'objets.
Chaque objet pouvant avoir autant de variables et de fonctions
que désiré par le programmeur.

Comme on l'avait dit précédemment on peut donc avoir simplement
grâce au concept d'Objet et de Classe des ensembles de variables
et de fonctions liées entre elles.

P6 - Méthodes et Passage de paramètres (et public et private) 
LO : expliquer les différents types de passage de paramètres 
LO : définir et utiliser des méthodes avec des paramètres et des résultats 
LO : rendre des attributs et méthodes privés ou publics en langage Java

Revenons dans cette leçon sur la classe Chat.
Nous avons ajouté sur cette déclaration de classe le mot-clé public.
Un peu plus bas nous voyons un autre mot-clé private.
Ces mots-clés servent à limiter ou non la visibilité des classes
et des attributs et méthodes.
Le fait de rendre une classe publique permet la création d'objets
de ce type en dehors du paquetage qui contient la classe.
La grande majorité des classes que nous écrirons seront publiques.

Le fait de rendre privé un attribut d'une classe permet de s'assurer
qu'on ne pourra le modifier que dans la classe courante.
En général tous les attributs sont privés et les méthodes sont
publiques. On pourra toutefois avoir des méthodes privées qui ne
pourront être utilisées que par d'autres méthodes de la même classe.

On verra par la suite un autre mot clé (protected) qui gérera lui
aussi la visibilité et l'accessibilité des attributs et des méthodes.

Continuons d'examiner la classe.

On remarque qu'il y a deux constructeurs et que le premier
prends un paramètre. Ce paramètre s'utilise comme une variable
dans la méthode. Exactement comme en C ou d'autres langages.
On notera simplement que le paramètre, comme toute variable,
est défini avec un type. Java, comme le C, est un langage fortement
typé. Ce n'est pas le cas du langage Python par exemple.

Les paramètres du constucteur servent en général à initialiser
les attributs du futur objet. Ainsi dès leur création les objets 
du même type peuvent avoir des valeurs d'attributs différentes. 

Voyons maintenant les méthodes.

La première méthode ressemble à celle que nous avions précédemment.

La méthode suivante a un paramètre de type objet String.

La méthode setAge lui ressemble mais il y a quelques différences 
intéressantes. Tout d'abord elle s'appelle setAge et sert à
modifier l'attribut age. On appelle ce genre de méthode un accesseur.
On a aussi une méthode getAge qui sert à récupérer l'age du chat.

A l'intérieur de la méthode on remarque l'utilisation du mot-clé
this. Ce mot clé sert à récupérer la référence de l'objet courant.
L'objet qui est manipulé par la méthode à un instant donné.
On peut s'en servir, comme ici, pour différencier un attribut
d'un paramètre. Ici le paramètre age à le même nom que l'attribut.
Java comprends donc bien que c'est la valeur du paramètre qu'on
recopie dans l'attribut et pas l'inverse.

Les deux méthodes suivantes permettent de récupérer les valeurs des
attributs age et nom. Alors que toutes les méthodes vues jusq'ici
étaient déclarées void (et ne retournaient donc aucune informations)
ici on a des types de retour String et int. Ces types s'utilisent
en lien avec le mot clé return qui permet à la méthode de renvoyer
une valeur au programme ou à la méthode l'appelant.
On notera qu'on peut renvoyer ainsi des objets (comme ici ceux de type
String). Ces objets sont renvoyés par référence. Il n'y a pas de
duplication d'objet. On travaillera sur le même objet que celui
référencé par l'attribut nom (ici).

La méthode suivante estPlusVieuxQue prend un objet en paramètre.
Sur cet objet qui est passé par référence comme pour le retour de
la méthode getNom. Nous pouvons donc appeler des méthodes sur
le chat passé en paramètre de la méthode.

Nous pouvons voir sur la méthode suivante la différence de passage
de paramètre entre les objets et les types de base.
La grosse différence est visible lorsqu'on appelle la méthode renommer
sur autreChat. Ici le chat est modifié partout. On appelle ça un effet
de bord. Alors que la variable duree contient une copie de la durée
passée en paramètre et donc si on modifie la durée dans la méthode
elle n'est pas modifiée en dehors de la méthode.

Il est à noter que si on modifie la variable autreChat (et pas le chat
référencé par la variable) nous n'avons pas d'effet de bord.
La variable paramètre est en effet locale à la méthode.

Voyons maintenant le programme principal et son exécution.

On créé deux chats.
On appelle les méthodes crier.
L'une d'elle modifie le nom du premier chat.
On voit bien la modification lors du deuxième appel de la méthode crier.

On donne ensuite des ages aux chats et on utilise la méthode estPlusVieuxQue 
pour comparer les ages.

La dernière partie du programme permet de montrer la différence de passages
de paramètre entre le chat hercule qui est modifié par effet de bord et
duree qui ne l'est pas.
La variable hercule n'est par contre pas modifiée.

P7 - Static, Méthodes et attributs de classe 
LO : expliquer la notion d'attribut et de méthode de classe en POO 
LO : rendre des attributs et méthodes statiques en langage Java

Cette leçon présente le concept d'attribut et de méthode de classe.
Un attribut et une méthode de classe sont uniques pour tous les objets
de la classe. Ce concept est proche du concept de variable globale dans
d'autres langages.

Ca peut servir, comme ici, à compter le nombre d'objets créés.

Pour déclarer un attribut de classe, on ajoute le mot clé static.
Ici il y aura un seul compteur pour tous les objets de la classe et donc
si on incrémente de 1 ce compteur dans chacun des constructeurs on
compte bien le nombre de chats qui sont créés dans le main.

On ajoute aussi une méthode déclarée avec le mot clé static pour
récupérer la valeur de l'attribut.

On note dans le programme principal que pour appeler cette méthode il
faut indiquer le nom de la classe à la place d'une variable de type objet.

Il s'agit donc d'un concept proche de celui de fonction dans d'autres langages.
Il n'y a pas d'objet courant lors de l'appel de la méthode et donc si on utilise
this il y aura une erreur.

P8 - Exceptions 
LO : expliquer la notion d'exception en programmation 
LO : déclarer l'émission d'exceptions et attrapper des exceptions en
langage Java

Lors de l'exécution d'un programme il peut y avoir des problèmes.
Par exemple : le fichier que l'on doit utiliser n'est plus accessible, il n'y a
plus d'espace sur le disque dur, un utilisateur tape un mot au lieu d'un nombre...

Dans de nombreux langages le concept d'exception sert à gérer ce genre de problème.
L'idée est de ne pas traiter les problèmes à l'endroit où ils sont detectés mais
de les traiter à un autre endroit.

L'intérêt est de rendre l'algorithme nominal (celui qui se déroule s'il n'y a pas
de problème) le plus simple possible.

En Java, quand un problème survient une exception est générée.

Regardons le premier programme. On voit bien qu'il va y avoir une division
par zéro sur la ligne 9. Exécutons le.
Un message d'erreur s'affiche. Il nous indique l'erreur et l'endroit où elle s'est produite.
D'autre part, le programme s'arrête.

En Java on a deux solutions pour gérer les problèmes :
- attraper les exceptions et les traiter ;
- propager les exceptions pour les traiter ailleurs ; 

Le second programme montre la première solution.
La partie qui peut poser problème est entourée par un bloc avec le mot clé try.
On essaye donc d'exécuter le code.
S'il y a un problème (ici la division par zéro) on ira dans le bloc catch correspondant
à l'exception et on affichera le message d'erreur.
Il est important de noter que le code qui suit le problème ne sera pas exécuté.
Dès qu'une exception est générée on arrête l'algorithme normal et on passera en
gestion d'exception jusqu'à ce que l'exception soit attrapée. Si l'exception
n'est jamais attrapée (comme dans le premier programme) le programme s'arrête en
affichant la localisation de l'erreur.

Il est à noter qu'on aurait pû mettre cela dans une boucle et retenter avec une autre 
opération.

Pour l'instant nous avons vu des exceptions dite RuntimeException pour lesquelles
nous ne sommes pas obligé de faire quelque chose (tout simplement car elles arrivent
souvent et donc qu'il vaut mieux gérer le problème en ammont dans l'algorithme).

Cependant, de nombreuses exceptions doivent absolument être traitées par le développeur.
Le programme Exception3 montre une telle exception. Cette exception nous indique qu'un
fichier est introuvable.
On ne peut écrire le code sans traiter cette exception comme ici avec un try/catch
ou comme dans le programme suivant.
Lorsqu'on essaie de fermer un fichier ouvert il peut se produire une exception (c'est
très rare cela dit) et donc il faut la gérer aussi.

Le 4ème programme montre la propagation des exceptions. Ici nous ouvrons le fichier dans
une méthode et nous ne voulons pas (ou nous ne pouvons pas) traiter l'exception 
FileNotFoundException ici.
Donc nous ajoutons dans la déclaration de la méthode le mot clé throws et le type
de l'exception qui peut être lancée dans la méthode.
On peut très bien attraper certaines exceptions et en propager d'autres comme c'est
fait ici.

Dans le programme principal on attrapera l'exception et on la traitera.

Cette façon de faire est très utilisée dans les bibliothèques. En effet on préféra
traiter les exceptions dans le programme principal ou dans une interface graphique.
C'est donc le développeur du programme final qui choisira. Le développeur de la 
bibliothèque ne peut pas savoir, par exemple, qu'on va introduire une interface
graphique avec des fenêtres présentant les messages d'erreur à l'utilisateur.

Un développeur peut aussi créer de nouvelles exceptions et les gérer.
Nous verrons ça à la fin de la leçon sur l'héritage.

P9 - Héritage (et protected) 
LO : expliquer la notion d'héritage en POO
LO : faire hériter une classe d'une autre classe en langage Java

Il arrive souvent que deux types d'objets sont très proches. Des variables et
des méthodes sont identiques ou très peu différentes. Une solution peu efficace
consiste à dupliquer le code dans les deux classes. L'ennui c'est que si on modifie
le code dans l'avenir (par exemple pour corriger un problème) on oubliera peut-être
de le modifier dans la seconde classe.

Une meilleure solution est proposée par le concept d'héritage.
Lors de la création d'une nouvelle classe on peut préciser qu'on souhaite hériter
d'une classe déjà existante. On récupèrera toutes les fonctionnalités de la classe
dont on hérite et on pourra modifier les méthodes et les valeurs des variables
ainsi qu'ajouter de nouveaux attributs et méthodes.

On doit noter ici qu'en Java une classe ne peut hériter que d'une seule classe.
D'autre part, une classe qui n'hérite pas explicitement d'une autre classe, hérite
automatiquement de la classe Object. L'ensemble des classes forme donc une hiérarchie
dont la racine est la classe Object.

Voyons cela sur un exemple. Nous souhaitons toujours manipuler des chats mais nous
voulons aussi manipuler des oiseaux. On pourrait créer uniquement la classe Oiseau.
Mais on se rend compte qu'il y a des choses communes entre les oiseaux et les chats.
Ce sont tous deux des animaux. On va donc créer une classe Animal dans laquelle
on va mettre des attributs et méthodes communes à toutes les classes d'animaux.
Ensuite, les classes Chat et Oiseau hériteront de la classe Animal.

Dans l'exemple la classe Animal n'a qu'un attribut et une méthode mais on pourrait
rendre cela beaucoup plus complexe.

On note le mot clé protected devant l'attribut cri. Ce mot clé crée un niveau de
protection intermédiaire entre public et private. Il signifie que les classes
qui vont hériter de la classe Animal pourront modifier l'attribut sans passer
par des méthodes publiques.

C'est ce que fait la classe Oiseau dans le constructeur.
On a aussi ajouté une autre méthode : voler. En effet les oiseaux peuvent voler
mais pas les chats...

La classe Chat modifie elle aussi le cri dans son constructeur et ajoute trois
méthodes.

Dans la méthode miauler nous retrouvons une exception. Il s'agit ici d'une nouvelle
exception créée par héritage de la classe standard Exception.

Cette classe d'exception définit une constante qui ne nous intéresse pas ici.

Ce qui est plus intéressant c'est qu'elle redéfinit une méthode qui existe dans la
classe Object : toString. Cette méthode sert à afficher un objet. On peut toujours
la redéfinir. On note au dessus de la méthode qu'on a écrit @Override.
Il s'agit d'une annotation. C'est un concept avancé que nous ne verrons pas dans
le cours. Elle indique qu'on a redéfini la méthode toString.

Revenons à la classe Chat. Dans la méthode miauler on trouve le mot clé throws qu'on
a déjà vu et qui sert à propager l'exception du nouveau type.
Pour lancer l'exception on utilisera le mot clé throw (sans s et qu'il ne faut pas
confondre). Alors que throws indique que la méthode peut générer des exceptions (mais
bien sûr c'est exceptionnel), throw demande explicitement à Java de lancer l'exception.
Cette exception doit normalement se trouver derrière un if qui vérifiera la condition
qui indique le problème. Ici si avec la méthode changerCri on indique une chaine nulle
et que plus tard on appelle miauler, on aura une exception ExceptionChatMuet qui sera
lancée.

Regardons maintenant le programme principal.
On y crée un chat et un oiseau. On appelle les méthodes crier héritées de la classe
Animal puis des méthodes spécifiques.

Ensuite on crée une liste d'animaux. Dans cette liste on peut placer des animaux
de n'importe quel type qui hérite de la classe Animal.

On peut ensuite, dans une boucle par exemple, appeler les méthodes de la classe Animal.

Ensuite on change le cri de tom pour déclencher ensuite l'exception.
On voit lors de l'exécution que la méthode toString est appelée par la méthode
e.printStackTrace() qu'on utilise souvent et qui indique la localisation d'une exception.
Ici on nous indique que l'exception est partie de la ligne 15 de la classe Chat et
a été propagée à la ligne 31 de la classe Main. Ces informations sont utiles pour
corriger un programme.

Il est à noter qu'on ne peut pas appeler les méthodes spécifiques à Oiseau sur un Animal.

Mais on peut transtyper les variables référençant des objets, comme on l'a fait pour 
les double  et les int.
Par contre si on transtype vers un type qui n'a rien à voir on aura des exceptions qui
seront générées.
Pour éviter cela on peut utiliser l'opérateur booléen instanceof qui renvoie true
si un transtypage est possible ou false sinon.

C'est ce que nous faisons en fin de méthode main.

P10 - Interfaces 
LO : expliquer la notion de classe abstraite et d'interface 
LO : utiliser des interfaces

Dans d'autres langages orienté objets il y a un concept d'héritage multiple.
Ce qui signifie qu'une classe peut hériter de plusieurs classes directement.
Cela pose un certain nombre de problèmes qui dépassent le cadre de ce cours.

En Java, on ne peut hériter que d'une seule classe. Mais le concept d'interface 
remplace l'héritage multiple.

Avant de le présenter nous allons voir le concept de classe abstraite qui est lié.

Parfois il arrive qu'on ne puisse pas coder une ou plusieurs méthodes dans une classe.
La ou les méthodes auront, par contre, une implémentation dans plusieurs classes
dérivées qui seront spécifiques à ces classes.

Revenons à notre ensemble de classes sur les animaux. Plutôt que de donner une
implémentation par défaut de la méthode crier dans Animal, qui ne correspond à rien
et qui affiche null si on ne change pas la variable cri, nous allons la déclarer abstraite.
Il n'y aura aucun code pour cette méthode. Du coup on ne pourra pas créer d'objets
de cette classe et elle deviendra abstraite.
Il faut pour cela utiliser le mot clé abstract sur la méthode et sur la classe.
Une classe qui a, au moins, une méthode abstraite est abstraite.

Lorsqu'on dérive la classe on peut implémenter une ou plusieurs méthodes abstraites.
S'il n'y a plus aucune méthode sans implémentation le classe devient une classe 
normale et on peut créer des objets normalement.

C'est ce que nous allons faire dans la classe Chat.

Regardons maintenant la classe Oiseau. On peut dire qu'un oiseau est un animal qui vole.
Mais il n'y a pas que des animaux qui volent. Les avions, eux aussi, volent.
On aimerait donc pouvoir dire que les oiseaux et les avions sont similaires.

Nous allons créer pour cela une interface. Une interface est comme une classe qui n'aurait
que des méthodes abstraites. On ne peut donc pas créer des objets directement avec
l'interface. On aura des classes qui implémenteront l'interface en implémentant ses
méthodes.

Ici nous appelons l'interface ObjetVolant et elle possède une méthode voler.

Les classes Oiseau et Avion implanteront cette interface. Pour cela on indique sur la 
première ligne de la classe le mot clé implements et le nom de l'interface.

Si on hérite aussi d'une classe on doit d'abord indiquer extends avant implements comme
pour Oiseau.
On peut aussi implémenter plusieurs interfaces en séparant le nom des interfaces par des
virgules.

Nous pouvons par exemple implémenter l'interface Serializable de Java qui sert à indiquer
au compilateur Java de générer des méthodes cachées permettant de sauver un objet dans
un fichier et de le recharger.

Dans le main, nous créons des animaux que nous rangeons dans une liste d'animaux.
On parcourt ensuite la liste en appelant la méthode crier.

De façon similaire on crée ensuite une liste d'objets volants (la définition d'une
interface créant, comme pour les classes, un nouveau type).
On y range l'oiseau et un nouvel avion.
Ensuite on parcourt la liste en appelant la méthode voler.

Tout se passe donc comme si la classe Oiseau héritait de deux classes...

P11 - debug 
LO : expliquer à quoi sert un debugger 
LO : localiser des erreurs de programmation en langage Java en utilisant un debugger

Dans cette leçon nous n'allons pas présenter de nouveaux concepts de Java.
Nous allons montrer comment on peut corriger des problèmes et mettre au point une
application Java avec un debugger.

Un debugger permet d'exécuter une application pas à pas en regardant après chaque pas
les valeurs des variables. Cela permet de mieux comprendre comment un programme
fonctionne et surtout ça permet de localiser et corriger des problèmes.

Regardons la classe MaClasse du paquetage de la leçon. Cette classe pose problème.
Si vous ne le voyez pas tout de suite, essayons d'exécuter le main de la classe Main.

Nous obtenons une exception NullPointerException. Java nous indique que l'exécution
vient de la méthode uneMethode et nous dit que c'est à la ligne 7.

Supposons que nous ne comprenons pas directement le problème.

Au lieu d'exécuter le programme normalement nous allons le lancer avec le debugger
intégré d'eclipse. Au lieu de démarrer le programme en utilisant l'option "Run As"
nous allons utliser "Debug As" puis "Java Application".

Eclipse nous propose de passer en perspective Debug (une perspective Eclipse
est une configuration de sous-fenêtres). Acceptons la proposition.

Nous voyons désormais en plus des fenêtres habituelles une sous-fenêtre
appelée Variables ainsi qu'un paneau Breakpoints dans la même
sous-fenêtre. 

Lorsque l'exception est générée le programme ne s'arrête pas.
Il se met en pause et nous pouvons examiner les variables.
On peut voir que l'objet courant (via la pseudo variable this)
a un attribut test dont la valeur est null.
Et donc quand on a essayé d'appeler la méthode substring cela
provoque l'exception NullPointerException.

On peut aussi exécuter le programme pas à pas à partir d'un point
d'arrêt.

Arrêtons d'abord le programme en cliquant sur le bouton rouge ou choisissant l'option 
"Terminate" du menu "Run".

Plaçons nous sur le main de la classe Main.
Si nous double-cliquons dans la marge au niveau du numéro de ligne
6 un petit cercle bleu apparait. Il s'agit d'un indicateur de
point d'arrêt (breakpoint en anglais).

Si nous regardons la fenêtre Variables et Breakpoints nous voyons
le nouveau point d'arrêt dans le panneau Breakpoint.
En cliquant sur la case cochée nous pouvons le désactiver temporairement.
Nous pouvons aussi le supprimer en choisissant l'option "Remove" dans le menu
contextuel.

Relançons le programme en choisissant "Debug" dans le menu "Run".

Le programme démarre et se met en pause sur le point d'arrêt.
Dans la fenêtre "Variables" nous voyons le tableau args.
Dans le menu "Run" choisissons "Step Over".
Le debugger lance l'exécution de la ligne courante et s'arrête à nouveau ensuite.
On peut remarquer l'apparition de la variable monObjet dans la fenêtre variables.
On peut aussi regarder la valeur des attributs en cliquant sur la flêche.
Pour la ligne suivante choisissons dans le menu "Run" l'option "Step Into".
Ce coup-ci le debugger rentre dans la méthode et nous montre son exécution.
Ici nous pouvons à nouveau voir this dans la fenêtre Variables.

Le debugger permet d'autres fonctionnalités mais nous avons vu les plus importantes
ici.

Arrêtons le programme, initialisons l'attribut test et vérifions que le programme
fonctionne désormais sans lancer d'exception. 

Pour revenir à la perspective Java normale il faut cliquer sur
l'icône avec le petit J en haut à droite d'eclipse.
On peut aussi choisir dans le menu "Window", "Perspective" puis "Java".


Bonus : Intro aux collections

Le problème des tableaux, en Java comme dans d'autres langages, c'est
qu'il faut savoir à l'avance le nombre de valeurs qui seront utiles.
C'est rarement le cas. Donc on peut utiliser d'autres structures
de données plus complexes. Nous présentons ici les 3 plus utilisées.

Le type qui ressemble le plus à un tableau est le type ArrayList.
Il permet de manipuler des tableaux de taille quelconque.
Java s'occupant de l'allocation de la mémoire au tableau.

Ce type est un type générique. Cela veut dire qu'on peut utliser
des tableaux avec des "cases" de n'importe quel type.
On précisera le type des "cases" entre < et > après le type.
Le concept de généricité est un concept avancé qui dépasse
le cadre de ce cours. Nous ne ferons que l'utiliser en précisant
des types pour les structures de données.
Nous déclarons d'abord une liste d'entiers.
Pour ajouter des entrées dans la liste on utilise la méthode add.
Pour consulter une entrée de la liste on utilise la méthode get en
précisant l'indice.

Il y a de nombreuses méthodes disponibles pour les objets de ce type.
On vous conseille de consulter la documentation en tapant dans votre
navigateur "ArrayList Java 8" :
https://docs.oracle.com/javase/8/docs/api/java/util/ArrayList.html

Il est à noter que comme pour la plupart des objets de types standard
Java sait afficher une liste d'objets.

Si on veut utliser une liste de valeurs de types de base, comme int,
il faudra utiliser l'un des types d'objets équivalents.
Pour int il s'agit du type Integer. Il y a aussi Byte, Short, Double, Float...
Ainsi on déclarera une ArrayList d'Integer mais on pourra la manipuler
comme une liste d'ints.
Comme pour les tableaux on pourra utiliser un for simplifié pour la parcourir.

Si, plutôt qu'une liste ordonnée, on veut utiliser un ensemble non
ordonné dans lequel les objets ne peuvent exister en double, on pourra
utiliser à la place de ArrayList le type HashSet.

Si, enfin, nous souhaitons gérer des tableaux indicés par autre chose
que des entiers (ou des tableaux avec des trous) on pourra utliser le
type HashMap. Ici aussi il s'agit d'un type générique et on devra
préciser le type des indices suivi du type des cases.
Ici nous voyons une HashMap indicée par des chaines et qui contient
des entiers correspondant à la population en millions de pays.
On ajoute des éléments en utilisant la méthode put et en précisant
l'indice (appelé aussi une clé) puis la valeur.
Pour récupérer la valeur à partir de l'indice on utilisera ici aussi
la méthode get.
Il y a plusieurs façon de parcourir une HashMap suivant si on s'intéresse
plus aux clés ou plus aux valeurs.
Voilà une solution en utilisant une variable référence de type
HashMap.Entry. On précise ici aussi les types des indices et des valeurs.


