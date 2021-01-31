# Neo4j-Spring tutorial
This is just a basic tutorial of neo4j in Java-spring

### Prepare the environment
- run your neo4j-db: if you don't have one, run the docker inside the `/docker` folder
- set neo4j-confs inside the `application.properties` file: if you ran the docker at the previous step, go at your `localhost:7687` and set the db username&pwd
- run the `Neo4jSpringApplication` (main class of this project)

### Feed the db
In order to feed the db, you can 
- use `swagger` at your `localhost:8080`
- or run the queries inside the `load-movies.cyper` file on your neo4j-shell (you can find one at your `localhost:7687` if your ran the docker at the previous step)

### Validate the result
If you follow the previous step, you should now obtain the same result at https://github.com/cicco94/neo4j-spring/blob/main/src/main/resources/result.PNG

#### Author's contact
ciccottandrea@gmail.com