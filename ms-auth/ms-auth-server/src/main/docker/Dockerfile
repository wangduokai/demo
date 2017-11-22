FROM cfmicserver1.node/tools/oracle-jdk:jdk-8u112
VOLUME /tmp
ADD ms-auth-server-1.0-SNAPSHOT.war /app.war
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.war"]