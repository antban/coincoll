
FROM java:8

COPY target/coincoll-api.jar /usr/share/coincoll/
COPY target/lib /usr/share/coincoll/lib

WORKDIR /usr/share/coincoll

EXPOSE 8080

ENTRYPOINT java -jar coincoll-api.jar
