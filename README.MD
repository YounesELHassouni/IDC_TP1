
# COMPRE RENDU ( TP Application Java )
<h2 style="color:blue; ">Partie 1:</h2>
<div style="padding-left: 1em;">
<h3>I- Création des Interfaces et Implémentations</h3>
<div style="padding-left: 1em;">
  <h4 style="padding-left: 2em;" >1. IDao Interface</h4>
<p>Création de l'interface IDao avec la méthode getDate.</p>
            <img style="max-width: 750px;padding: 1em;border: 2px dotted rgb(0, 162, 255);border-radius: 30px;" src="Captures/IDao.png">

<h4 style="padding-left: 2em;" >2. Implémentation de IDao</h4>
<p>Développement d'une implémentation de l'interface IDao.</p>
            <img style="max-width: 750px;padding: 1em;border: 2px dotted rgb(0, 162, 255);border-radius: 30px;" src="Captures/DaoImpl.png">

<h4 style="padding-left: 2em;" >3. IMetier Interface</h4>
<p>Création de l'interface IMetier avec la méthode calcul.</p>
            <img style="max-width: 750px;padding: 1em;border: 2px dotted rgb(0, 162, 255);border-radius: 30px;" src="Captures/IMetier.png">

<h4 style="padding-left: 2em;" >4. Implémentation de IMetier avec Couplage Faible</h4>
<p>Implémentation de l'interface IMetier en utilisant le couplage faible.</p>
            <img style="max-width: 750px;padding: 1em;border: 2px dotted rgb(0, 162, 255);border-radius: 30px;" src="Captures/MetierImpl.png">

<h4 style="padding-left: 2em;" >5. Implémentation d'Extension de l'Interface Dao</h4>
<p>Creation de class DaoImpl2 (Capteur).</p>
            <img style="max-width: 750px;padding: 1em;border: 2px dotted rgb(0, 162, 255);border-radius: 30px;" src="Captures/DaoImpl2.png">

<p>Creation de class DaoImplWS (Web Service).</p>
            <img style="max-width: 750px;padding: 1em;border: 2px dotted rgb(0, 162, 255);border-radius: 30px;" src="Captures/DaoImplWS.png">
</div>

<h3>II-  Injection des Dépendances</h3>
<div style="padding-left: 1em;">
<h4 style="padding-left: 2em;" >1. Par Instanciation Statique</h4>
<p>Mise en place de l'injection des dépendances par instanciation statique.</p>
<p style="font-size: small;margin-left: 4em;">Version BD</p>
            <img style="max-width: 750px;padding: 1em;border: 2px dotted rgb(0, 162, 255);border-radius: 30px;" src="Captures/img.png">

<p style="font-size: small;margin-left: 4em;">Version Capteur</p>
            <img style="max-width: 750px;padding: 1em;border: 2px dotted rgb(0, 162, 255);border-radius: 30px;" src="Captures/img_1.png">

<h4 style="padding-left: 2em;" >2. Par Instanciation Dynamique</h4>
<p>Réalisation de l'injection des dépendances par instanciation dynamique on utilisant un fichier txt.</p>

<p style="font-size: small;margin-left: 4em;">config.txt</p>
            <img style="max-width: 750px;padding: 1em;border: 2px dotted rgb(0, 162, 255);border-radius: 30px;" src="Captures/img_2.png">

<p style="font-size: small;margin-left: 4em;">Test de injection des dépendances par instanciation  dynamique(Version BD).</p>
            <img style="max-width: 750px;padding: 1em;border: 2px dotted rgb(0, 162, 255);border-radius: 30px;" src="Captures/img_3.png">

<p style="font-size: small;margin-left: 4em;">On effectue un changement dans la premier ligne dans config.txt</p>
            <img style="max-width: 750px;padding: 1em;border: 2px dotted rgb(0, 162, 255);border-radius: 30px;" src="Captures/img_4.png">

<p style="font-size: small;margin-left: 4em;">Test de injection des dépendances par instanciation  dynamique(Version WS).</p>
            <img style="max-width: 750px;padding: 1em;border: 2px dotted rgb(0, 162, 255);border-radius: 30px;" src="Captures/img_5.png">

<h4 style="padding-left: 2em;" >3.  En Utilisant le Framework SpringXML</h4>
<p>Configuration des beans et injection des dépendances via le fichier XML.</p>

<p style="font-size: small;margin-left: 4em;">Fichier ApplicationContext.xml</p>
            <img style="max-width: 750px;padding: 1em;border: 2px dotted rgb(0, 162, 255);border-radius: 30px;" src="Captures/img_8.png">

<p style="font-size: small;margin-left: 4em;">Test de injection des dépendances par Framework SpringXML (Version Captures).</p>
            <img style="max-width: 750px;padding: 1em;border: 2px dotted rgb(0, 162, 255);border-radius: 30px;" src="Captures/img_9.png">

<h4 style="padding-left: 2em;" >4.  En Utilisant le Framework Spring Annotation</h4>
<p>Utilisation des annotations de Spring pour la configuration et l'injection des dépendances.</p>


<p style="font-size: small;margin-left: 4em;">Ajouter @Compenent a l'Implémentation de IDao DaoImpl.</p>
            <img style="max-width: 750px;padding: 1em;border: 2px dotted rgb(0, 162, 255);border-radius: 30px;" src="Captures/img_12.png">

<p style="font-size: small;margin-left: 4em;">Ajouter @Compenent et @Autowired a MartieImpl.</p>
            <img style="max-width: 750px;padding: 1em;border: 2px dotted rgb(0, 162, 255);border-radius: 30px;" src="Captures/img_13.png">

<p style="font-size: small;margin-left: 4em;">Dans test avant tous on choisir les packages des classes qu'on va utilise.</p>
            <img style="max-width: 750px;padding: 1em;border: 2px dotted rgb(0, 162, 255);border-radius: 30px;" src="Captures/img_14.png">

<p style="font-size: small;margin-left: 4em;">On peux aussi utilise constructeur.</p>
            <img style="max-width: 750px;padding: 1em;border: 2px dotted rgb(0, 162, 255);border-radius: 30px;" src="Captures/img_15.png">

<p>Pour utilise differents extension on doit effectue les changement suivant :</p>

<p style="font-size: small;margin-left: 4em;">Ajouter @Compenent a l'extention.</p>
            <img style="max-width: 750px;padding: 1em;border: 2px dotted rgb(0, 162, 255);border-radius: 30px;" src="Captures/img_20.png">

<p style="font-size: small;margin-left: 4em;">Ajouter @Qualifier a MartieImpl avec le nom d'extension (dans notre example DaoImpl2)</p>
            <img style="max-width: 750px;padding: 1em;border: 2px dotted rgb(0, 162, 255);border-radius: 30px;" src="Captures/img_21.png">

<p style="font-size: small;margin-left: 4em;">Dans test on ajouter le package ext aux packages des classes qu'on va utilise.</p>
            <img style="max-width: 750px;padding: 1em;border: 2px dotted rgb(0, 162, 255);border-radius: 30px;" src="Captures/img_22.png">
</div>

<h3>III- Test</h3>
<div style="padding-left: 1em;">
<h4 style="padding-left: 2em;" >1. Class Calcul</h4>
<p>Création de class Calcul avec la method somme.</p>
            <img style="max-width: 750px;padding: 1em;border: 2px dotted rgb(0, 162, 255);border-radius: 30px;" src="Captures/img_23.png">

<h4 style="padding-left: 2em;" >2. Tester la methode dans la partie test de maven</h4>
<p>En utilise la methode assertTrue.</p>
            <img style="max-width: 750px;padding: 1em;border: 2px dotted rgb(0, 162, 255);border-radius: 30px;" src="Captures/img_24.png">

</div>
</div>
<h2>Conclusion</h2>
<p>Pendant la réalisation de ce travail pratique, De nombreuses leçons significatives ont été extraites. Parmi les éléments essentiels à retenir :</p>
<ul>
    <li>Couplage Faible et Flexibilité : L'utilisation du couplage faible dans l'implémentation de IMetier a illustré comment cette approche peut accroître la flexibilité et simplifier les modifications ultérieures.</li>
    <li>Injection des Dépendances avec Spring : Les différentes méthodes d'injection des dépendances, qu'il s'agisse de l'instanciation statique, dynamique ou via Spring, ont été explorées. Chacune présente ses avantages et inconvénients, le choix dépendant des besoins spécifiques du projet.</li> 
</ul>

<h3>Ressources</h3>
<ul>
    <li>Part 1 : https://www.youtube.com/watch?v=08eEhNKOw7I</li>
    <li>Part 2 : https://www.youtube.com/watch?v=oP-6ly2Zt5E</li>
</ul>

<h3>Auteur : </h3>
<h5>EL HASSOUNI Younes (19/02/2024)</h5>