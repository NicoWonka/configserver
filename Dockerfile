FROM openjdk:8
ADD target/config-0.0.1.jar config-server.jar
RUN bash -c 'touch /config-server.jar'
ENTRYPOINT ["java","-jar","config-server.jar"]