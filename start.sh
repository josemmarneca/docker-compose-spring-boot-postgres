 #!/bin/bash

# compile maven 
## mvn clean install -f app/pom.xml

# Run docker with build image
docker-compose up --build -d


# Check logs
# docker logs docker-compose-spring-boot-postgres
# docker logs docker-compose-spring-boot-postgres_app_1
