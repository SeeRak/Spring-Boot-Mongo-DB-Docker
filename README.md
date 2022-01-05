# Recette de cuisine Spring / MongoDB / Docker

:fries: :shrimp: Ce projet a pour but de mettre en place une API REST pour la gestion de recettes de cuisine :fries: :shrimp:

## Prérequis
1. :computer: Un IDE JAVA :computer:
2. :mag: JDK 11+ :mag:
3. :electric_plug: Docker :electric_plug:

## Utilisation
1. :abacus: Lancer la base de données :abacus:  
   :man_technologist: Dans un terminal a la racine du projet, taper la commande suivante: :man_technologist:
```shell script
docker compose up -d
```

2. :computer: Dans votre IDE favori, lancer le projet avec maven. :computer:


## Routes

:milky_way: GET :milky_way:

````shell
localhost:8080/ingredients
localhost:8080/recettes
````

:milky_way: POST :milky_way:  
:keyboard: Ne pas oublier le body :keyboard:
````shell
localhost:8080/ingredients
localhost:8080/recettes
````

:milky_way: DELETE :milky_way:
````shell
localhost:8080/ingredients/id
localhost:8080/recettes/id
````

:milky_way: PUT :milky_way:  
:keyboard: Ne pas oublier le body :keyboard:
````shell
localhost:8080/ingredients
localhost:8080/recettes
````

## Informations complémentaires

![Alt text](src/assets/spring_initalizr.PNG)
1. :blue_book: Projet : Maven Project :blue_book:
2. :closed_book: Language : Java :closed_book:
3. :green_book: Spring Boot : 2.6.2 :green_book:
4. :orange_book: Packaging : Jar :orange_book:
5. :ledger: Java : 11 :ledger:
### Dependances
1. :large_blue_circle: Spring Boot DevTools :large_blue_circle:
2. :red_circle: Lombok :red_circle:
3. :green_circle: Spring Web :green_circle:
4. :orange_circle: Spring Data MongoDB :orange_circle: