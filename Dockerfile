FROM openjdk:8
ADD target/configserver-1.0.2.jar configserver.jar
RUN bash -c 'touch /configserver.jar'
ENTRYPOINT ["java","-jar","configserver.jar"]