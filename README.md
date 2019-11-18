# tp développement objet

Ce TP fait suite aux fiches : Encapsulation et  Polymorphisme

Considérons une application qui travaille avec des objets de type Client (nom, prénom), 
liés à une adresse de domicile, optionnelle, dite de livraison. La classe _Adresse_ sera composée 
des propriétés _rue_, _ville_ et _codePostal_.

![classe Client](https://raw.githubusercontent.com/ocapuozzo/tpdev1/master/Client.png)


**A]** Concevoir un diagramme de classes qui présente les classes Adresse et Client et leurs associations. Vous utilisez un modeleur UML, par exemple dia.

**B]** Modifier le programme (https://github.com/ocapuozzo/tpdev1), classe _Main_, afin de 

1. Créer un client en lui affectant une adresse d'habitation et une autre de livraison. 
2. Afficher l'état textuel de l'objet Client ainsi créé.

Le client de test : 
```
nom=Dijkstra, rue=3 rue du clocher, codePostal=77000, ville=Melun
```       
Adresse de livraison :
```
nom=Kernighan, rue=2 rue du cimetière, codePostal=75001, ville=Paris
```
=> ce sont de informaticiens, trouvez leur prénom sur wikipedia

**C-a]** Lorsque l'adresse de livraison n'est pas renseignée, c'est l'adresse de domicile qui est retenue comme adresse de livraison.

Modifier le programme afin de  

1. Créer un client avec une adresse de domicile uniquement.
2. Afficher l'état textuel de l'objet Client ainsi créé (présentant toutes les caractéristiques de l'objet : nom, prénom, adresse de domicile et de livraison.
       
**C-b]** Dans la branche de test, ajouter au moins 2 méthodes de tests unitaires qui vérifient lle respect de la spécification fonctionnelle donnée en C-a (dite aussi règle de gestion) 

**D]** Après analyse, la décision est prise de permettre à un client d'avoir plusieurs adresses de livraison (de 0 à n) . Lorsque aucune adresse de livraison n'est renseignée, c'est toujours l'adresse de domicile qui est retenue comme adresse de livraison.

**D-a]** Modifier le diagramme de classe UML en conséquence. 

**D-b]** Modifier les méthodes de tests afin de prendre en compte l’évolution de la spécification fonctionnelle, et impacter l’implémentation de la logique métier en conséquence.

**D-c]** Modifier vote programme Main afin qu’il  

1. Créé un client avec une adresse de domicile uniquement.
2. Affiche l'état textuel de l'objet Client ainsi créé (présentant toutes les caractéristiques de l'objet)
3. Ajoute à l'objet Client déjà crée 2 autres adresses de livraison.
```       
nom=Kernighan, rue=2 rue du cimetière , codePostal=75001, ville=Paris    
nom=Knuth, rue=1 rue du cinema, codePostal=13001, ville=Marseille
```       
4. Affiche l'état textuel de l'objet Client ainsi créé.
       
**E]** On souhaite maintenant étendre les fonctionnalités de l'application avec des adresses intégrant, en plus des attributs rue, ville et codePostal, les attributs email et url (valeur optionnelle), sans modifier les classes actuelles.  Pour cela, vous décidez de concevoir une nouvelle classe adresse, nommée AdresseEtendue.
       
**E-a]** Avec l'aide du programme dia, proposer un diagramme de classes représentant la relation entre Client, la classe Adresse et la nouvelle classe. 
       
**E-b]** Ajouter 2 nouvelles méthodes de test unitaires. Exemple de données :
   
Le client :
``` 
   nom=Dijkstra, rue=3 rue du clocher, codePostal=77000, ville=Melun
   mail=edsger@dijstra.org, url="https://fr.wikipedia.org/wiki/Edsger_Dijkstra"
```
       
**E-c]** Dans le programme principal (classe _Main_) créer un client avec un email, une adresse de domicile et deux adresses de livraison et qui affiche l'état textuel de l'objet Client ainsi créé.
       
