FROM openjdk:8u111-alpine
VOLUME /tmp
ADD com.springboot.microservice.docker.standalone.demo.jar app.jar
RUN sh -c 'touch /app.jar'
ENV JAVA_OPTS=""
ENTRYPOINT [ "sh", "-c", "java $JAVA_OPTS -Djava.security.egd=file:/dev/./urandom -jar /app.jar" ]