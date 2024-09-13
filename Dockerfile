FROM amazoncorretto:11-alpine-jdk
COPY target/devsecOps-workshop-continuous-delivery*.jar devsecOps-workshop-continuous-delivery-0.0.1.jar
ENTRYPOINT ["java","-jar","/devsecOps-workshop-continuous-delivery-0.0.1.jar"]