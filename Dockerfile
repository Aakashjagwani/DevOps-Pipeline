FROM openjdk:8
ADD target/devOps1.jar devOps1.jar
EXPOSE 8072	
ENTRYPOINT ["java","-jar","devOps1.jar"] 