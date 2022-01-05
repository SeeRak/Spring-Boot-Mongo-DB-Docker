# Recette de cuisine Spring / MongoDB / Docker

:fries: :shrimp: Ce projet a pour but de mettre en place une API REST pour la gestion de recettes de cuisine :fries: :shrimp:

## Prérequis
1. :computer: Un IDE JAVA :computer:
2. :mag: JDK 11+ :mag:
3. :electric_plug: Docker :electric_plug:

## Utilisation
1. :abacus: Lancer la base de données :abacus:
   dans un terminal a la racine du projet, taper la commande suivante:
```shell script
docker compose up -d
```

2. Dans votre IDE favori, lancer le projet avec maven.


## Routes

### GET

````shell
localhost:8080/recettes
localhost:8080/ingredients
````

### POST
:keyboard: Ne pas oublier le body :keyboard:
````shell
localhost:8080/ingredients
localhost:8080/recettes
````

### DELETE
````shell
localhost:8080/ingredients/id
localhost:8080/recettes/id
````

### PUT
:keyboard: Ne pas oublier le body :keyboard:
````shell
localhost:8080/ingredients
````