 #!/bin/bash

# compile maven 
## mvn clean install -f app/pom.xml

# Run docker with build image
docker-compose up --build -d


# Check logs
# docker logs docker-compose-spring-boot-postgres
# docker logs docker-compose-spring-boot-postgres_app_1

/Users/josemarneca/Library/Java/JavaVirtualMachines/openjdk-17.0.2/Contents/Home/bin/java -Dmaven.multiModuleProjectDirectory=/Users/josemarneca/Workspace/Testes/docker-compose-spring-boot-postgres/app -Djansi.passthrough=true -Dmaven.home=/Users/josemarneca/.m2/wrapper/dists/apache-maven-3.9.3-bin/54p6kc7m0ap3os8bc4ge28ia2/apache-maven-3.9.3 -Dclassworlds.conf=/Users/josemarneca/.m2/wrapper/dists/apache-maven-3.9.3-bin/54p6kc7m0ap3os8bc4ge28ia2/apache-maven-3.9.3/bin/m2.conf -Dmaven.ext.class.path=/Users/josemarneca/Library/Application Support/JetBrains/Toolbox/apps/IDEA-C/ch-0/223.8617.56/IntelliJ IDEA CE.app/Contents/plugins/maven/lib/maven-event-listener.jar -javaagent:/Users/josemarneca/Library/Application Support/JetBrains/Toolbox/apps/IDEA-C/ch-0/223.8617.56/IntelliJ IDEA CE.app/Contents/lib/idea_rt.jar=50230:/Users/josemarneca/Library/Application Support/JetBrains/Toolbox/apps/IDEA-C/ch-0/223.8617.56/IntelliJ IDEA CE.app/Contents/bin -Dfile.encoding=UTF-8 -classpath /Users/josemarneca/.m2/wrapper/dists/apache-maven-3.9.3-bin/54p6kc7m0ap3os8bc4ge28ia2/apache-maven-3.9.3/boot/plexus-classworlds.license:/Users/josemarneca/.m2/wrapper/dists/apache-maven-3.9.3-bin/54p6kc7m0ap3os8bc4ge28ia2/apache-maven-3.9.3/boot/plexus-classworlds-2.7.0.jar org.codehaus.classworlds.Launcher -Didea.version=2022.3.2 clean install
