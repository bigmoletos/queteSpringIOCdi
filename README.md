# queteSpringIOC
Afin de mettre en pratique tes nouvelles connaissances de Spring et les montrer au reste du monde, il te faudra suivre les étapes suivantes.

NB : Pour ce projet, tu devras créer deux branches au sein de ton dépôt distant : une branche pour la solution 1 (cf. plus bas) et une branche pour la solution 2 (cf. plus bas).

NB bis : Tout comme dans l'exemple de la quête, toutes les méthodes devront être implémentées sous forme de code visible dans la console, c'est-à-dire utilisant des System.out.println.

Génère un projet Spring Boot « Web » à partir de https://start.spring.io (group : fr.wildcodeschool, artifact : the-wizard-project).

Crée une interface WizardInterface comportant une méthode giveAdvice() et une méthode changeDress(). Conçois ensuite deux classes (Dumbledore et Gandalf) implémentant cette interface. La méthode giveAdvice() doit remplir son rôle directement, via un simple retour de String. La méthode changeDress(), elle, doit remplir son rôle en recourant à un objet de type Outfit (cela signifie qu'il te faut créer la classe correspondante ; cette classe devra contenir une méthode retournant un String, par exemple "The wizard's dress is blue"), et ce via une injection de dépendance.

Créer une classe App comportant une méthode start() appelée depuis la classe TheWizardProjectApplication. La classe App devra passer par ClassPathXmlApplicationContext pour récupérer un objet de type WizardInterface (instancié à partir de la classeDumbledore ou de la classe Gandalf), à partir duquel elle invoquera les méthodes giveAdvice() et changeDress().

Configure le bean correspondant à l'objet de type WizardInterface mentionné plus haut, ainsi que sa dépendance, en passant par un fichier XML. Une fois cela fait, envoie les modifications vers ton dépôt distant et partage le lien en solution (ce sera ta solution 1).

Configure le bean correspondant à l'objet de type WizardInterface mentionné plus haut, ainsi que sa dépendance, en passant par les annotations Java. Une fois cela fait, envoie les modifications vers ton dépôt distant et partage le lien en solution (ce sera ta solution 2).

Critères de validation
Le projet passe au compilateur et affiche deux outputs : un correspondant à giveAdvice() et un correspondant à changeDress().
Il est possible d'interchanger les objets instanciés à partir de Dumbledore et Gandalf en changeant la configuration du bean, aussi bien via un fichier XML (dans la solution 1) que via des annotations Java (dans la solution 2).
La dépendance du bean est configurée via XML (dans la solution 1) et via les annotations Java (dans la solution 2).
