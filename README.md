# test-java-adneom
+ télécharger le projet en cliquant sur le bouton "clone or download"
+ executer la commande "mvn clean install" à la racine du projet "test-java-adneom"
+ executer la commande 
```
mvn org.apache.maven.plugins:maven-install-plugin:2.5.2:install-file -Dfile=<path-to-file> 
```
où \<path-to-file\> est le chemin d'accès au fichier .jar créé précédemment créé (disponible dans le dossier target du projet "test-java-adneom")
+ ajouter la dépendence suivante au POM du projet dans lequel on veut l'utiliser
```
<dependency>
	<groupId>com.adneom.test</groupId>
	<artifactId>test-java</artifactId>
	<version>0.0.1-SNAPSHOT</version>
</dependency>
```  
Pour une utilisation simplifiée dans un contexte d'entreprise il conviendra de rendre le .jar disponible via un repository manager tel que Nexus 3.
