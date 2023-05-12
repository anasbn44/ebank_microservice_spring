# Architectures Micro-services


### 1. Teste de la couche DAO
A partir du lien http://localhost:1997/h2-console on génére l'interface de la base de données. La figure suivante présente cette interface.

<img src="captures/1_1.png">

### 2. Teste du web micro-service en utilisant un client REST comme Postman
La figure ci-dessus représente la liste des clients générés en utilisant REST, elle est accessible via le lien http://localhost:1997/bankAccounts.
<img src="captures/1_2.png">
Avec le logiciel Postman nous permettant de tester les différentes fonctions du REST. Les figures qui suient présentent les différentes fonctions comme obtenir la liste des clients ou un client à partir de son id, ainsi qu'ajouter ou modifier un client.

<img src="captures/2_1.png">
<img src="captures/2_2.png">
<img src="captures/2_3.png">
<img src="captures/2_4.png">

### 3. Génération et teste de la documentation Swagger des API Rest du Web service
* Interface Swagger obtenu du lien http://localhost:1997/swagger-ui/
<img src="captures/3_1.png">
* Documentation généré par Swagger du lien http://localhost:1997/v3/api-docs
<img src="captures/3_2.png">
* Liste des clients en utilisant Swagger 
<img src="captures/3_3.png">
* Importqtion de la documentation Swagger envers Postman
<img src="captures/3_4.png">

### 4. Exposer une API Restful en utilisant Spring Data Rest en exploitant des projections
* Liste des clients en utilisant Spring Data Rest
<img src="captures/4_1.png">
* Obtention d'un client à partir de son id 
<img src="captures/4_2.png">
* Liste des clients par leurs type de compte par le lien http://localhost:1997/bankAccounts/search/findByType?type=CURRENT_ACCOUNT
<img src="captures/4_3.png">
* Liste des clients avec la projection "p1" du lien http://localhost:1997/bankAccounts?projection=p1
<img src="captures/4_4.png">

### 5. Création les DTOs et Mappers et de la couche Service (métier) du micro service
* Les DTOs
<img src="captures/dtos.png">
* Les Mappers
<img src="captures/mappers.png">
* Les services
<img src="captures/services.png">
### 6. Création un Web service GraphQL
* Affichage de la liste des comptes en utilisant la fonction accountsList de type query
<img src="captures/graph_00.png">
* Affichage d'un compte par son id en utilisant la fonction accountById de type query
<img src="captures/graph_01.png">
* Affichage du cas d'erreur où le id est invalide 
<img src="captures/graph_02.png">
* Ajout d'un compte en utilisant des variables
<img src="captures/graph_03.png">
* Confirmation de l'ajout
<img src="captures/graph_04.png">
* Modification d'un compte en utilisant des variables
<img src="captures/graph_05.png">
* Suppression d'un compte
<img src="captures/graph_06_1.png">
<img src="captures/graph_06_2.png">
* Affichage de la base de données avec les relations entre Customer et BankAccount
<img src="captures/graph_07.png">
* Affichage de la liste des comptes avec les nom de leurs Customers
<img src="captures/graph_08.png">
* Affichage de la liste des customers avec le solde de leurs comptes
<img src="captures/graph_09.png">
