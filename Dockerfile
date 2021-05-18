FROM openjdk:8
EXPOSE 9095
COPY ./target/Claims-Service.jar /usr/app/
WORKDIR /usr/app
RUN sh -c 'touch Claims-Service.jar'
ENTRYPOINT ["java","-jar","Claims-Service.jar"]