# Recette de cuisine Spring / MongoDB / Docker

Ce projet a pour but de mettre en place une API REST pour la gestion de recettes de cuisine

## Prérequis
1. Un IDE JAVA 
2. JDK 11+
3. Docker

## Utilisation
1. Lancer la base de données:
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
Ne pas oublier le body pour le post :)
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
Ne pas oublier le body pour le post :)
````shell
localhost:8080/ingredients
````