FROM cfmicserver1.node/tools/oracle-jdk:jdk-8u112
VOLUME /tmp
ADD ms-admin-1.0.0-SNAPSHOT.war /app.war
ENTRYPOINT ["java","-Djava.security.egd=file:/dev/./urandom","-jar","/app.war"]
