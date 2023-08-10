# Docker Compose Spring Boot and Postgres example

## Start project
Run the script start.sh or
### Compile with maven
mvn clean install -f app/pom.xml

### Run docker with build image (--build) in background (-d) 
docker-compose up --build -d
Run script start.sh (first time need ) 
```

##

## Set enviroments 
Run script enviroment

```
export $(cat .env | xargs)
```

## Run the System and build the image
We can easily run the whole with only a single command:
```bash
docker-compose up --build
```


## Run the System
We can easily run the whole with only a single command:
```bash
docker-compose up
```

Docker will pull the MySQL and Spring Boot images (if our machine does not have it before).

The services can be run on the background with command:
```bash
docker-compose up -d
```

## Stop the System
Stopping all the running containers is also simple with a single command:
```bash
docker-compose down
```

If you need to stop and remove all containers, networks, and all images used by any service in <em>docker-compose.yml</em> file, use the command:
```bash
docker-compose down --rmi all
```
 