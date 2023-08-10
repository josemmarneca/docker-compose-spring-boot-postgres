 #!/bin/bash

# Stop docker compose
docker-compose down

# Remove images
## docker rmi docker-compose-spring-boot-postgres_app:latest
## docker rmi postgres:latest

# Remove volumes
## docker volume rm docker-compose-spring-boot-postgres_data
## docker volume prune -f

# remove local data
## rm -rf data/postgres    
 
