# Docker Compose Spring Boot and Postgres example

## Start the system using the script
Run the script start `start.sh` or Compile with maven and run docker with build image

### Run script start 
Edit the file to compile with maven and them run 
```bash
sh start.sh
```
## Start the system using the command line
### Compile with maven
```bash
mvn clean install -f app/pom.xml
```

### Run docker with build image (--build) in background (-d) 
```bash 
docker-compose up --build -d`
```

### Run the System

```bash
docker-compose up
```

The services can be run on the background with command:
```bash
docker-compose up -d
```

## Stop the system using the script
Run the script stop `stop.sh` 
### Run script stop 
```bash
sh stop.sh
```
## Start the system using the command line
### stop all running containers
```bash
docker-compose down
```

If you need to stop and remove all containers, networks, and all images used by any service in <em>docker-compose.yml</em> file, use the command:
```bash
docker-compose down --rmi all
```
 
